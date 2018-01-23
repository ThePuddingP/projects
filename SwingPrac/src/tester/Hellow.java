package tester;
import javax.swing.*;

public class Hellow extends JFrame {
	JButton button;
	JLabel label;
	JPanel panel;
	public Hellow() {
		button = new JButton();
		label = new JLabel();
		button.setText("Klik hier!");
		setTitle("Hello world from Swing");
		panel = new JPanel();
		button.setToolTipText("Klik me");
		
		setSize(1280,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		panel.add(button);
		panel.add(label);
		add(panel);
		
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

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Hellow();
				
			}
		});
		
		

	}

}
