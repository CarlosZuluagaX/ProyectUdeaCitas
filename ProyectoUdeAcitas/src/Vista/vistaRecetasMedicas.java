
package Vista;

import Controlador.controladorBD;


public class vistaRecetasMedicas extends javax.swing.JFrame {

    /**
     * Creates new form loginInMedico
     */
    /*
        vcita_nombrePaciente = nombreCompleto;
        vcita_pacpaciente = pac_paciente;
        vcita_nombreIDUnidadMedica = nombreIDUnidadMedica;
        vcita_nombreFolio = nombreFolio;
        vcita_nombreConsultorio = nombreConsultorio;
        vcita_nombreMedico = nombreMedico;
        */
     /*Obtener el ID de la unidad MÉDICA*/
    //public int idUMedica;
    public int validaBD=0;
    public String reme_idpaciente = "";
    public String reme_nombrepaciente = "";
    public String reme_unidadmedica = "";
    controladorBD cb = new controladorBD();
    /**/
    public int  rec_idreceta = 0;
    public int  rec_idpaciente  = 0;
    public int  rec_idunidadmedica  = 0; 
    public String  rec_idcita  = ""; 
    
    public String rec_descripcion = "";
    public String rec_alergias = ""; 
    public String rec_estatura = "";
    public String rec_peso = "";
    public String  rec_presion = "";
    public String rec_tiposangre = "";
    public int reme_idcita =0;
    
    public vistaRecetasMedicas(String reme_idpaciente, String reme_nombrepaciente, String reme_unidadmedica, String reme_idcita, String cime_idreceta) {
        rec_idreceta = Integer.parseInt(cime_idreceta);
        this.reme_idpaciente = reme_idpaciente;
        this.reme_nombrepaciente = reme_nombrepaciente;
        this.reme_unidadmedica = reme_unidadmedica;
        this.reme_idcita = Integer.parseInt(reme_idcita);
        initComponents();
        recme_idpaciente.setText(reme_idpaciente);
        recme_nombrepaciente.setText(reme_nombrepaciente);
        recme_idunidadmedica.setText(reme_unidadmedica);
        recme_idreceta.setText(Integer.toString(rec_idreceta));
        recme_idcita.setText(reme_idcita);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        recme_descripción = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        recme_alergias = new javax.swing.JTextField();
        recme_presión = new javax.swing.JTextField();
        recme_tiposangre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        recme_idunidadmedica = new javax.swing.JLabel();
        recme_idpaciente = new javax.swing.JLabel();
        botonGReceta = new javax.swing.JButton();
        recme_estatura = new javax.swing.JComboBox<>();
        recme_peso = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        errorText = new javax.swing.JLabel();
        recme_nombrepaciente = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        recme_idreceta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        recme_idcita = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instituto Médico");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(500, 100));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Receta Médica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Descripción:");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Salir/Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        recme_descripción.setColumns(20);
        recme_descripción.setRows(5);
        jScrollPane3.setViewportView(recme_descripción);

        jLabel5.setText("Alergias:");

        jLabel6.setText("Presión:");

        jLabel7.setText("Tipo Sangre:");

        jLabel8.setText("Estatura");

        jLabel9.setText("Peso:");

