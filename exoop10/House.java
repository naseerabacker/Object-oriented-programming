/*
Using 2D graphics commands in an Applet, construct a house.
On mouse click event, change the color of the door from blue to red.
*/

import java.awt.*;
import java.awt.event.*;

public class House extends Frame
implements MouseListener, MouseMotionListener 
{
public House() 
{

addMouseListener(this);
addMouseMotionListener(this);
addWindowListener(new MyWindowAdapter());
}


public Color door =Color.blue;

public void mouseClicked(MouseEvent me) 
{
    if(door ==Color.blue)
{

    door =Color.red;

    }
    else if(door ==Color.red)
{
        door =Color.blue;

    }

repaint();
}

public void mouseEntered(MouseEvent me)
 {
   
}
public void mouseExited(MouseEvent me) 
{
   
}
public void mousePressed(MouseEvent me) 
{

}
public void mouseReleased(MouseEvent me) 
{
}
public void mouseDragged(MouseEvent me)
 {
}

public void mouseMoved(MouseEvent me)
{
}

public void paint(Graphics g)
 {

g.setColor(Color.red);//Draw rectangles
g.fillRect(100, 100, 170, 100);

g.setColor(door);//door
g.fillRect(160,160, 20, 40);

g.setColor(Color.black);//roof
int x[] = {100,190,270};
int y[] = {100,50,100};
Polygon poly=new Polygon(x,y,3);
g.fillPolygon(poly);

}

public static void main(String[] args)
 {
House appwin = new House();

appwin.setSize(new Dimension(300, 300));
appwin.setTitle("House");
appwin.setVisible(true);
}
}
class MyWindowAdapter extends WindowAdapter
 {
public void windowClosing(WindowEvent we)
 {
System.exit(0);
} 
}
