import java.awt.*;
public class Tree {

    public static void drawTrunk(Graphics g){
        g.setColor(new Color(150,75,0));
        g.fillRect(850,700,30,100);
    }
    public static void drawLeaves(Graphics g){
        g.setColor(new Color(1,50,32));
        g.fillOval(835, 650, 60, 60);
    }
    public static void drawApple(Graphics g){
        g.setColor(new Color(217,33,33));
        g.fillOval(855, 650, 10, 10);
        g.setColor(new Color(217,33,33));
        g.fillOval(835, 660, 10, 10);
        g.setColor(new Color(217,33,33));
        g.fillOval(865, 670, 10, 10);
    }
    public static void drawBranch(Graphics g){
        g.setColor(new Color(150,75,0));
        g.fillRect(860,750,50,10);
        g.setColor(new Color(150,75,0));
        g.fillRect(800,730,50,10);

    }

    }

