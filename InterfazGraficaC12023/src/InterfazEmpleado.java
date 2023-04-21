
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Image;
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jComboBoxEmpleado = new javax.swing.JComboBox<>();
        jButtonProbar = new javax.swing.JButton();
        jScrollBarEmpleado = new javax.swing.JScrollBar();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelImagen.setBackground(new java.awt.Color(255, 0, 0));
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paisaje.jpg"))); // NOI18N
        jLabelImagen.setText("jLabel2");
        jLabelImagen.setOpaque(true);

        jLabelNombre.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre.setText("Nombre:");

        jLabelNombre1.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre1.setText("Apellido");

        jLabelNombre2.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre2.setText("Edad");

        jLabelNombre3.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre3.setText("fecha de naciemiento");

        jLabelNombre4.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre4.setText("sueldo");

        jTextFieldEdad.setText("Ingrese su nombre");

        jTextFieldfecha_nac.setText("Ingrese su nombre");

        jTextFieldSueldo.setText("Ingrese su nombre");

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

        jButtonGuardarEmpleado.setText("Guardar Empleado");
        jButtonGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarEmpleadoActionPerformed(evt);
            }
        });

        jButtonMayorSueldo.setText("Gana mas");
        jButtonMayorSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMayorSueldoActionPerformed(evt);
            }
        });

        jLabelNombre5.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNombre5.setText("Sexo");

        buttonGroup1.add(jRadioButtonFemenino);
        jRadioButtonFemenino.setText("Femenino");

        buttonGroup1.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("Masculino");

        buttonGroup1.add(jRadioButtonOtros);
        jRadioButtonOtros.setText("otros");

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setText("jCheckBox1");

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setText("jCheckBox2");

        buttonGroup2.add(jCheckBox3);
        jCheckBox3.setText("jCheckBox3");

        jButtonProbar.setText("Probar");
        jButtonProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProbarActionPerformed(evt);
            }
        });

        jScrollBarEmpleado.setBlockIncrement(1);
        jScrollBarEmpleado.setMaximum(200);
        jScrollBarEmpleado.setVisibleAmount(1);

        jSpinner1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabelNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButtonMasculino)
                                    .addComponent(jRadioButtonFemenino)
                                    .addComponent(jRadioButtonOtros))
                                .addGap(50, 50, 50)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonGuardarEmpleado)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldfecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonMayorSueldo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonProbar)))
                                .addGap(173, 173, 173)))
                        .addComponent(jScrollBarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollBarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(126, 126, 126)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldfecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonMayorSueldo)
                                    .addComponent(jButtonGuardarEmpleado)
                                    .addComponent(jButtonProbar)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabelNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonFemenino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOtros)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarEmpleadoActionPerformed
        
        a[nroEmpleados] = new Empleado();
        a[nroEmpleados].setNombre(this.jTextFieldNombre.getText().trim());
        a[nroEmpleados].setApellido(this.jTextFieldApellido.getText().trim());
        
        
        
        int edad = 0;
        
        boolean okey = true;
        try {
            edad = Integer.parseInt(this.jTextFieldEdad.getText().trim());
            a[nroEmpleados].setEdad(edad);
        } catch (Exception e) {
            okey = false;
            JOptionPane.showMessageDialog(null, "Ingrese un numero entero para la edad");
        }
        a[nroEmpleados].setFecha_nac(this.jTextFieldfecha_nac.getText().trim());
        double sueldo;
        try {
            sueldo = Double.parseDouble(this.jTextFieldSueldo.getText().trim());
            a[nroEmpleados].setSueldo(sueldo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero decimal para el sueldo");
            okey = false;
        }
        
        // para el sexo
        if(this.jRadioButtonFemenino.isSelected()){
            a[nroEmpleados].setSexo( this.jRadioButtonFemenino.getText() );
        }
        
        
        if(this.jRadioButtonMasculino.isSelected()){
            a[nroEmpleados].setSexo( this.jRadioButtonMasculino.getText() );
        }
        
        
        if(this.jRadioButtonOtros.isSelected()){
            a[nroEmpleados].setSexo( this.jRadioButtonOtros.getText() );
        }
        
        
        if(okey){
            nroEmpleados++;
            JOptionPane.showMessageDialog(null, "Empleado Guardado");
            // mostrar al empleado
            tabla.setNumRows(0);
            for(int i = 0; i < nroEmpleados; i++){
                String empleaditos[] = new String[6];
                empleaditos[0] = a[i].getNombre();
                empleaditos[1] = a[i].getApellido();
                empleaditos[2] = a[i].getEdad() + "";
                empleaditos[3] = a[i].getSexo();
                empleaditos[4] = a[i].getFecha_nac();
                empleaditos[5] = a[i].getSueldo() + "";
                tabla.addRow(empleaditos);
            
            }
            
            
            this.jComboBoxEmpleado.addItem(this.jTextFieldNombre.getText());
            
            this.jTextFieldNombre.setText("");
            this.jTextFieldApellido.setText("");
            this.jTextFieldEdad.setText("");
            this.jTextFieldfecha_nac.setText("");
            this.jTextFieldSueldo.setText("");
            
            // aidiconar un elementos al ccombo box
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
