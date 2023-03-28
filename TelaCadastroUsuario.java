package telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaCadastroUsuario extends javax.swing.JFrame {

    public TelaCadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblRepitaSenha = new javax.swing.JLabel();
        txtRepitaSenha = new javax.swing.JPasswordField();
        btnSalvar = new javax.swing.JButton();
        cmbCargo = new javax.swing.JComboBox<>();
        lblCadastro = new javax.swing.JLabel();

        getContentPane().setLayout(null);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(115, 64, 302, 33);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(115, 104, 302, 33);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(12, 72, 52, 16);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(12, 112, 52, 16);

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCargo.setText("Cargo:");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(12, 201, 37, 16);

        lblRepitaSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRepitaSenha.setText("Repita a Senha:");
        getContentPane().add(lblRepitaSenha);
        lblRepitaSenha.setBounds(12, 152, 94, 16);
        getContentPane().add(txtRepitaSenha);
        txtRepitaSenha.setBounds(115, 144, 302, 33);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(207, 243, 98, 36);

        cmbCargo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Caixa", "Balconista" }));
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(115, 193, 300, 32);

        lblCadastro.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 26)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblCadastro.setText("Cadastre-se");
        getContentPane().add(lblCadastro);
        lblCadastro.setBounds(163, 18, 240, 33);

        setSize(new java.awt.Dimension(462, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            Connection conexao;
            PreparedStatement st;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "admin");

            if (txtSenha.getText().equals(txtRepitaSenha.getText())) {
                st = conexao.prepareStatement("INSERT INTO usuario VALUES(?, ?, ?)");
                st.setString(1, txtUsuario.getText());
                st.setString(2, txtSenha.getText());
                st.setString(3, cmbCargo.getSelectedItem().toString());
                st.executeUpdate(); //Executa o comando INSERT acima
                JOptionPane.showMessageDialog(btnSalvar, "Dados salvos com sucesso!");
                txtUsuario.setText("");
                txtSenha.setText("");
                txtRepitaSenha.setText("");
                txtUsuario.requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "As senhas não conferem.");
                txtSenha.requestFocus();
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnSalvar, "Você não possui o driver na biblioteca.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(btnSalvar, "Parâmetro do BD incorreto.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblRepitaSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtRepitaSenha;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
