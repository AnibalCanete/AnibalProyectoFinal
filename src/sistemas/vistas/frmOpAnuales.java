/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.vistas;

/**
 *
 * @author Anibal
 */
public class frmOpAnuales extends javax.swing.JFrame {

    /**
     * Creates new form frmOpAnuales
     */
    public frmOpAnuales() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiTitulo = new javax.swing.JLabel();
        panelOpAnuales = new javax.swing.JPanel();
        etiInformes = new javax.swing.JLabel();
        etiReportes = new javax.swing.JLabel();
        etiResultados = new javax.swing.JLabel();
        txtInformes = new javax.swing.JTextField();
        txtReportes = new javax.swing.JTextField();
        txtResultados = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        etiTitulo.setText("Operaciones Anuales");

        panelOpAnuales.setBackground(new java.awt.Color(51, 51, 255));
        panelOpAnuales.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etiInformes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etiInformes.setText("Informes:");

        etiReportes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etiReportes.setText("Reportes:");

        etiResultados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etiResultados.setText("Resultados:");

        txtInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInformesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpAnualesLayout = new javax.swing.GroupLayout(panelOpAnuales);
        panelOpAnuales.setLayout(panelOpAnualesLayout);
        panelOpAnualesLayout.setHorizontalGroup(
            panelOpAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpAnualesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpAnualesLayout.createSequentialGroup()
                        .addGroup(panelOpAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiResultados)
                            .addComponent(etiReportes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panelOpAnualesLayout.createSequentialGroup()
                        .addComponent(etiInformes)
                        .addGap(20, 20, 20)))
                .addGroup(panelOpAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtReportes, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(txtInformes, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOpAnualesLayout.setVerticalGroup(
            panelOpAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpAnualesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiInformes)
                    .addComponent(txtInformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOpAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiReportes)
                    .addComponent(txtReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOpAnualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiResultados)
                    .addComponent(txtResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Archivo.jpg"))); // NOI18N
        btnInsertar.setText("Insertar");

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Lapiz.jpg"))); // NOI18N
        btnModificar.setText("Modificar");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono x.jpg"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setMaximumSize(new java.awt.Dimension(211, 155));
        btnEliminar.setMinimumSize(new java.awt.Dimension(211, 155));
        btnEliminar.setPreferredSize(new java.awt.Dimension(211, 155));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Lupa.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelOpAnuales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiTitulo)
                .addGap(363, 363, 363))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(etiTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelOpAnuales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInformesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInformesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(frmOpAnuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOpAnuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOpAnuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOpAnuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmOpAnuales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnInsertar;
    public static javax.swing.JButton btnModificar;
    private javax.swing.JLabel etiInformes;
    private javax.swing.JLabel etiReportes;
    private javax.swing.JLabel etiResultados;
    private javax.swing.JLabel etiTitulo;
    private javax.swing.JPanel panelOpAnuales;
    public static javax.swing.JTextField txtInformes;
    public javax.swing.JTextField txtReportes;
    public javax.swing.JTextField txtResultados;
    // End of variables declaration//GEN-END:variables
}