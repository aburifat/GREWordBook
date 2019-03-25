package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;

public class WordCardBack extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCardBack frame = new WordCardBack(1);
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
	public WordCardBack(int id) {
		
		String word="";
        String pos="";
        String meaning="";
        String example="";
		
		try
	    {
	      String myDriver = "com.mysql.cj.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost/GRE";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "");
	      
	      String query = "SELECT * FROM word WHERE id = "+id+" limit 1";

	      Statement st = conn.createStatement();
	      
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        word = rs.getString("word");
	        pos = rs.getString("pos");
	        meaning = rs.getString("meaning");
	        example = rs.getString("example");
	      }
			st.close();
		}catch (Exception e){
				System.err.println("Got an exception! ");
				System.err.println(e.getMessage());
		}
	        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 500, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51, 250));
		panel.setBounds(22, 26, 435, 112);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel(word);
		//JLabel lblNewLabel = new JLabel("word");
		
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 415, 50);
		panel.add(lblNewLabel);
		
		JLabel lblVerb = new JLabel(pos);
		//JLabel lblVerb = new JLabel("pos");
		
		lblVerb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVerb.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerb.setForeground(new Color(255, 255, 255));
		lblVerb.setBounds(10, 62, 415, 44);
		panel.add(lblVerb);
		
		
		
		
		
		
		ImageIcon button = new ImageIcon("pics/okblue.png"); 
		Image buttonimg = button.getImage(); 
		Image buttonnewimg = buttonimg.getScaledInstance(75, 75,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newbutton = new ImageIcon(buttonnewimg);
		
		JButton btnNewButton = new JButton(newbutton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame card = new main.WordCard(); card.setVisible(true);
			}
		});

		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(22, 339, 48, 48);
		contentPane.add(btnNewButton);
		
		ImageIcon button2 = new ImageIcon("pics/sadblue.png"); 
		Image buttonimg2 = button2.getImage(); 
		Image buttonnewimg2 = buttonimg2.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newbutton2 = new ImageIcon(buttonnewimg2);
		
		JButton button_1 = new JButton(newbutton2);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame card = new main.WordCard(); card.setVisible(true);
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(409, 339, 48, 48);
		contentPane.add(button_1);
		
		
		
		JLabel lblIKnow = new JLabel("I Know..");
		lblIKnow.setForeground(new Color(255, 255, 255));
		lblIKnow.setHorizontalAlignment(SwingConstants.CENTER);
		lblIKnow.setBounds(22, 398, 48, 14);
		contentPane.add(lblIKnow);
		
		JLabel lblWhat = new JLabel("What?");
		lblWhat.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhat.setForeground(Color.WHITE);
		lblWhat.setBounds(409, 398, 48, 14);
		contentPane.add(lblWhat);
		
		JLabel label = new JLabel("");
		ImageIcon icon = new ImageIcon("pics/backgroundblack.jpg"); 
		Image img = icon.getImage(); 
		Image newimg = img.getScaledInstance(500, 461,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newimg);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 0, 51, 250));
		panel_1.setBounds(22, 147, 435, 181);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("<html>"+meaning+"</html>");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(10, 11, 415, 50);
		panel_1.add(label_1);
		
		JLabel label_3 = new JLabel("<html>"+example+"</html>");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(20, 72, 415, 107);
		panel_1.add(label_3);
		
		label.setIcon(newIcon);
		label.setBounds(0, 0, 484, 423);
		contentPane.add(label);
		
		
/////////////////////////////////////////////

		


////////////End DB////////////
		
		
	}
}
