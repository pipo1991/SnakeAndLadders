import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;



public class Gameboard extends javax.swing.JFrame {

    public Gameboard(int x,Player y[])  {
        initComponents();
        nerd=0;
        pl=y;
        playernow=0;
        numberofplayers=x;
        loadImage();
        if(x<4){
            name4.setVisible(false); 
            player4.setVisible(false);
            hpc4.setVisible(false);
                if(x<3) {
                   name3.setVisible(false); 
                   player3.setVisible(false);
                   hpc3.setVisible(false);
                }
        }
        name1.setText(pl[0].getName());
        name1.setForeground(pl[0].getColor());
        if(pl[0].isPc())hpc1.setText("PC");
        else hpc1.setVisible(false);
        name2.setText(pl[1].getName());
        name2.setForeground(pl[1].getColor());
        if(pl[1].isPc())hpc2.setText("PC");
        else hpc2.setVisible(false);
       if(x>2){
          name3.setText(pl[2].getName());
          name3.setForeground(pl[2].getColor());
          if(pl[2].isPc())hpc3.setText("PC");
          else hpc3.setVisible(false);
          if(x>3){
            name4.setText(pl[3].getName()); 
            name4.setForeground(pl[3].getColor());
            if(pl[3].isPc())hpc4.setText("PC");
            else hpc4.setVisible(false);
          }
       }
       status.setText("It's "+pl[playernow].getName()+" turn.");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        game = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player3 = new javax.swing.JLabel();
        player4 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        hpc1 = new javax.swing.JLabel();
        hpc2 = new javax.swing.JLabel();
        hpc3 = new javax.swing.JLabel();
        hpc4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pat's Snake and ladder");
        getContentPane().setLayout(null);

        game.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled-2.gif"))); // NOI18N
        getContentPane().add(game);
        game.setBounds(10, 10, 480, 480);

        jLabel2.setFont(new java.awt.Font("Snowdrift", 0, 36));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nerd");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 40, 170, 40);

        jButton1.setFont(new java.awt.Font("Ravie", 0, 11));
        jButton1.setText("Hit the Nerd");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 170, 160, 40);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(565, 80, 80, 80);

        player1.setFont(new java.awt.Font("Segoe Script", 1, 12));
        player1.setText("Player1:");
        getContentPane().add(player1);
        player1.setBounds(520, 220, 60, 30);

        player2.setFont(new java.awt.Font("Segoe Script", 1, 12));
        player2.setText("Player2:");
        getContentPane().add(player2);
        player2.setBounds(520, 260, 60, 30);

        player3.setFont(new java.awt.Font("Segoe Script", 1, 12));
        player3.setText("Player3:");
        getContentPane().add(player3);
        player3.setBounds(520, 300, 60, 30);

        player4.setFont(new java.awt.Font("Segoe Script", 1, 12));
        player4.setText("Player4:");
        getContentPane().add(player4);
        player4.setBounds(520, 340, 60, 30);

        name1.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        name1.setText("Player1:");
        getContentPane().add(name1);
        name1.setBounds(580, 220, 60, 30);

        name2.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        name2.setText("Player2:");
        getContentPane().add(name2);
        name2.setBounds(580, 260, 60, 30);

        name3.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        name3.setText("Player3:");
        getContentPane().add(name3);
        name3.setBounds(580, 300, 60, 30);

        name4.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        name4.setText("Player4:");
        getContentPane().add(name4);
        name4.setBounds(580, 340, 60, 30);
        getContentPane().add(status);
        status.setBounds(10, 500, 480, 40);

        hpc1.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        hpc1.setText("Player1:");
        getContentPane().add(hpc1);
        hpc1.setBounds(640, 220, 60, 30);

        hpc2.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        hpc2.setText("Player2:");
        getContentPane().add(hpc2);
        hpc2.setBounds(640, 260, 60, 30);

        hpc3.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        hpc3.setText("Player3:");
        getContentPane().add(hpc3);
        hpc3.setBounds(640, 300, 60, 30);

        hpc4.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        hpc4.setText("Player4:");
        getContentPane().add(hpc4);
        hpc4.setBounds(640, 340, 60, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 do  {
     GameRoll();
 }while(pl[playernow].isPc());
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel game;
    private javax.swing.JLabel hpc1;
    private javax.swing.JLabel hpc2;
    private javax.swing.JLabel hpc3;
    private javax.swing.JLabel hpc4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JLabel player3;
    private javax.swing.JLabel player4;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
    int nerd;
    Player pl[];
    Image img;
    int playernow;
    int numberofplayers;
    
    int diceroll(){
       nerd=(int)(6 * Math.random()) + 1;
       Graph.DrawNerds(jPanel1.getGraphics(),nerd);
       return nerd;
    }
    
    static Rectangle pos2rect(int x){
        int z=(x-1)/10,r=(x-1)%10;
        Rectangle rect=new Rectangle();
        if(z%2==0){
        rect.width=(48*r)+5;
        rect.height=(480-48*(z+1))+5;
        return rect;
        }
        rect.width=(480-48*(r+1))+5;
        rect.height=(480-48*(z+1))+5;
        return rect;
    }
    
    private void loadImage() {
         ClassLoader cl = Gameboard.class.getClassLoader();
         URL imageURL = cl.getResource("Untitled-2.gif");
         if (imageURL != null)
            img = Toolkit.getDefaultToolkit().createImage(imageURL);
      }
    
     void GameRoll(){
       PlayerRoll(pl[playernow]);
       if(pl[playernow].getScore()==100){
           JOptionPane.showMessageDialog(null, "Congratulations! "+pl[playernow].getName()+" wins.");
           OpeningWindow open=new OpeningWindow();
           open.setBounds(200,200, 580, 520);
           open.setResizable(false);
           open.setVisible(true);
           this.dispose();
       }
        playernow++;
        if(playernow>numberofplayers-1)playernow=0;
        status.setText("It's "+pl[playernow].getName()+" turn.");
   }
       
   void PlayerRoll(Player x){
     x.setScore(CheckPostion(x.getScore()+diceroll()));
     x.setXpos(x.getPos());
     x.setPos(pos2rect(x.getScore()));
     Graph.DrawXPos(game.getGraphics(), img, x.getXpos().width, x.getXpos().height);   
     DrawPlayers();
    }
   
   int CheckPostion(int x){
       if(x==1)return 38;
       if(x==4)return 14;
       if(x==9)return 31;
       
       if(x==17)return 7;
       
       if(x==21)return 42;
       if(x==28)return 84;
       
       if(x==51)return 67;
       if(x==54)return 34;
       
       if(x==62)return 19;
       if(x==64)return 60;
       
       if(x==71)return 91;
       if(x==80)return 100;
       
       if(x==87)return 24;
       
       if(x==93)return 73;
       if(x==95)return 75;
       if(x==98)return 79;
       if(x>100)return x-nerd;
       return x;
   }
   void DrawPlayers(){
       for(int i=0;i<numberofplayers;i++){
         Graph.DrawPos(game.getGraphics(), pl[i].getColor(), pl[i].getPos().width,pl[i].getPos().height);
       }
      Graph.DrawPos(game.getGraphics(), pl[playernow].getColor(), pl[playernow].getPos().width,pl[playernow].getPos().height);
   }
   
    @Override
   public void paint(Graphics g){
    super.paint(g);  
    DrawPlayers();
    Graph.DrawNerds(jPanel1.getGraphics(),nerd);
   }
}