package telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaRelatorios extends javax.swing.JFrame {
    DefaultTableModel defTable;
        
    public TelaRelatorios() {
        initComponents();
        txtNome.setVisible(false);
        lblNome.setVisible(false);
        txtCategoria.setVisible(false);
        lblCategoria.setVisible(false);
        defTable = (DefaultTableModel) tblProdutos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipoRelatorio = new javax.swing.JLabel();
        cmbTipoRelatorio = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();

        setTitle("Relatórios de Produtos");
        getContentPane().setLayout(null);

        lblTipoRelatorio.setText("Tipo de Relatório");
        getContentPane().add(lblTipoRelatorio);
        lblTipoRelatorio.setBounds(10, 40, 110, 16);

        cmbTipoRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Por Categoria", "Por Nome" }));
        cmbTipoRelatorio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoRelatorioItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbTipoRelatorio);
        cmbTipoRelatorio.setBounds(130, 30, 160, 30);

        lblNome.setText("Nome do Produto");
        getContentPane().add(lblNome);
        lblNome.setBounds(330, 40, 96, 16);
        getContentPane().add(txtNome);
        txtNome.setBounds(450, 30, 120, 30);
        getContentPane().add(txtCategoria);
        txtCategoria.setBounds(450, 30, 120, 30);

        lblCategoria.setText("Categoria");
        getContentPane().add(lblCategoria);
        lblCategoria.setBounds(330, 40, 100, 16);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(580, 30, 120, 30);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Categoria", "Preço"
            }
        ));
        jScrollPane1.setViewportView(tblProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 680, 250);

        setSize(new java.awt.Dimension(730, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String tipoRelatorio;
        tipoRelatorio = cmbTipoRelatorio.getSelectedItem().toString();

        try {
            Connection conexao;
            PreparedStatement st;
            ResultSet resultado;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "admin");
            //Verifica o conteúdo do comboBox de tipo de relatório
            if (tipoRelatorio.equalsIgnoreCase("Geral")) {
                st = conexao.prepareStatement("SELECT * FROM produtos");
                resultado = st.executeQuery();
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("codigo"), resultado.getString("nome"), resultado.getString("categoria"), resultado.getString("preco")};
                    defTable.addRow(linha);
                }
            } else if (tipoRelatorio.equalsIgnoreCase("Por categoria")) {
                st = conexao.prepareStatement("SELECT * FROM produtos WHERE categoria LIKE ?");
                st.setString(1, "%" + txtCategoria.getText() + "%");
                resultado = st.executeQuery();
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("codigo"), resultado.getString("nome"), resultado.getString("categoria"), resultado.getString("preco")};
                    defTable.addRow(linha);
                }
            } else if (tipoRelatorio.equalsIgnoreCase("Por nome")) {
                st = conexao.prepareStatement("SELECT * FROM produtos WHERE nome LIKE ?");
                st.setString(1, "%" + txtNome.getText() + "%");
                resultado = st.executeQuery();
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("codigo"), resultado.getString("nome"), resultado.getString("categoria"), resultado.getString("preco")};
                    defTable.addRow(linha);
                }
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto" + ex.getMessage());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbTipoRelatorioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoRelatorioItemStateChanged
         String tipo;
        tipo = cmbTipoRelatorio.getSelectedItem().toString();
        if(tipo.equalsIgnoreCase("Por categoria")){
            txtCategoria.setVisible(true);
            lblCategoria.setVisible(true);
            txtNome.setVisible(false);
            lblNome.setVisible(false); 
            defTable.setRowCount(0);
        }else if(tipo.equalsIgnoreCase("Por nome")){
            txtNome.setVisible(true);
            lblNome.setVisible(true);
            txtCategoria.setVisible(false);
            lblCategoria.setVisible(false);    
            defTable.setRowCount(0);
        }else if(tipo.equalsIgnoreCase("Geral")){
            txtCategoria.setVisible(false);
            lblCategoria.setVisible(false);
            txtNome.setVisible(false);
            lblNome.setVisible(false);  
            defTable.setRowCount(0);
        }

    }//GEN-LAST:event_cmbTipoRelatorioItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbTipoRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipoRelatorio;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
