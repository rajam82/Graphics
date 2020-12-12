package com.graphics.sample;
/**
 * Equation of a circle The standard form of an equation of a circle is
 *  ( x - h ) 2 + ( y - k ) 2 = r 2. The radius is r,
 *  the center of the circle is (h , k), and (x , y) is any point on the circle.
 * @author rajam
 *
 */

import java.awt.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;

public class CreatingPieChart extends Canvas {
	private Map<String,Double> plottingPoints = new HashMap<String,Double>();

	public CreatingPieChart(Map<String,Double> plottingPoints) {
		this.plottingPoints = plottingPoints;
	}

	public void paint(Graphics g) {
		setBackground(Color.GREEN);
		Set<String> keys =plottingPoints.keySet();
		Double x =0.0;
		Double y =0.0;
		
		int i=0;
		Double z=0.0;
		int code =0;
		for(String key:keys) {
			System.out.println("fffffffffffffff"+keys.size());
			Double value = plottingPoints.get(key);
			System.out.println(i+"fffffffffffffff"+value);

			y=y+(360/(100/(value*(100.0/160.0))));
			z=y-x;
			System.out.println(x+"yyyyyyyy"+y+"value"+value);
			g.drawArc(200, 200, 100, 100, x.intValue(), z.intValue());
			 code = code+25;
			g.setColor(new Color(255,code,code));
			i++;
			g.fillArc(200, 200, 100, 100, x.intValue(), z.intValue());

			x=y;
			
		}
		
		
		g.drawOval(300, 300, 500,80);
    

        
	}
	

	public static void main(String[] args) {
		Map<String,Double> plottingPoints = new HashMap<String,Double>();
		plottingPoints.put("moto e", 80.0);
		plottingPoints.put("moto g", 40.0);
		plottingPoints.put("moto x", 20.0);
		plottingPoints.put("moto xa", 20.0);

		CreatingPieChart m = new CreatingPieChart(plottingPoints);
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(400, 400);
		// f.setLayout(null);
		f.setVisible(true);
	}

}

