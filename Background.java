import java.awt.*;
public class Background {

    public static void drawSky(Graphics g){
        g.setColor(new Color(209,237,242));
        g.fillRect(0,10,1000,690);
    }
    public static void drawCloud(Graphics g){
        g.setColor(new Color(255,255,255));
        //first cloud
        g.fillOval(10,40,150,50);
        g.fillOval(60,20,100,50);
        g.fillOval(10,20,100,50);
        g.fillOval(10,50,100,50);
        //second cloud
        g.fillOval(400,60,150,50);
        g.fillOval(460,40,150,50);
        g.fillOval(410,40,100,50);
        g.fillOval(410,30,150,50);
        //third cloud
        g.fillOval(710,40,150,50);
        g.fillOval(760,20,150,50);
        g.fillOval(710,20,150,50);
        g.fillOval(710,50,100,50);

    }
}
