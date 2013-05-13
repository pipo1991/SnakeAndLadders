
public class OpeningWindow extends javax.swing.JFrame {

    public OpeningWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newgame = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pat's Snake and ladder");
        setBounds(new java.awt.Rectangle(400, 400, 400, 400));
        setForeground(java.awt.Color.white);
        setName("mainwindow"); // NOI18N
        getContentPane().setLayout(null);

        newgame.setFont(new java.awt.Font("Speed", 1, 36)); // NOI18N
        newgame.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        newgame.setText("New game");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });
        getContentPane().add(newgame);
        newgame.setBounds(100, 160, 390, 60);

        Quit.setFont(new java.awt.Font("Speed", 1, 36)); // NOI18N
        Quit.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        getContentPane().add(Quit);
        Quit.setBounds(100, 320, 390, 60);

        jLabel1.setFont(new java.awt.Font("Simpson", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pat's Snake and ladder V1.0");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(25, 20, 540, 70);

        jLabel2.setFont(new java.awt.Font("Simpson", 1, 36));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pat's Snake and ladder V1.0");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 540, 70);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game-Board-Snakes-and-Ladders-Full.gif"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setEnabled(false);
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 580, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        this.dispose();
        NumberOfPlayers num=new NumberOfPlayers();
        num.setBounds(200,200, 580, 520);
        num.setResizable(false);
        num.setVisible(true);
    }//GEN-LAST:event_newgameActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Quit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton newgame;
    // End of variables declaration//GEN-END:variables

}
