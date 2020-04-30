/*

 * Update user account with some money after entering his member id

 */

package bankingsystem;//package

//Importing all neccessary libraries

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.EventQueue;

import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



import javax.swing.JButton;

import javax.swing.JFormattedTextField;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.border.EmptyBorder;

//Creating the Updateaccount class for user account that extends J-Frame

public class Updateacct extends JFrame {

	//declaring field with private access modifier

	private JPanel contentPane;

	private JTextField id_area;

	//Initialize the Connectsql class for sql connection

	Connectsql connection = new Connectsql();

	// Insert info class

	Insertinfo insertin;

	//Getinfo class

	Getinfo getin;

	

	private JTextField amount;

	/**

	 * Launching the application.

	 */

	public static void main(String[] args) {

		//Static method invokelater that will the code later in the run method

		EventQueue.invokeLater(new Runnable() {

			public void run() {//calling the run method on interface Runnable

				try {//Error control with a try and catch block 

					Updateacct frame = new Updateacct();

					frame.setVisible(true);//Setting frame to visible

				} catch (Exception e) {

					e.printStackTrace();//printing the stack trace

				}

			}

		});

	}



	/**

	 * Create the frame.

	 */

	public Updateacct() {//update account

		//setting the tile for the frame

		setTitle("Banking System - Update user Account");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 600, 501);//Setting bounds

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));//setting borders

		setContentPane(contentPane);

		contentPane.setLayout(null);

		//Adding monney to the user account

		JLabel lblNewLabel = new JLabel("Add money to users account");

		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));

		lblNewLabel.setBounds(90, 23, 465, 49);//setting bounds

		contentPane.add(lblNewLabel);

		//Entering member id

		JLabel lblNewLabel_1 = new JLabel("Enter memeber id:");

		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));

		lblNewLabel_1.setBounds(38, 100, 312, 22);

		contentPane.add(lblNewLabel_1);

		//initialization

		id_area = new JTextField();

		id_area.setBounds(38, 135, 420, 36);

		contentPane.add(id_area);

		id_area.setColumns(10);

		//Add button

		JButton searchbtn = new JButton("Add");

		searchbtn.setFont(new Font("Tahoma", Font.BOLD, 19));

		searchbtn.setForeground(Color.WHITE);

		searchbtn.setBackground(Color.BLACK);

		searchbtn.addActionListener(new ActionListener() {//

			public void actionPerformed(ActionEvent e) {

				//Initialize the insertinfo class

				insertin = new Insertinfo();

				//Initialize the Getinfo class

				getin = new Getinfo();

		       	//Sets delete id textbox to setmember id setter

				getin.setmemberid(id_area.getText());

			    //Converts amount String to integer

				int amountinput = Integer.parseInt(amount.getText());

			   	//Set Account balance textbox to setacctbalance setter

				getin.setacctbalance(amountinput);

				//inset the getin setter to the inserttoacct method in insert info that inserts money to accoutbalance in database

				insertin.inserttoacct(getin);

				dispose();

			}

		});

		searchbtn.setBounds(174, 309, 222, 63);//bounds setter

		contentPane.add(searchbtn);

		

		JLabel lblEnterAmount = new JLabel("Enter Amount$:");

		lblEnterAmount.setFont(new Font("Tahoma", Font.BOLD, 25));

		lblEnterAmount.setBounds(38, 184, 230, 22);

		contentPane.add(lblEnterAmount);

		

		amount = new JFormattedTextField();

		amount.setColumns(10);

		amount.setBounds(38, 219, 420, 36);

	

		contentPane.add(amount);//adding the amount for final update

		



	}

}//ends Update class