package telas;

import java.sql.*;
import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
    }

    public TelaMenu(String usuario, String cargo) {
        initComponents();
        pnlCadastrarProdutos.setVisible(false);
        lblSaudacao.setText("Bem-vindo(a), " + usuario);
        btnExcluir.setVisible(false);
        if (cargo.equalsIgnoreCase("caixa") || cargo.equalsIgnoreCase("balconista")) {
            habilitar();
        }
    }

    private void habilitar() {
        itmCadastrarProdutos.setEnabled(false);
        itmAlterarProdutos.setEnabled(false);
        itmExcluirProdutos.setEnabled(false);
        itmRelatoriosProdutos.setEnabled(true);
        itmCadastrarFunc.setEnabled(false);
        itmAlterarFunc.setEnabled(false);
        itmExcluirFunc.setEnabled(false);
        itmRelatoriosFunc.setEnabled(true);
    }

    public TelaMenu(String cargo) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        pnlCadastrarProdutos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnOutrosRelatorios = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();
        barMenu = new javax.swing.JMenuBar();
        menuProdutos = new javax.swing.JMenu();
        itmCadastrarProdutos = new javax.swing.JMenuItem();
        itmAlterarProdutos = new javax.swing.JMenuItem();
        itmExcluirProdutos = new javax.swing.JMenuItem();
        itmRelatoriosProdutos = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFunc = new javax.swing.JMenuItem();
        itmAlterarFunc = new javax.swing.JMenuItem();
        itmExcluirFunc = new javax.swing.JMenuItem();
        itmRelatoriosFunc = new javax.swing.JMenuItem();

        getContentPane().setLayout(null);
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(330, 0, 280, 30);

        pnlCadastrarProdutos.setLayout(null);

        lblCodigo.setText("Código");
        pnlCadastrarProdutos.add(lblCodigo);
        lblCodigo.setBounds(10, 20, 70, 16);

        lblNome.setText("Nome");
        pnlCadastrarProdutos.add(lblNome);
        lblNome.setBounds(10, 60, 70, 16);

        lblCategoria.setText("Categoria");
        pnlCadastrarProdutos.add(lblCategoria);
        lblCategoria.setBounds(10, 100, 70, 16);

        lblPreco.setText("Preço");
        pnlCadastrarProdutos.add(lblPreco);
        lblPreco.setBounds(12, 139, 70, 16);
        pnlCadastrarProdutos.add(txtCodigo);
        txtCodigo.setBounds(90, 10, 80, 30);
        pnlCadastrarProdutos.add(txtNome);
        txtNome.setBounds(90, 50, 300, 30);
        pnlCadastrarProdutos.add(txtCategoria);
        txtCategoria.setBounds(90, 90, 300, 30);
        pnlCadastrarProdutos.add(txtPreco);
        txtPreco.setBounds(90, 130, 300, 30);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnSalvar);
        btnSalvar.setBounds(10, 180, 130, 40);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnBuscar);
        btnBuscar.setBounds(180, 10, 70, 30);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnExcluir);
        btnExcluir.setBounds(150, 180, 110, 40);

        btnAlterar.setText("Salvar Alteração");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnAlterar);
        btnAlterar.setBounds(270, 180, 120, 40);

        btnOutrosRelatorios.setText("Outros Relatórios");
        btnOutrosRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutrosRelatoriosActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnOutrosRelatorios);
        btnOutrosRelatorios.setBounds(260, 10, 130, 30);

        getContentPane().add(pnlCadastrarProdutos);
        pnlCadastrarProdutos.setBounds(100, 70, 400, 230);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/bgpadaria.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, -20, 610, 400);

        menuProdutos.setMnemonic('P');
        menuProdutos.setText("Produtos");

        itmCadastrarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarProdutos.setText("Cadastrar");
        itmCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(itmCadastrarProdutos);

        itmAlterarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarProdutos.setText("Alterar");
        itmAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(itmAlterarProdutos);

        itmExcluirProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirProdutos.setText("Excluir");
        itmExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(itmExcluirProdutos);

        itmRelatoriosProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatoriosProdutos.setText("Relatórios");
        itmRelatoriosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(itmRelatoriosProdutos);

        barMenu.add(menuProdutos);

        menuFuncionarios.setMnemonic('F');
        menuFuncionarios.setText("Funcionários");

        itmCadastrarFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarFunc.setText("Cadastrar");
        menuFuncionarios.add(itmCadastrarFunc);

        itmAlterarFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarFunc.setText("Alterar");
        menuFuncionarios.add(itmAlterarFunc);

        itmExcluirFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirFunc.setText("Excluir");
        menuFuncionarios.add(itmExcluirFunc);

        itmRelatoriosFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatoriosFunc.setText("Relatórios");
        menuFuncionarios.add(itmRelatoriosFunc);

        barMenu.add(menuFuncionarios);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(622, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(true);
        btnBuscar.setVisible(false);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(false);
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            Connection conexao;
            PreparedStatement st;

            //Fazer a conexão com BANCO DE DADOS
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "admin");

            //INSERIR DADOS NA TABELA
            st = conexao.prepareStatement("INSERT INTO produtos VALUES(?,?,?,?)");
            st.setString(1, txtCodigo.getText());
            st.setString(2, txtNome.getText());
            st.setString(3, txtCategoria.getText());
            st.setDouble(4, Double.parseDouble(txtPreco.getText()));
            st.executeUpdate();

            JOptionPane.showMessageDialog(btnSalvar, "Produto salvo com sucesso!");
            txtCodigo.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            txtPreco.setText("");
            txtCodigo.requestFocus();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex.getMessage() + "\nEntre em contato com o administrador e informe");
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Este código de produto já está cadastrado");
                txtCodigo.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro número " + ex.getErrorCode() + "\nEntre em contato com o administrador e informe o número do erro");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void itmRelatoriosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnBuscar.setVisible(true);
        btnExcluir.setVisible(false);
        btnAlterar.setVisible(false);
        btnOutrosRelatorios.setVisible(true);
    }//GEN-LAST:event_itmRelatoriosProdutosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o código do produto");
            txtCodigo.requestFocus();
            return; // para a execução nesta linha (stop)       
        }
        try {
            Connection conexao;
            PreparedStatement st;
            ResultSet resultado;
            //Conexão com o BD
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "admin");
            //Busca o código do produto na tabela produtos do BD
            st = conexao.prepareStatement("SELECT * FROM produtos WHERE codigo=?");
            st.setString(1, txtCodigo.getText());
            resultado = st.executeQuery(); //Executa o SELECT criado acima
            if (resultado.next()) { // Se encontrou o código do produto na tabela
                txtNome.setText(resultado.getString("nome"));
                txtCategoria.setText(resultado.getString("categoria"));
                txtPreco.setText(resultado.getString("preco"));
                btnAlterar.setVisible(true);
                btnExcluir.setVisible(true);

            } else { //Senão encontrou o produto
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
                txtCodigo.requestFocus();
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnBuscar, "Você não tem o driver na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(btnBuscar, "Algum parâmetro do BD está incorreto");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            //CONECTAR COM O BANCO DE DADOS
            Connection conexao;
            PreparedStatement st;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "admin");
            // DELETAR O PRODUTO PELO CÓDIGO INFORMADO
            st = conexao.prepareStatement("DELETE FROM produtos WHERE codigo=?");
            st.setString(1, txtCodigo.getText());
            int res = st.executeUpdate();
            //VERIFICAR SE O PRODUTO FOI OU NÃO DELETADO E INFORMAR
            if (res == 1) { // Se excluiu da tabela
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
                txtCodigo.setText("");
                txtNome.setText("");
                txtCategoria.setText("");
                txtPreco.setText("");
                txtCodigo.requestFocus();
                btnExcluir.setVisible(false);
                btnAlterar.setVisible(false);
            } else { // Se não excluiu da tabela
                JOptionPane.showMessageDialog(null, "Não foi possível excluir o produto com este código");
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto" + ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void itmExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnBuscar.setVisible(true);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(false);
    }//GEN-LAST:event_itmExcluirProdutosActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            Connection conexao;
            PreparedStatement st;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "admin");
            st = conexao.prepareStatement("UPDATE produtos SET nome = ?, categoria = ?, preco = ? WHERE codigo = ?");
            st.setString(1, txtNome.getText());
            st.setString(2, txtCategoria.getText());
            st.setString(3, txtPreco.getText());
            st.setString(4, txtCodigo.getText());
            st.executeUpdate(); //Executa o comando SQL UPDATE
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
            txtCodigo.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            txtPreco.setText("");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto" + ex.getMessage());
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void itmAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnBuscar.setVisible(true);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(false);
    }//GEN-LAST:event_itmAlterarProdutosActionPerformed

    private void btnOutrosRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutrosRelatoriosActionPerformed
        TelaRelatorios tela;
        tela = new TelaRelatorios();
        tela.setVisible(true);
    }//GEN-LAST:event_btnOutrosRelatoriosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOutrosRelatorios;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenuItem itmAlterarFunc;
    private javax.swing.JMenuItem itmAlterarProdutos;
    private javax.swing.JMenuItem itmCadastrarFunc;
    private javax.swing.JMenuItem itmCadastrarProdutos;
    private javax.swing.JMenuItem itmExcluirFunc;
    private javax.swing.JMenuItem itmExcluirProdutos;
    private javax.swing.JMenuItem itmRelatoriosFunc;
    private javax.swing.JMenuItem itmRelatoriosProdutos;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JPanel pnlCadastrarProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
