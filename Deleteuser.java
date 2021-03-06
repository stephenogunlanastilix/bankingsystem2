/**

*Delete user delete users from sql database
* 

*/
package bankingsystem;

import java.awt.BorderLayout;	//Java class libraries used to design windows interface
import java.awt.EventQueue;

import javax.swing.JFrame;		//Provides a set of lightweight components that works the same on all platforms
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;				
import java.awt.event.ActionEvent;
import java.awt.Color;

import bankingsystem.Connectsql;
import bankingsystem.Getinfo;
import bankingsystem.Insertinfo;

public class Deleteuser extends JFrame {  //create class inheriting attributes from the parent class Jframe

	private JPanel contentPane;			//instance variables
	private JTextField delete_id;		//JPanel & Textfield contents is only accessible within the declared class
	Connectsql connection = new Connectsql();	//create an object connection of the class connectsql
	Insertinfo insertin = new Insertinfo();
	Getinfo getin = new Getinfo();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {//executing main method (ref - https://www.youtube.com/watch?v=2_EydV6EYt0&list=PL4OYVwyd_80ow3KLiePwXdSd_Lmxa-jpN&index=4)
		EventQueue.invokeLater(new Runnable() {		//undertake actions when previous gui events are processed
			public void run() {
				try {
					Deleteuser frame = new Deleteuser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();	//prints error with details line number and class name
				}
			}
		});
	}

	/**
	 * Create the frame. (My code)
	 */
	public Deleteuser() { 		// delete user class
		setTitle("Banking System - Delete user");		//setting the graphical properties of the user interface
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 501);		//sets the position, width and height of the GUI
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete User");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(186, 24, 349, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter memeber id:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(38, 100, 404, 22);
		contentPane.add(lblNewLabel_1);
		
		delete_id = new JTextField();
		delete_id.setBounds(38, 136, 475, 49);
		contentPane.add(delete_id);
		delete_id.setColumns(10);
		
		JButton delbtn = new JButton("Delete");
		delbtn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		delbtn.setForeground(Color.WHITE);
		delbtn.setBackground(Color.BLACK);
		// Action listener set a the action to be performed
		delbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Initialize InsertInfo class
				insertin = new Insertinfo();
				//Initialize Get info class
				getin = new Getinfo();
				//Check if member id is empty then throws an error Member id is empty
                if(delete_id.getText().isEmpty()) {
               	 JOptionPane.showMessageDialog(null, "Membership ID is empty");
                }else {
                	//Set delete id textbox to setmember id setter
            		getin.setmemberid(delete_id.getText());
            		//insert the getin setter to the delete method in insert info that user deletes info from database
    				insertin.delete(getin);
                }
		
			}
		});
		delbtn.setBounds(159, 198, 230, 64);	//delete button properties
		contentPane.add(delbtn);			// calls the method
	}
}
