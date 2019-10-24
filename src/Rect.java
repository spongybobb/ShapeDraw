import java.awt.*;

public class Rect {

    private int width; // Fields
    private int height;
    private Point pos;
    private Color col;
    public Rect(Point initPos, Color col, int width, int height){// The constructor

        this.width =width;// Initialize fields
        this.height =height;
        pos =initPos;
        this.col =col;

    }

    public void draw(Graphics g) {// A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x, pos.y, width, height);
    }

}
