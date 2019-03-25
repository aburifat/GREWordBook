package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Options extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Options frame = new Options();
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
	public Options() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 461);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
		
		ImageIcon icon = new ImageIcon("pics/book.png"); 
		Image img = icon.getImage(); 
		Image newimg = img.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newimg);
		
		JButton btnNewButton = new JButton(newIcon);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame dic = new main.Dictionary(); dic.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(10, 176, 120, 120);
		contentPane.add(btnNewButton);
		
		ImageIcon icon2 = new ImageIcon("pics/flashcard.png"); 
		Image img2 = icon2.getImage(); 
		Image newimg2 = img2.getScaledInstance(110, 110,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon2 = new ImageIcon(newimg2);
		
		JButton button = new JButton(newIcon2);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				JFrame card = new main.WordCard(); card.setVisible(true);
			}
		});
		button.setBounds(140, 176, 120, 120);
		contentPane.add(button);
		
		ImageIcon icon3 = new ImageIcon("pics/helpline.png"); 
		Image img3 = icon3.getImage(); 
		Image newimg3 = img3.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon3 = new ImageIcon(newimg3);
		
		JButton button_1 = new JButton(newIcon3);
		button_1.setBounds(270, 176, 120, 120);
		contentPane.add(button_1);
		
		ImageIcon icon4 = new ImageIcon("pics/aboutus.png"); 
		Image img4 = icon4.getImage(); 
		Image newimg4 = img4.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon4 = new ImageIcon(newimg4);
		
		JButton button_2 = new JButton(newIcon4);
		button_2.setBounds(400, 176, 120, 120);
		contentPane.add(button_2);
		
		ImageIcon back = new ImageIcon("pics/back.png"); 
		Image backimg = back.getImage(); 
		Image backnewimg = backimg.getScaledInstance(200, 70,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newback = new ImageIcon(backnewimg);
		
		JButton btnEnter = new JButton(newback);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame Welcome = new main.Welcome(); Welcome.setVisible(true);
			}
		});
		btnEnter.setBounds(321, 310, 187, 54);
		//btnEnter.setBackground(new Color(0, 0, 51));
		btnEnter.setForeground(new Color(0, 0, 255));
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(btnEnter);
		
		
		JLabel label = new JLabel("");
		
		ImageIcon icon5 = new ImageIcon("pics/background.jpg"); 
		Image img5 = icon5.getImage(); 
		Image newimg5 = img5.getScaledInstance(877, 461,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon5 = new ImageIcon(newimg5);
		
		JLabel lblNewLabel = new JLabel("");
		
		ImageIcon icon6 = new ImageIcon("pics/gre.jpg"); 
		Image img6 = icon6.getImage(); 
		Image newimg6 = img6.getScaledInstance(152, 180,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon6 = new ImageIcon(newimg6);
		
		lblNewLabel.setIcon(newIcon6);
		lblNewLabel.setBounds(672, 176, 179, 180);
		contentPane.add(lblNewLabel);
		
		label.setIcon(newIcon5);
		label.setBounds(0, 0, 877, 461);
		contentPane.add(label);
		
	}
}
