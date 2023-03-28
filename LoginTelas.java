package telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginTelas extends javax.swing.JFrame {

    public LoginTelas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        pswSenha = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblNaoPossuiCadastro = new javax.swing.JLabel();
        lblPadaria = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(77, 59, 249, 33);

        pswSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(pswSenha);
        pswSenha.setBounds(77, 99, 249, 33);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(12, 67, 60, 16);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(12, 107, 46, 16);

        btnEntrar.setBackground(new java.awt.Color(204, 204, 204));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(140, 150, 121, 35);

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(204, 204, 204));
        btnCadastrar.setText("Cadastre-se");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(81, 240, 240, 35);

        lblNaoPossuiCadastro.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblNaoPossuiCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lblNaoPossuiCadastro.setText("Não possui cadastro?");
        getContentPane().add(lblNaoPossuiCadastro);
        lblNaoPossuiCadastro.setBounds(130, 210, 149, 20);

        lblPadaria.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 26)); // NOI18N
        lblPadaria.setForeground(new java.awt.Color(255, 0, 0));
        lblPadaria.setText("Padaria - 9UNI");
        getContentPane().add(lblPadaria);
        lblPadaria.setBounds(120, 10, 240, 33);

        setSize(new java.awt.Dimension(414, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        TelaCadastroUsuario t;
        t = new TelaCadastroUsuario();
        t.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if(txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Preencha o nome do usuário.");
            txtUsuario.requestFocus();
            return;
        }
        if(pswSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Preencha a senha.");
            pswSenha.requestFocus();
            return;
        }
        try {
            Connection conexao;
            PreparedStatement st;
            ResultSet resultado;
            // Conexão com o banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "admin");
            // Busca o usuário na tabela do banco de dados
            st = conexao.prepareStatement("SELECT * FROM usuario WHERE usuario=? AND senha=?");
            st.setString(1, txtUsuario.getText());
            st.setString(2, pswSenha.getText());
            resultado = st.executeQuery(); //Executa o select criado a cima
            if (resultado.next()) {
                txtUsuario.setText("");
                pswSenha.setText("");
                //Se encontrou o usuário na tabela
                TelaMenu tela;
                tela = new TelaMenu(resultado.getString("usuario"),resultado.getString("cargo"));
                tela.setVisible(true);
            } else {
                //Se não encontrar resultado
                JOptionPane.showMessageDialog(null, "Usuário e/ou Senha inválidos.");
                txtUsuario.requestFocus();
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnEntrar, "Você não tem o driver na biblioteca.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(btnEntrar, "Algum parâmetro do BD está incorreto.");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER){
            pswSenha.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void pswSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswSenhaKeyPressed
        if (evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER){
            btnEntrar.doClick();
        }
    }//GEN-LAST:event_pswSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(LoginTelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblNaoPossuiCadastro;
    private javax.swing.JLabel lblPadaria;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
