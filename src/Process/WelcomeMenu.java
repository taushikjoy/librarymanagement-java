package Process;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



 
    public class WelcomeMenu extends JFrame implements ActionListener {


	    JFrame welcomemenu=new JFrame("Welcome");
	
	    JButton addmember=new JButton("Add Member");
	    JButton addbooks=new JButton("Add Books");
	    JButton borrowbooks=new JButton("Borrow books");
	    JButton exit=new JButton("EXIT");
	
	
    public void WelcomeMenu(){
		
    	welcomemenu.setTitle("Menu");
    	
  
    	
		JLabel jL = new JLabel("Welcome");
		
		
		GridLayout gl = new GridLayout(5,1);
		welcomemenu.setLayout(gl);
		welcomemenu.setContentPane(new JLabel(new ImageIcon("bk.jpg")) );
		
		
		welcomemenu.add(jL);
		
		welcomemenu.add(addmember);
		welcomemenu.add(addbooks);
		welcomemenu.add(borrowbooks);
		welcomemenu.add(exit);
		
		
		welcomemenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcomemenu.setBounds(200,200,1000,500);


		welcomemenu.setVisible(true);

		addmember.addActionListener(this);
		addbooks.addActionListener(this);
		borrowbooks.addActionListener(this);
		exit.addActionListener(this);
        
		Container c=welcomemenu.getContentPane();
		c.setLayout(null);
		
		jL.setLocation(350,35);
	    jL.setSize(400,60);
        
        
		addmember.setSize(200,50);
		addmember.setLocation(400,150);
		
		addbooks.setSize(200,50);
		addbooks.setLocation(400,220);
		
		borrowbooks.setSize(200,50);
		borrowbooks.setLocation(400,290);
		
		exit.setSize(200,50);
		exit.setLocation(400,360);
		
		Font jl=new Font("Apple Chancery", Font.ITALIC, 80);
		jL.setFont(jl);
		
		//Font test=new Font("Apple Chancery", Font.ITALIC, 20);
		
		
		Font f=new Font("Papyrus", Font.ITALIC, 20);
		addmember.setFont(f);
		addbooks.setFont(f);
		borrowbooks.setFont(f);
		exit.setFont(f);
		
		
		//jL.setForeground(Color.CYAN);
		jL.setForeground(Color.GREEN);
		addmember.setForeground(Color.BLUE);
		addbooks.setForeground(Color.BLUE);
		borrowbooks.setForeground(Color.BLUE);
		exit.setForeground(Color.RED);
		
		c.add(addmember);
		
	}
	
    //*for run the Frame
//	public static void main (String [] args){
//		WelcomeMenu w = new WelcomeMenu();
//		w.WelcomeMenu();
//	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==addmember) {
           // SignupPage add=new SignupPage();
			
			SignupPage p=new SignupPage();
			p.SignupPage();
			
			
			
		}
		else if(e.getSource()==addbooks) {
			//AddBook add=new AddBook();
			
			AddBook ab=new AddBook();
			ab.AddBook();

			
		}
		else if(e.getSource()==borrowbooks) {
			//BorrowBook borrowBook = new BorrowBook();
			LoginConfirmation lic = new LoginConfirmation();
			lic.LoginConfirmation();
			
//			BorrowBook bob=new BorrowBook();
//			bob.BorrowBook();
			
		}
		else if(e.getSource()==exit){
			System.exit(0);
			
		}
	
	}
	
	
}
