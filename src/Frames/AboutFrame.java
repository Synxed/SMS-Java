/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

/**
 *
 * @author Cerberus
 */
public class AboutFrame extends javax.swing.JFrame {

    /**
     * Creates new form AboutFrame
     */
    public AboutFrame() {
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

        AboutPanel = new javax.swing.JPanel();
        AboutLabel = new javax.swing.JLabel();
        DevelopedbyPanel = new javax.swing.JPanel();
        DevelopedbyLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SMS - About");
        setResizable(false);

        AboutPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("About"));

        AboutLabel.setText("<html>Skill Management System is a management software developed to aid<br> administrators of software companies, in recording their employees<br> skills, registering projects and allocating employees based on their<br> sills and generating different reports for analysis purpose.<br>  The program stores all recorded data in a local database and<br> using credential authentication,it prevents unauthorized usage.</html>");

        javax.swing.GroupLayout AboutPanelLayout = new javax.swing.GroupLayout(AboutPanel);
        AboutPanel.setLayout(AboutPanelLayout);
        AboutPanelLayout.setHorizontalGroup(
            AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AboutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );
        AboutPanelLayout.setVerticalGroup(
            AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        DevelopedbyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Developed by"));

        DevelopedbyLabel.setText("<html>11500114111 - Suman Bhowmick<br> 11500114110 - Sujay Dey<br> 11500114109 - Sugata Bera<br> 11500114108 - Suchismita Mahato<br> 11500114107 - Subir Kumar Hansda</html>");

        javax.swing.GroupLayout DevelopedbyPanelLayout = new javax.swing.GroupLayout(DevelopedbyPanel);
        DevelopedbyPanel.setLayout(DevelopedbyPanelLayout);
        DevelopedbyPanelLayout.setHorizontalGroup(
            DevelopedbyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DevelopedbyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DevelopedbyLabel)
                .addContainerGap())
        );
        DevelopedbyPanelLayout.setVerticalGroup(
            DevelopedbyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DevelopedbyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DevelopedbyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DevelopedbyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AboutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutLabel;
    private javax.swing.JPanel AboutPanel;
    private javax.swing.JLabel DevelopedbyLabel;
    private javax.swing.JPanel DevelopedbyPanel;
    // End of variables declaration//GEN-END:variables
}