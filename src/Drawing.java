import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;



public class Drawing extends Canvas {

    private Frame f;
    private Circle circle;

    public Drawing(){
        Point p=new Point(200,200);
        Color c=new Color(0x992266);//  The  RGB  number  comprises  three  bytes:
        circle = new Circle(p,c,200);
        f  =  new  Frame("My  window");    //  Instantiates  the  Frame
        f.add(this);   // Adds the Canvas to the Frame
        f.setLayout(null); //  Stops  the  frame  from  trying  to  layout  contents
        f.setSize(400,  400);  //  Sets  the  dimensions  of  the  frame
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//  Closes  the  program  if close window clicked
        setBackground(Color.WHITE);  //  Sets  the  Canvas  background
        setSize(400,  400);    //  Sets  the  Canvas  size  to  be  the  same  as  the  frame

    }//constructor




    public void paint(Graphics g) {
    circle.draw(g);



    }


}

