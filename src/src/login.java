package src;
import java.awt.Dimension;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JButton;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login {
	private String Userid = "L";
	private String password = "1";

	JFrame frame;
	private JTextField Nameid;
	private JPasswordField passid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 0, 1008, 681);
		panel.setBackground(new Color(0,0,0,0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Nameid = new JTextField();
		Nameid.setBorder(null);
		Nameid.setFont(new Font("SansSerif", Font.PLAIN, 25));
	
		Nameid.setBounds(429, 318, 372, 34);
		panel.add(Nameid);
		Nameid.setColumns(10);
		
		passid = new JPasswordField();
		passid.setBorder(null);
		passid.setFont(new Font("SansSerif", Font.PLAIN, 25));
		passid.setBounds(429, 419, 372, 34);
		panel.add(passid);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(passid.getText().length() != 0 && Nameid.getText().length() != 0) {
					if( Nameid.getText().contentEquals(Userid) &&
							passid.getText().contentEquals(password)) {
						home hm = new home();
						hm.initialize("null" , "null" , true);
						hm.frame.setVisible(true);
						frame.dispose();
					}
					else {
						JOptionPane.showMessageDialog(lblNewLabel_1, "Incorrect Name or Password");
					}
				}
				else {
					
					JOptionPane.showMessageDialog(lblNewLabel_1, "Please fill the feild");
				}
				
				
				
				
				
				
			}
		});
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(429, 476, 175, 47);
		panel.add(lblNewLabel_1);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("assets\\loginbtn.png"));
		btnNewButton.setBackground(new Color(0,0,0,0));
		btnNewButton.setBounds(429, 476, 175, 47);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(0, 0, 1008, 681);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("assets\\backgorund.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(0, 0, 1049, 720);
		panel_1.add(lblNewLabel);
		frame.setBounds(100, 100, 1035, 786);
		frame.setPreferredSize(new Dimension(1024, 720));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
