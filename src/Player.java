
import java.awt.Color;
import java.awt.Rectangle;

public class Player{
   private String name;
   private  int score;
   private  Rectangle pos,xpos;
   private  Color color;
   private  boolean pc;
 
    
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.pos = new Rectangle();
        pos.height=1000;
        pos.width=1000;
        this.xpos = new Rectangle();
        xpos.height=1000;
        xpos.width=1000;
        this.color = Color.RED;
    }
 
    
    public Player(String name,Color color) {
        this.name = name;
        this.score = 0;
        this.pos = new Rectangle();
        pos.height=1000;
        pos.width=1000;
        this.xpos = new Rectangle();
        xpos.height=1000;
        xpos.width=1000;
        this.color = color;
    }

    
    public void setPc(boolean pc) {
        this.pc = pc;
    }

    
    public boolean isPc() {
        return pc;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public void setScore(int score) {
        this.score = score;
    }

    public void setPos(Rectangle pos) {
        this.pos = pos;
    }

    
    public void setXpos(Rectangle xpos) {
        this.xpos = xpos;
    }
   
    
    public String getName() {
        return name;
    }
    
    
    public Color getColor() {
        return color;
    }

    
    public int getScore() {
        return score;
    }

    
    public Rectangle getPos() {
        return pos;
    }

    
    public Rectangle getXpos() {
        return xpos;
    }

}
