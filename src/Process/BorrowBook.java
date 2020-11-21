package Process;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BorrowBook  extends JFrame implements ActionListener{

	JFrame borrowbook = new JFrame(" BORROW BOOK  ");
	JTextField bookname = new JTextField();
	JTextField code = new JTextField();
	
	

	JLabel booknamelabel = new JLabel(" Book Name");
	JLabel codelabel = new JLabel(" Code");

	
	JButton borrow = new JButton("BORROW BOOK");
	JButton search = new JButton("SEARCH");
	JButton cancel = new JButton("CANCEL"); 
	
	
	BookGetSet[] books;
	private int index;
	private Object name;
	private Object isAvailable;
	
	
	
	public void BorrowBook() {
		
		books= new BookGetSet[50];
		index=0;
		
		
		GridLayout gl = new GridLayout(3, 2);
		borrowbook.setLayout(gl);
		borrowbook.setContentPane(new JLabel(new ImageIcon("background-01...bb.png")) );
		
		
		borrowbook.add(booknamelabel);
		borrowbook.add(bookname);

		borrowbook.add(codelabel);
		borrowbook.add(code);
		
		borrowbook.add(borrow);
		borrowbook.add(search);
		borrowbook.add(cancel);
		
		borrow.addActionListener(this);
		search.addActionListener(this);
		cancel.addActionListener(this);
		
		borrowbook.setTitle("Borrow Book");
		borrowbook.setSize(500,400);
		borrowbook.setLocation(500,250);
		borrowbook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borrowbook.setBounds(200,200,1000,500);
		
		borrowbook.setVisible(true);
		
		Container c=borrowbook.getContentPane();
		c.setLayout(null);
		
		
		bookname.setSize(250,50);
		bookname.setLocation(690,120);
		
		code.setSize(250,50);
		code.setLocation(690,220);
		
		booknamelabel.setSize(250,50);
		booknamelabel.setLocation(150,120);
		
		codelabel.setSize(250,50);
		codelabel.setLocation(150,220);
		
		
		
		borrow.setSize(200,50);
		borrow.setLocation(250,350);
		
		
		search.setSize(200,50);
		search.setLocation(500,350);
			
	    cancel.setSize(200,50);
		cancel.setLocation(750,350);
		
		
		
        Font f=new Font("Papyrus", Font.ITALIC, 30);
        
        Font buf=new Font("Papyrus", Font.ITALIC, 20);
        
		
		booknamelabel.setFont(f);
		codelabel.setFont(f);
		
		borrow.setFont(buf);
		search.setFont(buf);
		cancel.setFont(buf);
	
		booknamelabel.setForeground(Color.BLACK);
		codelabel.setForeground(Color.BLACK);
		
		
		borrow.setForeground(Color.BLUE);
		search.setForeground(Color.GREEN);
		cancel.setForeground(Color.RED);
		
		
	
		
 
	}		

	//*for run the Frame
//	public static void main (String [] args){
//		    BorrowBook bob = new BorrowBook();
//			bob.BorrowBook();
//		}
	 
	
	public void actionPerformed(ActionEvent e) {
	 		if(e.getSource()==borrow){	
	 		
	 			boolean isFound = authentication();
	
	 			
	 		}
	 		if(e.getSource()==search){
				boolean isFound = authentication();			
				if(isFound == true){
					
				JOptionPane.showMessageDialog(null, "Book is available");
				//isFound=availablebook();
				
				//BorrowBook ou = new BorrowBook();
			}
			
				
					else
					JOptionPane.showMessageDialog(null, "unavailable");
		
            }
			
			
			        //borrowbook.dispose();
			
		
			
			
			else if(e.getSource()==cancel){
				borrowbook.dispose();
				
			}
	}
	
	
	public boolean authentication(){
		String name,code,author,price,isAvailable;
		//Boolean isAvailable;
	
		try{
			File f = new File("bookstore.txt");
			Scanner input = new Scanner(f);
			
			while(input.hasNextLine()){
				name = input.nextLine();
				code = input.nextLine();
				price = input.nextLine();
				author = input.nextLine();
				isAvailable=input.nextLine();
				
				
				//isAvailable= input.nextBoolean();
				//books[index] = new BookGetSet(name, code, price, author, isAvailable);
				
				
				books[index] = new BookGetSet(name, code, price, author,isAvailable);
				if(this.bookname.getText().equals(name) == true && this.code.getText().equals(code) == true ){
					//isAvailable=true;
					return true;
				}
				
				index++;
			}
		}
		catch(Exception e){}
		return false;
	}
	
	
//	public boolean availablebook(){
//		String name,code,author,price;
//		Boolean isAvailable;
//	
//		try{
//			File f = new File("bookstore.txt");
//			Scanner input = new Scanner(f);
//			
//			while(input.hasNextLine()){
//				name = input.nextLine();
//				code = input.nextLine();
//				price = input.nextLine();
//				author = input.nextLine();
//				isAvailable= input.nextBoolean();
//				books[index] = new BookGetSet(name, code, price, author, isAvailable);
//				
//				if(authentication()==true){
//					JOptionPane.showMessageDialog(null,"book is unavailable");
//					return true;
//				}
//				
//				index++;
//			}
//		}
//		catch(Exception e){}
//		return false;
//	}
	
	
}