        recme_presión.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        recme_tiposangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recme_tiposangreActionPerformed(evt);
            }
        });

        jLabel2.setText("No. Paciente:");

        jLabel3.setText("No. Unidad Médica:");

        recme_idunidadmedica.setText("_______");

        recme_idpaciente.setText("________________________________________________");

        botonGReceta.setBackground(new java.awt.Color(204, 255, 204));
        botonGReceta.setText("Guardar Receta");
        botonGReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGRecetaActionPerformed(evt);
            }
        });

        recme_estatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0m", "1.1m", "1.2m", "1.3m", "1.4m", "1.5m", "1.6m", "1.7m", "1.8m", "1.9m", "2m", "2.1m", "2.2m", "2.3m", "2.4m", "2.5m", "2.6m", "2.7m", "2.8m", "2.9m", "3m", " " }));

        recme_peso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10kg", "11kg", "12kg", "13kg", "14kg", "15kg", "16kg", "17kg", "18kg", "19kg", "20kg", "21kg", "22kg", "23kg", "24kg", "25kg", "26kg", "27kg", "28kg", "29kg", "30kg", "31kg", "32kg", "33kg", "34kg", "35kg", "36kg", "37kg", "38kg", "39kg", "40kg", "41kg", "42kg", "43kg", "44kg", "45kg", "46kg", "47kg", "48kg", "49kg", "50kg", "51kg", "52kg", "53kg", "54kg", "55kg", "56kg", "57kg", "58kg", "59kg", "60kg", "61kg", "62kg", "63kg", "64kg", "65kg", "66kg", "67kg", "68kg", "69kg", "70kg", "71kg", "72kg", "73kg", "74kg", "75kg", "76kg", "77kg", "78kg", "79kg", "80kg", "81kg", "82kg", "83kg", "84kg", "85kg", "86kg", "87kg", "88kg", "89kg", "90kg", "91kg", "92kg", "93kg", "94kg", "95kg", "96kg", "97kg", "98kg", "99kg", "100kg", "101kg", "102kg", "103kg", "104kg", "105kg", "106kg", "107kg", "108kg", "109kg", "110kg", "111kg", "112kg", "113kg", "114kg", "115kg", "116kg", "117kg", "118kg", "119kg", "120kg", "121kg", "122kg", "123kg", "124kg", "125kg", "126kg", "127kg", "128kg", "129kg", "130kg", "131kg", "132kg", "133kg", "134kg", "135kg", "136kg", "137kg", "138kg", "139kg", "140kg", "141kg", "142kg", "143kg", "144kg", "145kg", "146kg", "147kg", "148kg", "149kg", "150kg", "151kg", "152kg", "153kg", "154kg", "155kg" }));

        jLabel10.setText("Error:");

        errorText.setText("__________");

        recme_nombrepaciente.setText("_______");

        jLabel11.setText("Nombre Paciente:");

        jLabel12.setText("No. Receta:");

        recme_idreceta.setEditable(false);

        jLabel13.setText("No. Cita:");

        recme_idcita.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(recme_idpaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(recme_idunidadmedica)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(recme_nombrepaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(recme_idcita)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(recme_idreceta)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addComponent(errorText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(recme_alergias, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(recme_presión, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(75, 75, 75)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(recme_tiposangre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(recme_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(recme_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(354, 354, 354)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonGReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(191, 235, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(recme_idunidadmedica)
                    .addComponent(recme_idpaciente)
                    .addComponent(jLabel12)
                    .addComponent(recme_idreceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(recme_nombrepaciente)
                            .addComponent(jLabel13)))
                    .addComponent(recme_idcita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(recme_alergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recme_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel9))
                    .addComponent(recme_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(recme_presión, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recme_tiposangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(botonGReceta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(errorText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recme_tiposangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recme_tiposangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recme_tiposangreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonGRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGRecetaActionPerformed
        // TODO add your handling code here:
        
          rec_descripcion = recme_descripción.getText();
          rec_alergias = recme_alergias.getText();
          rec_estatura = (String) recme_estatura.getSelectedItem();
          rec_peso = (String) recme_peso.getSelectedItem();
          rec_presion = recme_presión.getText();
          rec_tiposangre = recme_tiposangre.getText();
          
          cb.MySQLConnection("root", "sakai", "bdconsultorio"); /*Abrimos conexión*/
          validaBD = cb.insertDataUsuarioRecetas("tabla_recetas",  rec_idreceta,  Integer.parseInt(reme_idpaciente),   Integer.parseInt(reme_unidadmedica), 
          rec_descripcion,  rec_alergias,  rec_estatura,
          rec_peso,  rec_presion,  rec_tiposangre,reme_idcita );
          if(validaBD == 1){
                System.out.println("Proceso de guardado de Usuario de PAC fue correcto");
            }
          else{
                 System.out.println("Proceso de guardado de Usuario de PAC fue ERRONEO");
            }
          cb.closeConnection();
          this.dispose();
    }//GEN-LAST:event_botonGRecetaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(loginInMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(loginInMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(loginInMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(loginInMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new loginInMedico().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGReceta;
    private javax.swing.JLabel errorText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField recme_alergias;
    private javax.swing.JTextArea recme_descripción;
    private javax.swing.JComboBox<String> recme_estatura;
    private javax.swing.JTextField recme_idcita;
    private javax.swing.JLabel recme_idpaciente;
    private javax.swing.JTextField recme_idreceta;
    private javax.swing.JLabel recme_idunidadmedica;
    private javax.swing.JLabel recme_nombrepaciente;
    private javax.swing.JComboBox<String> recme_peso;
    private javax.swing.JTextField recme_presión;
    private javax.swing.JTextField recme_tiposangre;
    // End of variables declaration//GEN-END:variables
}
