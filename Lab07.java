import java.awt.*;
import java.applet.*;
import java.util.*;
public class Lab07 extends Applet
{
    public void paint (Graphics g) {

        //Tree
        Tree.drawTrunk(g);
        Tree.drawLeaves(g);
        Tree.drawApple(g);
        Tree.drawBranch(g);
        //Mountain
        Mountain.drawLightRock(g);
        Mountain.drawSnow(g);
        Mountain.drawDarkRock(g);
        //Background
        Background.drawSky(g);
        Background.drawCloud(g);
        //Grass
        Grass.drawHill(g);
        Grass.drawDarkHill(g);


    }
}
