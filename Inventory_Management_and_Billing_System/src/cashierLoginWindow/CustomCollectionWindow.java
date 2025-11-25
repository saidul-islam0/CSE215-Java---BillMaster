package cashierLoginWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import helperPackage.BookList;
import helperPackage.FileReadWrite;
import mainPackage.BookCollection;

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
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class CustomCollectionWindow extends JFrame {

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
					CustomCollectionWindow frame = new CustomCollectionWindow();
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
	public CustomCollectionWindow() {
		
		BookCollection bookCollection = new FileReadWrite().ReadObjectFromFile("bookCollection.dat");
		BookCollection customCollection = new FileReadWrite().ReadObjectFromFile("customCollection.dat");
		
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
		
		JLabel lblCustomCollection = new JLabel("Custom Collection");
		lblCustomCollection.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomCollection.setForeground(Color.GREEN);
		lblCustomCollection.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblCustomCollection.setBackground(new Color(30, 144, 255));
		panel.add(lblCustomCollection);
		
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
		textAreaDisplay.setEditable(false);
		scrollPane.setViewportView(textAreaDisplay);
		
		JLabel lblCollectionList = new JLabel("Collection List");
		lblCollectionList.setForeground(Color.GREEN);
		lblCollectionList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCollectionList.setBackground(Color.RED);
		lblCollectionList.setBounds(75, 10, 118, 30);
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
		
		JTextArea textAreaIndex = new JTextArea();
		textAreaIndex.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textAreaIndex.setForeground(new Color(255, 255, 255));
		textAreaIndex.setBackground(new Color(0, 191, 255));
		textAreaIndex.setBounds(10, 137, 248, 119);
		panel_2.add(textAreaIndex);
		
		JTextPane txtpnForMakingCustom = new JTextPane();
		txtpnForMakingCustom.setForeground(new Color(0, 255, 0));
		txtpnForMakingCustom.setBackground(new Color(30, 144, 255));
		txtpnForMakingCustom.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtpnForMakingCustom.setText("For Making Custom Collection Enter Index Number using Comma(,) no space:");
		txtpnForMakingCustom.setEditable(false);
		txtpnForMakingCustom.setBounds(10, 72, 248, 70);
		panel_2.add(txtpnForMakingCustom);
		
		JButton btnCreateCollection = new JButton("Create Collection");
		btnCreateCollection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					String indexString = textAreaIndex.getText();
					
					ArrayList<String> indexListString = new ArrayList<>(Arrays.asList(indexString.split(",")));

					int[] indexList = new int[indexListString.size()];
					int indexCount = 0;
					
					for(int i = 0; i < indexListString.size(); i++) {
						indexList[indexCount++] = Integer.parseInt(indexListString.get(i));
					}
					
					BookCollection customCollection = new BookCollection();
					
					for (int i = 0; i < indexCount; i++)
						customCollection.addBook(bookCollection.accessBook(indexList[i]));
					
					File file = new File("customCollection.dat");
					ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
					output.writeObject(customCollection);
					output.close();
					
					JOptionPane.showMessageDialog(null, "Custom Collection Created Successfully.", "Successfull",
							JOptionPane.PLAIN_MESSAGE);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Custom Collection Not Created!!", "Something went wrong!",
							JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnCreateCollection.setForeground(Color.BLACK);
		btnCreateCollection.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCreateCollection.setBackground(Color.GREEN);
		btnCreateCollection.setBounds(10, 271, 248, 30);
		panel_2.add(btnCreateCollection);
		
		textAreaDisplay.setText("Previus Custom Collection:\n\n" + new BookList().getBookListWithIndex(customCollection.getBookCollection(), customCollection.getNumberOfBooks()));
	}
}
