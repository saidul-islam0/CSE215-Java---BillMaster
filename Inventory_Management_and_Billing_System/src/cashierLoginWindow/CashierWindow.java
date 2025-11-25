package cashierLoginWindow;

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

public class CashierWindow extends JFrame {

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
					CashierWindow frame = new CashierWindow();
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
	public CashierWindow() {
		
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
		
		JLabel lblCashierControl = new JLabel("CASHIER CONTROL");
		lblCashierControl.setHorizontalAlignment(SwingConstants.CENTER);
		lblCashierControl.setForeground(Color.GREEN);
		lblCashierControl.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblCashierControl.setBackground(new Color(30, 144, 255));
		panel.add(lblCashierControl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(10, 102, 566, 351);
		contentPane.add(panel_1);
		
		JButton btnCreateCustomeCollection = new JButton("Create Custome Collection");
		btnCreateCustomeCollection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new CustomCollectionWindow().setVisible(true);
			}
		});
		btnCreateCustomeCollection.setForeground(Color.BLACK);
		btnCreateCustomeCollection.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCreateCustomeCollection.setBackground(Color.GREEN);
		btnCreateCustomeCollection.setBounds(140, 75, 285, 30);
		panel_1.add(btnCreateCustomeCollection);
		
		JButton btnMakeInvoice = new JButton("Make Invoice");
		btnMakeInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MakeInvoiceWindow().setVisible(true);
			}
		});
		btnMakeInvoice.setForeground(Color.BLACK);
		btnMakeInvoice.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMakeInvoice.setBackground(Color.GREEN);
		btnMakeInvoice.setBounds(140, 123, 285, 30);
		panel_1.add(btnMakeInvoice);
		
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
		btnLogOut.setBounds(140, 224, 285, 30);
		panel_1.add(btnLogOut);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ChangePasswordCashierWindow().setVisible(true);
			}
		});
		btnChangePassword.setForeground(Color.BLACK);
		btnChangePassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnChangePassword.setBackground(Color.GREEN);
		btnChangePassword.setBounds(140, 173, 285, 30);
		panel_1.add(btnChangePassword);
	}

}
