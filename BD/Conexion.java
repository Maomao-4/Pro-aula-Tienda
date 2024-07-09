package BD;

import java.awt.Image;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vistasAdmin.menuAdmin;
import vistasUser.Principal;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.awt.Desktop;
import java.io.StringReader;
import java.time.LocalDate;
import javax.swing.text.Element;

public class Conexion {

    String conexionBD = "C:/Users/PC/Downloads/bd";
    Connection conn = null;

    public Conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(conexionBD);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos." + e.getMessage(), "BD", JOptionPane.ERROR_MESSAGE);
        }
    }

    static int IDusuario;

    public void validarUsuario(String userr, String pass) {
        
        String user = String.valueOf(userr);
        String cod = pass;
        String SQl = "SELECT * FROM admin  WHERE usuario='" + user + "' and ps='" + cod + "'";
        String SQLu = "SELECT * FROM usuario  WHERE Correo='" + user + "' and Contra='" + cod + "'";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQl); //generar consulta y guardar el resultado en el rs
            if (rs.next()) {

                menuAdmin form = new menuAdmin();

                form.setVisible(true);
                stmt.close();
                rs.close();

            } else {
                try {
                    Statement stmts = conn.createStatement();
                    ResultSet rss = stmt.executeQuery(SQLu);
                    if (rss.next()) {

                        IDusuario = rss.getInt("id");
                        System.out.println("id=" + IDusuario);

                        Principal form = new Principal();
                        form.setVisible(true);
                        stmts.close();
                        rss.close();

                    } else {
                        JOptionPane.showMessageDialog(null, "Informacion incorrecta");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }

    }

    public int ejecutarSentenciaSQL(String sentenciaSQL) {
        try {
            PreparedStatement ptmt = conn.prepareStatement(sentenciaSQL);
            ptmt.execute();
            return 1;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "BD", JOptionPane.ERROR_MESSAGE);
            return 0;
        }

    }

    public void añadir(String sentenciaSQL) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sentenciaSQL);
            JOptionPane.showMessageDialog(null, "Producto registrado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar a la base de datos");
            System.out.println(ex);
        }

    }

    public ResultSet consultar(String SentenciaSQL) {
        try {
            PreparedStatement ptmt = conn.prepareStatement(SentenciaSQL);
            ResultSet respuesta = ptmt.executeQuery();
            return respuesta;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "BD", JOptionPane.ERROR_MESSAGE);

            return null;
        }

    }

    public void carrito(String nombre, int etiqueta, String tipo, float precio, int unidades, String imagen) {
        String sentenciaSQL = "INSERT INTO Carrito  (IDusuario,Nombre, Etiqueta, Tipo, Precio,Unidades, Nimagen) VALUES ('" + IDusuario + "','" + nombre + "','" + etiqueta + "','" + tipo + "','" + precio + "','" + unidades + "','" + imagen + "')";
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sentenciaSQL);
            JOptionPane.showMessageDialog(null, "Carrito actualizado ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido agregar productos al carrito");
            System.out.println(ex);
        }

    }

    public ResultSet consultarCarrito() {
        String SentenciaSQL = "SELECT IDcompra FROM Carrito WHERE IDusuario = '" + IDusuario + "'";
        try {
            PreparedStatement ptmt = conn.prepareStatement(SentenciaSQL);
            ResultSet respuesta = ptmt.executeQuery();
            return respuesta;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "BD", JOptionPane.ERROR_MESSAGE);

            return null;
        }

    }

    public String procesarCarrito() {
        String consulta = "SELECT Nombre, Precio, Unidades FROM Carrito WHERE IDusuario = ?";
        List<String> nombres = new ArrayList<>();
        List<Integer> precios = new ArrayList<>();
        List<Integer> unidades = new ArrayList<>();
        int acumulador = 0;

        try (PreparedStatement ptmt = conn.prepareStatement(consulta)) {
            ptmt.setInt(1, IDusuario);
            ResultSet respuesta = ptmt.executeQuery();

            boolean productosEncontrados = false;

            while (respuesta.next()) {
                productosEncontrados = true; // Al menos un producto fue encontrado

                String nombre = respuesta.getString("Nombre");
                int precio = respuesta.getInt("Precio");
                int cantidad = respuesta.getInt("Unidades");

                nombres.add(nombre);
                precios.add(precio);
                unidades.add(cantidad);

                acumulador += precio * cantidad;
            }

            if (!productosEncontrados) {
                return ""; // No se encontraron productos, retorna texto vacío
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente
        }

        // Calcular IVA y Total
        double iva = acumulador * 0.19; // Supongo un 19% de IVA
        double total = acumulador + iva;

        // Construir el texto en formato HTML con los títulos en negrita
        StringBuilder facturaHTML = new StringBuilder();
        facturaHTML.append("<html>");
        facturaHTML.append("<body>");
        facturaHTML.append("<h1>Factura</h1>");

        facturaHTML.append("<p><strong>Pre-total:</strong> " + acumulador + "</p>");
        facturaHTML.append("<p><strong>IVA 19%:</strong> " + iva + "</p>");
        facturaHTML.append("<p><strong>Total:</strong> " + total + "</p>");

        facturaHTML.append("</body>");
        facturaHTML.append("</html>");

        return facturaHTML.toString();
    }

    public String procesarCarrito1() {
        String consulta = "SELECT Nombre, Precio, Unidades FROM Carrito WHERE IDusuario = ?";
        List<String> nombres = new ArrayList<>();
        List<Integer> precios = new ArrayList<>();
        List<Integer> unidades = new ArrayList<>();
        int acumulador = 0;

        try (PreparedStatement ptmt = conn.prepareStatement(consulta)) {
            ptmt.setInt(1, IDusuario);
            ResultSet respuesta = ptmt.executeQuery();

            boolean productosEncontrados = false;

            while (respuesta.next()) {
                productosEncontrados = true; // Al menos un producto fue encontrado

                String nombre = respuesta.getString("Nombre");
                int precio = respuesta.getInt("Precio");
                int cantidad = respuesta.getInt("Unidades");

                nombres.add(nombre);
                precios.add(precio);
                unidades.add(cantidad);

                acumulador += precio * cantidad;
            }

            if (!productosEncontrados) {
                return ""; // No se encontraron productos, retorna texto vacío
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente
        }

        // Calcular IVA y Total
        double iva = acumulador * 0.19; // Supongo un 19% de IVA
        double total = acumulador + iva;

        // Construir el texto en formato HTML con los títulos en negrita
        StringBuilder facturaHTML = new StringBuilder();
        facturaHTML.append("<html>");
        facturaHTML.append("<body style='font-family: Rockwell, Arial, sans-serif; margin: 50px; background-color: #f9f9f9; padding: 20px;'>");
        facturaHTML.append("<div style='max-width: 600px; margin: 0 auto; background-color: #fff; padding: 20px; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);'>");
        facturaHTML.append("<h1 style='text-align: center; color: #333;'>Detalles</h1>");

        for (int i = 0; i < nombres.size(); i++) {
            facturaHTML.append("<div class='product' style='margin-bottom: 15px; padding: 10px; border: 1px solid #ddd; border-radius: 3px;'>");
            facturaHTML.append("<p><strong>Producto:</strong> " + nombres.get(i) + " (" + unidades.get(i) + ")</p>");
            facturaHTML.append("<p><strong>Precio:</strong> $" + precios.get(i) + "</p>");
            facturaHTML.append("</div>");
        }

        facturaHTML.append("<p style='text-align: right;'><strong>sub-total:</strong> $" + acumulador + "</p>");
        facturaHTML.append("<p style='text-align: right;'><strong>IVA 19%:</strong> $" + iva + "</p>");
        facturaHTML.append("<p style='text-align: right;'><strong>Total:</strong> $" + total + "</p>");

        facturaHTML.append("</div>"); // Cierre del contenedor principal
        facturaHTML.append("</body>");
        facturaHTML.append("</html>");

        return facturaHTML.toString();
    }

    public void generarFacturaPDF() {
        String facturaHTML = procesarCarrito1();
        String rutaPDF = "D:/prueba/factura.pdf";

        Document document = new Document(PageSize.A4);

        try {
            PdfWriter.getInstance(document, new FileOutputStream(new File(rutaPDF)));
            document.open();

            HTMLWorker htmlWorker = new HTMLWorker(document);
            htmlWorker.parse(new StringReader(facturaHTML));

            document.close();
            System.out.println("PDF creado exitosamente en: " + rutaPDF);

            File file = new File(rutaPDF);
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void procesarFactura(String direccion, String metodoPago, String telefono) {
        String consulta = "SELECT Nombre, Precio, Unidades FROM Carrito WHERE IDusuario = ?";
        List<String> nombres = new ArrayList<>();
        List<Integer> precios = new ArrayList<>();
        List<Integer> unidades = new ArrayList<>();
        int acumulador = 0;

        try (PreparedStatement ptmt = conn.prepareStatement(consulta)) {
            ptmt.setInt(1, IDusuario);
            ResultSet respuesta = ptmt.executeQuery();

            boolean productosEncontrados = false;

            while (respuesta.next()) {
                productosEncontrados = true; // Al menos un producto fue encontrado

                String nombre = respuesta.getString("Nombre");
                int precio = respuesta.getInt("Precio");
                int cantidad = respuesta.getInt("Unidades");

                nombres.add(nombre);
                precios.add(precio);
                unidades.add(cantidad);

                acumulador += precio * cantidad;
            }

            if (!productosEncontrados) {

            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente
        }

        // Calcular IVA y Total
        double iva = acumulador * 0.19; // Supongo un 19% de IVA
        double total = acumulador + iva;

        // Construir el texto en formato HTML con los títulos en negrita
        StringBuilder facturaHTML = new StringBuilder();
        LocalDate fechaActual = LocalDate.now();

        facturaHTML.append("<html>");
        facturaHTML.append("<body style='font-family: Rockwell, Arial, sans-serif; margin: 50px; background-color: #f9f9f9; padding: 20px;'>");
        facturaHTML.append("<div style='max-width: 600px; margin: 0 auto; background-color: #fff; padding: 20px; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);'>");
        facturaHTML.append("<h1 style='text-align: center; color: #333; font-size: 36px;'>L'élégance D'arcy</h1>");
        facturaHTML.append("<br><br><br><br><h1 style='text-align: center; color: #333; font-size: 24px;'>Factura de compra</h1><br>");
        facturaHTML.append(" <h1 style='text-align: center; color: #333; font-size: 12px;'>----------------------------------------------------------------------------------------------------------------------------------</h1><br>");

        // Información de los productos
        for (int i = 0; i < nombres.size(); i++) {
            facturaHTML.append("<div class='product' style='margin-bottom: 15px; padding: 10px; border: 1px solid #ddd; border-radius: 3px;'>");
            facturaHTML.append("<p><strong>Producto:</strong> " + nombres.get(i) + " (" + unidades.get(i) + ")</p>");
            facturaHTML.append("<p><strong>Precio:</strong> $" + precios.get(i) + "</p>");
            facturaHTML.append("</div>");
        }

        // Detalles finales y de la tienda
        facturaHTML.append("<br><br><p><strong>Fecha:</strong> " + fechaActual + "</p>");
        facturaHTML.append("<p><strong>Dirección:</strong> " + direccion + "</p>");
        facturaHTML.append("<p><strong>Número de Teléfono:</strong> " + telefono + "</p>");
        facturaHTML.append("<p><strong>Método de Pago:</strong> " + metodoPago + "</p>");
        facturaHTML.append(" <h1 style='text-align: center; color: #333; font-size: 12px;'>----------------------------------------------------------------------------------------------------------------------------------</h1><br><br>");
        // Total y cierre del contenedor principal
        facturaHTML.append("<p style='text-align: right;'><strong>Sub-total:</strong> $" + acumulador + "</p>");
        facturaHTML.append("<p style='text-align: right;'><strong>IVA 19%:</strong> $" + iva + "</p>");
        facturaHTML.append("<p style='text-align: right;'><strong>Total:</strong> $" + total + "</p>");

        facturaHTML.append("</div>"); // Cierre del contenedor principal
        facturaHTML.append("</body>");
        facturaHTML.append("</html>");

        String facturaHTMLa = facturaHTML.toString();

        String rutaPDF = "D:/prueba/factura2.pdf";

        Document document = new Document(PageSize.A4);

        try {
            PdfWriter.getInstance(document, new FileOutputStream(new File(rutaPDF)));
            document.open();

            HTMLWorker htmlWorker = new HTMLWorker(document);
            htmlWorker.parse(new StringReader(facturaHTMLa));

            com.itextpdf.text.Image image = com.itextpdf.text.Image.getInstance("D:/prueba/logo.png");
            image.setAlignment(225);
            image.scaleToFit(150, 150);
            document.add(image);

            document.close();
            System.out.println("PDF creado exitosamente en: " + rutaPDF);

            File file = new File(rutaPDF);
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
