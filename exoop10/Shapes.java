//Program to draw Circle, Rectangle, Line

import java.awt.*;
import java.awt.event.*;

public class Shapes extends Frame 
{
    public Shapes()
    {
		// Anonymous inner class to handle window close events.
    addWindowListener(new WindowAdapter()
    {
    public void windowClosing(WindowEvent we) 
    {
      System.exit(0);
    }
   });
   }

	public void paint(Graphics g) 
	{

		g.setColor(Color.red);//Draw lines
		g.drawLine(50, 150, 150, 50);
		
		g.setColor(Color.yellow);//Draw rectangles
		g.drawRect(80, 50, 60, 50);
		g.fillRect(80, 150, 50, 50);

		g.setColor(Color.black);//Draw Circles
		g.drawOval(180, 150,50, 50);
		g.fillOval(180, 50,50, 50);
	}

	public static void main(String[] args) 
	{
		Shapes appwin = new Shapes();

		appwin.setSize(new Dimension(400, 400));
		appwin.setTitle("Shapes");
		appwin.setVisible(true);
	}
}



