package com.magiccalc.core;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PrintGraph extends Canvas {

		public PrintGraph(){
			setBackground(Color.WHITE);
			
			//super();
		}
		
		@Override
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D)g;
			g2.setColor(Color.BLACK);
			g2.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
			g2.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
			//super.paint(g2);
		}
}
