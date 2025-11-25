package cashierLoginWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import helperPackage.BookList;
import helperPackage.FileReadWrite;
import mainPackage.BookCollection;
import mainPackage.Invoice;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class MakeInvoiceWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//reducing warning
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	
	BookCollection bookCollection = new FileReadWrite().ReadObjectFromFile("bookCollection.dat");
	BookCollection customCollection = new FileReadWrite().ReadObjectFromFile("customCollection.dat");
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeInvoiceWindow frame = new MakeInvoiceWindow();
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
	public MakeInvoiceWindow() {
		
		
		
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
		
		JLabel lblMakeInvoice = new JLabel("Make Invoice");
		lblMakeInvoice.setHorizontalAlignment(SwingConstants.CENTER);
		lblMakeInvoice.setForeground(Color.GREEN);
		lblMakeInvoice.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblMakeInvoice.setBackground(new Color(30, 144, 255));
		panel.add(lblMakeInvoice);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(288, 102, 288, 351);
		contentPane.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 268, 293);
		panel_1.add(scrollPane);
		
		JTextArea textAreaDisplay = new JTextArea();
		textAreaDisplay.setForeground(new Color(255, 255, 255));
		textAreaDisplay.setBackground(new Color(0, 191, 255));
		scrollPane.setViewportView(textAreaDisplay);
		
		JLabel lblCollectionList = new JLabel("Collection List or Invoice");
		lblCollectionList.setHorizontalAlignment(SwingConstants.CENTER);
		lblCollectionList.setForeground(Color.GREEN);
		lblCollectionList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCollectionList.setBackground(Color.RED);
		lblCollectionList.setBounds(10, 10, 268, 30);
		panel_1.add(lblCollectionList);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(30, 144, 255));
		panel_2.setBounds(10, 102, 268, 351);
		contentPane.add(panel_2);
		
		JLabel lblTotalBooks = new JLabel("Total Books: " + bookCollection.getNumberOfBooks());
		lblTotalBooks.setForeground(Color.GREEN);
		lblTotalBooks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalBooks.setBackground(Color.RED);
		lblTotalBooks.setBounds(10, 10, 151, 30);
		panel_2.add(lblTotalBooks);
		
		JTextArea textAreaIndex = new JTextArea();
		textAreaIndex.setForeground(Color.WHITE);
		textAreaIndex.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textAreaIndex.setBackground(new Color(0, 191, 255));
		textAreaIndex.setBounds(10, 191, 248, 65);
		panel_2.add(textAreaIndex);
		
		JTextPane txtpnInvoice = new JTextPane();
		txtpnInvoice.setText("For Making Invoice Enter Index Number using Comma(,) no space:");
		txtpnInvoice.setForeground(Color.GREEN);
		txtpnInvoice.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtpnInvoice.setEditable(false);
		txtpnInvoice.setBackground(new Color(30, 144, 255));
		txtpnInvoice.setBounds(10, 110, 248, 44);
		panel_2.add(txtpnInvoice);
		
		JCheckBox chckbxBookList = new JCheckBox("Book List");
		chckbxBookList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxBookList.setBackground(Color.GREEN);
		chckbxBookList.setBounds(10, 160, 99, 21);
		panel_2.add(chckbxBookList);
		
		JCheckBox chckbxCustomBookList = new JCheckBox("Custom Book List");
		chckbxCustomBookList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxCustomBookList.setBackground(Color.GREEN);
		chckbxCustomBookList.setBounds(123, 160, 128, 21);
		panel_2.add(chckbxCustomBookList);
		
		JButton btnSeeBookList = new JButton("See Book List");
		btnSeeBookList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaDisplay.setText(new BookList().getBookListWithIndex(bookCollection.getBookCollection(), bookCollection.getNumberOfBooks()));
			}
		});
		btnSeeBookList.setForeground(Color.BLACK);
		btnSeeBookList.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSeeBookList.setBackground(Color.GREEN);
		btnSeeBookList.setBounds(10, 42, 248, 30);
		panel_2.add(btnSeeBookList);
		
		JButton btnYourCustomCollection = new JButton("Your Custom Collection");
		btnYourCustomCollection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaDisplay.setText(new BookList().getBookListWithIndex(customCollection.getBookCollection(), customCollection.getNumberOfBooks()));
			}
		});
		btnYourCustomCollection.setForeground(Color.BLACK);
		btnYourCustomCollection.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnYourCustomCollection.setBackground(Color.GREEN);
		btnYourCustomCollection.setBounds(10, 76, 248, 30);
		panel_2.add(btnYourCustomCollection);
		
		JButton btnCreateInvoice = new JButton("Create Invoice");
		btnCreateInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Invoice invoice = new Invoice();
					String indexString = textAreaIndex.getText();
					ArrayList<String> indexListString = new ArrayList<>(Arrays.asList(indexString.split(",")));
					int[] indexList = new int[indexListString.size()];
					int indexCount = 0;
					for (int i = 0; i < indexListString.size(); i++) {
						indexList[indexCount++] = Integer.parseInt(indexListString.get(i));
					}
					if (chckbxBookList.isSelected()) {
						for (int i = 0; i < indexCount; i++)
							invoice.addBook(bookCollection.accessBook(indexList[i]));
					}

					else if (chckbxCustomBookList.isSelected()) {
						for (int i = 0; i < indexCount; i++)
							invoice.addBook(customCollection.accessBook(indexList[i]));
					}
					textAreaDisplay.setText(invoice.toString());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Unsupported data type!!!", "Something went wrong!",
							JOptionPane.PLAIN_MESSAGE);
				}
				
			}
		});
		btnCreateInvoice.setForeground(Color.BLACK);
		btnCreateInvoice.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCreateInvoice.setBackground(Color.GREEN);
		btnCreateInvoice.setBounds(10, 271, 151, 30);
		panel_2.add(btnCreateInvoice);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					String invoice = textAreaDisplay.getText();
					
					String filename = new Invoice().getDateTimeFile();
					filename = filename.concat(".txt");
					
					
					File file = new File(filename);
					PrintWriter output = new PrintWriter(file);
					output.println(invoice);
					output.close();
					
					JOptionPane.showMessageDialog(null, "Invoice Printed Out Successfully", "Payment Successfull.",
							JOptionPane.PLAIN_MESSAGE);
					
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Something went wrong!!\nInvoice not printed..", "Payment Unsuccessfull!",
							JOptionPane.PLAIN_MESSAGE);
				}
			
			}
		});
		btnPay.setForeground(Color.BLACK);
		btnPay.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPay.setBackground(Color.GREEN);
		btnPay.setBounds(171, 271, 90, 30);
		panel_2.add(btnPay);
		
		JButton btnGoback = new JButton("Go Back");
		btnGoback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CashierWindow.main(null);
			}
		});
		btnGoback.setForeground(Color.BLACK);
		btnGoback.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGoback.setBackground(Color.GREEN);
		btnGoback.setBounds(10, 311, 248, 30);
		panel_2.add(btnGoback);
	}
}
