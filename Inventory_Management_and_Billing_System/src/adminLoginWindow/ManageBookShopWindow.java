package adminLoginWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import helperPackage.BookList;
import helperPackage.FileReadWrite;
import mainPackage.BookCollection;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
//import javax.swing.JTextPane;//reducing warning
//import javax.swing.JFormattedTextField;//reducing warning
//import javax.swing.JScrollBar;//reducing warning
import javax.swing.JScrollPane;

public class ManageBookShopWindow extends JFrame {

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
					ManageBookShopWindow frame = new ManageBookShopWindow();
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
	public ManageBookShopWindow() {
		
		BookCollection bookCollection = new FileReadWrite().ReadObjectFromFile("bookCollection.dat");
		
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
		
		JLabel lblMangeBookShop = new JLabel("Mange Book Shop");
		lblMangeBookShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblMangeBookShop.setForeground(Color.GREEN);
		lblMangeBookShop.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblMangeBookShop.setBackground(new Color(30, 144, 255));
		panel.add(lblMangeBookShop);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(288, 102, 288, 351);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCollectionList = new JLabel("Collection List");
		lblCollectionList.setBounds(75, 10, 118, 30);
		lblCollectionList.setForeground(Color.GREEN);
		lblCollectionList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCollectionList.setBackground(Color.RED);
		panel_1.add(lblCollectionList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 268, 293);
		panel_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(0, 191, 255));
		
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
		
		JLabel lblShorting = new JLabel("Shorting");
		lblShorting.setHorizontalAlignment(SwingConstants.CENTER);
		lblShorting.setForeground(Color.GREEN);
		lblShorting.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblShorting.setBackground(Color.RED);
		lblShorting.setBounds(100, 39, 101, 30);
		panel_2.add(lblShorting);
		
		JButton ShortByIsbn = new JButton("Short By ISBN");
		ShortByIsbn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookCollection.sortByIsbn();
				textArea.setText(new BookList().getBookListFullDetails(bookCollection.getBookCollection(), bookCollection.getNumberOfBooks()));
			}
		});
		
		ShortByIsbn.setForeground(Color.BLACK);
		ShortByIsbn.setFont(new Font("Tahoma", Font.BOLD, 18));
		ShortByIsbn.setBackground(Color.GREEN);
		ShortByIsbn.setBounds(10, 75, 248, 30);
		panel_2.add(ShortByIsbn);
		
		JButton btnShortByPrice = new JButton("Short By Price");
		btnShortByPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookCollection.sortByPrice();;
				textArea.setText(new BookList().getBookListFullDetails(bookCollection.getBookCollection(), bookCollection.getNumberOfBooks()));
			}
		});
		btnShortByPrice.setForeground(Color.BLACK);
		btnShortByPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnShortByPrice.setBackground(Color.GREEN);
		btnShortByPrice.setBounds(10, 120, 248, 30);
		panel_2.add(btnShortByPrice);
		
		JButton btnGoback = new JButton("Go Back");
		btnGoback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminPanelWindow.main(null);
			}
		});
		
		JButton btnShortByYear = new JButton("Year of Publish");
		btnShortByYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookCollection.sortByYearOfPublish();;
				textArea.setText(new BookList().getBookListFullDetails(bookCollection.getBookCollection(), bookCollection.getNumberOfBooks()));
			}
		});
		btnShortByYear.setForeground(Color.BLACK);
		btnShortByYear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnShortByYear.setBackground(Color.GREEN);
		btnShortByYear.setBounds(10, 165, 248, 30);
		panel_2.add(btnShortByYear);
		btnGoback.setForeground(Color.BLACK);
		btnGoback.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGoback.setBackground(Color.GREEN);
		btnGoback.setBounds(130, 311, 128, 30);
		panel_2.add(btnGoback);
		
		JButton btnFilter = new JButton("Filter");
		btnFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new FilterBookListWindow().setVisible(true);
			}
		});
		btnFilter.setForeground(Color.BLACK);
		btnFilter.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFilter.setBackground(Color.GREEN);
		btnFilter.setBounds(10, 210, 248, 30);
		panel_2.add(btnFilter);
		
		JButton btnEditABook = new JButton("Edit a Book Details");
		btnEditABook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new EditBookDetailsWindow().setVisible(true);
			}
		});
		btnEditABook.setForeground(Color.BLACK);
		btnEditABook.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEditABook.setBackground(Color.GREEN);
		btnEditABook.setBounds(10, 255, 248, 30);
		panel_2.add(btnEditABook);
	}
}
