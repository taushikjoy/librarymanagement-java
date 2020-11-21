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


public class LoginConfirmation extends JFrame implements ActionListener {

	JFrame LoginConfirmation = new JFrame();
	JButton HaveAccount = new JButton("YES/LOGIN");
	JButton HaveNoAccount = new JButton("NO/SIGN UP");
	
	public void LoginConfirmation () {
		
		JLabel AskForAccount = new JLabel("            Already Registerd ??");
		
		
		GridLayout gl = new GridLayout(3,1);
		LoginConfirmation.setLayout(gl);
		LoginConfirmation.setContentPane(new JLabel(new ImageIcon("background-01.png")) );

		
		
		LoginConfirmation.add(AskForAccount);
		
		LoginConfirmation.add(HaveAccount);
		LoginConfirmation.add(HaveNoAccount);
		
		LoginConfirmation.setTitle("Confirmation for Account");
		LoginConfirmation.setSize(500, 400);
		
		//LoginConfirmation.add(HaveAccount);
			//loginwindow.add(cancel);
		/*jLabel.setLocation(2,50);
		 how to set jlable in a fixed locaton ??
		 */
		LoginConfirmation.setLocation(450,250);
		LoginConfirmation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		LoginConfirmation.setVisible(true);
		

		
		HaveAccount.addActionListener(this);
		HaveNoAccount.addActionListener(this);
		
		LoginConfirmation.setVisible(true);
		
		
		Container c=LoginConfirmation.getContentPane();
		c.setLayout(null);
		
		Font f=new Font("Papyrus", Font.ITALIC, 35);

		Font buf=new Font("Papyrus", Font.ITALIC, 18);
		
		AskForAccount.setFont(f);
		
		AskForAccount.setForeground(Color.BLACK);
		
		AskForAccount.setSize(500,50);
		AskForAccount.setLocation(2,20);
	
		
		HaveAccount.setSize(200,50);
		HaveAccount.setLocation(160,140);
			
		HaveNoAccount.setSize(200,50);
		HaveNoAccount.setLocation(160,240);

		HaveAccount.setForeground(Color.GREEN);
		HaveNoAccount.setForeground(Color.RED);
		
		HaveAccount.setFont(buf);
		HaveNoAccount.setFont(buf);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==HaveAccount){
			ConfirmID confirmID = new ConfirmID();
			
		}
		else if(e.getSource()==HaveNoAccount)
		{
			SignupPage suPage=new SignupPage();
			suPage.SignupPage();
		}
		// TODO Auto-generated method stub
		
	}
//	public static void main (String [] args){
//		LoginConfirmation lc = new LoginConfirmation();
//	//w.WelcomeMenu();
//		lc.LoginConfirmation();
//	}
//	
	
	

	
	
	
}
