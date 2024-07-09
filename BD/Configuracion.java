/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;
public class Configuracion {
    private static Configuracion instancia = null;
    private boolean idioma;

    private Configuracion() {
        // Inicializa las variables compartidas
        idioma = true; // Por ejemplo, configura el idioma inicial en "true"
    }

    public static Configuracion getInstance() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public boolean isIdioma() {
        return idioma;
    }

    public void setIdioma(boolean idioma) {
        this.idioma = idioma;
    }
}