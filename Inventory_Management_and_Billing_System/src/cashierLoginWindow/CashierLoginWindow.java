package cashierLoginWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import adminLoginWindow.AdminPanelWindow;//reducing warning
import helperPackage.FileReadWrite;
import helperPackage.User;
import welcomeWindow.WelcomeWindow;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CashierLoginWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//reducing warning
	
	private JPanel contentPane;
	private JTextField textFieldUserName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	
	User user = new FileReadWrite().ReadCashier("cashier", "password");
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierLoginWindow frame = new CashierLoginWindow();
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
	public CashierLoginWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(10, 10, 566, 61);
		contentPane.add(panel);
		
		JLabel lblCashierLogin = new JLabel("CASHIER LOGIN");
		lblCashierLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblCashierLogin.setForeground(Color.GREEN);
		lblCashierLogin.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblCashierLogin.setBackground(new Color(30, 144, 255));
		panel.add(lblCashierLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(10, 102, 566, 351);
		contentPane.add(panel_1);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setForeground(Color.GREEN);
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUserName.setBackground(Color.RED);
		lblUserName.setBounds(140, 50, 90, 30);
		panel_1.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.GREEN);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBackground(Color.RED);
		lblPassword.setBounds(140, 101, 90, 30);
		panel_1.add(lblPassword);
		
		textFieldUserName = new JTextField();
		textFieldUserName.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")//reducing warning
			public void actionPerformed(ActionEvent e) {
				textFieldUserName.nextFocus();
			}
		});
		textFieldUserName.setForeground(Color.WHITE);
		textFieldUserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldUserName.setColumns(10);
		textFieldUserName.setBackground(new Color(0, 191, 255));
		textFieldUserName.setBounds(230, 53, 163, 30);
		panel_1.add(textFieldUserName);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")//reducing warning
			public void actionPerformed(ActionEvent e) {
				String userName = textFieldUserName.getText();
				String password = passwordField.getText();
				if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
					JOptionPane.showMessageDialog(null,
						    "Login Successfull..",
						    "Login Status",
						    JOptionPane.PLAIN_MESSAGE);
					dispose();
					new CashierWindow().setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,
						    "User Name or Password Incorrect!!",
						    "Login Status",
						    JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogin.setBackground(Color.GREEN);
		btnLogin.setBounds(60, 255, 90, 30);
		panel_1.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUserName.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBackground(Color.GREEN);
		btnReset.setBounds(212, 255, 90, 30);
		panel_1.add(btnReset);
		
		JButton btnGoback = new JButton("Go Back");
		btnGoback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WelcomeWindow.main(null);
			}
		});
		btnGoback.setForeground(Color.BLACK);
		btnGoback.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGoback.setBackground(Color.GREEN);
		btnGoback.setBounds(357, 255, 128, 30);
		panel_1.add(btnGoback);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLogin.doClick();
			}
		});
		passwordField.setForeground(Color.WHITE);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBackground(new Color(0, 191, 255));
		passwordField.setBounds(230, 101, 163, 30);
		panel_1.add(passwordField);
	}
}
