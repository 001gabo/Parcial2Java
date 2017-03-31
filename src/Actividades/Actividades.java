 
package Actividades;
    
import Principal.Principal;
import Principal.login;
import com.sun.glass.events.KeyEvent;
import conexionBD.conexionBD; 
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Actividades extends javax.swing.JFrame {
    
    public static int iddocente = login.iddocente;
   
    //variables para la conexion
    Connection con = null;
    PreparedStatement ps = null; 
    ResultSet rs = null; 
    Statement st = null;
    String query;
    
    //variables miscelaneas 
    int arreglo_materias,conteoM=0,conteoP=0;
    HashMap<Integer, Integer> HashMaterias= new HashMap<>();
    HashMap<Integer, Integer> HashPeriodos= new HashMap<>();
    
    public Actividades() {
        initComponents();
        darIdDocente();
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
        JLabel6 = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();

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
        lblidocente.setText("ID DOCENTE");

        JLabel6.setText("Materia");

        cbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbMateria.setToolTipText("");

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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(lblidocente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtPorcentajeActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbPeriodos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabel6)
                                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPorcentajeActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(JLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbPeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblidocente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        setSize(new java.awt.Dimension(507, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void llenar_cbPeriodos(){
        try{
            con=conexionBD.getConnection();
            st=con.createStatement();
            query="select * from periodo";
            rs=st.executeQuery(query);
            while(rs.next()){ 
                this.cbPeriodos.addItem(rs.getString(2)); 
                HashPeriodos.put(conteoP, rs.getInt(1));
                conteoP++;
            }
            con.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this,"Ocurrio un error: "+ex);
        }
    }
    
    private void llenar_cbMaterias(){
        
        int id_detalle_usuario_materia,c=0,x=0;
        int[] materias;
         
        try{
            con=conexionBD.getConnection();
            st=con.createStatement();
            query="select count(id_materia) as 'Conteo' from detalle_usuario_materia where id_docente="+iddocente+";";
            rs=st.executeQuery(query);
            if(rs.next()){
                c=rs.getInt("Conteo");
            }
            materias = new int[c];
            
            query="select * from detalle_usuario_materia where id_docente="+iddocente+";";
            rs=st.executeQuery(query);  
            while(rs.next()){  
                materias[x]=rs.getInt(3);
                x++;
            }  
            for(int j=0;j<materias.length;j++){
                query="select * from materia where id_materia="+materias[j]+";";
                rs=st.executeQuery(query); 
                while(rs.next()){ 
                    this.cbMateria.addItem(rs.getString(2)); 
                    HashMaterias.put(conteoM, rs.getInt(1));
                    conteoM++;
                }
            } 
            con.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this,"Ocurrio un error: "+ex);
        }
    }
    
    private void darIdDocente(){
            query="SELECT * FROM `docente` WHERE `id_docente` ='"+iddocente+"';" ; 
            try{
            con=conexionBD.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(query); 
            rs.next();
            lblidocente.setText(rs.getString("user")); 
            }catch(SQLException ex){ 
                JOptionPane.showMessageDialog(this,"Ocurrio un error: "+ex); 
            }
        }
    
    private void agregar_items(){
        cbPeriodos.removeAllItems();
        cbPeriodos.removeAllItems();
        cbPeriodos.removeAllItems();
        cbPeriodos.removeAllItems();
        
        cbMateria.removeAllItems();
        cbMateria.removeAllItems();
        cbMateria.removeAllItems();
        cbMateria.removeAllItems(); 
        llenar_cbPeriodos();
        llenar_cbMaterias(); 
        
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
        int item_seleccionado_periodo,item_seleccionado_materia;
        double porcentaje,total_porcentaje=0;
        
        nombre_actividad = txtNombreActividad.getText();
        
        if(txtPorcentajeActividad.getText().equals("")){
            porcentaje=0;
        }else{
            prueba=txtPorcentajeActividad.getText();
            porcentaje=Double.parseDouble(prueba);
        }
        
        if(nombre_actividad.equals("")){
            JOptionPane.showMessageDialog(this, "No posee nombre la actividad");
        }else{
            item_seleccionado_materia=HashMaterias.get(cbMateria.getSelectedIndex()); 
            item_seleccionado_periodo=HashPeriodos.get(cbPeriodos.getSelectedIndex());
            
            //Menos que el 100%
            try{   
                query ="select sum(porcentaje) as 'porcentaje_total' from actividad where id_periodo="+item_seleccionado_periodo+" AND id_docente="+iddocente+" AND id_materia= "+item_seleccionado_materia+" ;";
                con=conexionBD.getConnection();
                st=con.createStatement();
                rs=st.executeQuery(query);
                if(rs.next()){
                    total_porcentaje=rs.getInt("porcentaje_total");
                }
                if(porcentaje<100 && total_porcentaje<100){ //si es menor que 100 hace el insert
                    try{   
                    query ="INSERT INTO `actividad`( `nombre`, `porcentaje`, `id_periodo`,`id_docente`,`id_materia`) VALUES ('"+nombre_actividad+"','"+porcentaje+"','"+item_seleccionado_periodo+"','"+iddocente+"','"+item_seleccionado_materia+"')";
                    con=conexionBD.getConnection();
                    st=con.createStatement();
                    st.executeUpdate(query);
                    JOptionPane.showMessageDialog(this,"Se ha creado la actividad de manera exitosa. El porcentaje restante es "+(100-total_porcentaje-porcentaje)+"% ");
                    con.close();
                    }catch(SQLException ex){ 
                        JOptionPane.showMessageDialog(this,"Ocurrio un error: "+ex); 
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Se ha EXCEDIDO el 100% de la nota"); 
                }  
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
    private javax.swing.JLabel JLabel6;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbMateria;
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
