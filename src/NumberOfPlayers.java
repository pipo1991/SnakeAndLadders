
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class NumberOfPlayers extends javax.swing.JFrame {

    public NumberOfPlayers() {
        initComponents();
        s=new String[4];
        c=new JComboBox[4];
        h=new JComboBox[4];
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        name4 = new javax.swing.JTextField();
        color4 = new javax.swing.JComboBox();
        name3 = new javax.swing.JTextField();
        color3 = new javax.swing.JComboBox();
        name1 = new javax.swing.JTextField();
        color1 = new javax.swing.JComboBox();
        name2 = new javax.swing.JTextField();
        color2 = new javax.swing.JComboBox();
        title = new javax.swing.JLabel();
        titleshadow = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hpc1 = new javax.swing.JComboBox();
        hpc2 = new javax.swing.JComboBox();
        hpc3 = new javax.swing.JComboBox();
        hpc4 = new javax.swing.JComboBox();
        ok = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pat's Snake and ladder");
        getContentPane().setLayout(null);

        label1.setFont(new java.awt.Font("Tahoma", 1, 14));
        label1.setForeground(new java.awt.Color(0, 0, 255));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Player 1 name");
        getContentPane().add(label1);
        label1.setBounds(10, 150, 120, 30);

        label2.setFont(new java.awt.Font("Tahoma", 1, 14));
        label2.setForeground(new java.awt.Color(0, 0, 255));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Player 2 name");
        getContentPane().add(label2);
        label2.setBounds(10, 230, 120, 30);

        label3.setFont(new java.awt.Font("Tahoma", 1, 14));
        label3.setForeground(new java.awt.Color(0, 0, 255));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Player 3 name");
        getContentPane().add(label3);
        label3.setBounds(10, 310, 120, 30);

        label4.setFont(new java.awt.Font("Tahoma", 1, 14));
        label4.setForeground(new java.awt.Color(0, 0, 255));
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("Player 4 name");
        getContentPane().add(label4);
        label4.setBounds(10, 390, 120, 30);

        name4.setToolTipText("");
        name4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name4ActionPerformed(evt);
            }
        });
        getContentPane().add(name4);
        name4.setBounds(140, 390, 140, 30);

        color4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Red", "Blue", "Green", "Yellow" }));
        getContentPane().add(color4);
        color4.setBounds(300, 390, 130, 30);

        name3.setToolTipText("");
        name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name3ActionPerformed(evt);
            }
        });
        getContentPane().add(name3);
        name3.setBounds(140, 310, 140, 30);

        color3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Green", "Red", "Blue", "Black", "Yellow" }));
        color3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color3ActionPerformed(evt);
            }
        });
        getContentPane().add(color3);
        color3.setBounds(300, 310, 130, 30);

        name1.setToolTipText("");
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        getContentPane().add(name1);
        name1.setBounds(140, 150, 140, 30);

        color1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Red", "Blue", "Green", "Black", "Yellow" }));
        color1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                color1ItemStateChanged(evt);
            }
        });
        color1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color1ActionPerformed(evt);
            }
        });
        getContentPane().add(color1);
        color1.setBounds(300, 150, 130, 30);

        name2.setToolTipText("");
        name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name2ActionPerformed(evt);
            }
        });
        getContentPane().add(name2);
        name2.setBounds(140, 230, 140, 30);

        color2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blue", "Red", "Green", "Black", "Yellow" }));
        getContentPane().add(color2);
        color2.setBounds(300, 230, 130, 30);

        title.setFont(new java.awt.Font("Snap ITC", 0, 30));
        title.setForeground(new java.awt.Color(255, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Players Details");
        getContentPane().add(title);
        title.setBounds(0, -40, 580, 250);

        titleshadow.setFont(new java.awt.Font("Snap ITC", 0, 30));
        titleshadow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleshadow.setText("Players Details");
        getContentPane().add(titleshadow);
        titleshadow.setBounds(0, -35, 580, 250);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("** leave the field empty if you are less than 4  players");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 560, 30);

        hpc1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "Pc" }));
        getContentPane().add(hpc1);
        hpc1.setBounds(440, 150, 130, 30);

        hpc2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "Pc" }));
        getContentPane().add(hpc2);
        hpc2.setBounds(440, 230, 130, 30);

        hpc3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "Pc" }));
        hpc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpc3ActionPerformed(evt);
            }
        });
        getContentPane().add(hpc3);
        hpc3.setBounds(440, 310, 130, 30);

        hpc4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "Pc" }));
        getContentPane().add(hpc4);
        hpc4.setBounds(440, 390, 130, 30);

        ok.setFont(new java.awt.Font("Old English Text MT", 0, 36));
        ok.setText("ok");
        ok.setToolTipText("");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(190, 440, 230, 40);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game-Board-Snakes-and-Ladders-Full.gif"))); // NOI18N
        Back.setEnabled(false);
        getContentPane().add(Back);
        Back.setBounds(0, 0, 580, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed

    }//GEN-LAST:event_name1ActionPerformed

    private void name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name3ActionPerformed

    }//GEN-LAST:event_name3ActionPerformed

    private void name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name2ActionPerformed

    }//GEN-LAST:event_name2ActionPerformed

    private void name4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name4ActionPerformed

    }//GEN-LAST:event_name4ActionPerformed

    private void color3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color3ActionPerformed
   
    }//GEN-LAST:event_color3ActionPerformed

    private void hpc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpc3ActionPerformed

    }//GEN-LAST:event_hpc3ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
  if (status()){ 
    s[0]=name1.getText();
    s[1]=name2.getText();
    s[2]=name3.getText();
    s[3]=name4.getText();
    c[0]=color1;
    c[1]=color2;
    c[2]=color3;
    c[3]=color4;
    h[0]=hpc1;
    h[1]=hpc2;
    h[2]=hpc3;
    h[3]=hpc4;
    int pl=0;
    for(int i=0;i<4;i++){
        if(!s[i].isEmpty())pl++;
    }
    player=new Player[pl];
    int counter=0;
    for(int i=0;i<4;i++){
       if(!s[i].isEmpty()){
           player[counter]=new Player(s[i]);
           player[counter].setColor(colorchoose(c[i]));
          player[counter].setPc(HPC(h[i]));
          counter++;
             } 
          }        
        Gameboard open=new Gameboard(pl,player);
        this.dispose();
        open.setBounds(200,200, 710, 620);
        open.setResizable(false);
        open.setVisible(true);
    
        }
    }//GEN-LAST:event_okActionPerformed

    private void color1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_color1ActionPerformed

    private void color1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_color1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_color1ItemStateChanged
