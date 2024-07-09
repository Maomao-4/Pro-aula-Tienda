package vistasUser;

import BD.Configuracion;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import BD.Conexion;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import project.Project;

public class Principal extends javax.swing.JFrame {

    private Point point;
    private Configuracion configuracion = Configuracion.getInstance();
    boolean idiomaActual;
    

    public Principal() {
        
        idiomaActual = configuracion.isIdioma();
        setUndecorated(true);
        initComponents();
        JButton[] btns = {Accesorios, Carrito, Hombre, Instagram, Instagram1, Mujer, Niño, Twitter};
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
        
        Prom(promo);
        PocoStock(PocoStock);
        tra();
        setLocationRelativeTo(null);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lup = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JLabel();
        Carrito = new javax.swing.JButton();
        Mujer = new javax.swing.JButton();
        Hombre = new javax.swing.JButton();
        Niño = new javax.swing.JButton();
        Accesorios = new javax.swing.JButton();
        Bienvenido1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Bienvenido2 = new javax.swing.JLabel();
        Promo = new javax.swing.JLabel();
        Pstock = new javax.swing.JLabel();
        redes = new javax.swing.JTextField();
        Twitter = new javax.swing.JButton();
        Instagram = new javax.swing.JButton();
        Instagram1 = new javax.swing.JButton();
        Contacto1 = new javax.swing.JTextField();
        LDown1 = new javax.swing.JPanel();
        LDown2 = new javax.swing.JPanel();
        promo = new javax.swing.JLabel();
        PocoStock = new javax.swing.JLabel();
        InfoStock = new javax.swing.JLabel();
        InfoProm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MujerCMA = new javax.swing.JPanel();
        Mcerrar = new javax.swing.JButton();
        Mminimizar = new javax.swing.JButton();

        Lup.setBackground(new java.awt.Color(0, 153, 153));

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(241, 226, 205));
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fondo.setEnabled(false);
        Fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FondoMousePressed(evt);
            }
        });
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setBackground(new java.awt.Color(29, 26, 37));
        Nombre.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Nombre.setForeground(new java.awt.Color(29, 26, 37));
        Nombre.setText("L'élégance D'arcy");
        Fondo.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 380, 60));

        Menu.setBackground(new java.awt.Color(29, 26, 37));
        Menu.setForeground(new java.awt.Color(204, 255, 255));

        Bienvenido.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Bienvenido.setForeground(new java.awt.Color(233, 212, 181));
        Bienvenido.setText("BIENVENIDO");

        Carrito.setBackground(new java.awt.Color(67, 60, 84));
        Carrito.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Carrito.setForeground(new java.awt.Color(233, 212, 181));
        Carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shopping-cart.png"))); // NOI18N
        Carrito.setText("Carrito");
        Carrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 212, 181)));
        Carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarritoActionPerformed(evt);
            }
        });

        Mujer.setBackground(new java.awt.Color(67, 60, 84));
        Mujer.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Mujer.setForeground(new java.awt.Color(233, 212, 181));
        Mujer.setText("Mujer");
        Mujer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 212, 181)));
        Mujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MujerActionPerformed(evt);
            }
        });

        Hombre.setBackground(new java.awt.Color(67, 60, 84));
        Hombre.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Hombre.setForeground(new java.awt.Color(233, 212, 181));
        Hombre.setText("Hombre");
        Hombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 212, 181)));
        Hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HombreActionPerformed(evt);
            }
        });

        Niño.setBackground(new java.awt.Color(67, 60, 84));
        Niño.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Niño.setForeground(new java.awt.Color(233, 212, 181));
        Niño.setText("Niño/a");
        Niño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 212, 181)));
        Niño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NiñoActionPerformed(evt);
            }
        });

        Accesorios.setBackground(new java.awt.Color(67, 60, 84));
        Accesorios.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Accesorios.setForeground(new java.awt.Color(233, 212, 181));
        Accesorios.setText("Accesorios");
        Accesorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 212, 181)));
        Accesorios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Accesorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccesoriosActionPerformed(evt);
            }
        });

        Bienvenido1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Bienvenido1.setForeground(new java.awt.Color(233, 212, 181));
        Bienvenido1.setText("Acerca de:");

        jPanel1.setBackground(new java.awt.Color(241, 226, 205));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Bienvenido2.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Bienvenido2.setForeground(new java.awt.Color(233, 212, 181));
        Bienvenido2.setText("Categorias:");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bienvenido1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Accesorios, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(Niño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Hombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Mujer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Bienvenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bienvenido)
                .addGap(16, 16, 16))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bienvenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Mujer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Hombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Niño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Accesorios, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(Bienvenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        Fondo.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        Promo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Promo.setForeground(new java.awt.Color(29, 26, 37));
        Promo.setText("PROMOCIONES");
        Promo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        Fondo.add(Promo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 150, -1));

        Pstock.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Pstock.setForeground(new java.awt.Color(29, 26, 37));
        Pstock.setText("POCO STOCK");
        Pstock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        Fondo.add(Pstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, 130, -1));

        redes.setEditable(false);
        redes.setBackground(new java.awt.Color(67, 60, 84));
        redes.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        redes.setForeground(new java.awt.Color(233, 212, 181));
        redes.setText(" Siguenos en nuestras redes");
        redes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        redes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redesActionPerformed(evt);
            }
        });
        Fondo.add(redes, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 650, 260, 36));

        Twitter.setBackground(new java.awt.Color(67, 60, 84));
        Twitter.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Twitter.setForeground(new java.awt.Color(233, 212, 181));
        Twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/twitter.png"))); // NOI18N
        Twitter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Twitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwitterActionPerformed(evt);
            }
        });
        Fondo.add(Twitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 650, -1, -1));

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
        Fondo.add(Instagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 650, -1, -1));

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
        Fondo.add(Instagram1, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 650, -1, -1));

        Contacto1.setEditable(false);
        Contacto1.setBackground(new java.awt.Color(67, 60, 84));
        Contacto1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Contacto1.setForeground(new java.awt.Color(233, 212, 181));
        Contacto1.setText("Contactanos");
        Contacto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Fondo.add(Contacto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 650, 120, 36));

        LDown1.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout LDown1Layout = new javax.swing.GroupLayout(LDown1);
        LDown1.setLayout(LDown1Layout);
        LDown1Layout.setHorizontalGroup(
            LDown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        LDown1Layout.setVerticalGroup(
            LDown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Fondo.add(LDown1, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 1, 940, -1));

        LDown2.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout LDown2Layout = new javax.swing.GroupLayout(LDown2);
        LDown2.setLayout(LDown2Layout);
        LDown2Layout.setHorizontalGroup(
            LDown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        LDown2Layout.setVerticalGroup(
            LDown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Fondo.add(LDown2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 90, 940, -1));

        promo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Fondo.add(promo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 210, 260));

        PocoStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Fondo.add(PocoStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 230, 260));

        InfoStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InfoStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65), 2));
        Fondo.add(InfoStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 230, 100));

        InfoProm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InfoProm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65), 2));
        Fondo.add(InfoProm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 210, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traducir.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 120, 70, 70));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1190, 710));

        MujerCMA.setBackground(new java.awt.Color(241, 226, 205));
        MujerCMA.setForeground(new java.awt.Color(255, 255, 255));
        MujerCMA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MujerCMAMouseDragged(evt);
            }
        });
        MujerCMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MujerCMAMousePressed(evt);
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

        javax.swing.GroupLayout MujerCMALayout = new javax.swing.GroupLayout(MujerCMA);
        MujerCMA.setLayout(MujerCMALayout);
        MujerCMALayout.setHorizontalGroup(
            MujerCMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MujerCMALayout.createSequentialGroup()
                .addContainerGap(1104, Short.MAX_VALUE)
                .addComponent(Mminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MujerCMALayout.setVerticalGroup(
            MujerCMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mminimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(Mcerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(MujerCMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarritoActionPerformed
        Carrito form = new Carrito();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CarritoActionPerformed

    private void MujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MujerActionPerformed
        Mujer form = new Mujer();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MujerActionPerformed

    private void HombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HombreActionPerformed
        Hombre form = new Hombre();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HombreActionPerformed

    private void NiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NiñoActionPerformed
        Niño form = new Niño();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NiñoActionPerformed

    private void AccesoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccesoriosActionPerformed
        Accesorios form = new Accesorios();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AccesoriosActionPerformed

    private void FondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_FondoMousePressed
    private static void openWebPage(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
    private void InstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstagramActionPerformed
        // TODO add your handling code here:
        openWebPage("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }//GEN-LAST:event_InstagramActionPerformed

    private void redesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redesActionPerformed

    private void McerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_McerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_McerrarActionPerformed

    private void MminimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MminimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MminimizarActionPerformed

    private void MujerCMAMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MujerCMAMouseDragged
        int CurrentX = this.getLocation().x;
        int CurrentY = this.getLocation().y;

        int MoveX = (CurrentX + evt.getX()) - (CurrentX + point.x);
        int MoveY = (CurrentY + evt.getY()) - (CurrentY + point.y);

        int x = CurrentX + MoveX;
        int y = CurrentY + MoveY;

        this.setLocation(x, y);
    }//GEN-LAST:event_MujerCMAMouseDragged

    private void MujerCMAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MujerCMAMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_MujerCMAMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Configuracion configuracion = Configuracion.getInstance();
        boolean idiomaActual = configuracion.isIdioma();
        configuracion.setIdioma(!idiomaActual);
        tra();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void TwitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwitterActionPerformed
        // TODO add your handling code here:
        openWebPage("https://twitter.com/URBANOSTORE05?t=nGlyttEKwB2M877W8TntNA&s=09");
    }//GEN-LAST:event_TwitterActionPerformed

    private void Instagram1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instagram1ActionPerformed
        // TODO add your handling code here:
        openWebPage("https://wa.me/573022311918");
    }//GEN-LAST:event_Instagram1ActionPerformed

    public void tra() {
    Configuracion configuracion = Configuracion.getInstance(); // Obtiene la instancia compartida
    boolean idiomaActual = configuracion.isIdioma(); // Obtiene el idioma actual

    // Realiza la traducción de los componentes según el idiomaActual
    Mujer.setText(idiomaActual ? "Mujer" : "Woman");
    Hombre.setText(idiomaActual ? "Hombre" : "Man");
    Niño.setText(idiomaActual ? "Niño/a" : "Children");
    Accesorios.setText(idiomaActual ? "Accesorios" : "Accessories");
    Carrito.setText(idiomaActual ? "Carrito" : "Shopping");
    Promo.setText(idiomaActual ? "Promociones" : "Promotions");
    Bienvenido.setText(idiomaActual ? "Bienvenido" : "Welcome");
    Bienvenido2.setText(idiomaActual ? "Categorias" : "Categories");
    redes.setText(idiomaActual ? "Siguenos en nuestras redes":"Follow us in our social medias");
    Contacto1.setText(idiomaActual ? "Contactanos":"Contact us");
    Pstock.setText(idiomaActual ? "Poco stock":"Low in stock");
    Bienvenido1.setText(idiomaActual ? "Acerca de:" : "About:");
    
    String nameLabel = idiomaActual ? "Nombre:" : "Name:";
    String categoryLabel = idiomaActual ? "Categoría:" : "Category:";
    String prizeLabel = idiomaActual ? "Precio:" : "Price:";
    String stockLabel = idiomaActual ? "Unidades disponibles:" : "stock:";

    textoProductoP = "<html>"
            + "<center><b>&emsp;&emsp;" + nameLabel + "</b> " + nombreP + "<br>"
            + "<b>" + categoryLabel + "</b> " + tipoP + "<br>"
            + "<b>&emsp;" + prizeLabel + "</b> " + precioP + (idiomaActual ? " pesos" : " cop") + "<br>"
            + "<b>&emsp;" + stockLabel + "</b> " + stockP + "</center>"
            + "</html>";

    InfoProm.setText(textoProductoP);
    InfoStock.setText(textoProductoP);
}
    String textoProductoP;
    String nombreP;
    String tipoP;
    int etiquetaP;
    int stockP;
    float precioP;

    public void Prom(JLabel promo) {
        String SentenciaSQL = "SELECT Nombre, etiqueta, tipo, precio, Nimagen, Stock FROM Productos WHERE precio = (SELECT MIN(precio) FROM Productos WHERE precio > 0 AND precio IS NOT NULL)";
        try {
            Conexion co = new Conexion();
            ResultSet resultado = co.consultar(SentenciaSQL);
            while (resultado.next()) {
                nombreP = resultado.getString("Nombre");
                etiquetaP = resultado.getInt("etiqueta");
                tipoP = resultado.getString("tipo");
                precioP = resultado.getFloat("precio");
                String Nimagen = resultado.getString("Nimagen");
                stockP = resultado.getInt("Stock");

                textoProductoP = "<html>"
                        + "<center><b>&emsp;&emsp;Nombre:</b> " + nombreP + "<br>"
                        + "<b>Categoría:</b>" + tipoP + "<br>"
                        + "<b>&emsp;Precio:</b>" + precioP + " pesos" + "<br>"
                        + "<b>&emsp;Unidades disponibles:</b> " + stockP + "</center>"
                        + "</html>";

                String Ruta = "C:/Users/PC/Downloads" + Nimagen;
                Image mImage = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImage.getScaledInstance(promo.getWidth(), promo.getHeight(), Image.SCALE_SMOOTH));
                promo.setIcon(mIcono);
                InfoProm.setText(textoProductoP);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "BD", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
String nombreS;
int etiquetaS;
String tipoS;
float precioS;
String NimagenS;
int stoockS;
    public void PocoStock(JLabel PocoStock) {
        String SentenciaSQL = "SELECT Nombre, etiqueta, tipo, precio, Nimagen, Stock FROM Productos WHERE stock = (SELECT MIN(stock) FROM Productos WHERE stock > 0 AND stock IS NOT NULL)";
        try {
            Conexion co = new Conexion();
            ResultSet resultado = co.consultar(SentenciaSQL);

            while (resultado.next()) {
                nombreS = resultado.getString("Nombre");
                etiquetaS = resultado.getInt("etiqueta");
                tipoS = resultado.getString("tipo");
                precioS = resultado.getFloat("precio");
                NimagenS = resultado.getString("Nimagen");
                stoockS = resultado.getInt("Stock");

                textoProductoP = "<html>"
                        + "<center><b>&emsp;&emsp;Nombre:</b> " + nombreS + "<br>"
                        + "<b>Categoría:</b>" + tipoS + "<br>"
                        + "<b>&emsp;Precio:</b>" + precioS + " pesos" + "<br>"
                        + "<b>&emsp;Unidades disponibles:</b> " + stoockS + "</center>"
                        + "</html>";

                String Ruta = "D:/prueba/" + NimagenS;
                Image mImage = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImage.getScaledInstance(PocoStock.getWidth(), PocoStock.getHeight(), Image.SCALE_SMOOTH));
                PocoStock.setIcon(mIcono);
                InfoStock.setText(textoProductoP);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprimir la excepción en la consola para depuración
        }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accesorios;
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JLabel Bienvenido1;
    private javax.swing.JLabel Bienvenido2;
    private javax.swing.JButton Carrito;
    private javax.swing.JTextField Contacto1;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton Hombre;
    private javax.swing.JLabel InfoProm;
    private javax.swing.JLabel InfoStock;
    private javax.swing.JButton Instagram;
    private javax.swing.JButton Instagram1;
    private javax.swing.JPanel LDown1;
    private javax.swing.JPanel LDown2;
    private javax.swing.JPanel Lup;
    private javax.swing.JButton Mcerrar;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Mminimizar;
    private javax.swing.JButton Mujer;
    private javax.swing.JPanel MujerCMA;
    private javax.swing.JButton Niño;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel PocoStock;
    private javax.swing.JLabel Promo;
    private javax.swing.JLabel Pstock;
    private javax.swing.JButton Twitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel promo;
    private javax.swing.JTextField redes;
    // End of variables declaration//GEN-END:variables
}
