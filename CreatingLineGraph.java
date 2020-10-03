package com.graphics.sample;

import java.awt.*;
import javax.swing.JFrame;

public class CreatingLineGraph extends Canvas {
	private int x;
	private int y;
	private int axisRange;
	private int axisMargin = 30;
//axisRange should be multiple of axiaMargin
	public CreatingLineGraph(int x, int y,int axisRange) {
		this.x = x;
		this.y = y;
		this.axisRange = axisRange;
	}

	public void paint(Graphics g) {
		Graphics2D g1 = (Graphics2D) g;
		setBackground(Color.GREEN);
		
		for (int x1 = axisRange; x1>axisMargin; x1--) {
			g1.drawString(".", x1,axisRange);
		}
		
		for (int y1 = 0; y1 < axisRange; y1++) {
			
			g1.drawString(".", axisMargin, y1);
			
		}
		
		
		for (int x1 = axisRange; x1 >axisMargin; x1--) {
			if(x1%axisMargin == 0 || x1==axisRange ||x1==axisMargin) {
			g1.drawString(x1-axisMargin+"", x1,axisRange+30);
			//axisRange+30 is positioning
			}
		}
		for (int y1 = 0; y1 < axisRange; y1++) {
			if(y1%axisMargin == 0||y1==axisRange||y1==axisMargin) {
				int y2=axisRange-y1;
			g1.drawString(y2+"", axisMargin-30, y1);
          //axisMargin-30 is positioning
			}
		}
	
			/*int spots[][]={{40,90}};
			for(int i=0;i<2;i++) {
				int spotsInner[]=spots[i];
				for(int x=spotsInner[0];x<spotsInner[1];x++) {
					g1.drawString(".",x, spotsInner[0]);
				}
			}
				*/
			for(int x=40;x<80;x++) {
				g1.drawString(".",40, x);
			}	

			for(int x=40;x<80;x++) {
				g1.drawString(".",80, x);
			}	
			for(int x=40;x<80;x++) {
				g1.drawString(".",x,40);
			}	

			for(int x=40;x<80;x++) {
				g1.drawString(".", x,80);
			}	
			for (int j = 200; j < 250; j++) {
				g.drawString(".", 200, j);
			}
			for (int x = 200; x < 250; x++) {
				g.drawString(".", x, 250);
			}
			for (int j = 250; j < 300; j++) {
				g.drawString(".", 250, j);
			}
			for (int x = 250; x < 300; x++) {
				g.drawString(".", x, 300);
			}
			for (int j = 300; j < 350; j++) {
				g.drawString(".", 300, j);
			}
			for (int x = 300; x < 350; x++) {
				g.drawString(".", x, 350);
			}
	}

	public static void main(String[] args) {
		CreatingLineGraph m = new CreatingLineGraph(200, 200,480);
		

		JFrame f = new JFrame();
		f.add(m);
		
		f.setSize(400, 400);
		// f.setLayout(null);
		f.setVisible(true);
	}

}
