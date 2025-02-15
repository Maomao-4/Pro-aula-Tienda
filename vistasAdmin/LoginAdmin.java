/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasAdmin;

import vistasUser.Principal;
import BD.Conexion;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import vistasUser.Cuenta;

/**
 *
 * @author Lenovo
 */
public class LoginAdmin extends javax.swing.JFrame {

    private Point point;

    /**
     * Creates new form LoginAdmin
     */
    public LoginAdmin() {
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
        JButton[] btns = {login, reg};
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

        jTextField1 = new javax.swing.JTextField();
        CMA = new javax.swing.JPanel();
        Mcerrar = new javax.swing.JButton();
        Mminimizar = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        Menu2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Lup = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Lup1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        contra = new javax.swing.JLabel();
        ContraT = new javax.swing.JPasswordField();
        UserT = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        reg = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

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
                .addContainerGap(420, Short.MAX_VALUE)
                .addComponent(Mminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CMALayout.setVerticalGroup(
            CMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mminimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(Mcerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(CMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        Fondo.setBackground(new java.awt.Color(241, 226, 205));
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu2.setBackground(new java.awt.Color(0, 153, 153));
        Menu2.setForeground(new java.awt.Color(204, 255, 255));

        jPanel4.setBackground(new java.awt.Color(222, 238, 238));

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

        javax.swing.GroupLayout Menu2Layout = new javax.swing.GroupLayout(Menu2);
        Menu2.setLayout(Menu2Layout);
        Menu2Layout.setHorizontalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Menu2Layout.setVerticalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );

        Fondo.add(Menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 276, -1, -1));

        Lup.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout LupLayout = new javax.swing.GroupLayout(Lup);
        Lup.setLayout(LupLayout);
        LupLayout.setHorizontalGroup(
            LupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LupLayout.setVerticalGroup(
            LupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Fondo.add(Lup, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 487, -1));

        jPanel1.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        Lup1.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout Lup1Layout = new javax.swing.GroupLayout(Lup1);
        Lup1.setLayout(Lup1Layout);
        Lup1Layout.setHorizontalGroup(
            Lup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Lup1Layout.setVerticalGroup(
            Lup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Fondo.add(Lup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 487, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unauthorized-person.png"))); // NOI18N
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 62, -1, -1));

        usuario.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(29, 26, 37));
        usuario.setText("Usuario:");
        Fondo.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 297, -1, -1));

        contra.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        contra.setForeground(new java.awt.Color(29, 26, 37));
        contra.setText("Contraseña:");
        Fondo.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 377, -1, -1));

        ContraT.setBackground(new java.awt.Color(67, 60, 84));
        ContraT.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        ContraT.setForeground(new java.awt.Color(233, 212, 181));
        ContraT.setText("jPasswordField1");
        ContraT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraTMouseClicked(evt);
            }
        });
        Fondo.add(ContraT, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 380, 152, -1));

        UserT.setBackground(new java.awt.Color(67, 60, 84));
        UserT.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        UserT.setForeground(new java.awt.Color(233, 212, 181));
        UserT.setText("Ingresar usuario");
        UserT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTMouseClicked(evt);
            }
        });
        UserT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTActionPerformed(evt);
            }
        });
        Fondo.add(UserT, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 297, -1, -1));

        login.setBackground(new java.awt.Color(67, 60, 84));
        login.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(67, 60, 84));
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/swipe-right.png"))); // NOI18N
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 26, 37), 2));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        Fondo.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 464, 80, -1));

        jPanel5.setBackground(new java.awt.Color(29, 26, 37));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        Fondo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 20, 570));

        reg.setBackground(new java.awt.Color(67, 60, 84));
        reg.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        reg.setForeground(new java.awt.Color(233, 212, 181));
        reg.setText("Registrarse");
        reg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 60, 84), 2));
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        Fondo.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 110, -1));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void McerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_McerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_McerrarActionPerformed

    private void MminimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MminimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MminimizarActionPerformed

    private void CMAMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMAMouseDragged
        int CurrentX = this.getLocation().x;
        int CurrentY = this.getLocation().y;

        int MoveX = (CurrentX + evt.getX()) - (CurrentX + point.x);
        int MoveY = (CurrentY + evt.getY()) - (CurrentY + point.y);

        int x = CurrentX + MoveX;
        int y = CurrentY + MoveY;

        this.setLocation(x, y);
    }//GEN-LAST:event_CMAMouseDragged

    private void CMAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMAMousePressed
        point = evt.getPoint();
        getComponentAt(point);
    }//GEN-LAST:event_CMAMousePressed

    private void UserTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTMouseClicked
        // TODO add your handling code here:
        UserT.setText("");
    }//GEN-LAST:event_UserTMouseClicked

    private void ContraTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraTMouseClicked
        ContraT.setText("");
    }//GEN-LAST:event_ContraTMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        Conexion c = new Conexion();
        String userr = UserT.getText();
        String pass = ContraT.getText();
        c.validarUsuario(userr, pass);
        this.dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void UserTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
        Cuenta form = new Cuenta();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CMA;
    private javax.swing.JPasswordField ContraT;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Lup;
    private javax.swing.JPanel Lup1;
    private javax.swing.JButton Mcerrar;
    private javax.swing.JPanel Menu2;
    private javax.swing.JButton Mminimizar;
    private javax.swing.JTextField UserT;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton login;
    private javax.swing.JButton reg;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
