package Process;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddBook extends JFrame implements ActionListener {

	JFrame addbook = new JFrame(" ADD BOOK ");
	JTextField bookname = new JTextField();
	JTextField code = new JTextField();
	JTextField price = new JTextField();
	
	JLabel booknamelabel = new JLabel(" Book Name");
	JLabel codelabel = new JLabel(" Code");
	JLabel pricelabel = new JLabel(" Price");
	
	JButton submit = new JButton("SUBMIT");
	JButton cancel = new JButton("CANCEL");

	 public void AddBook() {
		 

			GridLayout gl = new GridLayout(4,2,5,5);
			addbook.setLayout(gl);
			
			addbook.setContentPane(new JLabel(new ImageIcon("Add book 02.png")) );

		

			
			addbook.add(booknamelabel);
			addbook.add(bookname);
			
			addbook.add(codelabel);
			addbook.add(code);
			
			addbook.add(pricelabel);
			addbook.add(price);
	
			addbook.add(submit);
			addbook.add(cancel);
			
			
			submit.addActionListener(this);
			cancel.addActionListener(this);
			
			addbook.setTitle("Book Details");
			addbook.setSize(500,400);
			addbook.setLocation(500,250);
			addbook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			addbook.setBounds(200,200,1000,500);
			
			
			
			addbook.setVisible(true);
			

			Container c=addbook.getContentPane();
			c.setLayout(null);


			
			bookname.setSize(250,50);
			bookname.setLocation(650,150);
			
			code.setSize(250,50);
			code.setLocation(650,220);
			
			price.setSize(250,50);
			price.setLocation(650,290);
			
			
		
			
			
			booknamelabel.setSize(250,50);
			booknamelabel.setLocation(150,150);
			
			codelabel.setSize(250,50);
			codelabel.setLocation(150,220);
			
			pricelabel.setSize(250,50);
			pricelabel.setLocation(150,290);
			
			
			
			
			
			
			
			submit.setSize(200,50);
			submit.setLocation(400,390);
			
			cancel.setSize(200,50);
			cancel.setLocation(700,390);
			
			
			Font f=new Font("Papyrus", Font.ITALIC, 25);
			
			Font buf=new Font("Papyrus", Font.ITALIC, 20);
			
			booknamelabel.setFont(f);
			codelabel.setFont(f);
			pricelabel.setFont(f);

			
			submit.setFont(buf);
			cancel.setFont(buf);
		
			booknamelabel.setForeground(Color.BLACK);
			codelabel.setForeground(Color.BLACK);
			pricelabel.setForeground(Color.BLACK);
			
			submit.setForeground(Color.GREEN);
			cancel.setForeground(Color.RED);
			
			
			
	 }
	
	 //*for run the Frame
//	 public static void main (String [] args){
//		 AddBook ab = new AddBook();
//			ab.AddBook();
//		}
	 
	 
	 
	 public void actionPerformed(ActionEvent e) {
			if(e.getSource()== submit){
		 
				try {
				
					String b = bookname.getText();
					String c = code.getText();
					String p = price.getText();
				
				
				
					FileWriter f = new FileWriter("bookstore.txt", true);
					f.write( b + "\n" + c + "\n" + p + "\n");
					f.close();
					addbook.dispose();
				

				boolean isFound = authentication();
				
				if(isFound == true)
					JOptionPane.showMessageDialog(null, "Book Added !! :D ");
				
				
				
				
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
			
		
		
	else if(e.getSource()==cancel){
			addbook.dispose();
			
		}

	 }

	 private boolean authentication() throws FileNotFoundException {
			try{
			File f = new File("bookstore.txt");
			
			Scanner input = new Scanner(f);
		
			
			while(input.hasNextLine() == true){
			
			
			return true;
		}
			
			input.close();
			
					}
	    catch(Exception e){
	   
	    
	    }		
		
			return false;
					
						
		
	 }
	 
	 
	 
}