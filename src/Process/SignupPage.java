package Process;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupPage extends JFrame implements ActionListener {

	
	
	JFrame loginwindow = new JFrame();
    
    
    
    JComboBox type = new JComboBox(new String[] {"Teacher","Student"});
    
    
	
	
	
	JTextField id = new JTextField();
	JPasswordField password = new JPasswordField();
	JPasswordField repassword = new JPasswordField();
	
	JLabel typeLabel = new JLabel(" Type");
	
	JLabel userLabel = new JLabel(" Id");
	JLabel passLabel = new JLabel(" Password");
	JLabel repassLabel = new JLabel(" Re Type Password");
	
	JButton login = new JButton("SIGN UP");
	JButton cancel = new JButton("CANCEL");
	
	
	 
		 public void SignupPage(){
			    
			
			
				
				
				GridLayout gl = new GridLayout(5,2,5,5);
				loginwindow.setLayout(gl);
				loginwindow.setContentPane(new JLabel(new ImageIcon("Screen Shot 2016-04-25 at 6.40.24 PM.png")) );
				
			
				loginwindow.add(new JLabel());
				loginwindow.add(type);
				loginwindow.add(typeLabel);


				
				
				loginwindow.add(userLabel);
				loginwindow.add(id);
				
				loginwindow.add(passLabel);
				loginwindow.add(password);
				
				loginwindow.add(repassLabel);
				loginwindow.add(repassword);
		
				loginwindow.add(login);
				loginwindow.add(cancel);
				
				
				loginwindow.setTitle("Sign Up");
				loginwindow.setSize(500,400);
				loginwindow.setLocation(500,250);
				loginwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				loginwindow.setBounds(200,200,1000,500);

				
				login.addActionListener(this);
				cancel.addActionListener(this);
				
				loginwindow.setVisible(true);
				
				Container c=loginwindow.getContentPane();
				c.setLayout(null);
				
				
				
				type.setSize(250,50);
				type.setLocation(690,70);
				
				
				id.setSize(250,50);
				id.setLocation(690,150);
				
				password.setSize(250,50);
				password.setLocation(690,220);
				
				repassword.setSize(250,50);
				repassword.setLocation(690,290);
				
				typeLabel.setSize(250,50);
				typeLabel.setLocation(150,80);

				
				userLabel.setSize(250,50);
				userLabel.setLocation(150,150);
				
				passLabel.setSize(250,50);
				passLabel.setLocation(150,220);
				
				repassLabel.setSize(250,50);
			    repassLabel.setLocation(150,290);
			    
			    
			    
			    login.setSize(200,50);
			    login.setLocation(500,400);
				
				cancel.setSize(200,50);
				cancel.setLocation(750,400);
				
				
				
                Font f=new Font("Papyrus", Font.ITALIC, 25);
                
                Font buf=new Font("Papyrus", Font.ITALIC, 20);
                //Font test=new Font("Apple Chancery", Font.ITALIC, 25);
                
                
                
				
				userLabel.setFont(f);
				passLabel.setFont(f);
				repassLabel.setFont(f);
				typeLabel.setFont(f);
				

				login.setFont(buf);
				cancel.setFont(buf);
			
				typeLabel.setForeground(Color.RED);
				userLabel.setForeground(Color.RED);
				passLabel.setForeground(Color.RED);
				repassLabel.setForeground(Color.RED);
				
				login.setForeground(Color.GREEN);
				cancel.setForeground(Color.RED);

				
				
				
	

		 }

//		 public static void main (String [] args){
//			 SignupPage sp = new SignupPage();
//				sp.SignupPage();
//			}
		 
		 
		 public void actionPerformed(ActionEvent e) {
				if(e.getSource() == login){
					try{
						
						String t = type.getSelectedItem().toString();
						
						String i = id.getText();
						String p = password.getText();
						String rp = repassword.getText();
						
						FileWriter f = new FileWriter("membersinfo.txt", true);
						f.write(t+"\n"+ i + "\n" + p + "\n" );
						
						f.close();
						loginwindow.dispose();
								
						
							}
							
							
							catch(Exception e1){
								
								System.out.println("File error");
							
											
							}
					
					
				}

				else if (e.getSource()==cancel){
					loginwindow.dispose();
				}
		 }	 
}
