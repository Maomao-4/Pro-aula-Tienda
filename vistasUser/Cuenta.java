package vistasUser;

import BD.Conexion;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;
import vistasAdmin.LoginAdmin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author PC
 */
public class Cuenta extends javax.swing.JFrame {

    private Point point;

    public Cuenta() {
        setUndecorated(true);
        initComponents();
        JButton[] btns = {Instagram,Twitter, registro, regresar};
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
        setLocationRelativeTo(null);
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
        Lup = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        LDown = new javax.swing.JPanel();
        NNombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        Celular = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        contra = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        registro = new javax.swing.JButton();
        redes = new javax.swing.JTextField();
        Twitter = new javax.swing.JButton();
        Instagram = new javax.swing.JButton();
        Contacto = new javax.swing.JTextField();
        Instagram2 = new javax.swing.JButton();
        Direccion1 = new javax.swing.JLabel();
        numero1 = new javax.swing.JTextField();
        Contra = new javax.swing.JPasswordField();
        regresar = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();

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
                .addContainerGap(865, Short.MAX_VALUE)
                .addComponent(Mminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CMALayout.setVerticalGroup(
            CMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mcerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(Mminimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(CMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 30));

        Fondo.setBackground(new java.awt.Color(241, 226, 205));
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lup.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout LupLayout = new javax.swing.GroupLayout(Lup);
        Lup.setLayout(LupLayout);
        LupLayout.setHorizontalGroup(
            LupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        LupLayout.setVerticalGroup(
            LupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Fondo.add(Lup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        Nombre.setBackground(new java.awt.Color(0, 153, 153));
        Nombre.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Nombre.setForeground(new java.awt.Color(29, 26, 37));
        Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/team.png"))); // NOI18N
        Nombre.setText("REGISTRO DE USUARIO");
        Fondo.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 490, -1));

        LDown.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout LDownLayout = new javax.swing.GroupLayout(LDown);
        LDown.setLayout(LDownLayout);
        LDownLayout.setHorizontalGroup(
            LDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        LDownLayout.setVerticalGroup(
            LDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Fondo.add(LDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 940, -1));

        NNombre.setBackground(new java.awt.Color(204, 255, 255));
        NNombre.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        NNombre.setForeground(new java.awt.Color(67, 60, 84));
        NNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/id-card.png"))); // NOI18N
        NNombre.setText("Nombres: ");
        NNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        Fondo.add(NNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        Apellido.setBackground(new java.awt.Color(204, 255, 255));
        Apellido.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(67, 60, 84));
        Apellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/id-card.png"))); // NOI18N
        Apellido.setText("Apellidos: ");
        Apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        Fondo.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        Edad.setBackground(new java.awt.Color(204, 255, 255));
        Edad.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Edad.setForeground(new java.awt.Color(67, 60, 84));
        Edad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar.png"))); // NOI18N
        Edad.setText("Edad:");
        Edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        Fondo.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, -1));

        Celular.setBackground(new java.awt.Color(204, 255, 255));
        Celular.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Celular.setForeground(new java.awt.Color(67, 60, 84));
        Celular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/phone-call.png"))); // NOI18N
        Celular.setText("Numero celular:");
        Celular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        Fondo.add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 184, -1));

        Correo.setBackground(new java.awt.Color(204, 255, 255));
        Correo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Correo.setForeground(new java.awt.Color(67, 60, 84));
        Correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/envelope.png"))); // NOI18N
        Correo.setText("Correo Electrico:");
        Correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        Fondo.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        contra.setBackground(new java.awt.Color(204, 255, 255));
        contra.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        contra.setForeground(new java.awt.Color(67, 60, 84));
        contra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/padlock.png"))); // NOI18N
        contra.setText("Contraseña");
        contra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        Fondo.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 140, -1));

        nombre.setBackground(new java.awt.Color(241, 226, 205));
        nombre.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(67, 60, 84));
        nombre.setText("Ingrese su nombre:");
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        Fondo.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 174, 38));

        apellido.setBackground(new java.awt.Color(241, 226, 205));
        apellido.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(67, 60, 84));
        apellido.setText("Ingrese su apellido:");
        apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellidoMouseClicked(evt);
            }
        });
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        Fondo.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 174, 36));

        correo.setBackground(new java.awt.Color(241, 226, 205));
        correo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        correo.setForeground(new java.awt.Color(67, 60, 84));
        correo.setText("Ingrese su correo:");
        correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correoMouseClicked(evt);
            }
        });
        Fondo.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 186, 36));

        direccion.setBackground(new java.awt.Color(241, 226, 205));
        direccion.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        direccion.setForeground(new java.awt.Color(67, 60, 84));
        direccion.setText("Ingrese su direccion:");
        direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direccionMouseClicked(evt);
            }
        });
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        Fondo.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 186, 36));

        registro.setBackground(new java.awt.Color(241, 226, 205));
        registro.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        registro.setForeground(new java.awt.Color(67, 60, 84));
        registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings.png"))); // NOI18N
        registro.setText("Registrarse");
        registro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        Fondo.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 143, -1));

        redes.setEditable(false);
        redes.setBackground(new java.awt.Color(67, 60, 84));
        redes.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        redes.setForeground(new java.awt.Color(233, 212, 181));
        redes.setText("Siguenos en nuestras redes");
        redes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Fondo.add(redes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, 36));

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
        Fondo.add(Twitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, -1, -1));

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
        Fondo.add(Instagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, -1, -1));

        Contacto.setEditable(false);
        Contacto.setBackground(new java.awt.Color(67, 60, 84));
        Contacto.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Contacto.setForeground(new java.awt.Color(233, 212, 181));
        Contacto.setText("Contactanos");
        Contacto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Fondo.add(Contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, -1, 36));

        Instagram2.setBackground(new java.awt.Color(67, 60, 84));
        Instagram2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Instagram2.setForeground(new java.awt.Color(0, 153, 153));
        Instagram2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/whatsapp.png"))); // NOI18N
        Instagram2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        Instagram2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Instagram2ActionPerformed(evt);
            }
        });
        Fondo.add(Instagram2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, -1, -1));

        Direccion1.setBackground(new java.awt.Color(204, 255, 255));
        Direccion1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Direccion1.setForeground(new java.awt.Color(67, 60, 84));
        Direccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marker.png"))); // NOI18N
        Direccion1.setText("Direccion:");
        Direccion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        Fondo.add(Direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 182, -1));

        numero1.setBackground(new java.awt.Color(241, 226, 205));
        numero1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        numero1.setForeground(new java.awt.Color(67, 60, 84));
        numero1.setText("Ingrese su numero:");
        numero1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        numero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numero1MouseClicked(evt);
            }
        });
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });
        numero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero1KeyTyped(evt);
            }
        });
        Fondo.add(numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 186, 36));

        Contra.setBackground(new java.awt.Color(241, 226, 205));
        Contra.setForeground(new java.awt.Color(67, 60, 84));
        Contra.setText(" ....PasswordField1");
        Contra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        Contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraMouseClicked(evt);
            }
        });
        Fondo.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 160, 40));

        regresar.setBackground(new java.awt.Color(241, 226, 205));
        regresar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(67, 60, 84));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/swipe-left.png"))); // NOI18N
        regresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        Fondo.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 143, -1));
        Fondo.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 170, 30));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 940, 710));

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

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void InstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstagramActionPerformed
        // TODO add your handling code here:
        openWebPage("https://instagram.com/lelegance_darcy05?igshid=OGQ5ZDc2ODk2ZA==");
    }//GEN-LAST:event_InstagramActionPerformed

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        // TODO add your handling code here:
        nombre.setText("");
    }//GEN-LAST:event_nombreMouseClicked

    private void apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoMouseClicked
        // TODO add your handling code here:
        apellido.setText("");
    }//GEN-LAST:event_apellidoMouseClicked

    private void correoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMouseClicked
        // TODO add your handling code here:
        correo.setText("");
    }//GEN-LAST:event_correoMouseClicked

    private void direccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionMouseClicked
        // TODO add your handling code here:
        direccion.setText("");
    }//GEN-LAST:event_direccionMouseClicked

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        Conexion co = new Conexion();
        int año = date.getCalendar().get(Calendar.YEAR);
        int mes = date.getCalendar().get(Calendar.MONTH) +1;
        int dia = date.getCalendar().get(Calendar.DAY_OF_MONTH);
        String c = correo.getText();
        String fechaNacimiento = "" + año + "-" + mes + "-" + dia;
        String SQL = "SELECT * FROM usuario WHERE Correo = '" + c + "'";
        System.out.println(c);
        try {
        ResultSet resultadoIDs = co.consultar(SQL);
            if(resultadoIDs.next()){
                JOptionPane.showMessageDialog(this, "El correo o el usuario fue registrado anteriormente.");
            }else{
                String sentenciaSQL = "INSERT INTO usuario  (Nombre, Apellidos, id, Edad,Num, Correo,Direccion,Contra) VALUES ('" + nombre.getText() + "','" + apellido.getText() + "',null,'" + fechaNacimiento + "','" + numero1.getText() + "','" + correo.getText() + "','" + direccion.getText() + "','" + Contra.getText() + "')";
                co.añadir(sentenciaSQL);
               
            }
        } catch (SQLException ex ) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registroActionPerformed

    private void numero1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numero1MouseClicked
        // TODO add your handling code here:
        numero1.setText("");
    }//GEN-LAST:event_numero1MouseClicked

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero1ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
       LoginAdmin form = new LoginAdmin();
       form.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void Instagram2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instagram2ActionPerformed
        // TODO add your handling code here:
        openWebPage("https://wa.me/573022311918");
    }//GEN-LAST:event_Instagram2ActionPerformed

    private void TwitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwitterActionPerformed
        // TODO add your handling code here:
        openWebPage("https://twitter.com/URBANOSTORE05?t=nGlyttEKwB2M877W8TntNA&s=09");
    }//GEN-LAST:event_TwitterActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        // TODO add your handling code here:
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_apellidoKeyTyped

    private void numero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero1KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) || numero1.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_numero1KeyTyped

    private void ContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraMouseClicked
        // TODO add your handling code here:
        Contra.setText("");
    }//GEN-LAST:event_ContraMouseClicked

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
                new Cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JPanel CMA;
    private javax.swing.JLabel Celular;
    private javax.swing.JTextField Contacto;
    private javax.swing.JPasswordField Contra;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Direccion1;
    private javax.swing.JLabel Edad;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton Instagram;
    private javax.swing.JButton Instagram2;
    private javax.swing.JPanel LDown;
    private javax.swing.JPanel Lup;
    private javax.swing.JButton Mcerrar;
    private javax.swing.JButton Mminimizar;
    private javax.swing.JLabel NNombre;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Twitter;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel contra;
    private javax.swing.JTextField correo;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField redes;
    private javax.swing.JButton registro;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
