package project_D;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Menu extends JPanel {
	private JMenuBar menuBar = new JMenuBar();
    public Menu() {
        JMenu fileMenu = new JMenu("File");
        JMenuItem registerItem = new JMenuItem("Register");
        JMenuItem loginItem = new JMenuItem("Login");
        JMenuItem playGameItem = new JMenuItem("Play Game");
        JMenuItem scoretableItem = new JMenuItem("Scoretable");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");

        
        
        
        fileMenu.add(registerItem);
        fileMenu.add(loginItem);
        fileMenu.add(playGameItem);
        fileMenu.add(scoretableItem);
        fileMenu.add(exitItem);

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        
        setLayout(null);
        add(menuBar);
  
        menuBar.setBounds (0, 0, 635, 25);
        
        
       
        
        registerItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	RegisterWindow registerWindow = new RegisterWindow();
            	 registerWindow.setVisible(true);

                
            }
        });

        loginItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	LoginWindow loginWindow = new LoginWindow();
            	loginWindow.setVisible(true);
                
            }
        });

        playGameItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	PlayGame myframe = new PlayGame();
				myframe.setFocusable(true);
            	
            }
        });

        scoretableItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    
    }


    
 } 
    
 
     
     
    
     
    

  



	
		
		  
                