Color colorchoose(JComboBox x){
    Color fx=Color.BLACK;
    String m=x.getSelectedItem().toString();
    if(m.equals("Red"))fx=Color.RED;
    else if(m.equals("Blue"))fx=Color.BLUE;
    else if(m.equals("Green"))fx=Color.GREEN;
    else if(m.equals("Black"))fx=Color.BLACK;
    else if(m.equals("Yellow"))fx=Color.YELLOW;
    return fx;
}
Boolean HPC(JComboBox x){
    String m=x.getSelectedItem().toString();
    if(m.equals("Pc"))return true;
    return false;
}
boolean status(){
    if(name1.getText().isEmpty() && name2.getText().isEmpty()
           && name3.getText().isEmpty() && name4.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter at least one name");
                return false;
        }
   if(name1.getText().isEmpty() && name2.getText().isEmpty()&& name3.getText().isEmpty() ||
      name4.getText().isEmpty() && name2.getText().isEmpty()&& name3.getText().isEmpty() ||
      name4.getText().isEmpty() && name2.getText().isEmpty()&& name1.getText().isEmpty() ||
      name4.getText().isEmpty() && name1.getText().isEmpty()&& name3.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter at least 2 Players");
                return false;
        }
       if(color1.getSelectedItem() == color2.getSelectedItem()
            && !name1.getText().isEmpty()&& !name2.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please change the color of either player 1 or 2.\n"
                + "Each player must have a unique color.");
                return false;
    }
       if(color1.getSelectedItem() == color3.getSelectedItem()
            && !name1.getText().isEmpty()&& !name3.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please change the color of either player 1 or 3.\n"
                + "Each player must have a unique color.");
                return false;
    }
        if(color1.getSelectedItem() == color4.getSelectedItem()
            && !name1.getText().isEmpty()&& !name4.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please change the color of either player 1 or 4.\n"
                + "Each player must have a unique color.");
                return false;
    }
       if(color2.getSelectedItem() == color3.getSelectedItem()
            && !name2.getText().isEmpty()&& !name3.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please change the color of either player 2 or 3.\n"
                + "Each player must have a unique color.");
                return false;
    }
       if(color2.getSelectedItem() == color4.getSelectedItem()
            && !name2.getText().isEmpty()&& !name4.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please change the color of either player 2 or 4.\n"
                + "Each player must have a unique color.");
                return false;
    }
       if(color3.getSelectedItem() == color4.getSelectedItem()
            && !name3.getText().isEmpty()&& !name4.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please change the color of either player 3 or 4.\n"
                + "Each player must have a unique color.");
                return false;
    }
    return true;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JComboBox color1;
    private javax.swing.JComboBox color2;
    private javax.swing.JComboBox color3;
    private javax.swing.JComboBox color4;
    private javax.swing.JComboBox hpc1;
    private javax.swing.JComboBox hpc2;
    private javax.swing.JComboBox hpc3;
    private javax.swing.JComboBox hpc4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField name4;
    private javax.swing.JButton ok;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleshadow;
    // End of variables declaration//GEN-END:variables
    private Player player[];
    private String s[];
    private JComboBox c[],h[];

}
