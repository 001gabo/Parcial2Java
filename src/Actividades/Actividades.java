 
package Actividades;
    
import Principal.Principal;
import Principal.login;
import com.sun.glass.events.KeyEvent;
import conexionBD.conexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Actividades extends javax.swing.JFrame {
    
    public static int iddocente = login.iddocente;
   
    //variables para la conexion
    Connection con = null;
    PreparedStatement ps = null; 
    ResultSet rs = null; 
    Statement st = null;
    String query;
    
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
        jLabel5 = new javax.swing.JLabel();
        lblidocente = new javax.swing.JLabel();

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

        jLabel5.setText("Docente");

        lblidocente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPorcentajeActividad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbPeriodos, javax.swing.GroupLayout.Alignment.LEADING, 0, 112, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblidocente)
                                    .addComponent(jLabel5)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblidocente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(507, 365));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_items(){
        cbPeriodos.removeAllItems();
        cbPeriodos.removeAllItems();
        cbPeriodos.removeAllItems();
        cbPeriodos.removeAllItems();
        lblidocente.setText(String.valueOf(iddocente));
        //conexion a la bd
        try{
            con=conexionBD.getConnection();
            st=con.createStatement();
            query="select * from periodo";
            rs=st.executeQuery(query);
            while(rs.next()){ 
                this.cbPeriodos.addItem(rs.getString(2)); 
            }
            con.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this,"Ocurrio un error: "+ex);
        }
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
        String nombre_actividad,prueba;
        int item_seleccionado;
        double porcentaje,total_periodo=0;
        
        nombre_actividad = txtNombreActividad.getText();
        item_seleccionado = cbPeriodos.getSelectedIndex();
        
        if(txtPorcentajeActividad.getText().equals("")){
        porcentaje=0;
        }else{
        prueba=txtPorcentajeActividad.getText();
        porcentaje=Double.parseDouble(prueba);
        }
        
        if(nombre_actividad.equals("")){
            JOptionPane.showMessageDialog(this, "No posee nombre la actividad");
        }else{
          //Verificando que no exceda el 100% del periodo
          try{
            con=conexionBD.getConnection();
            st=con.createStatement();
            query="select * from actividad";
            rs=st.executeQuery(query);
            while(rs.next()){ 
                 total_periodo=total_periodo+(rs.getDouble("porcentaje"));
                 if(total_periodo<=100){
                     //si no excede el 100% del periodo se ingresa
                        try{   

                            query ="INSERT INTO `actividad`( `nombre`, `porcentaje`, `id_periodo`,`id_docente`) VALUES ('"+nombre_actividad+"','"+porcentaje+"','"+(item_seleccionado+1)+"','"+iddocente+"')";
                            con=conexionBD.getConnection();
                            st=con.createStatement();
                            st.executeUpdate(query);
                            JOptionPane.showMessageDialog(this,"Se ha creado la actividad de manera exitosa. El porcentaje restante es"+(100-total_periodo)+"% ");
                            con.close();
                        }catch(SQLException ex){ 
                            JOptionPane.showMessageDialog(this,"Ocurrio un error: "+ex); 
            }
                 }else{
                     JOptionPane.showMessageDialog(this, "Se ha excedido el 100% del periodo");
                 }
            }
            con.close();
        }
        catch(SQLException ex){
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblidocente;
    private javax.swing.JTextField txtNombreActividad;
    private javax.swing.JTextField txtPorcentajeActividad;
    // End of variables declaration//GEN-END:variables
}
