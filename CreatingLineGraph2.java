package com.graphics.sample;

import java.awt.*;
import javax.swing.JFrame;

public class CreatingLineGraph2 extends Canvas {
	private int x;
	private int y;
	private int xAxisRange;
	private int yAxisRange;
	private int axisRange;
	private int axisMargin =50;
	private int xAxisStartRange;
	private int xAxisEndRange;
	private int yAxisStartRange;
	private int yAxisEndRange;
//axisRange should be multiple of axiaMargin
	public CreatingLineGraph2(int x, int y,int xAxisStartRange,int xAxisEndRange,int yAxisStartRange,int yAxisEndRange) {
		this.x = x;
		this.y = y;
		this.xAxisStartRange = xAxisStartRange;
		this.xAxisEndRange = xAxisEndRange;
		this.yAxisStartRange = yAxisStartRange;
		this.yAxisEndRange = yAxisEndRange;
		this.xAxisRange=xAxisEndRange-xAxisStartRange+axisMargin;
		this.yAxisRange=yAxisEndRange-yAxisStartRange+axisMargin;
	}

	public void paint(Graphics g) {
		Graphics2D g1 = (Graphics2D) g;
		setBackground(Color.GREEN);
		
		for (int x1 = xAxisRange; x1>axisMargin; x1--) {
			g1.drawString(".", x1,yAxisRange);
		}
		
		for (int y1 = axisMargin; y1 <= yAxisRange; y1++) {
			
			g1.drawString(".", axisMargin, y1);
			
		}
		
		int x2=xAxisEndRange+axisMargin;
		for (int x1 = xAxisRange; x1 >=0; x1--) {
			
			System.out.println(x1+""+axisMargin);
			if(x1%axisMargin == 0 || x1==xAxisRange ||x1==axisMargin) {
				x2=x2-axisMargin;
				g1.drawString(x2+"", x1,yAxisRange+50);
				
				System.out.println(x1);
				System.out.println(x2+""+xAxisStartRange);
				if(x2==xAxisStartRange) {
					break;
				}
			//axisRange+30 is positioning
			}
		}
		int y2=yAxisEndRange+axisMargin;
		for (int y1 = axisMargin; y1 <= yAxisRange; y1++) {
			if(y1%axisMargin == 0||y1==yAxisRange||y1==axisMargin||y1==0) {
				 y2=y2-axisMargin;
			g1.drawString(y2+"", axisMargin-30, y1);
			if(y2==yAxisStartRange) {
				break;
			}
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
			int x=1910;
			int y=122;
			do {
		
				g.drawString(".", getPointX(x), getPointY(y));
				System.out.println(x+"xxxxxxxxxx"+getPointX(x));
				System.out.println(y+"yyyyyyy"+getPointY(y));
               if(x<=1950)
				x++;
               if(y<=150)
				y++;
			}while(x<=1950||y<=150);
			 x=1950;
			 y=150;
			do {
		
				g.drawString(".", getPointX(x), getPointY(y));
				System.out.println(x+"xxxxxxxxxx"+getPointX(x));
				System.out.println(y+"yyyyyyy"+getPointY(y));

				  if(x<=2000)
						x++;
		               if(y<=180)
						y++;
			}while(x<=2000||y<=180);
			 x=2000;
			 y=180;
			do {
		
				g.drawString(".", getPointX(x), getPointY(y));
				System.out.println(x+"xxxxxxxxxx"+getPointX(x));
				System.out.println(y+"yyyyyyy"+getPointY(y));

				  if(x<=2050)
						x++;
		               if(y<=210)
						y++;
			}while(x<=2050||y<=210);
			 x=2050;
			 y=210;
			do {
		
				g.drawString(".", getPointX(x), getPointY(y));
				System.out.println(x+"xxxxxxxxxx"+getPointX(x));
				System.out.println(y+"yyyyyyy"+getPointY(y));

				  if(x<=2078)
						x++;
		               if(y<=290)
						y++;
			}while(x<=2078||y<=290);
		/*
		 * 
		 * int x=1910;
			int y=122;
			do {
		
				g.drawString(".", getPointX(x), getPointY(y));
				System.out.println(x+"xxxxxxxxxx"+getPointX(x));
				System.out.println(y+"yyyyyyy"+getPointY(y));

				x++;
				y++;
			}while(x<=1938||y<=150);
			 x=1938;
			 y=150;
			do {
		
				g.drawString(".", getPointX(x), getPointY(y));
				System.out.println(x+"xxxxxxxxxx"+getPointX(x));
				System.out.println(y+"yyyyyyy"+getPointY(y));

				x++;
				y++;
			}while(x<=1968||y<=180);
			 x=1968;
			 y=180;
			do {
		
				g.drawString(".", getPointX(x), getPointY(y));
				System.out.println(x+"xxxxxxxxxx"+getPointX(x));
				System.out.println(y+"yyyyyyy"+getPointY(y));

				x++;
				y++;
			}while(x<=1998||y<=210);
			 x=1998;
			 y=210;
			do {
		
				g.drawString(".", getPointX(x), getPointY(y));
				System.out.println(x+"xxxxxxxxxx"+getPointX(x));
				System.out.println(y+"yyyyyyy"+getPointY(y));

				x++;
				y++;
			}while(x<=2078||y<=290);
		 * 
		 * 	for (int j = 200; j < 250; j++) {
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
			}*/
	}

	public static void main(String[] args) {
		CreatingLineGraph2 m = new CreatingLineGraph2(200, 200,1900,2100,0,300);
		

		JFrame f = new JFrame();
		f.add(m);
		
		f.setSize(400, 400);
		// f.setLayout(null);
		f.setVisible(true);
	}
private int getPointX(int x) {
	int x3=xAxisEndRange;
	
	for (int x1 = xAxisRange; x1 >=0; x1--) {
		
			
		x3=x3-1;
		
		int y3=yAxisEndRange;
		for (int y1 = axisMargin; y1 <= yAxisRange; y1++) {
			
			y3=y3-1;
			if(x3==x) {
				return x1;
			}
			}
		}
	return 0;
}
private int getPointY(int y) {
	int x3=xAxisEndRange;
	
	for (int x1 = xAxisRange; x1 >=0; x1--) {
		
			
		x3=x3-1;
		
		int y3=yAxisEndRange;
		for (int y1 = axisMargin; y1 <= yAxisRange; y1++) {
			
			y3=y3-1;
			if(y3==y) {
				return y1;
			}
			}
		}
	return 0;
}
}
