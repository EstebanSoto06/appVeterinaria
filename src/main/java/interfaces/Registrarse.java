package interfaces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Registrarse extends javax.swing.JFrame {
    public Registrarse() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroudPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPasswordCheck = new javax.swing.JPasswordField();
        lbPassword = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lbPasswordCheck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        backgroudPanel.setBackground(new java.awt.Color(204, 255, 255));
        backgroudPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(0, 102, 102));

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("REGISTRARSE");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(69, 69, 69))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(19, 19, 19))
        );

        backgroudPanel.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 498, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.setToolTipText("");
        txtUsuario.setName(""); // NOI18N
        txtUsuario.setPreferredSize(new java.awt.Dimension(64, 30));
        backgroudPanel.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 220, -1));

        txtPasswordCheck.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPasswordCheck.setToolTipText("");
        txtPasswordCheck.setPreferredSize(new java.awt.Dimension(64, 30));
        backgroudPanel.add(txtPasswordCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 220, -1));

        lbPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbPassword.setText("Contraseña");
        backgroudPanel.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        lbUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbUsuario.setText("Usuario");
        backgroudPanel.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        btnVolver.setBackground(new java.awt.Color(0, 102, 102));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        backgroudPanel.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 220, -1));

        btnRegistrarse.setBackground(new java.awt.Color(0, 102, 102));
        btnRegistrarse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        backgroudPanel.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 220, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setToolTipText("");
        txtPassword.setPreferredSize(new java.awt.Dimension(64, 30));
        backgroudPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 220, -1));

        lbPasswordCheck.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbPasswordCheck.setText("Confirmar Contraseña");
        backgroudPanel.add(lbPasswordCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backgroudPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backgroudPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String password = new String(txtPassword.getPassword());
        String passwordCheck = new String(txtPasswordCheck.getPassword());
        
        // Verificar contraseñas
        if (!password.equals(passwordCheck)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Guardar nuevo usuario
            String usuario = txtUsuario.getText();
                        
            String nuevoUsuario = usuario + "," + password;

            // Verificar si el usuario ya existe
            try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            boolean existe = false;
            String linea;
                while ((linea = br.readLine()) != null) {
                String[] datosUsuario = linea.split(",");
                    // Si ya existe avisar
                    if (datosUsuario[0].equals(usuario)) {
                        existe = true;
                        linea = null;
                    }
                }
                System.out.print(existe);
                if (existe == true){
                    JOptionPane.showMessageDialog(this, "Este usuario ya está registrado!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
                        bw.write(nuevoUsuario);
                        bw.newLine();
                        JOptionPane.showMessageDialog(this, "Usuario registrado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(this, "Error al guardar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        this.setVisible(false);
                        setLocationRelativeTo(null);

                        Login login = new Login();
                        login.setVisible(true);
                        login.setLocationRelativeTo(null);
                }
            } catch (IOException e) {
                // Manejar cualquier error de lectura del archivo
                e.printStackTrace();
            }                        
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        setLocationRelativeTo(null);
        
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroudPanel;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPasswordCheck;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordCheck;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}