package src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class update {

	public static JFrame frame;
	private JTextField name;
	private JTextField appid;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					update window = new update();
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
//	public update() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1032, 738);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1023, 699);
		panel.setBackground(new Color(0,0,0,0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		name = new JTextField();
		name.setBounds(349, 300, 364, 31);
		name.setFont(new Font("SansSerif", Font.PLAIN, 25));
		panel.add(name);
		name.setColumns(10);
		
		appid = new JTextField();
		appid.setBounds(349, 358, 364, 31);
		appid.setFont(new Font("SansSerif", Font.PLAIN, 25));
		appid.setColumns(10);
		panel.add(appid);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("assets\\updatebtnnew.png"));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					getform(name.getText() , appid.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(396, 437, 255, 64);
		panel.add(lblNewLabel_1);
		
		
		JLabel Home = new JLabel("Home");
		Home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home hm = new home();
				hm.initialize("null", "null", true);
				hm.frame.setVisible(true);
				frame.dispose();
			}
		});
		Home.setHorizontalAlignment(SwingConstants.CENTER);
		Home.setFont(new Font("SansSerif", Font.PLAIN, 25));
		Home.setBounds(289, 34, 115, 33);
		panel.add(Home);
		
		JLabel lblNewLabel_2_1 = new JLabel("Update");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("SansSerif", Font.BOLD, 32));
		lblNewLabel_2_1.setBounds(414, 34, 115, 33);
		panel.add(lblNewLabel_2_1);
		
		JLabel Logout = new JLabel("Logout");
		Logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login lg = new login();
				lg.initialize(); 
				lg.frame.setVisible(true);
				frame.dispose();
			}
		});
		Logout.setHorizontalAlignment(SwingConstants.CENTER);
		Logout.setFont(new Font("SansSerif", Font.PLAIN, 25));
		Logout.setBounds(536, 34, 115, 33);
		panel.add(Logout);
		
		JPanel backgrouynd = new JPanel();
		backgrouynd.setBounds(0, 0 , 1023, 699);
		frame.getContentPane().add(backgrouynd);
		backgrouynd.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("assets\\update_new.jpg"));
		lblNewLabel.setBounds(0, 0, 1023, 699);
		backgrouynd.add(lblNewLabel);
		
		frame.setPreferredSize(new Dimension(1040, 720+16));
		frame.pack();
	}
	
	public static void getform(String name , String appid) throws IOException {
		String filename = "forms/" + name + "-"+ appid + ".txt";
		File f = new File(filename);
		if(f.exists()) {
			JOptionPane.showMessageDialog(frame, "form found, you are editing your form");
			home hm = new home();
			hm.initialize(filename , appid , false );
			hm.frame.setVisible(true);
			frame.dispose();
		}
		else {
			JOptionPane.showMessageDialog(frame , "Application id or name does match");
		}
		
	}
}
