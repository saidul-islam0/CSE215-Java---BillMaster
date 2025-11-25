package welcomeWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
//import java.awt.BorderLayout;//reducing warning
import javax.swing.JLabel;
//import java.awt.Panel;//reducing warning
import javax.swing.SwingConstants;

import adminLoginWindow.AdminLoginWindow;
import cashierLoginWindow.CashierLoginWindow;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow window = new WelcomeWindow();
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
	public WelcomeWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(10, 10, 566, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNSUBookShop = new JLabel("NSU BOOK SHOP");
		lblNSUBookShop.setBackground(new Color(30, 144, 255));
		lblNSUBookShop.setForeground(new Color(0, 255, 0));
		lblNSUBookShop.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblNSUBookShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblNSUBookShop.setBounds(0, 0, 562, 61);
		panel.add(lblNSUBookShop);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(10, 102, 566, 351);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new AdminLoginWindow().setVisible(true);
			}
		});
		btnAdminLogin.setForeground(new Color(0, 0, 0));
		btnAdminLogin.setBackground(new Color(0, 255, 0));
		btnAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdminLogin.setBounds(185, 45, 171, 41);
		panel_1.add(btnAdminLogin);
		
		JButton btnCashierLogin = new JButton("Cashier Login");
		btnCashierLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new CashierLoginWindow().setVisible(true);
			}
		});
		btnCashierLogin.setForeground(Color.BLACK);
		btnCashierLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCashierLogin.setBackground(Color.GREEN);
		btnCashierLogin.setBounds(185, 133, 171, 41);
		panel_1.add(btnCashierLogin);
		
		JButton btnExitApp = new JButton("Exit App");
		btnExitApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExitApp.setForeground(Color.BLACK);
		btnExitApp.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExitApp.setBackground(Color.GREEN);
		btnExitApp.setBounds(185, 216, 171, 41);
		panel_1.add(btnExitApp);
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
