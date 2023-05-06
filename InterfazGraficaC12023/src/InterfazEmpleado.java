
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
public class InterfazEmpleado extends javax.swing.JFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    int nroEmpleados = 0;
    Empleado a[] = new Empleado[100];
    public InterfazEmpleado() {
        initComponents();
        
        // cambiando datos de los textfiled
        this.jTextFieldEdad.setText("");
        this.jTextFieldfecha_nac.setText("");
        this.jTextFieldSueldo.setText("");
        
        
        
        this.setLocationRelativeTo(null);
        tabla.addColumn("NOMBRE");
        tabla.addColumn("APELLIDO");
        tabla.addColumn("EDAD");
        tabla.addColumn("SEXO");
        tabla.addColumn("FECHA NAC");
        tabla.addColumn("SUELDO");
        
        /// para adiionar los datos (del modelo tabla) a la tabla
        this.jTableEmpleado.setModel(tabla);
        
        
//        String nombre =  this.jTextFieldNombre.getText();
//        System.out.println("Fiel " + nombre);
//        this.jTextFieldNombre.setText("Osvaldo");


    ImageIcon imgIcon = new ImageIcon(getClass().getResource("/imagenes/paisaje.jpg"));
    Image imgEscalada = imgIcon.getImage().getScaledInstance(jLabelImagen.getWidth(),
                jLabelImagen.getHeight(), Image.SCALE_SMOOTH);
    Icon iconoEscalado = new ImageIcon(imgEscalada);
    jLabelImagen.setIcon(iconoEscalado);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jLabelNombre3 = new javax.swing.JLabel();
        jLabelNombre4 = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldfecha_nac = new javax.swing.JTextField();
        jTextFieldSueldo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleado = new javax.swing.JTable();
        jButtonGuardarEmpleado = new javax.swing.JButton();
        jButtonMayorSueldo = new javax.swing.JButton();
        jLabelNombre5 = new javax.swing.JLabel();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonOtros = new javax.swing.JRadioButton();
        jButtonProbar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBoxEmpleado = new javax.swing.JComboBox<>();
        jScrollBarEmpleado = new javax.swing.JScrollBar();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImagen.setBackground(new java.awt.Color(255, 0, 0));
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paisaje.jpg"))); // NOI18N
        jLabelImagen.setText("jLabel2");
        jLabelImagen.setOpaque(true);
        jPanel1.add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 130, 130));

        jLabelNombre.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre.setText("Nombre:");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 41, 48, 28));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 42, 153, 28));

        jLabelNombre1.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre1.setText("Apellido");
        jPanel1.add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 82, 48, 28));

        jLabelNombre2.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre2.setText("Edad");
        jPanel1.add(jLabelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 48, 28));

        jLabelNombre3.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre3.setText("fecha de naciemiento");
        jPanel1.add(jLabelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 111, 28));

        jLabelNombre4.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre4.setText("sueldo");
        jPanel1.add(jLabelNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 48, 28));
        jPanel1.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 83, 153, 28));

        jTextFieldEdad.setText("Ingrese su nombre");
        jPanel1.add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 153, 28));

        jTextFieldfecha_nac.setText("Ingrese su nombre");
        jPanel1.add(jTextFieldfecha_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 153, 28));

        jTextFieldSueldo.setText("Ingrese su nombre");
        jPanel1.add(jTextFieldSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 153, 28));

        jTableEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableEmpleado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 350, 170));

        jButtonGuardarEmpleado.setText("Guardar Empleado");
        jButtonGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jButtonMayorSueldo.setText("Gana mas");
        jButtonMayorSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMayorSueldoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMayorSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabelNombre5.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre5.setText("Sexo");
        jPanel1.add(jLabelNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 48, 28));

        buttonGroup1.add(jRadioButtonFemenino);
        jRadioButtonFemenino.setText("Femenino");
        jPanel1.add(jRadioButtonFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        buttonGroup1.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("Masculino");
        jPanel1.add(jRadioButtonMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        buttonGroup1.add(jRadioButtonOtros);
        jRadioButtonOtros.setText("otros");
        jPanel1.add(jRadioButtonOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jButtonProbar.setText("Probar");
        jButtonProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProbarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonProbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setText("jCheckBox1");

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setText("jCheckBox2");

        buttonGroup2.add(jCheckBox3);
        jCheckBox3.setText("jCheckBox3");

        jSpinner1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        jScrollBarEmpleado.setBlockIncrement(1);
        jScrollBarEmpleado.setMaximum(200);
        jScrollBarEmpleado.setVisibleAmount(1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jCheckBox2)))
                        .addGap(7, 7, 7)
                        .addComponent(jCheckBox3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollBarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 160, 140));

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarEmpleadoActionPerformed
        
        String nomArch = "Empleadito.dat";
        
        ObjectOutputStream arch = null;
        try{
            if(new File(nomArch).exists())
                arch = new AddObjectOutputStream(new FileOutputStream(nomArch, true));
            else
                arch = new ObjectOutputStream(new FileOutputStream(nomArch, true));
            
            // recuperar todo lo quiero guardar
            Empleado emp = new Empleado();
            
            emp.setNombre(this.jTextFieldNombre.getText().trim());
            emp.setApellido(this.jTextFieldApellido.getText().trim());
        
        
        
            int edad = 0;

            boolean okey = true;
            try {
                edad = Integer.parseInt(this.jTextFieldEdad.getText().trim());
                emp.setEdad(edad);
            } catch (Exception e) {
                okey = false;
                JOptionPane.showMessageDialog(null, "Ingrese un numero entero para la edad");
            }
            emp.setFecha_nac(this.jTextFieldfecha_nac.getText().trim());
            double sueldo;
            try {
                sueldo = Double.parseDouble(this.jTextFieldSueldo.getText().trim());
                emp.setSueldo(sueldo);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero decimal para el sueldo");
                okey = false;
            }

            // para el sexo
            if(this.jRadioButtonFemenino.isSelected()){
                emp.setSexo( this.jRadioButtonFemenino.getText() );
            }


            if(this.jRadioButtonMasculino.isSelected()){
                emp.setSexo( this.jRadioButtonMasculino.getText() );
            }


            if(this.jRadioButtonOtros.isSelected()){
                emp.setSexo( this.jRadioButtonOtros.getText() );
            }


            if(okey){
                JOptionPane.showMessageDialog(null, "Empleado Guardado");
                System.out.println("nombre " + emp.getNombre());
//                this.jComboBoxEmpleado.addItem(this.jTextFieldNombre.getText());
                this.jTextFieldNombre.setText("");
                this.jTextFieldApellido.setText("");
                this.jTextFieldEdad.setText("");
                this.jTextFieldfecha_nac.setText("");
                this.jTextFieldSueldo.setText("");
                
                arch.writeObject(emp);
                System.out.println("guardaro correcto");
                
                // aidiconar un elementos al ccombo box
            }
            
            
            
        } catch (Exception e) {
                
                
        } finally {
            try {
                arch.close();
            } catch (IOException ex) {
                Logger.getLogger(InterfazEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
       
            
    }//GEN-LAST:event_jButtonGuardarEmpleadoActionPerformed

    private void jButtonMayorSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMayorSueldoActionPerformed
        double max = 0;
        // recorrer para encontrar  el maximo
        for(int i = 0; i < nroEmpleados; i++){
            if(max < a[i].getSueldo()){
                max = a[i].getSueldo();
            }
        }
        
        // para mostrar el maximo
        for(int i = 0; i < nroEmpleados; i++){
            if(max == a[i].getSueldo()){
                this.jTextFieldNombre.setText(a[i].getNombre());
                this.jTextFieldApellido.setText(a[i].getApellido());
                this.jTextFieldEdad.setText(a[i].getEdad() + "");
                this.jTextFieldfecha_nac.setText(a[i].getFecha_nac());
                this.jTextFieldSueldo.setText(a[i].getSueldo()+ "");
            }
        }
    }//GEN-LAST:event_jButtonMayorSueldoActionPerformed

    private void jButtonProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProbarActionPerformed
        // TODO add your handling code here:
        
//        jTextFieldNombre.setText(this.jComboBoxEmpleado.getSelectedItem().toString());
        
//        jTextFieldApellido.setText(this.jComboBoxEmpleado.getSelectedIndex() + "");
        // para gregar elementos
        jComboBoxEmpleado.addItem("hola");
        
        jTextFieldSueldo.setText(jScrollBarEmpleado.getValue() + "");
    }//GEN-LAST:event_jButtonProbarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        
        InterfazMenu menu = new InterfazMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    
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
            java.util.logging.Logger.getLogger(InterfazEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonGuardarEmpleado;
    private javax.swing.JButton jButtonMayorSueldo;
    private javax.swing.JButton jButtonProbar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBoxEmpleado;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNombre5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JRadioButton jRadioButtonOtros;
    private javax.swing.JScrollBar jScrollBarEmpleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTableEmpleado;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSueldo;
    private javax.swing.JTextField jTextFieldfecha_nac;
    // End of variables declaration//GEN-END:variables
}
