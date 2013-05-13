import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Graph {
    static void DrawNerds(Graphics g,int x){
        g.setColor(Color.red);
        g.fillRect(5,5, 70, 70);
        g.setColor(Color.white);
        
        if(x==4 || x==5 || x==6)
        g.fillOval(10,10, 18, 18);
        if(x==6)
        g.fillOval(10,30, 18, 18);
        if(x==3 ||x==4 || x==5 || x==6)
        g.fillOval(10,50, 18, 18);
        if(x==2)
        g.fillOval(30,10, 18, 18); 
        if(x==1||x==3 || x==5)
        g.fillOval(30,30, 18, 18); 
        if(x==2)
        g.fillOval(30,50, 18, 18); 
        if(x==3 ||x==4 || x==5 || x==6)
        g.fillOval(50,10, 18, 18);
        if(x==6)
        g.fillOval(50,30, 18, 18);  
        if(x==4 || x==5 || x==6)
        g.fillOval(50,50, 18, 18);
    }
    
   static void DrawPos(Graphics g,Color c,int x,int y){
       g.setColor(c);
       g.fillOval(x,y, 38, 38);
   }
   
   static void DrawXPos(Graphics g,Image img,int x,int y){
       int z=x-5,m=y-5;
       g.drawImage(img, z, m, z+48, m+48, z, m, z+48, m+48, null);
   }
}