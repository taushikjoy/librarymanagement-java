package Process;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Member;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class ConfirmID extends JFrame implements ActionListener{

	private static final String String = null;

	private static Member [] membersinfo ;

    JFrame confirmid = new JFrame();
 
    JComboBox type = new JComboBox(new String[] {"Teacher","Student"});
	
	JTextField id = new JTextField();
	JPasswordField password = new JPasswordField();
	
	JLabel typeLabel = new JLabel(" Type");
	JLabel userLabel = new JLabel(" Id");
	JLabel passLabel = new JLabel(" Password");

	JButton login = new JButton("LOGIN");
	JButton cancel = new JButton("CANCEL");
	
	MembersGetSet[] members;
	private int index;
	
	public ConfirmID() {
		
	
		members = new MembersGetSet[30];
		index=0;
		
		
		GridLayout gl = new GridLayout(4,1);
		confirmid.setLayout(gl);
		confirmid.setContentPane(new JLabel(new ImageIcon("background-01.png")) );
		
		//confirmid.add(new JLabel(" Type"));
	    confirmid.add(type);
	    confirmid.add(typeLabel);
		
		
		
		confirmid.add(userLabel);
		confirmid.add(id);
		
		confirmid.add(passLabel);
		confirmid.add(password);
		
		confirmid.add(login);
		confirmid.add(cancel);
		
//		login.addActionListener(this);
//		cancel.addActionListener(this);
		
		confirmid.setTitle("LOGIN!");
		confirmid.setSize(500,400);
		confirmid.setLocation(500,250);
		confirmid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		confirmid.setBounds(200,200,1000,500);
		
		login.addActionListener(this);
		cancel.addActionListener(this);
		
		confirmid.setVisible(true);
		
		
		Container c=confirmid.getContentPane();
		c.setLayout(null);
		
		
		
		type.setSize(250,50);
		type.setLocation(690,70);
		
		
		id.setSize(250,50);
		id.setLocation(690,150);
		
		password.setSize(250,50);
		password.setLocation(690,220);
		
		
		typeLabel.setSize(250,50);
		typeLabel.setLocation(150,80);

		
		userLabel.setSize(250,50);
		userLabel.setLocation(150,150);
		
		passLabel.setSize(250,50);
		passLabel.setLocation(150,220);
		
		
	    login.setSize(200,50);
		login.setLocation(500,380);
			
	    cancel.setSize(200,50);
		cancel.setLocation(750,380);
		
		
		
		Font f=new Font("Papyrus", Font.ITALIC, 25);
		
		Font buf=new Font("Papyrus", Font.ITALIC, 20);
		
		typeLabel.setFont(f);
		userLabel.setFont(f);
		passLabel.setFont(f);
		
		

		
		login.setFont(buf);
		cancel.setFont(buf);
		
		
		login.setForeground(Color.GREEN);
		cancel.setForeground(Color.RED);
	
		userLabel.setForeground(Color.BLACK);
		passLabel.setForeground(Color.BLACK);
		typeLabel.setForeground(Color.BLACK);
		
		
		
		
		
	}

    public void actionPerformed(ActionEvent e) {

	    if(e.getSource()==login){
		boolean isFound = authentication();			
		if(isFound == true){
			
		JOptionPane.showMessageDialog(null, "Login successful");
		
		//BorrowBook ou = new BorrowBook();
		
		BorrowBook bob=new BorrowBook();
		bob.BorrowBook();
	}
	
		
			else
			JOptionPane.showMessageDialog(null, "Invalid Id or Password");
		//Options ou = new Options();
		
		
		
	
	}
	
//					try {
//				FileWriter f = new FileWriter("membersinfo.txt", true);
//						//int index=0;				
//						for(int i = 0; i < index; i++){
//					if(memberinfo[i] != null){
//					f.write(members[i].getType() + "\n" + members[i].getId() + "\n" + members[i].getPassword() + "\n");
//				}
//					BorrowBook borrowBook = new BorrowBook();
//
//						}
//			f.close();
//			}
//		catch (Exception e1) {					System.out.println(e1.getMessage());
//	}}
		else if(e.getSource()== cancel){
			confirmid.dispose();
			
			
		}

	

	
	}
		
    public boolean authentication(){
	    String type,id,password;
	try{
		File f = new File("membersinfo.txt");
		Scanner input = new Scanner(f);
		
		while(input.hasNextLine()){
			type = input.nextLine();
			id = input.nextLine();
			password = input.nextLine();
			
			members[index] = new MembersGetSet(type, id, password);
			
			if(this.id.getText().equals(id) == true && this.password.getText().equals(password) == true){
				return true;
			}
			
			index++;
		}
	}
	catch(Exception e){}
	return false;

	
}
	
	
	
}
