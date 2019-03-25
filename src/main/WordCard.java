package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordCard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCard frame = new WordCard();
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
	public WordCard() {
		
		////Strat DB////////
		
		try
	    {
	      String myDriver = "com.mysql.cj.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost/GRE";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "");
	      
	      String query = "SELECT * FROM word ORDER BY RAND() LIMIT 1";

	      Statement st = conn.createStatement();
	      
	      ResultSet rs = st.executeQuery(query);
	      
	      while (rs.next())
	      {
	        int id = rs.getInt("id");
	        String word = rs.getString("word");
	        //String pos = rs.getString("pos");
	        //String meaning = rs.getString("meaning");
	        //String example = rs.getString("example");
	        
	        //System.out.format("%s, %s, %s, %s, %s, %s\n", id, word, pos, meaning, example);
	        
	        
	        //////////////////////////////
	      
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 500, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51, 210));
		panel.setBounds(0, 99, 484, 146);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(word+"\r\n");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 41, 484, 69);
		panel.add(lblNewLabel);
		
		ImageIcon button = new ImageIcon("pics/see.gif"); 
		Image buttonimg = button.getImage(); 
		Image buttonnewimg = buttonimg.getScaledInstance(48, 48,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newbutton = new ImageIcon(buttonnewimg);
		
		JButton btnNewButton = new JButton(newbutton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WordCardBack cardback=new WordCardBack(id);
				//JFrame cardback = new main.WordCardBack(); 
				cardback.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(217, 273, 48, 48);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("background");
		
		ImageIcon icon = new ImageIcon("pics/backgroundblack.jpg"); 
		Image img = icon.getImage(); 
		Image newimg = img.getScaledInstance(500, 461,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newimg);
		
		ImageIcon button2 = new ImageIcon("pics/backblue.png"); 
		Image buttonimg2 = button2.getImage(); 
		Image buttonnewimg2 = buttonimg2.getScaledInstance(48, 48,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newbutton2 = new ImageIcon(buttonnewimg2);
		
		JButton btnBack = new JButton(newbutton2);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame option = new main.Options(); option.setVisible(true);
			}
		});
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.setBounds(159, 273, 48, 48);
		contentPane.add(btnBack);
		
		ImageIcon button3 = new ImageIcon("pics/exitred.png"); 
		Image buttonimg3 = button3.getImage(); 
		Image buttonnewimg3 = buttonimg3.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newbutton3 = new ImageIcon(buttonnewimg3);
		
		JButton button_1 = new JButton(newbutton3);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(275, 273, 48, 48);
		contentPane.add(button_1);
		
		label.setIcon(newIcon);
		label.setBounds(0, 0, 484, 423);
		contentPane.add(label);
		
		
		/////////////////////////////////////////////
		
		
	      }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
		
		////////////End DB////////////
	}
}
