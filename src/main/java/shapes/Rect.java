package shapes;

import shapes.Shape;

import java.awt.*;

public class Rect extends Shape {

    private int width; // Fields
    private int height;

    public Rect(Point initPos, Color col, int width, int height){
        super(initPos, col);// The constructor

        this.width =width;// Initialize fields
        this.height =height;

    }

    @Override
    public void draw(Graphics g) {// A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x, pos.y, width, height);
    }

}
