/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasAdmin;

import BD.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author Lenovo
 */
public class InformacionP extends javax.swing.JFrame {
static String Nimagen = "NoImageSelected.png";    
static String eti;
private Point point;
    /**
     * Creates new form InformacionP
     */
    public InformacionP() {
        this(0, "n", "t", 0, 0);
    }

    /**
     * Creates new form InformacionP
     */
    public InformacionP(int etiqueta, String Nombre, String tipo, float precio, int stock) {
        setUndecorated(true);
        initComponents();
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
        JButton[] btns2 = { Mminimizar};
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
        
        JButton[] btns = {edit, delate, si};
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
                    btn.setBackground(new Color(153,153,255));//color que tomara cuando pase el jerry por encima
                    btn.setForeground(new Color(67, 60, 84));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(67, 60, 84));//color del boton original que recupera
                    btn.setForeground(new Color(233, 212, 181));
                }
            });
        }
        eti = String.valueOf(etiqueta);
        String p = String.valueOf(precio);
        String s = String.valueOf(stock);
        jTextField1.setText(eti);
        name.setText(Nombre);
        jTextField4.setText(p);
        jTextField5.setText(s);
        labelm1(etiqueta);
        setLocationRelativeTo(null);
    }
    public void labelm1(int id){
    String SentenciaSQL = "Select Nimagen FROM Productos WHERE etiqueta = " + id;
            try {
            Conexion co = new Conexion();
            ResultSet resultado = co.consultar(SentenciaSQL);
            while (resultado.next()) {

                Nimagen = resultado.getString("Nimagen");

                String Ruta = "D:/prueba/" + Nimagen;
                Image mImage = new ImageIcon(Ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImage.getScaledInstance(nI.getWidth(), nI.getHeight(), Image.SCALE_SMOOTH));
                nI.setIcon(mIcono);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "BD", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        nI = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        MujerCMA = new javax.swing.JPanel();
        Mcerrar = new javax.swing.JButton();
        Mminimizar = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delate = new javax.swing.JButton();
        si = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(233, 212, 181));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(67, 60, 84));
        jTextField1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(233, 212, 181));
        jTextField1.setText("m");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37)));

        name.setBackground(new java.awt.Color(67, 60, 84));
        name.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(233, 212, 181));
        name.setText(" b");
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37)));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(67, 60, 84));
        jTextField4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(233, 212, 181));
        jTextField4.setText("n");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37)));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(67, 60, 84));
        jTextField5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(233, 212, 181));
        jTextField5.setText(" ,m");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37)));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        nI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 3));

        jPanel2.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 26, 37));
        jLabel2.setText("INFORMACION DEL PRODUCTO");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 26, 37));
        jLabel3.setText("Nombre del producto:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 26, 37));
        jLabel4.setText("Categoria del producto:");

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(29, 26, 37));
        jLabel5.setText("Etiqueta del producto:");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(29, 26, 37));
        jLabel6.setText("Precio del producto:");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(29, 26, 37));
        jLabel7.setText("Stock del producto:");

        type.setBackground(new java.awt.Color(67, 60, 84));
        type.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        type.setForeground(new java.awt.Color(29, 26, 37));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre", "Nino/a", "Accesorios" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        MujerCMA.setBackground(new java.awt.Color(241, 226, 205));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MujerCMALayout.setVerticalGroup(
            MujerCMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mcerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(Mminimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        edit.setBackground(new java.awt.Color(67, 60, 84));
        edit.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(233, 212, 181));
        edit.setText("Editar");
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delate.setBackground(new java.awt.Color(67, 60, 84));
        delate.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        delate.setForeground(new java.awt.Color(233, 212, 181));
        delate.setText("Borrar");
        delate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        delate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delateActionPerformed(evt);
            }
        });

        si.setBackground(new java.awt.Color(67, 60, 84));
        si.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        si.setForeground(new java.awt.Color(233, 212, 181));
        si.setText("Seleccionar y cambiar imagen");
        si.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MujerCMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(nI, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(delate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MujerCMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void McerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_McerrarActionPerformed
        this.dispose();
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

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        Conexion co = new Conexion();
        String tipo = "";
        tipo = type.getSelectedItem().toString();
        String SentenciaSQL = "UPDATE Productos SET Nombre='" + name.getText() + "', tipo='" + tipo + "', Precio='" + jTextField4.getText() + "', Nimagen='" + Nimagen + "', Stock='" + jTextField5.getText() + "' WHERE etiqueta=" + eti;
        try {
           int rowsUpdated =  co.ejecutarSentenciaSQL(SentenciaSQL);
           if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Informacion del producto con etiqueta " + eti + " modificada exitosamente");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el producto con etiqueta " + eti);
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar los datos del producto: " + e.getMessage());
            System.out.println(e);
        }
       
    }//GEN-LAST:event_editActionPerformed

    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
        // TODO add your handling code here:
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        JFileChooser fileChooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG, JPEG Images", "jpg", "png", "jpeg");
        fileChooser.setFileFilter(filter);

        int selection = fileChooser.showOpenDialog(null);

        if (selection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String selectedFileName = selectedFile.getName();

            if (selectedFileName.endsWith(".jpg") || selectedFileName.endsWith(".png") || selectedFileName.endsWith(".jpeg")) {
                File destinationFile = new File("D:/prueba/" + selectedFileName);

                try {
                    BufferedImage image = ImageIO.read(selectedFile);
                    ImageIO.write(image, "png", destinationFile);
                    System.out.println("Imagen guardada exitosamente en: " + destinationFile.getAbsolutePath());

                    // Para mostrar la imagen en un JLabel (aquí asumiendo que 'font' es un JLabel)
                    ImageIcon icon = new ImageIcon(destinationFile.getAbsolutePath());
                    Image scaledImage = icon.getImage().getScaledInstance(nI.getWidth(), nI.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon scaledIcon = new ImageIcon(scaledImage);
                    nI.setIcon(scaledIcon);

                    JOptionPane.showMessageDialog(null, "Imagen guardada exitosamente en: " + destinationFile.getAbsolutePath(), "Imagen", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "El nombre de la imagen es: " + selectedFileName, "Nombre", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("El nombre es: " + selectedFileName);
                    Nimagen= selectedFileName;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Formato no válido. Selecciona una imagen en formato JPG o PNG.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("El usuario canceló la operación de abrir.");
        }
    }//GEN-LAST:event_siActionPerformed

    private void delateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delateActionPerformed
        // TODO add your handling code here:
        String SentenciaSQLbuscar = "SELECT * FROM Productos WHERE etiqueta = " + eti;
        String SentenciaSQLdelete = "DELETE FROM Productos WHERE etiqueta = " + eti;
        String SentenciaSQLdelate = "DELETE FROM Carrito WHERE Etiqueta = " + eti;
        try {
            Conexion co = new Conexion();
            ResultSet resultado = co.consultar(SentenciaSQLbuscar);
            if (resultado.next()) {
                String Nombre = resultado.getString("Nombre");

                String mensajeConfirmacion = "¿Está seguro de que quiere eliminar este producto?\n" + "Nombre: " + Nombre;

                int confirmacion = JOptionPane.showConfirmDialog(null, mensajeConfirmacion, "Confirmación de Eliminación", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    co.ejecutarSentenciaSQL(SentenciaSQLdelete);
                    co.ejecutarSentenciaSQL(SentenciaSQLdelate);
                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Prodcuto no registrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_delateActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyReleased

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_nameKeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) || jTextField4.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) || jTextField5.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

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
            java.util.logging.Logger.getLogger(InformacionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mcerrar;
    private javax.swing.JButton Mminimizar;
    private javax.swing.JPanel MujerCMA;
    private javax.swing.JButton delate;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel nI;
    private javax.swing.JTextField name;
    private javax.swing.JButton si;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
