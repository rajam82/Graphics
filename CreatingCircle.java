package com.graphics.sample;
/**
 * Equation of a circle The standard form of an equation of a circle is
 *  ( x - h ) 2 + ( y - k ) 2 = r 2. The radius is r,
 *  the center of the circle is (h , k), and (x , y) is any point on the circle.
 * @author rajam
 *
 */

import java.awt.*;
import javax.swing.JFrame;

public class CreatingCircle extends Canvas {
	private int x;
	private int y;

	public CreatingCircle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void paint(Graphics g) {
		setBackground(Color.GREEN);
		
		g.drawOval(300, 300, 500,80);
    

        for(int x=300;x<380;x++) {
			g.drawString(".",500, x);
		}	

		for(int x=300;x<380;x++) {
			g.drawString(".",580, x);
		}	
		for(int x=500;x<580;x++) {
			g.drawString(".",x,300);
		}	

		for(int x=500;x<580;x++) {
			g.drawString(".", x,380);
		}
		for(int x=500;x<580;x++) {
			for(int y=300;y<380;y++) {
				g.drawString(".", x,y);
			}
		}
	}
	

	public static void main(String[] args) {
		CreatingCircle m = new CreatingCircle(20, 200);
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(400, 400);
		// f.setLayout(null);
		f.setVisible(true);
	}

}

