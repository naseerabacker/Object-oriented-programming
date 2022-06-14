/*5. Develop a program that has a Choice component which contains the names of shapes such as rectangle, triangle, square and circle. Draw the corresponding shapes for given parameters as per user’s choice.*/


import java.awt.*;
import java.awt.event.*;

public class Choices extends Frame implements ItemListener
{
    Choice shapes;
    String str;

    public Choices()
    {

    setLayout(new FlowLayout());    // Use a flow layout.

    shapes = new Choice();    // Create choice lists.
   
   
    shapes.add("Rectangle");    // Add items to os list.
    shapes.add("Triangle");
    shapes.add("Square");
    shapes.add("Circle");

   
    add(shapes);    // Add choice lists to window.

   
    shapes.addItemListener(this);    // Add item listeners.
   
    addWindowListener(new WindowAdapter()
    {
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
    });
    }


    public void itemStateChanged(ItemEvent ie)
    {
        str=shapes.getSelectedItem();
        repaint();
    }

   
    public void paint(Graphics g) // Display current selections.
    {
        if(str.equals("Rectangle"))
        {
            g.setColor(Color.red);
            g.fillRect(50, 50, 150, 150);
        }
        else if(str.equals("Triangle"))
        {
            Color c1= new Color(255,200,100);
            int xpoints[] = { 0,155,175};
            int ypoints[] = {145,85,145};
            int num =3;
            g.setColor(c1);
            g.fillPolygon(xpoints, ypoints, num);
        }
        else if(str.equals("Square"))
        {
            Color c2= new Color(200,200,100);
            g.setColor(c2);
            g.fillRect(70, 40, 100, 100);
        }
        else if(str.equals("Circle"))
        {
            Color c3= new Color(200,100,150);
            g.setColor(c3);
            g.fillOval(75, 40, 100, 100);
        }
        else { }
    }


    public static void main(String[] args)
    {
        Choices appwin = new Choices();

        appwin.setSize(new Dimension(250, 250));
        appwin.setTitle("Choice");
        appwin.setVisible(true);
    }
}
