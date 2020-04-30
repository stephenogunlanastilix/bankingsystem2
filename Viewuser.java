/*
 * View user class Shows the first name , last name , user name , member id ,password 
 */
package bankingsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Viewuser extends JFrame { // Displays the user information from Database

	private JPanel contentPane;

// Main Method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Sets the default parameters to empty
					Viewuser frame = new Viewuser("","","" ,"","");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Code to create the frame 
	 
	//Pass the user name , first name , last name , member id , account balance to view user parameters
	public Viewuser(String username , String firstname ,String lastname , String memberid ,String acctbalance ) {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 564, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User information");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(113, 39, 345, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Firstname:");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFirstname.setBounds(50, 112, 163, 28);
		contentPane.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLastname.setBounds(249, 112, 345, 28);
		contentPane.add(lblLastname);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUsername.setBounds(50, 193, 163, 28);
		contentPane.add(lblUsername);
		
		JLabel lblMembershipId = new JLabel("Membership id:");
		lblMembershipId.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblMembershipId.setBounds(249, 193, 345, 28);
		contentPane.add(lblMembershipId);
		
		JLabel usernameid= new JLabel("Username goes here!");
		usernameid.setFont(new Font("Tahoma", Font.BOLD, 20));
		usernameid.setBounds(50, 234, 143, 28);
		//Set user name field to user name
		usernameid.setText(username);
		contentPane.add(usernameid);
		
		JLabel membershipid = new JLabel("Membership id goes here");
		membershipid.setFont(new Font("Tahoma", Font.BOLD, 20));
		membershipid.setBounds(249, 234, 345, 28);
		//set member id field to membershi pid
		membershipid.setText(memberid);
		contentPane.add(membershipid);
		
		JLabel lastnameid = new JLabel("Lastname goes here");
		lastnameid.setFont(new Font("Tahoma", Font.BOLD, 20));
		lastnameid.setBounds(249, 152, 345, 28);
		//Set last name field to last name
		lastnameid.setText(lastname);
		contentPane.add(lastnameid);
		
		JLabel firstnameid = new JLabel("Firstname goes here");
		firstnameid.setForeground(new Color(0, 0, 0));
		firstnameid.setFont(new Font("Tahoma", Font.BOLD, 20));
		firstnameid.setBounds(50, 152, 143, 28);
		//set first name field to first name
		firstnameid.setText(firstname);
		contentPane.add(firstnameid);
		
		JLabel lblAccountBalance = new JLabel("Account Balance");
		lblAccountBalance.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAccountBalance.setBounds(50, 287, 345, 28);
		contentPane.add(lblAccountBalance);
		
		JLabel label = new JLabel("<dynamic>");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(50, 328, 345, 28);
		//Set account balance field to account balance
		label.setText("$"+acctbalance);
		contentPane.add(label);
	}
}
