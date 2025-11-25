package adminLoginWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import welcomeWindow.WelcomeWindow;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPanelWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//reducing warning
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanelWindow frame = new AdminPanelWindow();
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
	public AdminPanelWindow() {
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
		
		JLabel lblAdminPanel = new JLabel("ADMIN PANEL");
		lblAdminPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminPanel.setForeground(Color.GREEN);
		lblAdminPanel.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblAdminPanel.setBackground(new Color(30, 144, 255));
		panel.add(lblAdminPanel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(10, 102, 566, 351);
		contentPane.add(panel_1);
		
		JButton btnAddNewBook = new JButton("Add New Book");
		btnAddNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AddNewBookWindow().setVisible(true);
			}
		});
		btnAddNewBook.setForeground(Color.BLACK);
		btnAddNewBook.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddNewBook.setBackground(Color.GREEN);
		btnAddNewBook.setBounds(206, 62, 175, 30);
		panel_1.add(btnAddNewBook);
		
		JButton btnManageBookShop = new JButton("Manage Bookshop");
		btnManageBookShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ManageBookShopWindow().setVisible(true);
			}
		});
		btnManageBookShop.setForeground(Color.BLACK);
		btnManageBookShop.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnManageBookShop.setBackground(Color.GREEN);
		btnManageBookShop.setBounds(191, 113, 216, 30);
		panel_1.add(btnManageBookShop);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WelcomeWindow.main(null);
			}
		});
		btnLogOut.setForeground(Color.BLACK);
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogOut.setBackground(Color.GREEN);
		btnLogOut.setBounds(232, 214, 128, 30);
		panel_1.add(btnLogOut);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ChangePasswordWindow().setVisible(true);
			}
		});
		btnChangePassword.setForeground(Color.BLACK);
		btnChangePassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnChangePassword.setBackground(Color.GREEN);
		btnChangePassword.setBounds(191, 164, 216, 30);
		panel_1.add(btnChangePassword);
	}
}
