package com.dsa.ch02;

import java.awt.*;
import javax.swing.JFrame;

public class OrderedWorkshop extends Canvas{
	
	public void paint(Graphics graphics) {
		setBackground(Color.WHITE);
		setForeground(Color.BLUE);
		
		for (int i = 20; i < 200; i=i+20) {
			graphics.drawRect(20, i, 50, 20);
		}
		
		graphics.fillRect(20, 20, 50, 20);
		
	}
	
	public static void main(String[] args) {
		OrderedWorkshop orderedWorkshop = new OrderedWorkshop();
		JFrame jFrame = new JFrame();
		
		jFrame.add(orderedWorkshop);
		jFrame.setSize(400, 400);
		jFrame.setVisible(true);

	}
}
