// my reference source was https://projectworlds.in and https://www.youtube.com/watch?v=-CZObYoDeAo


// Menu class previews the options and functionality 
//that can be carried out on the Graphical User Interface (GUI) of the software.  




package bankingsystem;
// JAVA provides a rich set of libraries to help create Graphical User Interface in platform independent way.AWT (Abstract Window Toolkit)
// How to start a gui class
import java.awt.BorderLayout;
import java.awt.Color; // imports colors in default sRGB color space or colors in arbitrary color spaces identified by a ColorSpace.
import java.awt.EventQueue;
import java.awt.Font; // This imports Font class states fonts, which are used to render text in a visible way.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;// 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//Imports Add user class
import bankingsystem.Adduser;



public class Menu extends JFrame { // Menu class previews the options and functionality that can be carried out on the Graphical User Interface (GUI) of the software

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Sets default Menu parameter to empty
					Menu frame = new Menu(" ");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public Menu(String user) { // constructor 
		setTitle("Banking System - Menu"); // invokes the JFrame constructor
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // method is used to specify one of several options for the close button
		setBounds(100, 100, 824, 600);
		contentPane = new JPanel();
		//Sets the border of this component. The Border object is responsible for defining the insets for the 
		//component(overriding any insets set directly on the component)
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
		setContentPane(contentPane);
		contentPane.setLayout(null); // set the layout manager
		
		JButton btnNewButton = new JButton("Add"); // JButton is an implementation of a "push" button for the add member function in gui.
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(Color.BLACK);
			// Action listener set a the action to be performed
		btnNewButton.addActionListener(new ActionListener() { // Implement the ActionListener interface in the class 
			public void actionPerformed(ActionEvent arg0) { // method is invoked automatically whenever action listener is called  
				 //Redirect users to Add user class by setting visibility to true
				new Adduser().setVisible(true);
			}
		});
		btnNewButton.setBounds(34, 200, 196, 89);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search"); // JButton is an implementation of a "push" button for the search member function in gui.
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(287, 200, 196, 89);
			// Action listener set a the action to be performed
		btnNewButton_1.addActionListener(new ActionListener() { // Implement the ActionListener interface in the class 
			public void actionPerformed(ActionEvent arg0) { // method is invoked automatically whenever action listener is called
				 //Redirect users to Search user class by setting visibility to true
				new Searchuser().setVisible(true);
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete"); // JButton is an implementation of a "push" button for the delete member function in gui.
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(548, 200, 196, 89);
			// Action listener set a the action to be performed
		btnNewButton_2.addActionListener(new ActionListener() { // Implement the ActionListener interface in the class 
			public void actionPerformed(ActionEvent arg0) { // method is invoked automatically whenever action listener is called
				 //Redirect users to Delete user class by setting visibility to true
				new Deleteuser().setVisible(true);
			}
		});
		contentPane.add(btnNewButton_2);
		
		JLabel txt_username = new JLabel("Welcome User!");
		txt_username.setBackground(new Color(0, 0, 255));
		txt_username.setFont(new Font("Tahoma", Font.BOLD, 40));
		txt_username.setBounds(192, 74, 471, 62);
		txt_username.setText("Welcome " + user);
		contentPane.add(txt_username);
		
		JButton updatebankacct = new JButton("Update bank account");
		updatebankacct.setFont(new Font("Tahoma", Font.PLAIN, 20));
			// Action listener set a the action to be performed
		updatebankacct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Redirect users to Update acct. class by setting visibility to true
				new Updateacct().setVisible(true); // ask it to become visible. 
			}
		});
		updatebankacct.setForeground(Color.WHITE);
		updatebankacct.setBackground(Color.BLACK);
		updatebankacct.setBounds(264, 341, 291, 89);
		contentPane.add(updatebankacct);
		
	}
}
