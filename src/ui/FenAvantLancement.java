/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


/**
 *
 * @author BaDRi
 */
public class FenAvantLancement extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private int secondes;
  
    public FenAvantLancement(int secondes) {
        this.secondes = secondes;
        initComponents();
        this.setVisible(true);
        lblNumero.setText(String.valueOf(secondes));
    }

    public void setsecondes(int secondes) {
        this.secondes = secondes;
        lblNumero.setText(String.valueOf(secondes));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(330, 330));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(330, 330));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(330, 330));
        jPanel1.setLayout(null);

        lblNumero.setFont(new java.awt.Font("Arial", 1, 111)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("-");
        jPanel1.add(lblNumero);
        lblNumero.setBounds(133, 120, 63, 114);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Secondes");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(125, 260, 80, 31);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Le test commence dans");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 350, 70);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNumero;
    // End of variables declaration//GEN-END:variables
}
