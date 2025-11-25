package cashierLoginWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import helperPackage.User;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class ChangePasswordCashierWindow extends JFrame {

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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePasswordCashierWindow frame = new ChangePasswordCashierWindow();
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
	public ChangePasswordCashierWindow() {
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
		
		JLabel lblChangePassword = new JLabel("CHANGE PASSWORD");
		lblChangePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangePassword.setForeground(Color.GREEN);
		lblChangePassword.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblChangePassword.setBackground(new Color(30, 144, 255));
		panel.add(lblChangePassword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(10, 91, 566, 351);
		contentPane.add(panel_1);
		
		JLabel lblNewUserName = new JLabel("New User Name:");
		lblNewUserName.setForeground(Color.GREEN);
		lblNewUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewUserName.setBackground(Color.RED);
		lblNewUserName.setBounds(95, 50, 135, 30);
		panel_1.add(lblNewUserName);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setForeground(Color.GREEN);
		lblNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewPassword.setBackground(Color.RED);
		lblNewPassword.setBounds(95, 101, 135, 30);
		panel_1.add(lblNewPassword);
		
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
		
		JButton btnSaveChanges = new JButton("Save Changes");
		btnSaveChanges.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")//reducing warning
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					
					String userName = textFieldUserName.getText();
					String password = passwordField.getText();
					User user = new User(userName, password);
					File file = new File("cashier.dat");
					
					int confirmation = JOptionPane.showConfirmDialog(
							null,
							"Are you sure you want to change Password?" + "\nThere is no way to reset..",
							"Warning!!",
							JOptionPane.YES_NO_OPTION);

					if(confirmation == 0) {
						ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
						output.writeObject(user);
						output.close();
						JOptionPane.showMessageDialog(null, "Password successfully changed..", "Successfull",
								JOptionPane.PLAIN_MESSAGE);
						dispose();
						CashierWindow.main(null);
					}
					else {
						dispose();
						CashierWindow.main(null);
					}
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Password not changed", "Something went wrong!!",
							JOptionPane.PLAIN_MESSAGE);
				}
			
			}
		});
		btnSaveChanges.setForeground(Color.BLACK);
		btnSaveChanges.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSaveChanges.setBackground(Color.GREEN);
		btnSaveChanges.setBounds(60, 255, 170, 30);
		panel_1.add(btnSaveChanges);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CashierWindow.main(null);
			}
		});
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBackground(Color.GREEN);
		btnCancel.setBounds(357, 255, 128, 30);
		panel_1.add(btnCancel);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSaveChanges.doClick();
			}
		});
		passwordField.setForeground(Color.WHITE);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBackground(new Color(0, 191, 255));
		passwordField.setBounds(230, 101, 163, 30);
		panel_1.add(passwordField);
	}
}
