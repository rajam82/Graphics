package com.graphics.sample;

import java.awt.*;
import javax.swing.JFrame;

public class CreatingLine extends Canvas {
	private int x;
	private int y;

	public CreatingLine(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void paint(Graphics g) {
		setBackground(Color.GREEN);

		for (int j = 0; j < y; j++) {
			g.drawString(".", x, j);
		}

	}

	public static void main(String[] args) {
		CreatingLine m = new CreatingLine(20, 200);
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(400, 400);
		// f.setLayout(null);
		f.setVisible(true);
	}

}
