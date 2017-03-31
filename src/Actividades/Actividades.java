 
package Actividades;
    
import Principal.Principal;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Actividades extends javax.swing.JFrame {
    
    public Actividades() {
        initComponents();
        agregar_items();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreActividad = new javax.swing.JTextField();
        txtPorcentajeActividad = new javax.swing.JTextField();
        cbPeriodos = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setText("<-- Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Crear actividades");

        jLabel2.setText("Nombre de actividad");

        jLabel3.setText("Porcentaje");

        jLabel4.setText("Periodo");

        txtPorcentajeActividad.setText(" ");
        txtPorcentajeActividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeActividadKeyTyped(evt);
            }
        });

        cbPeriodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbPeriodos.setSelectedItem(cbPeriodos);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(txtNombreActividad)
                                .addComponent(jLabel3)
                                .addComponent(txtPorcentajeActividad, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                            .addComponent(cbPeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPorcentajeActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        setSize(new java.awt.Dimension(507, 365));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_items(){
        cbPeriodos.removeAllItems();
        cbPeriodos.removeAllItems();
        cbPeriodos.removeAllItems();
        cbPeriodos.removeAllItems();
    }
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtPorcentajeActividadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeActividadKeyTyped
        //Haciendo que solo admita numeros
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPorcentajeActividadKeyTyped

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String nombre_actividad,item_seleccionado;
        int porcentaje;
        
        nombre_actividad = txtNombreActividad.getText();
        item_seleccionado = cbPeriodos.getSelectedItem().toString();
        
        if(txtPorcentajeActividad.getText().equals("")){
        porcentaje=0;
        }else{
        porcentaje=Integer.parseInt(txtPorcentajeActividad.getText());
        }
        
        if(nombre_actividad.equals("")){
            JOptionPane.showMessageDialog(this, "No posee nombre la actividad");
        }else{
          //Metodo para la conexion a la bdd
            String query = "";
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;   
            Statement st = null;
            try{  
                con=DriverManager.getConnection("jdbc:mysql://localhost/hb140222_rs120072","root","");
                st=con.createStatement();
                // ps.setString(1,usuario);
               // ps.setString(2,pass);
                rs= ps.executeQuery();
                if(rs.next()){
                     JOptionPane.showMessageDialog(this,"Bienvenido");  
                     //con esto se va de una pantalla a otra
                     this.dispose();
                     new Principal().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this,"Usuario o contraseña incorrecto.");
                }
                con.close();
            }catch(SQLException ex){ 
                JOptionPane.showMessageDialog(this,"Ocurrio un error: "+ex); 
            } 
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbPeriodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNombreActividad;
    private javax.swing.JTextField txtPorcentajeActividad;
    // End of variables declaration//GEN-END:variables
}
