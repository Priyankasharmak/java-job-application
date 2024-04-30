package src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

import filehandle.createFIle;

public class home {

	
	JFrame frame;
	private JTextField name;
	private JTextField number;
	private JTextField mail;
	private JTextField qualification;
	private JTextField parent_name;
	private JTextField comments;
	private JTextField age;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					home window = new home();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public home() {
//		initialize("null" , "null"  , false);
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	 void initialize(String fle , String oldid , boolean gen ) {
		String image;
		if(gen) {
			image = "assets\\generatebtn.png";
		}
		else {
			image=  "assets\\upbtn.png";
		}
	
		frame = new JFrame();
		frame.setBounds(100, 100, 1033, 754);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0,0,0,0));
		panel.setBounds(0, 0, 1018, 712);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(Color.WHITE);
		
	
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 32));
		lblNewLabel_1.setBounds(285, 21, 111, 65);
		panel.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setFont(new Font("SansSerif", Font.PLAIN, 24));
		name.setBounds(189, 141, 459, 31);
		panel.add(name);
		name.setColumns(10);
		
		JComboBox gender = new JComboBox();
		gender.setFont(new Font("SansSerif", Font.PLAIN, 25));
		gender.setModel(new DefaultComboBoxModel(new String[] {" Male", " Female", " Other"}));
		gender.setBounds(213, 183, 168, 31);
		panel.add(gender);
		
		JComboBox experience = new JComboBox();
		experience.setModel(new DefaultComboBoxModel(new String[] {" 1 year", " 2 years", " 3 years", " 4 years", " 5+ years"}));
		experience.setFont(new Font("SansSerif", Font.PLAIN, 24));
		experience.setBounds(254, 396, 127, 39);
		panel.add(experience);
		
		JComboBox sta = new JComboBox();
		sta.setModel(new DefaultComboBoxModel(new String[] {"  Single", "  Married"}));
		sta.setFont(new Font("SansSerif", Font.PLAIN, 24));
		sta.setBounds(202, 447, 179, 31);
		panel.add(sta);
		
		number = new JTextField();
		number.setFont(new Font("SansSerif", Font.PLAIN, 25));
		number.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(number.getText().length() > 9 ) {
					e.consume();
				}
				char c = e.getKeyChar();
		        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
		            e.consume();
		        }
			}
		});
		number.setColumns(10);
		number.setBounds(289, 223, 359, 31);
		panel.add(number);
		
		mail = new JTextField();
		mail.setFont(new Font("SansSerif", Font.PLAIN, 24));
		mail.setColumns(10);
		mail.setBounds(173, 269, 475, 31);
		panel.add(mail);
		
		qualification = new JTextField();
		qualification.setFont(new Font("SansSerif", Font.PLAIN, 24));
		qualification.setColumns(10);
		qualification.setBounds(270, 484, 378, 31);
		panel.add(qualification);
		
		parent_name = new JTextField();
		parent_name.setFont(new Font("SansSerif", Font.PLAIN, 24));
		parent_name.setColumns(10);
		parent_name.setBounds(270, 526, 378, 31);
		panel.add(parent_name);
		
		comments = new JTextField();
		comments.setFont(new Font("SansSerif", Font.PLAIN, 24));
		comments.setColumns(10);
		comments.setBounds(242, 568, 406, 31);
		panel.add(comments);
		
		age = new JTextField();
		age.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			
				if(age.getText().length() > 1 ) {
					e.consume();
				}
				char c = e.getKeyChar();
		        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
		            e.consume();
		        }
			
			}});
		age.setFont(new Font("SansSerif", Font.PLAIN, 25));
		age.setColumns(10);
		age.setBounds(173, 311, 208, 31);
		panel.add(age);
		
		JComboBox language = new JComboBox();
		language.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3+"}));
		language.setFont(new Font("SansSerif", Font.PLAIN, 24));
		language.setBounds(332, 353, 61, 39);
		panel.add(language);
		
		
		JLabel genbtn = new JLabel("");
		genbtn.setHorizontalAlignment(SwingConstants.CENTER);
		genbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nme = name.getText() ;
				String num = number.getText();
				String life = age.getText() ;
				String parent  = parent_name.getText();
				String qualif = qualification.getText() ;
				String com  = comments.getText();
				String exp = (String)experience.getSelectedItem();
				String gen = (String)gender. getSelectedItem();
				String stat = (String)sta. getSelectedItem();
				String mails  = mail.getText();
				String lang = (String)language. getSelectedItem();
				if(
						nme.length() != 0 && 
						num.length() != 0 && num.length() == 10
						&& life.length() != 0 &&
						parent.length() != 0 &&
						qualif.length() != 0 &&
						mails.length() != 0
						) {
					createFIle cf = new createFIle();
					cf.fm = frame;
					try {
						if(fle.contentEquals("null")) {
							
							cf.createFile( nme, mails, num, qualif , fle, exp, stat, life, com, parent, lang, gen,  true  , "null");	
							JOptionPane.showMessageDialog(frame, "Your form is created with application id " + cf.id);
						}
						else {
							cf.createFile(nme, mails, num, qualif , fle, exp, stat, life, com, parent, lang, gen , false ,oldid);	
							JOptionPane.showMessageDialog(frame, "Your form is created with application id " + cf.id);
							frame.dispose();
							 update updt = new update();
							 updt. initialize();
							 updt.frame.setVisible(true);
						}
						
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				else if(
						nme.length() != 0 && 
						num.length() != 0 && 
						life.length() != 0 &&
						parent.length() != 0 &&
						qualif.length() != 0 &&
						mails.length() != 0
						){
					JOptionPane.showMessageDialog(frame, "Please enter full mobile number");
					
				}
				else {
					JOptionPane.showMessageDialog(frame, "Please fill all field!");
				}
				
				
			}
		});
		
		
		genbtn.setIcon(new ImageIcon(image));
		genbtn.setBounds(369, 621, 259, 65);
		panel.add(genbtn);
		
		JLabel Update = new JLabel("Update");
		Update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!gen) {
					JOptionPane.showMessageDialog(frame, "You are currently on Update, Please dont change window");
				}
				else {
				update updt = new update();
				updt.initialize();
				updt.frame.setVisible(true);
				frame.dispose();
			}
				}
		});
		Update.setHorizontalAlignment(SwingConstants.CENTER);
		Update.setFont(new Font("SansSerif", Font.PLAIN, 25));
		Update.setBackground(Color.WHITE);
		Update.setBounds(399, 23, 111, 65);
		panel.add(Update);
		
		JLabel logout = new JLabel("Logout");
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!gen) {
					JOptionPane.showMessageDialog(frame, "You are currently on Update, Please dont change window");
				}
				else {
				login lg = new login();
				lg.initialize();
				lg.frame.setVisible(true);
				frame.dispose();
			}}
		});
		logout.setHorizontalAlignment(SwingConstants.CENTER);
		logout.setFont(new Font("SansSerif", Font.PLAIN, 25));
		logout.setBackground(Color.WHITE);
		logout.setBounds(507, 23, 111, 65);
		panel.add(logout);
		
		JLabel admin = new JLabel("Admin");
		admin.setHorizontalAlignment(SwingConstants.CENTER);
		admin.setFont(new Font("SansSerif", Font.PLAIN, 20));
		admin.setBackground(Color.WHITE);
		admin.setBounds(712, 61, 111, 31);
		panel.add(admin);
		

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1023, 712);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("assets\\homepage.jpg"));
		lblNewLabel.setBounds(0, 0, 1024, 712);
		panel_1.add(lblNewLabel);
		frame.setPreferredSize(new Dimension(1024, 720));
	}
}
