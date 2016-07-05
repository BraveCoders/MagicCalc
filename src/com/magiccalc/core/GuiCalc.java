package com.magiccalc.core;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuiCalc extends JFrame {
	
	private final int width = 400;
	private final int height  = 400;
	private BorderLayout borderLayout;
	private Canvas canvas;
	private Button button;
	private TextField textField;
	public TextField getTextField() {
		return textField;
	}

	private JPanel panel;

	public GuiCalc() {
		super("MagicCalc");
		borderLayout = new BorderLayout();
		canvas = new Canvas();
		button = new Button("Print");
		button.addActionListener(new ClickButton());	
		textField = new TextField();
		panel = new JPanel();
		this.add(panel);
		panel.setLayout(borderLayout);
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(canvas,BorderLayout.CENTER);
		panel.add(button, BorderLayout.SOUTH);
		panel.add(textField, BorderLayout.NORTH);
		
		this.setVisible(true);
	}
	
	class ClickButton implements ActionListener{
		
		ExprFact ex;
				
		public ClickButton(){
			ex=new ExprFact();
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Expr x = ex.createExpr(GuiCalc.this.getTextField().getText());
			JOptionPane.showMessageDialog(null, x.getValueFor(1) + "");
		}
		
	}



}
