/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redesocial.telas;
import java.util.Arrays;
import javax.swing.JOptionPane;
import redesocial.classes.Empresa;
import redesocial.classes.Pessoa;
import redesocial.classes.Usuario;
/**
 *
 * @author cliente
 */
public class Login extends javax.swing.JFrame {
    public Usuario admL = new Usuario();
    /**
     * Creates new form NewJFrame
     */
    public Login() {
     
        initComponents();
        
    }
    
    public String pEmail;
    public String pSenha;
    public String pNome;
    
    public void exportarPessoa(Usuario admCP){
          pNome = admCP.getNomeUsuario();
          pEmail = admCP.getEmail();
          pSenha = admCP.getSenha();
         
    }
    
  
   
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrarP = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        btnEntrarE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setText("E-mail");

        jLabel3.setText("Senha");

        btnEntrarP.setText("Entrar(Pessoa)");
        btnEntrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarPActionPerformed(evt);
            }
        });

        jLabel4.setText("Não possui conta?");

        btnCadastro.setText("Cadastre-se");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnEntrarE.setText("Entrar(Empresa)");
        btnEntrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarEActionPerformed(evt);
            }
        });

        jButton1.setText("adm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnEntrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnEntrarE, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrarP)
                    .addComponent(btnEntrarE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btnCadastro))
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean temEmPessoaEmail(String validar){
        for (Pessoa i : admL.getListaPessoa())
            if (validar.equals(i.getEmail())){
                return true;
            }
        return false;
    }
    public boolean temEmPessoaSenha(String validar){
        for (Pessoa i : admL.getListaPessoa())
            if (validar.equals(i.getSenha())){
                return true;
            }
        return false;
    }
    
    public boolean temEmEmpresaEmail(String validar){
        for (Empresa i : admL.getListaEmpresa())
            if (validar.equals(i.getEmail())){
                return true;
            }
        return false;
    }
    public boolean temEmEmpresaSenha(String validar){
        for (Empresa i : admL.getListaEmpresa())
            if (validar.equals(i.getSenha())){
                return true;
            }
        return false;
    }
    
    private void btnEntrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarPActionPerformed
        if (temEmPessoaSenha(String.valueOf(txtSenha.getPassword())) || temEmPessoaEmail(txtEmail.getText()) ){ 
            RedeSocial redesocial = new RedeSocial();
            admL.setPessoa_sessao(admL.getPessoaEmail(txtEmail.getText()));
            redesocial.admRS = admL;
            redesocial.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"Email ou Senha incorretos");
            limparCampos();
        }
       
            
    }//GEN-LAST:event_btnEntrarPActionPerformed

    public void limparCampos(){
        txtEmail.setText("");
        txtSenha.setText("");
        
    }
    
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        Cadastro c = new Cadastro();
        c.admC = admL;
        this.dispose();
        c.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnEntrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarEActionPerformed
        if (temEmEmpresaSenha(String.valueOf(txtSenha.getPassword())) || temEmEmpresaEmail(txtEmail.getText()) ){ 
            RedeSocial redesocial = new RedeSocial();
            admL.setEmpresa_sessao(admL.getEmpresaEmail(txtEmail.getText()));
            redesocial.admRS = admL;
            redesocial.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"Email ou Senha incorretos");
            limparCampos();
        }
       
    }//GEN-LAST:event_btnEntrarEActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        admL.setPessoa_sessao(null);
        admL.setEmpresa_sessao(null);
        if (admL.getPessoaIndex("Joselito") != 2) {
            admL.adicionarPessoa("a", "b", "c");
            admL.adicionarPessoa("Joselito", "Junior@gmail", "jun10r");
            admL.adicionarPessoa("Gustavo", "gustavo@gmail", "123gugu1221");
            admL.adicionarEmpresa("123233", "Bar", "zezinBar", "barze@gmail", "casshaa");
            admL.adicionarEmpresa("...", "adm", "c", "b", "a");
            String[] produtos = {"cerveja", "cafe", "espetinho", "casah"};
            System.out.println(Arrays.toString(produtos));
            admL.adicionarProduto("zezinBar", produtos);
            admL.adicionarEmpresa("167545", "foguetes", "ElonX", "mosquetao@gmail", "verde");
            produtos[0] = "foguete que da re";
            produtos[1] = "satelites";
            produtos[2] = "viagem a marte";
            produtos[3] = "verificado do X";
            admL.adicionarProduto("ElonX", produtos);
        }
        admL.listar();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Adm tela_de_adm = new Adm();
        tela_de_adm.adm = admL;
        tela_de_adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   

//Os botões diferentes são solucões temporarias ate eu achar uma condiçao que se encaixe
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrarE;
    private javax.swing.JButton btnEntrarP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
