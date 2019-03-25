package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
import java.awt.Choice;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.Icon;

public class Dictionary extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dictionary frame = new Dictionary();
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
	public Dictionary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 461);
		contentPane = new JPanel();
		
		ImageIcon icon = new ImageIcon("pics/dicback.jpg"); 
		Image img = icon.getImage(); 
		Image newimg = img.getScaledInstance(905, 453,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newimg);
		
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51, 150));
		panel.setBounds(0, 0, 861, 81);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ImageIcon icon1 = new ImageIcon("pics/search.png"); 
		Image img1 = icon1.getImage(); 
		Image newimg1 = img1.getScaledInstance(15, 15,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon1 = new ImageIcon(newimg1);
		
		ImageIcon icon2 = new ImageIcon("pics/3dwhite.jpg"); 
		Image img2 = icon2.getImage(); 
		Image newimg2 = img2.getScaledInstance(18, 18,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon2 = new ImageIcon(newimg2);
		
		ImageIcon icon3 = new ImageIcon("pics/backdic.png"); 
		Image img3 = icon3.getImage(); 
		Image newimg3 = img3.getScaledInstance(135, 40,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon3 = new ImageIcon(newimg3);
		
		ImageIcon icon4 = new ImageIcon("pics/exitdic.png"); 
		Image img4 = icon4.getImage(); 
		Image newimg4 = img4.getScaledInstance(135, 40,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon4 = new ImageIcon(newimg4);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		JButton btnNewButton = new JButton("");
		
		
		DefaultListModel model = new DefaultListModel();
		String description="";
		JList list = new JList( model );
		JTextArea textArea = new JTextArea();
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchkey=textField.getText();
				System.out.println(searchkey); 
				model.clear();
				list.setSelectedIndex(-1);
				String description="";
				textArea.setText(description);
				
				try
			    {
			      String myDriver = "com.mysql.cj.jdbc.Driver";
			      String myUrl = "jdbc:mysql://localhost/GRE";
			      Class.forName(myDriver);
			      Connection conn = DriverManager.getConnection(myUrl, "root", "");
			      System.out.format("%s\n",searchkey);
			      String query = "SELECT * FROM word where word like '%"+searchkey+"%'";

			      Statement st = conn.createStatement();
			      
			      ResultSet rs = st.executeQuery(query);
			      //int i=0;
			      while (rs.next())
			      {
			        //int id = rs.getInt("id");
			        String word = rs.getString("word");
			        //System.out.format("%s\n",word);
			        model.addElement(word);
			        //i++;
			        
			      }
			      st.close();
			    }
			    catch (Exception er)
			    {
			      System.err.println("Got an exception! ");
			      System.err.println(er.getMessage());
			    }
				
				
			}
		});
		btnNewButton.setBounds(813, 34, 23, 20);
		btnNewButton.setIcon(newIcon1);
		panel.add(btnNewButton);
		
		String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		
		
		
		
		JLabel lblNewLabel = new JLabel("GRE WordBook");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 11, 556, 70);
		panel.add(lblNewLabel);
		
		
		textField.addKeyListener(new KeyAdapter() {
		        @Override
		        public void keyPressed(KeyEvent e) {
		            if(e.getKeyCode() == KeyEvent.VK_ENTER){
		                // something like...
		               
		               // or...
		               btnNewButton.doClick();
		            }
		        }

		    });
		textField.setBounds(586, 34, 221, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192, 150));
		panel_1.setBounds(0, 81, 861, 342);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		JComboBox comboBox = new JComboBox(alpha);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.clear();
				list.setSelectedIndex(-1);
				String description="";
				textArea.setText(description);
				try
			    {
			      String myDriver = "com.mysql.cj.jdbc.Driver";
			      String myUrl = "jdbc:mysql://localhost/GRE";
			      Class.forName(myDriver);
			      Connection conn = DriverManager.getConnection(myUrl, "root", "");
			      System.out.format("%s\n",comboBox.getSelectedItem().toString());
			      String query = "SELECT * FROM word where word like '"+comboBox.getSelectedItem().toString()+"%'";

			      Statement st = conn.createStatement();
			      
			      ResultSet rs = st.executeQuery(query);
			      //int i=0;
			      while (rs.next())
			      {
			        //int id = rs.getInt("id");
			        String word = rs.getString("word");
			        //System.out.format("%s\n",word);
			        model.addElement(word);
			        //i++;
			        
			      }
			      st.close();
			    }
			    catch (Exception e)
			    {
			      System.err.println("Got an exception! ");
			      System.err.println(e.getMessage());
			    }
				
			}
		});
		comboBox.setBounds(0, 0, 63, 54);
		panel_1.add(comboBox);
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBackground(new Color(0, 0, 51));
		comboBox.setMaximumRowCount(7);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 32));
		
		JButton button = new JButton(newIcon3);
		button.setBounds(73, 294, 135, 38);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame Options = new main.Options(); Options.setVisible(true);
			}
		});
		panel_1.add(button);
		
		
		//textArea.setBounds(400, 11, 451, 272);
		
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		JScrollPane scrollPane2 = new JScrollPane(textArea);
		scrollPane2.setViewportBorder(UIManager.getBorder("ScrollPane.border"));
		scrollPane2.setBounds(400, 11, 451, 272);
		scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1.add(scrollPane2);
		
		
		try
	    {
	      String myDriver = "com.mysql.cj.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost/GRE";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "");
	      System.out.format("%s\n",comboBox.getSelectedItem().toString());
	      String query = "SELECT * FROM word where word like '"+comboBox.getSelectedItem().toString()+"%'";

	      Statement st = conn.createStatement();
	      
	      ResultSet rs = st.executeQuery(query);
	      //int i=0;
	      while (rs.next())
	      {
	        //int id = rs.getInt("id");
	        String word = rs.getString("word");
	        //System.out.format("%s\n",word);
	        model.addElement(word);
	        //i++;
	        
	      }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
		
		
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if(list.getSelectedValue()!=null) {
				String key=list.getSelectedValue().toString();
				
				try
			    {
			      String myDriver = "com.mysql.cj.jdbc.Driver";
			      String myUrl = "jdbc:mysql://localhost/GRE";
			      Class.forName(myDriver);
			      Connection conn = DriverManager.getConnection(myUrl, "root", "");
			      System.out.format("%s\n",key);
			      String query = "SELECT * FROM word where word = '"+key+"'";

			      Statement st = conn.createStatement();
			      
			      ResultSet rs = st.executeQuery(query);
			      while (rs.next())
			      {
			    	  String word = rs.getString("word");
				      String pos = rs.getString("pos");
				      String meaning = rs.getString("meaning");
				      String example = rs.getString("example");
				      final String description="\n"+word+"("+pos+")\n\n"+meaning+"\n\nExample: \n"+example;
				      textArea.setText(description);
			      }
			      st.close();
			    }
			    catch (Exception e)
			    {
			      System.err.println("Got an exception! ");
			      System.err.println(e.getMessage());
			    }
				
				
				
				
				}
			}
		});
		list.setBorder(UIManager.getBorder("ScrollPane.border"));
		list.setFont(new Font("Tw Cen MT", Font.BOLD, 25));

		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(73, 11, 315, 272);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1.add(scrollPane);
		
		JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(716, 294, 135, 38);
		button_1.setIcon(newIcon4);
		panel_1.add(button_1);


		JLabel label = new JLabel("");
		
		label.setIcon(newIcon);
		label.setBounds(0, 0, 861, 423);
		contentPane.add(label);
		
	}
}
