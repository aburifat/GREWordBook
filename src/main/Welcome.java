package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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

	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 461);
		contentPane = new JPanel();
		 setContentPane(contentPane);
		 contentPane.setForeground(new Color(255, 255, 255));
		 contentPane.setBackground(new Color(0, 128, 128));
		 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setEnabled(false);
		panel.setBounds(0, 54, 861, 71);
		panel.setBackground(new Color(0, 0, 51));
		contentPane.add(panel);
		
		JLabel lblGreWordbook = new JLabel("GRE WordBook");
		panel.add(lblGreWordbook);
		lblGreWordbook.setForeground(new Color(255, 255, 255));
		lblGreWordbook.setBackground(new Color(0, 0, 128));
		lblGreWordbook.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblGreWordbook.setHorizontalAlignment(SwingConstants.CENTER);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(321, 131, 202, 37);
		panel_1.setBackground(new Color(0, 0, 102));
		contentPane.add(panel_1);
		
		
		JLabel lblLearnToLead = new JLabel("Learn To Lead");
		panel_1.add(lblLearnToLead);
		lblLearnToLead.setForeground(new Color(255, 255, 0));
		lblLearnToLead.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblLearnToLead.setHorizontalAlignment(SwingConstants.CENTER);
		
		ImageIcon button = new ImageIcon("pics/enter.png"); 
		Image buttonimg = button.getImage(); 
		Image buttonnewimg = buttonimg.getScaledInstance(200, 70,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newbutton = new ImageIcon(buttonnewimg);
		
		JButton btnEnter = new JButton(newbutton);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				JFrame Options = new main.Options(); Options.setVisible(true);
			}
		});
		btnEnter.setBounds(321, 310, 187, 54);
		//btnEnter.setBackground(new Color(0, 0, 51));
		btnEnter.setForeground(new Color(0, 0, 255));
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(btnEnter);
		
		JLabel label = new JLabel("");
		
		ImageIcon icon = new ImageIcon("pics/background.jpg"); 
		Image img = icon.getImage(); 
		Image newimg = img.getScaledInstance(877, 461,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newimg);
		
		label.setIcon(newIcon);
		label.setBounds(0, 0, 877, 461);
		contentPane.add(label);
		
		
		
		
		
	}
}
