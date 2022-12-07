import java.awt.*;
public class Mountain {

    public static void drawLightRock(Graphics g){
        Polygon triangle1 = new Polygon();
        triangle1.addPoint(100,700);
        triangle1.addPoint(300, 700);
        triangle1.addPoint(300,300);
        g.setColor(new Color(211,211,211));
        g.fillPolygon(triangle1);
        Polygon triangle2 = new Polygon();
        triangle2.addPoint(400,700);
        triangle2.addPoint(600, 700);
        triangle2.addPoint(600,300);
        g.setColor(new Color(211,211,211));
        g.fillPolygon(triangle2);
    }
    public static void drawDarkRock(Graphics g){
        Polygon triangle2 = new Polygon();
        triangle2.addPoint(600,700);
        triangle2.addPoint(800, 700);
        triangle2.addPoint(600,300);
        g.setColor(new Color(169,169,169));
        g.fillPolygon(triangle2);
        Polygon triangle3 = new Polygon();
        triangle3.addPoint(500,700);
        triangle3.addPoint(300, 700);
        triangle3.addPoint(300,300);
        g.setColor(new Color(169,169,169));
        g.fillPolygon(triangle3);
    }
    public static void drawSnow(Graphics g){
        //change numbers for snowcaps
        Polygon triangle4 = new Polygon();
        triangle4.addPoint(600,700);
        triangle4.addPoint(800, 700);
        triangle4.addPoint(600,300);
        g.setColor(new Color(255,255,255));
        g.fillPolygon(triangle4);
        Polygon triangle5 = new Polygon();
        triangle5.addPoint(500,700);
        triangle5.addPoint(300, 700);
        triangle5.addPoint(300,300);
        g.setColor(new Color(255,255,255));
        g.fillPolygon(triangle5);
    }

    }
