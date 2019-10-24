import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;



public class Drawing extends Canvas {

    private Frame f;
    private Circle circle;
    private Rect rectangle;

    public Drawing(){
        Point p=new Point(200,200);
        Color c=new Color(0x992566);//  The  RGB  number  comprises  three  bytes:
        Point p1=new Point(230,230);
        Color c1=new Color(0x998300);//  The  RGB  number  comprises  three  bytes:

        circle = new Circle(p,c,200);
        rectangle = new Rect(p1,c1,100,50);
        f  =  new  Frame("My  window");    //  Instantiates  the  Frame
        f.add(this);   // Adds the Canvas to the Frame
        f.setLayout(null); //  Stops  the  frame  from  trying  to  layout  contents
        f.setSize(400,  400);  //  Sets  the  dimensions  of  the  frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {	// Closes the frame if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE);  //  Sets  the  Canvas  background
        setSize(400,  400);    //  Sets  the  Canvas  size  to  be  the  same  as  the  frame

    }//constructor




    public void paint(Graphics g) {
    circle.draw(g);
    rectangle.draw(g);



    }


}

