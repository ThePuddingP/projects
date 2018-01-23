package Parkeersimulator;

import javax.swing.*;

public class Buttontest extends JFrame{
	JButton button;
	JLabel label;
	JPanel panel;
	
	public Buttontest() {
	button = new JButton();
	label = new JLabel();
	
	button.setText("Klik hier!");
	
	panel = new JPanel();

	setVisible(true);
	
	panel.add(button);
	panel.add(label);
	
	


	
	
	
	
	button.addMouseListener(new java.awt.event.MouseAdapter() {
		@Override
		public void mouseClicked(java.awt.event.MouseEvent dong) {
			buttonMouseClicked(dong);
		}
	});	
	}

	private void buttonMouseClicked(java.awt.event.MouseEvent dong) {
		label.setText("Hello World");
	
	}
	

	
	
}
