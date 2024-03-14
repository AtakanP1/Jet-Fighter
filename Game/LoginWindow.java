package project_D;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class LoginWindow extends JFrame {
	private ArrayList<User> userList = new ArrayList<>();
	   private User loggedInUser;
	 
         private JTextField usernameField;
         private JPasswordField passwordField;

         public LoginWindow() {
             setTitle("Login");
             setSize(300, 200);
             setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

             JPanel panel = new JPanel();
             panel.setLayout(new GridLayout(3, 2));

             JLabel usernameLabel = new JLabel("Username:");
             JLabel passwordLabel = new JLabel("Password:");

             usernameField = new JTextField();
             passwordField = new JPasswordField();

             JButton loginButton = new JButton("Login");
             loginButton.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     String enteredUsername = usernameField.getText();
                     char[] enteredPasswordChars = passwordField.getPassword();
                     String enteredPassword = new String(enteredPasswordChars);

                     if (authenticateUser(enteredUsername, enteredPassword)) {
                    	 
                         JOptionPane.showMessageDialog(null, "Login successful!\n");
                         loggedInUser = getUserByUsername(enteredUsername);
                          
                         
                        dispose();
                         
                       
                        
                        
                        
                        } else {
                         JOptionPane.showMessageDialog(null, "Login failed. Invalid username or password.");
                     }

                     
                     
                     
                     
                     
                     
                 }
             });

             panel.add(usernameLabel);
             panel.add(usernameField);
             panel.add(passwordLabel);
             panel.add(passwordField);
             panel.add(loginButton);

             add(panel);
         }
         private boolean authenticateUser(String username, String password) {
             for (User user : userList) {
                 if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                     return true; // Kullanıcı doğrulandı
                 }
             }
             return false; // Kullanıcı doğrulanamadı
         }

         private User getUserByUsername(String username) {
             for (User user : userList) {
                 if (user.getUsername().equals(username)) {
                     return user; // Kullanıcı bulundu
                 }
             }
             return null; // Kullanıcı bulunamadı
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
     }

	
	
	
	
	
	
	
	
	
	
	
	
	
	

