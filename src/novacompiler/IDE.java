package novacompiler;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kathy
 */
public class IDE extends javax.swing.JFrame {

    NumeroLinea numerolinea;
    Directorio dir;
    
   
    public IDE() {
        initComponents();
        
        inicializar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_Guardar = new javax.swing.JButton();
        BTN_NuevoDoc = new javax.swing.JButton();
        BTN_Abrir = new javax.swing.JButton();
        BTN_Keywords = new javax.swing.JButton();
        BTN_Indentificadores = new javax.swing.JButton();
        BTN_Tokens = new javax.swing.JButton();
        BTN_Compilar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTPCodigo = new javax.swing.JTextPane();
        JTA_Terminal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/Icon/icons8_save_48px.png"))); // NOI18N
        BTN_Guardar.setText("Guardar");
        BTN_Guardar.setToolTipText("Guardar documento");
        BTN_Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/pressed/icons8_save_48px_p.png"))); // NOI18N
        BTN_Guardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/On Layer/icons8_save_48px_on.png"))); // NOI18N
        BTN_Guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        BTN_NuevoDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/Icon/icons8_code_file_48px.png"))); // NOI18N
        BTN_NuevoDoc.setText("Nuevo");
        BTN_NuevoDoc.setToolTipText("Crea un nuevo documento");
        BTN_NuevoDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_NuevoDoc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/pressed/icons8_code_file_48px_p.png"))); // NOI18N
        BTN_NuevoDoc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/On Layer/icons8_code_file_48px_on.png"))); // NOI18N
        BTN_NuevoDoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_NuevoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoDocActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_NuevoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        BTN_Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/Icon/icons8_opened_folder_48px.png"))); // NOI18N
        BTN_Abrir.setText("Abrir");
        BTN_Abrir.setToolTipText("Abrir un documento");
        BTN_Abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Abrir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/pressed/icons8_opened_folder_48px_P.png"))); // NOI18N
        BTN_Abrir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/On Layer/icons8_opened_folder_48px_ON.png"))); // NOI18N
        BTN_Abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AbrirActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        BTN_Keywords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/Icon/icons8-text-color-48.png"))); // NOI18N
        BTN_Keywords.setText("Keywords");
        BTN_Keywords.setToolTipText("Muestra las palabras reservadas");
        BTN_Keywords.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Keywords.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/pressed/icons8-text-color-48.png"))); // NOI18N
        BTN_Keywords.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/On Layer/icons8-text-color-48.png"))); // NOI18N
        BTN_Keywords.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(BTN_Keywords, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, -1));

        BTN_Indentificadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/Icon/icons8-text-cursor-48.png"))); // NOI18N
        BTN_Indentificadores.setText("Identificadores");
        BTN_Indentificadores.setToolTipText("Muestra los identificadores");
        BTN_Indentificadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Indentificadores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/pressed/icons8-text-cursor-48.png"))); // NOI18N
        BTN_Indentificadores.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/On Layer/icons8-text-cursor-48.png"))); // NOI18N
        BTN_Indentificadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(BTN_Indentificadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, -1));

        BTN_Tokens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/Icon/icons8-index-48.png"))); // NOI18N
        BTN_Tokens.setText("Tokens");
        BTN_Tokens.setToolTipText("Muestra los tokens");
        BTN_Tokens.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Tokens.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/pressed/icons8-index-48.png"))); // NOI18N
        BTN_Tokens.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/On Layer/icons8-index-48.png"))); // NOI18N
        BTN_Tokens.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(BTN_Tokens, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        BTN_Compilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/Icon/icons8_code_48px.png"))); // NOI18N
        BTN_Compilar.setText("Compilar");
        BTN_Compilar.setToolTipText("Compila el archivo");
        BTN_Compilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Compilar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/On Layer/icons8_code_48px_on.png"))); // NOI18N
        BTN_Compilar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/novacompiler/Iconos/pressed/icons8_code_48px_p.png"))); // NOI18N
        BTN_Compilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(BTN_Compilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        JTPCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTPCodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTPCodigoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTPCodigo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 480, 440));

        JTA_Terminal.setColumns(20);
        JTA_Terminal.setRows(5);
        getContentPane().add(JTA_Terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 480, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    
    private void BTN_NuevoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoDocActionPerformed
        JTA_Terminal.setText("");
                dir.Nuevo(this);
                clearAllComp();
    }//GEN-LAST:event_BTN_NuevoDocActionPerformed

    private void BTN_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActionPerformed
        JTA_Terminal.setText("");
                dir.Guardar(this);
                clearAllComp();
    }//GEN-LAST:event_BTN_GuardarActionPerformed

    private void BTN_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AbrirActionPerformed
        JTA_Terminal.setText("");
                dir.Abrir(this);
                clearAllComp();
    }//GEN-LAST:event_BTN_AbrirActionPerformed

    private void JTPCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPCodigoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTPCodigoKeyPressed

    private void JTPCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPCodigoKeyReleased
       int keyCode = evt.getKeyCode();
       if ((keyCode >= 65) && (keyCode <= 90) || 
           (keyCode >= 48) && (keyCode <= 57) || 
           (keyCode >= 97) && (keyCode <= 122) || 
           (keyCode != 27 && !(keyCode <= 37 && keyCode >= 40) && 
           !(keyCode <= 16 && keyCode >= 18) && 
           keyCode != 524 && keyCode != 20)){
           
           if(!getTitle().contains("*")){
               setTitle(getTitle() + "*");
           }
       } 
    }//GEN-LAST:event_JTPCodigoKeyReleased

    private void inicializar(){
        //Importante
        dir = new Directorio();
        
        setTitle ("#CUADRO");
        
        String[] options = new String[]{"guardar y continuar","descargar"};
        
        numerolinea = new NumeroLinea(JTPCodigo);
        jScrollPane1.setRowHeaderView(numerolinea);
    }
    
    
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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
        
        
    }
    
    public void clearAllComp(){
            JTA_Terminal.setText("");
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Abrir;
    private javax.swing.JButton BTN_Compilar;
    private javax.swing.JButton BTN_Guardar;
    private javax.swing.JButton BTN_Indentificadores;
    private javax.swing.JButton BTN_Keywords;
    private javax.swing.JButton BTN_NuevoDoc;
    private javax.swing.JButton BTN_Tokens;
    private javax.swing.JTextArea JTA_Terminal;
    public javax.swing.JTextPane JTPCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
