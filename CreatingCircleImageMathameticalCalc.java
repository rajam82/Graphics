package com.graphics.sample;
/**
 * Equation of a circle The standard form of an equation of a circle is
 *  ( x - h ) 2 + ( y - k ) 2 = r 2. The radius is r,
 *  the center of the circle is (h , k), and (x , y) is any point on the circle.
 * @author rajam
 *
 */

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class CreatingCircleImageMathameticalCalc extends Canvas {
	private int x;
	private int y;
	private double angle = 0;
	// To control the radius of moving
	private final double MAX_X = 400;
	private final double MAX_Y = 400;
	public CreatingCircleImageMathameticalCalc(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void paint(Graphics g) {
		setBackground(Color.GREEN);
		
	//	g.drawOval(300, 300, 500,80);
    
		 BufferedImage img = new BufferedImage(40,40,BufferedImage.TYPE_INT_RGB);
		try {
			img = ImageIO.read(new File("U:\\graphics\\sample\\src\\main\\resources\\flower.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 // increase angle (should be a double value
for(int i=0;i<1000;i++) {
	    double random = angle * 2.0 * Math.PI/360.0; //this will convert it to rads
	    // rotate around P(0/0)
	    int x = (int) (Math.sin(random) * MAX_X);
	    int y = (int) (Math.cos(random) * MAX_Y);

	    // move P to center of JFrame (width and height = 1000)
	    x += 500;
	    y += 500;

	    // image is 500x300, calc upper left corner
	    x -= 250;
	    y -= 150;
	    angle++;
	    // draw
	   g.drawImage(img, x, y, null);
}

for(int x=500;x<750;x++) {
	 double random = x * 2.0 * Math.PI/360.0; //this will convert it to rads
	    // rotate around P(0/0)
	    int x1 = (int) (Math.tan(random)*100 );
	   // int y = (int) (Math.tan(random) * MAX_Y);
	    System.out.println(x1);
	g.drawString(".", 500, x1);
}
	}
	

	public static void main(String[] args) {
		CreatingCircleImageMathameticalCalc m = new CreatingCircleImageMathameticalCalc(20, 200);
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(400, 400);
		// f.setLayout(null);
		f.setVisible(true);
	}

}

