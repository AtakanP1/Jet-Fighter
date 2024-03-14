package project_D;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;



public class Mainapp extends JFrame {
	
	
			
			

	
	public static void main(String[] args) {
		
		
		
		JFrame frame = new JFrame("Jet Fighter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Menu());
		frame.setMaximumSize(new Dimension(1000, 600));
		frame.setMinimumSize(new Dimension(535, 500));
		frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
        
		 
	
	}	
	

}
