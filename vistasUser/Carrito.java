package vistasUser;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import BD.Conexion;
import BD.Configuracion;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import vistasAdmin.MetodoDePago;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author PC
 */
public class Carrito extends javax.swing.JFrame {

    private Point point;
    Conexion co = new Conexion();
    static int cantidad;
    private Configuracion configuracion = Configuracion.getInstance();
    boolean idiomaActual;
    
    public Carrito() {
        idiomaActual = configuracion.isIdioma();
        setUndecorated(true);
        initComponents();
        JButton[] btns = {Accesorios1, Hombre1, Mujer1, Instagram, Instagram1, Niño1, Twitter, Home};
        for (JButton btn : btns) {
            btn.setBackground(new Color(67, 60, 84));//color del boton original
            btn.setForeground(new Color(233, 212, 181));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(233, 212, 181));//color que tomara cuando pase el jerry por encima
                    btn.setForeground(new Color(67, 60, 84));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(67, 60, 84));//color del boton original que recupera
                    btn.setForeground(new Color(233, 212, 181));
                }
            });
        }
        JButton[] btns1 = {Mcerrar};
        for (JButton btn1 : btns1) {
            btn1.setBackground(new Color(241, 226, 205));
            btn1.setUI(new BasicButtonUI());
            btn1.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn1.setBackground(new Color(193, 28, 28));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn1.setBackground(new Color(241, 226, 205));
                }
            });
        }
        JButton[] btns2 = {Mminimizar};
        for (JButton btn2 : btns2) {
            btn2.setBackground(new Color(241, 226, 205));
            btn2.setUI(new BasicButtonUI());
            btn2.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn2.setBackground(new Color(233, 212, 181));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn2.setBackground(new Color(241, 226, 205));
                }
            });
        }
        JButton[] btns3 = {dt, jButton1, back, Sig};
        for (JButton btn3 : btns3) {
            btn3.setBackground(new Color(67, 60, 84));//color del boton original
            btn3.setForeground(new Color(233, 212, 181));
            btn3.setUI(new BasicButtonUI());
            btn3.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                   
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    
                    
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    
                   
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn3.setBackground(new Color(153,153,255));//color que tomara cuando pase el jerry por encima
                    btn3.setForeground(new Color(67, 60, 84));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn3.setBackground(new Color(67, 60, 84));//color del boton original que recupera
                    btn3.setForeground(new Color(233, 212, 181));
                }
            });
        }
        ConsultaIDs();
        Sig.doClick();
        setLocationRelativeTo(null);
        String factura = co.procesarCarrito();
        fctura.setText(factura);
        tra();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CMA = new javax.swing.JPanel();
        Mcerrar = new javax.swing.JButton();
        Mminimizar = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        Menu2 = new javax.swing.JPanel();
        Carrito1 = new javax.swing.JButton();
        Mujer1 = new javax.swing.JButton();
        Hombre1 = new javax.swing.JButton();
        Niño1 = new javax.swing.JButton();
        Accesorios1 = new javax.swing.JButton();
        Bienvenido3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Bienvenido4 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        Lup = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        LDown = new javax.swing.JPanel();
        redes = new javax.swing.JTextField();
        Twitter = new javax.swing.JButton();
        Instagram = new javax.swing.JButton();
        Contacto = new javax.swing.JTextField();
        Instagram1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Image1 = new javax.swing.JLabel();
        Info1 = new javax.swing.JLabel();
        Image2 = new javax.swing.JLabel();
        Info2 = new javax.swing.JLabel();
        Image3 = new javax.swing.JLabel();
        Info3 = new javax.swing.JLabel();
        Sig = new javax.swing.JButton();
        nn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fctura = new javax.swing.JLabel();
        dt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CMA.setBackground(new java.awt.Color(241, 226, 205));
        CMA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CMAMouseDragged(evt);
            }
        });
        CMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CMAMousePressed(evt);
            }
        });

        Mcerrar.setBackground(new java.awt.Color(241, 226, 205));
        Mcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel (1).png"))); // NOI18N
        Mcerrar.setBorder(null);
        Mcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                McerrarActionPerformed(evt);
            }
        });

        Mminimizar.setBackground(new java.awt.Color(241, 226, 205));
        Mminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus (1).png"))); // NOI18N
        Mminimizar.setBorder(null);
        Mminimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MminimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CMALayout = new javax.swing.GroupLayout(CMA);
        CMA.setLayout(CMALayout);
        CMALayout.setHorizontalGroup(
            CMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CMALayout.createSequentialGroup()
                .addContainerGap(1124, Short.MAX_VALUE)
                .addComponent(Mminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CMALayout.setVerticalGroup(
            CMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mminimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(Mcerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(CMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 30));

        Fondo.setBackground(new java.awt.Color(241, 226, 205));
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu2.setBackground(new java.awt.Color(29, 26, 37));
        Menu2.setForeground(new java.awt.Color(204, 255, 255));

        Carrito1.setBackground(new java.awt.Color(153, 153, 255));
        Carrito1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Carrito1.setForeground(new java.awt.Color(233, 212, 181));
        Carrito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shopping-cart.png"))); // NOI18N
        Carrito1.setText("Carrito");
        Carrito1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 212, 181), 3));
        Carrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito1ActionPerformed(evt);
            }
        });

        Mujer1.setBackground(new java.awt.Color(67, 60, 84));
        Mujer1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Mujer1.setForeground(new java.awt.Color(233, 212, 181));
        Mujer1.setText("Mujer");
        Mujer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 212, 181)));
        Mujer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mujer1ActionPerformed(evt);
            }
        });

        Hombre1.setBackground(new java.awt.Color(67, 60, 84));
        Hombre1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Hombre1.setForeground(new java.awt.Color(233, 212, 181));
        Hombre1.setText("Hombre");
        Hombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 212, 181)));
        Hombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hombre1ActionPerformed(evt);
            }
        });

        Niño1.setBackground(new java.awt.Color(67, 60, 84));
        Niño1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Niño1.setForeground(new java.awt.Color(233, 212, 181));
        Niño1.setText("Niño/a");
        Niño1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 212, 181)));
        Niño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Niño1ActionPerformed(evt);
            }
        });

        Accesorios1.setBackground(new java.awt.Color(67, 60, 84));
        Accesorios1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Accesorios1.setForeground(new java.awt.Color(233, 212, 181));
        Accesorios1.setText("Accesorios");
        Accesorios1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 212, 181)));
        Accesorios1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Accesorios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accesorios1ActionPerformed(evt);
            }
        });

        Bienvenido3.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Bienvenido3.setForeground(new java.awt.Color(233, 212, 181));
        Bienvenido3.setText("Acerca de:");

        jPanel4.setBackground(new java.awt.Color(241, 226, 205));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Bienvenido4.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Bienvenido4.setForeground(new java.awt.Color(233, 212, 181));
        Bienvenido4.setText("Categorias:");

        Home.setBackground(new java.awt.Color(67, 60, 84));
        Home.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Home.setForeground(new java.awt.Color(233, 212, 181));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        Home.setText("Inicio");
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        Home.setBorderPainted(false);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu2Layout = new javax.swing.GroupLayout(Menu2);
        Menu2.setLayout(Menu2Layout);
        Menu2Layout.setHorizontalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Menu2Layout.createSequentialGroup()
                .addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bienvenido3)
                            .addComponent(Carrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Menu2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bienvenido4)
                            .addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Niño1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Hombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(Mujer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Accesorios1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        Menu2Layout.setVerticalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(Bienvenido4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Mujer1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Hombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Niño1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Accesorios1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Bienvenido3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Carrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        Fondo.add(Menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, 708));

        Lup.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout LupLayout = new javax.swing.GroupLayout(Lup);
        Lup.setLayout(LupLayout);
        LupLayout.setHorizontalGroup(
            LupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LupLayout.setVerticalGroup(
            LupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Fondo.add(Lup, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 1, 940, -1));

        Nombre.setBackground(new java.awt.Color(0, 153, 153));
        Nombre.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Nombre.setForeground(new java.awt.Color(29, 26, 37));
        Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shopping-cart_1.png"))); // NOI18N
        Nombre.setText("carrito");
        Fondo.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 35, -1, -1));

        LDown.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout LDownLayout = new javax.swing.GroupLayout(LDown);
        LDown.setLayout(LDownLayout);
        LDownLayout.setHorizontalGroup(
            LDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LDownLayout.setVerticalGroup(
            LDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Fondo.add(LDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 940, -1));

        redes.setEditable(false);
        redes.setBackground(new java.awt.Color(67, 60, 84));
        redes.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        redes.setForeground(new java.awt.Color(233, 212, 181));
        redes.setText("Siguenos en nuestras redes");
        redes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        redes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redesActionPerformed(evt);
            }
        });
        Fondo.add(redes, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 657, -1, 36));

        Twitter.setBackground(new java.awt.Color(67, 60, 84));
        Twitter.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Twitter.setForeground(new java.awt.Color(0, 153, 153));
        Twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/twitter.png"))); // NOI18N
        Twitter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Twitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwitterActionPerformed(evt);
            }
        });
        Fondo.add(Twitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 657, -1, -1));

        Instagram.setBackground(new java.awt.Color(67, 60, 84));
        Instagram.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Instagram.setForeground(new java.awt.Color(0, 153, 153));
        Instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instagram.png"))); // NOI18N
        Instagram.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Instagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstagramActionPerformed(evt);
            }
        });
        Fondo.add(Instagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 657, -1, -1));

        Contacto.setEditable(false);
        Contacto.setBackground(new java.awt.Color(67, 60, 84));
        Contacto.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Contacto.setForeground(new java.awt.Color(233, 212, 181));
        Contacto.setText("Contactanos");
        Contacto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Fondo.add(Contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 657, -1, 36));

        Instagram1.setBackground(new java.awt.Color(67, 60, 84));
        Instagram1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Instagram1.setForeground(new java.awt.Color(0, 153, 153));
        Instagram1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/whatsapp.png"))); // NOI18N
        Instagram1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Instagram1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Instagram1ActionPerformed(evt);
            }
        });
        Fondo.add(Instagram1, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 657, -1, -1));

        back.setBackground(new java.awt.Color(67, 60, 84));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up-arrow (1).png"))); // NOI18N
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 60, 84), 2));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        Fondo.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 50, 40));

        Image1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Fondo.add(Image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 90, 110));

        Info1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Info1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65), 2));
        Fondo.add(Info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 210, 100));

        Image2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Fondo.add(Image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 90, 120));

        Info2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Info2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65), 2));
        Fondo.add(Info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 210, 100));

        Image3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Fondo.add(Image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 90, 120));

        Info3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Info3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65), 2));
        Fondo.add(Info3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 210, 100));

        Sig.setBackground(new java.awt.Color(67, 60, 84));
        Sig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up-arrow (2).png"))); // NOI18N
        Sig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 60, 84), 2));
        Sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigActionPerformed(evt);
            }
        });
        Fondo.add(Sig, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 50, 40));

        nn.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        nn.setForeground(new java.awt.Color(29, 26, 37));
        nn.setText("No hay elementos en el carrito");
        Fondo.add(nn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 520, 60));

        jPanel1.setBackground(new java.awt.Color(241, 226, 205));

        fctura.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        dt.setBackground(new java.awt.Color(67, 60, 84));
        dt.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        dt.setForeground(new java.awt.Color(233, 212, 181));
        dt.setText("Ver mas detalles");
        dt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        dt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(67, 60, 84));
        jButton1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(233, 212, 181));
        jButton1.setText("Finalizar compra");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fctura, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fctura, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 280, 480));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1190, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CMAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMAMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_CMAMousePressed

    private void CMAMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMAMouseDragged
        int CurrentX = this.getLocation().x;
        int CurrentY = this.getLocation().y;

        int MoveX = (CurrentX + evt.getX()) - (CurrentX + point.x);
        int MoveY = (CurrentY + evt.getY()) - (CurrentY + point.y);

        int x = CurrentX + MoveX;
        int y = CurrentY + MoveY;

        this.setLocation(x, y);
    }//GEN-LAST:event_CMAMouseDragged
    private static void openWebPage(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
    private void McerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_McerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_McerrarActionPerformed

    private void MminimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MminimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MminimizarActionPerformed

    private void InstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstagramActionPerformed
        // TODO add your handling code here:
        openWebPage("https://instagram.com/lelegance_darcy05?igshid=OGQ5ZDc2ODk2ZA==");
    }//GEN-LAST:event_InstagramActionPerformed

    private void redesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redesActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Principal form = new Principal();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void Accesorios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accesorios1ActionPerformed
        Accesorios form = new Accesorios();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Accesorios1ActionPerformed

    private void Niño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Niño1ActionPerformed
        Niño form = new Niño();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Niño1ActionPerformed

    private void Hombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hombre1ActionPerformed
        Hombre form = new Hombre();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Hombre1ActionPerformed

    private void Mujer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mujer1ActionPerformed
        Mujer form = new Mujer();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Mujer1ActionPerformed

    private void Carrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito1ActionPerformed
        Carrito form = new Carrito();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Carrito1ActionPerformed
    private int posicionActualSig = 0;
    private int posicionActualBack = 0;
    private List<Integer> idArray = new ArrayList<>();

    public void ConsultaIDs() {
        try {
          
            ResultSet resultadoIDs = co.consultarCarrito();
            while (resultadoIDs.next()) {
                int IDcompra = resultadoIDs.getInt("IDcompra");
                idArray.add(IDcompra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (posicionActualBack > 0) {
            posicionActualBack--;
        } else {
            posicionActualBack = idArray.size() - 1;
        }

        int posicion = posicionActualBack % idArray.size();

        LabelM1(Image1, idArray.get(posicion), Info1);
        LabelM2(Image2, idArray.get((posicion + 1) % idArray.size()), Info2);
        LabelM3(Image3, idArray.get((posicion + 2) % idArray.size()), Info3);
    }//GEN-LAST:event_backActionPerformed

    private void SigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigActionPerformed
        if (idArray.isEmpty()) {
            Image1.setVisible(false);
            Info1.setVisible(false);
            Image2.setVisible(false);
            Info2.setVisible(false);
            Image3.setVisible(false);
            Info3.setVisible(false);
            back.setVisible(false);
            Sig.setVisible(false);
            dt.setVisible(false);
            nn.setVisible(true);
            System.out.println("No hay elementos en idArray");
            return;
        }
        int posicion = posicionActualSig % idArray.size();
        int tamArray = idArray.size();
        
        if (tamArray == 1) {
            LabelM1(Image1, idArray.get(posicion), Info1);
            Image2.setVisible(false);
            Info2.setVisible(false);
            Image3.setVisible(false);
            Info3.setVisible(false);
            nn.setVisible(false);
            back.setVisible(false);
            Sig.setVisible(false);
            dt.setVisible(true);
        } else if (tamArray == 2) {
            LabelM1(Image1, idArray.get(posicion), Info1);
            LabelM2(Image2, idArray.get((posicion + 1) % idArray.size()), Info2);
            Image2.setVisible(true);
            Info2.setVisible(true);
            Image3.setVisible(false);
            Info3.setVisible(false);
            nn.setVisible(false);
            back.setVisible(false);
            Sig.setVisible(false);
            dt.setVisible(true);
        } else if (tamArray == 3) {
            LabelM1(Image1, idArray.get(posicion), Info1);
            LabelM2(Image2, idArray.get((posicion + 1) % idArray.size()), Info2);
            LabelM3(Image3, idArray.get((posicion + 2) % idArray.size()), Info3);
            Image2.setVisible(true);
            Info2.setVisible(true);
            Image3.setVisible(true);
            Info3.setVisible(true);
            nn.setVisible(false);
            back.setVisible(false);
            Sig.setVisible(false);
            dt.setVisible(true);
        }
        else if (tamArray > 3) {
            LabelM1(Image1, idArray.get(posicion), Info1);
            LabelM2(Image2, idArray.get((posicion + 1) % idArray.size()), Info2);
            LabelM3(Image3, idArray.get((posicion + 2) % idArray.size()), Info3);
            Image2.setVisible(true);
            Info2.setVisible(true);
            Image3.setVisible(true);
            Info3.setVisible(true);
            nn.setVisible(false);
            back.setVisible(true);
            Sig.setVisible(true);
            dt.setVisible(true);
        }
        // Incrementa la posición actual para el botón "Sig" para la próxima vez
        posicionActualSig++;
    }//GEN-LAST:event_SigActionPerformed

    private void dtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtActionPerformed
        // TODO add your handling code here:
        co.generarFacturaPDF();
    }//GEN-LAST:event_dtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MetodoDePago mp = new MetodoDePago();
        mp.setVisible(true);   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TwitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwitterActionPerformed
        // TODO add your handling code here:
        openWebPage("https://twitter.com/URBANOSTORE05?t=nGlyttEKwB2M877W8TntNA&s=09");
    }//GEN-LAST:event_TwitterActionPerformed

    private void Instagram1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instagram1ActionPerformed
        // TODO add your handling code here:
         openWebPage("https://wa.me/573022311918");
    }//GEN-LAST:event_Instagram1ActionPerformed
    int IDusuario;
    String nombre;
    int etiqueta;
    String Tipo;
    float precio;
    String Nimagen;
    int Unidades;
    int IDcompra;
    String textoProducto1;

    public void LabelM1(JLabel promo, int IDdelproducto, JLabel Text) {
        String SentenciaSQL = "Select IDusuario, Nombre, Etiqueta, Tipo, Precio, Unidades, Nimagen, IDcompra FROM Carrito WHERE IDcompra =" + IDdelproducto; 
        try {

            ResultSet resultado = co.consultar(SentenciaSQL);
            while (resultado.next()) {
                IDusuario = resultado.getInt("IDusuario");
                nombre = resultado.getString("Nombre");
                etiqueta = resultado.getInt("Etiqueta");
                Tipo = resultado.getString("Tipo");
                precio = resultado.getFloat("Precio");
                Nimagen = resultado.getString("Nimagen");
                Unidades = resultado.getInt("Unidades");
                IDcompra = resultado.getInt("IDcompra");

                textoProducto1 = "<html>"
                        + "<center><b>&emsp;&emsp;Nombre:</b> " + nombre + "<br>"
                        + "<b>Categoría:</b>" + Tipo + "<br>"
                        + "<b>&emsp;Precio:</b>" + precio + " pesos" + "<br>"
                        + "<b>&emsp;Unidades seleccionadas:</b> " + Unidades + "</center>"
                        + "</html>";

                String Ruta = "D:/prueba/" + Nimagen;
                Image mImage = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImage.getScaledInstance(promo.getWidth(), promo.getHeight(), Image.SCALE_SMOOTH));
                promo.setIcon(mIcono);
                Text.setText(textoProducto1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "BD", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
    int IDusuario2;
    String nombre2;
    int etiqueta2;
    String Tipo2;
    float precio2;
    String Nimagen2;
    int Unidades2;
    int IDcompra2;
    String textoProducto2;

    public void LabelM2(JLabel promo, int ID, JLabel Text) {
        String SentenciaSQL = "Select IDusuario, Nombre, Etiqueta, Tipo, Precio, Unidades, Nimagen, IDcompra FROM Carrito WHERE IDcompra =" + ID;
        try {

            ResultSet resultado = co.consultar(SentenciaSQL);
            while (resultado.next()) {
                IDusuario2 = resultado.getInt("IDusuario");
                nombre2 = resultado.getString("Nombre");
                etiqueta2 = resultado.getInt("Etiqueta");
                Tipo2 = resultado.getString("Tipo");
                precio2 = resultado.getFloat("Precio");
                Nimagen2 = resultado.getString("Nimagen");
                Unidades2 = resultado.getInt("Unidades");
                IDcompra2 = resultado.getInt("IDcompra");

                textoProducto2 = "<html>"
                        + "<center><b>&emsp;&emsp;Nombre:</b> " + nombre2 + "<br>"
                        + "<b>Categoría:</b>" + Tipo2 + "<br>"
                        + "<b>&emsp;Precio:</b>" + precio2 + " pesos" + "<br>"
                        + "<b>&emsp;Unidades seleccionadas:</b> " + Unidades2 + "</center>"
                        + "</html>";

                String Ruta = "D:/prueba/" + Nimagen2;
                Image mImage = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImage.getScaledInstance(promo.getWidth(), promo.getHeight(), Image.SCALE_SMOOTH));
                promo.setIcon(mIcono);
                Text.setText(textoProducto2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "BD", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
    int IDusuario3;
    String nombre3;
    int etiqueta3;
    String Tipo3;
    float precio3;
    String Nimagen3;
    int Unidades3;
    int IDcompra3;
    String textoProducto3;

    public void LabelM3(JLabel promo, int ID, JLabel Text) {
        String SentenciaSQL = "Select IDusuario, Nombre, Etiqueta, Tipo, Precio, Unidades, Nimagen, IDcompra FROM Carrito WHERE IDcompra =" + ID;
        try {

            ResultSet resultado = co.consultar(SentenciaSQL);
            while (resultado.next()) {
                IDusuario3 = resultado.getInt("IDusuario");
                nombre3 = resultado.getString("Nombre");
                etiqueta3 = resultado.getInt("Etiqueta");
                Tipo3 = resultado.getString("Tipo");
                precio3 = resultado.getFloat("Precio");
                Nimagen3 = resultado.getString("Nimagen");
                Unidades3 = resultado.getInt("Unidades");
                IDcompra3 = resultado.getInt("IDcompra");

               textoProducto3 = "<html>"
                        + "<center><b>&emsp;&emsp;Nombre:</b> " + nombre3 + "<br>"
                        + "<b>Categoría:</b>" + Tipo3 + "<br>"
                        + "<b>&emsp;Precio:</b>" + precio3 + " pesos" + "<br>"
                        + "<b>&emsp;Unidades seleccionadas:</b> " + Unidades3 + "</center>"
                        + "</html>";

                String Ruta = "D:/prueba/" + Nimagen3;
                Image mImage = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImage.getScaledInstance(promo.getWidth(), promo.getHeight(), Image.SCALE_SMOOTH));
                promo.setIcon(mIcono);
                Text.setText(textoProducto3);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "BD", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
    
    public void tra() {
        Configuracion configuracion = Configuracion.getInstance(); // Obtiene la instancia compartida
        boolean idiomaActual = configuracion.isIdioma();
        Home.setText(idiomaActual ? "Inicio" : "Home");
        Nombre.setText(idiomaActual ? "CARRITO" : "Shopping");
        Bienvenido4.setText(idiomaActual ? "Categorias" : "Category");
        Mujer1.setText(idiomaActual ? "Mujer" : "Woman");
        Hombre1.setText(idiomaActual ? "Hombre" : "Man");
        Niño1.setText(idiomaActual ? "Niño/a" : "Children");
        Accesorios1.setText(idiomaActual ? "Accesorios" : "Accessories");
        Carrito1.setText(idiomaActual ? "Carrito" : "Shopping");
        Bienvenido3.setText(idiomaActual ? "Acerca de:" : "About:");
        nn.setText(idiomaActual ? "No hay elementos en el carrito":"Don't have any item in the shopping cart");

        redes.setText(idiomaActual ? "Siguenos en nuestras redes" : "Follow us in our social medias");
        Contacto.setText(idiomaActual ? "Compartir" : "Share");

        String nameLabel = idiomaActual ? "Nombre:" : "Name:";
        String categoryLabel = idiomaActual ? "Categoría:" : "Category:";
        String prizeLabel = idiomaActual ? "Precio:" : "Price:";
        String stockLabel = idiomaActual ? "Unidades disponibles:" : "stock:";

        textoProducto1 = "<html>"
                + "<center><b>&emsp;&emsp;" + nameLabel + "</b> " + nombre + "<br>"
                + "<b>" + categoryLabel + "</b> " + Tipo + "<br>"
                + "<b>&emsp;" + prizeLabel + "</b> " + precio + (idiomaActual ? " pesos" : " cop") + "<br>"
                + "<b>&emsp;" + stockLabel + "</b> " + Unidades + "</center>"
                + "</html>";

        textoProducto2 = "<html>"
                + "<center><b>&emsp;&emsp;" + nameLabel + "</b> " + nombre2 + "<br>"
                + "<b>" + categoryLabel + "</b> " + Tipo2 + "<br>"
                + "<b>&emsp;" + prizeLabel + "</b> " + precio2 + (idiomaActual ? " pesos" : " cop") + "<br>"
                + "<b>&emsp;" + stockLabel + "</b> " + Unidades2 + "</center>"
                + "</html>";

        textoProducto3 = "<html>"
                + "<center><b>&emsp;&emsp;" + nameLabel + "</b> " + nombre3 + "<br>"
                + "<b>" + categoryLabel + "</b> " + Tipo3 + "<br>"
                + "<b>&emsp;" + prizeLabel + "</b> " + precio3 + (idiomaActual ? " pesos" : " cop") + "<br>"
                + "<b>&emsp;" + stockLabel + "</b> " + Unidades3 + "</center>"
                + "</html>";

        Info1.setText(textoProducto1);
        Info2.setText(textoProducto2);
        Info3.setText(textoProducto3);

    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accesorios1;
    private javax.swing.JLabel Bienvenido3;
    private javax.swing.JLabel Bienvenido4;
    private javax.swing.JPanel CMA;
    private javax.swing.JButton Carrito1;
    private javax.swing.JTextField Contacto;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton Hombre1;
    private javax.swing.JButton Home;
    private javax.swing.JLabel Image1;
    private javax.swing.JLabel Image2;
    private javax.swing.JLabel Image3;
    private javax.swing.JLabel Info1;
    private javax.swing.JLabel Info2;
    private javax.swing.JLabel Info3;
    private javax.swing.JButton Instagram;
    private javax.swing.JButton Instagram1;
    private javax.swing.JPanel LDown;
    private javax.swing.JPanel Lup;
    private javax.swing.JButton Mcerrar;
    private javax.swing.JPanel Menu2;
    private javax.swing.JButton Mminimizar;
    private javax.swing.JButton Mujer1;
    private javax.swing.JButton Niño1;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Sig;
    private javax.swing.JButton Twitter;
    private javax.swing.JButton back;
    private javax.swing.JButton dt;
    private javax.swing.JLabel fctura;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nn;
    private javax.swing.JTextField redes;
    // End of variables declaration//GEN-END:variables
}
