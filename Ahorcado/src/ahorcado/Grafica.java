package ahorcado;

public class Grafica extends javax.swing.JFrame {
    
    Juego miPalabra=new Juego();
    int Ganador=0;

    public Grafica() {
        initComponents();
        miPalabra.LlenarPalabras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EtiquetaBienvenida = new javax.swing.JLabel();
        Pos0 = new javax.swing.JTextField();
        Pos1 = new javax.swing.JTextField();
        Pos2 = new javax.swing.JTextField();
        Pos3 = new javax.swing.JTextField();
        Pos4 = new javax.swing.JTextField();
        LetraUsuario = new javax.swing.JTextField();
        BotonOk = new javax.swing.JToggleButton();
        Vidas = new javax.swing.JTextField();
        EtiquetaVidas = new javax.swing.JLabel();
        CuadroDeTexto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EtiquetaBienvenida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EtiquetaBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaBienvenida.setText("BIENVENIDO AL JUEGO DEL AHORCADO");

        Pos0.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Pos0.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Pos1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Pos1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Pos2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Pos2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Pos3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Pos3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Pos4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Pos4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LetraUsuario.setFont(new java.awt.Font("Tahoma", 0, 90)); // NOI18N
        LetraUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BotonOk.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BotonOk.setText("OK");
        BotonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonOkMouseClicked(evt);
            }
        });
        BotonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOkActionPerformed(evt);
            }
        });

        Vidas.setFont(new java.awt.Font("Tahoma", 0, 90)); // NOI18N
        Vidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Vidas.setText("5");

        EtiquetaVidas.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        EtiquetaVidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaVidas.setText("VIDAS");

        CuadroDeTexto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CuadroDeTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CuadroDeTexto)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Pos0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LetraUsuario))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Vidas)
                                    .addComponent(EtiquetaVidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EtiquetaBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pos0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LetraUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EtiquetaVidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Vidas, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(CuadroDeTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonOkMouseClicked
       int bandera=0;
        miPalabra.Vidas--;
        
        for(int i=0;i<5;i++){
            
            if(miPalabra.Palabra[i].equals(LetraUsuario.getText())){
                
                switch (i){
                    case 0:{
                        Pos0.setText(miPalabra.Palabra[0]);
                        miPalabra.Vidas++; Ganador++;
                        CuadroDeTexto.setText("FELICIDADES! HA ENCONTRADO LA LETRA: "+miPalabra.Palabra[0]);
                        
                    }break;
                    case 1:{
                        Pos1.setText(miPalabra.Palabra[1]);
                        miPalabra.Vidas++; Ganador++;
                        CuadroDeTexto.setText("FELICIDADES! HA ENCONTRADO LA LETRA: "+miPalabra.Palabra[1]);
                    }break;
                    case 2:{
                        Pos2.setText(miPalabra.Palabra[2]);
                        miPalabra.Vidas++; Ganador++;
                        CuadroDeTexto.setText("FELICIDADES! HA ENCONTRADO LA LETRA: "+miPalabra.Palabra[2]);
                    }break;
                    case 3:{
                        Pos3.setText(miPalabra.Palabra[3]);
                        miPalabra.Vidas++; Ganador++;
                        CuadroDeTexto.setText("FELICIDADES! HA ENCONTRADO LA LETRA: "+miPalabra.Palabra[3]);
                    }break;
                    default:{
                        Pos4.setText(miPalabra.Palabra[4]);
                        miPalabra.Vidas++; Ganador++;
                        CuadroDeTexto.setText("FELICIDADES! HA ENCONTRADO LA LETRA: "+miPalabra.Palabra[4]);
                    }break;
                    
                                       
                    
                }
                bandera=1;
            }
        }
        if(bandera==0){
            CuadroDeTexto.setText("LETRA ERRONEA SE HA RESTADO 1 A SUS VIDAS");
        }
        
        Vidas.setText(Integer.toString(miPalabra.Vidas));
        
        if(miPalabra.Vidas<=0){
            CuadroDeTexto.setText("SU CONTADOR DE VIDAS HA QUEDADO EN 0, EL JUEGO HA TERMINADO");
        }
        
        if(Ganador==5){
            CuadroDeTexto.setText("FELICIDADES! HA ENCONTRADO LA PALABRA!");
        }        
             
        
        
    }//GEN-LAST:event_BotonOkMouseClicked

    private void BotonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOkActionPerformed
        
        
          
    }//GEN-LAST:event_BotonOkActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonOk;
    private javax.swing.JTextField CuadroDeTexto;
    private javax.swing.JLabel EtiquetaBienvenida;
    private javax.swing.JLabel EtiquetaVidas;
    private javax.swing.JTextField LetraUsuario;
    private javax.swing.JTextField Pos0;
    private javax.swing.JTextField Pos1;
    private javax.swing.JTextField Pos2;
    private javax.swing.JTextField Pos3;
    private javax.swing.JTextField Pos4;
    private javax.swing.JTextField Vidas;
    // End of variables declaration//GEN-END:variables
}
