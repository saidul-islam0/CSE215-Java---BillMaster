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
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FilterBookListWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//reducing warning
	
	private JPanel contentPane;
	private JTextField textFieldAgeStart;
	private JTextField textFieldAgeEnd;
	private JTextField textFieldYearOfPublishStart;
	private JTextField textFieldYearOfPublishEnd;
	private JTextField textFieldPriceStart;
	private JTextField textFieldPriceEnd;
	private JTextField textFieldDiscountStart;
	private JTextField textFieldDiscountEnd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilterBookListWindow frame = new FilterBookListWindow();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })//reducing warning
	public FilterBookListWindow() {
		
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
		
		JLabel lblFilterBookList = new JLabel("Filter Book List");
		lblFilterBookList.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilterBookList.setForeground(Color.GREEN);
		lblFilterBookList.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblFilterBookList.setBackground(new Color(30, 144, 255));
		panel.add(lblFilterBookList);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(288, 102, 288, 351);
		contentPane.add(panel_1);
		
		JLabel lblCollectionList = new JLabel("Collection List");
		lblCollectionList.setForeground(Color.GREEN);
		lblCollectionList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCollectionList.setBackground(Color.RED);
		lblCollectionList.setBounds(75, 10, 118, 30);
		panel_1.add(lblCollectionList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 268, 293);
		panel_1.add(scrollPane);
		
		JTextArea textAreaDisplay = new JTextArea();
		textAreaDisplay.setForeground(Color.WHITE);
		textAreaDisplay.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textAreaDisplay.setEditable(false);
		textAreaDisplay.setBackground(new Color(0, 191, 255));
		scrollPane.setViewportView(textAreaDisplay);
		
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
		
		JLabel lblFromTo = new JLabel("From - To");
		lblFromTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFromTo.setForeground(Color.GREEN);
		lblFromTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFromTo.setBackground(Color.RED);
		lblFromTo.setBounds(154, 10, 101, 30);
		panel_2.add(lblFromTo);
		
		JCheckBox chckbxAuthorAge = new JCheckBox("Author's Age");
		chckbxAuthorAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxAuthorAge.setBackground(new Color(0, 255, 0));
		chckbxAuthorAge.setBounds(6, 46, 138, 21);
		panel_2.add(chckbxAuthorAge);
		
		textFieldAgeStart = new JTextField();
		textFieldAgeStart.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldAgeStart.setBounds(164, 46, 42, 21);
		panel_2.add(textFieldAgeStart);
		textFieldAgeStart.setColumns(10);
		
		textFieldAgeEnd = new JTextField();
		textFieldAgeEnd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldAgeEnd.setColumns(10);
		textFieldAgeEnd.setBounds(216, 46, 42, 21);
		panel_2.add(textFieldAgeEnd);
		
		JCheckBox chckbxAuthorsGender = new JCheckBox("Author's Gender");
		chckbxAuthorsGender.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxAuthorsGender.setBackground(Color.GREEN);
		chckbxAuthorsGender.setBounds(6, 76, 138, 21);
		panel_2.add(chckbxAuthorsGender);
		
		JCheckBox chckbxPrice = new JCheckBox("Price");
		chckbxPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxPrice.setBackground(Color.GREEN);
		chckbxPrice.setBounds(6, 166, 138, 21);
		panel_2.add(chckbxPrice);
		
		JCheckBox chckbxGenre = new JCheckBox("Genre");
		chckbxGenre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxGenre.setBackground(Color.GREEN);
		chckbxGenre.setBounds(6, 106, 138, 21);
		panel_2.add(chckbxGenre);
		
		JCheckBox chckbxYearOfPublish = new JCheckBox("Year of Publish");
		chckbxYearOfPublish.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxYearOfPublish.setBackground(Color.GREEN);
		chckbxYearOfPublish.setBounds(6, 136, 138, 21);
		panel_2.add(chckbxYearOfPublish);
		
		JCheckBox chckbxDiscount = new JCheckBox("Discount");
		chckbxDiscount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxDiscount.setBackground(Color.GREEN);
		chckbxDiscount.setBounds(6, 196, 138, 21);
		panel_2.add(chckbxDiscount);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JCheckBox chckbxShortBy = new JCheckBox("Short By");
		chckbxShortBy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxShortBy.setBackground(Color.GREEN);
		chckbxShortBy.setBounds(6, 226, 138, 21);
		panel_2.add(chckbxShortBy);
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBoxGender.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxGender.setBackground(new Color(0, 191, 255));
		comboBoxGender.setBounds(164, 76, 93, 21);
		panel_2.add(comboBoxGender);
		
		JComboBox comboBoxGenre = new JComboBox();
		comboBoxGenre.setModel(new DefaultComboBoxModel(new String[] {"Select Genre", "Fiction", "Non-Fiction"}));
		comboBoxGenre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxGenre.setBackground(new Color(0, 191, 255));
		comboBoxGenre.setBounds(164, 106, 93, 21);
		panel_2.add(comboBoxGenre);
		
		textFieldYearOfPublishStart = new JTextField();
		textFieldYearOfPublishStart.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldYearOfPublishStart.setColumns(10);
		textFieldYearOfPublishStart.setBounds(164, 136, 42, 21);
		panel_2.add(textFieldYearOfPublishStart);
		
		textFieldYearOfPublishEnd = new JTextField();
		textFieldYearOfPublishEnd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldYearOfPublishEnd.setColumns(10);
		textFieldYearOfPublishEnd.setBounds(216, 136, 42, 21);
		panel_2.add(textFieldYearOfPublishEnd);
		
		textFieldPriceStart = new JTextField();
		textFieldPriceStart.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldPriceStart.setColumns(10);
		textFieldPriceStart.setBounds(164, 166, 42, 21);
		panel_2.add(textFieldPriceStart);
		
		textFieldPriceEnd = new JTextField();
		textFieldPriceEnd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldPriceEnd.setColumns(10);
		textFieldPriceEnd.setBounds(216, 166, 42, 21);
		panel_2.add(textFieldPriceEnd);
		
		textFieldDiscountStart = new JTextField();
		textFieldDiscountStart.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldDiscountStart.setColumns(10);
		textFieldDiscountStart.setBounds(164, 196, 42, 21);
		panel_2.add(textFieldDiscountStart);
		
		JComboBox comboBoxShort = new JComboBox();
		comboBoxShort.setModel(new DefaultComboBoxModel(new String[] {"None", "ISBN", "Price", "Year of Publish"}));
		comboBoxShort.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBoxShort.setBackground(new Color(0, 191, 255));
		comboBoxShort.setBounds(164, 226, 91, 21);
		panel_2.add(comboBoxShort);
		
		textFieldDiscountEnd = new JTextField();
		textFieldDiscountEnd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldDiscountEnd.setColumns(10);
		textFieldDiscountEnd.setBounds(216, 196, 42, 21);
		panel_2.add(textFieldDiscountEnd);
		
		JButton btnFilter = new JButton("Filter");
		btnFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				BookCollection collection = new FileReadWrite().ReadObjectFromFile("bookCollection.dat");
				
				try {
					if (chckbxAuthorAge.isSelected()) {
						int ageStart = Integer.parseInt(textFieldAgeStart.getText());
						int ageEnd = Integer.parseInt(textFieldAgeEnd.getText());
						for (int i = 0; i < collection.getNumberOfBooks(); i++) {
							int age = collection.accessBook(i).getWriter().getAge();
							if (age < ageStart || age > ageEnd)
								collection.removeBook(i--);
						}
					}
					
					if (chckbxAuthorsGender.isSelected()) {
						String gender = comboBoxGender.getSelectedItem().toString();
						for (int i = 0; i < collection.getNumberOfBooks(); i++) {
							if (!collection.accessBook(i).getWriter().getGender().equals(gender))
								collection.removeBook(i--);
						}
					}
					
					if (chckbxGenre.isSelected()) {
						String genre = comboBoxGenre.getSelectedItem().toString();
						for (int i = 0; i < collection.getNumberOfBooks(); i++) {
							if (!collection.accessBook(i).getGenre().getGenre().equals(genre))
								collection.removeBook(i--);
						}
					}
					
					if (chckbxYearOfPublish.isSelected()) {
						int yearOfPublishStart = Integer.parseInt(textFieldYearOfPublishStart.getText());
						int yearOfPublishEnd = Integer.parseInt(textFieldYearOfPublishEnd.getText());
						for (int i = 0; i < collection.getNumberOfBooks(); i++) {
							int year = collection.accessBook(i).getYearOfPublish();
							if (year < yearOfPublishStart || year > yearOfPublishEnd)
								collection.removeBook(i--);
						}
					}
					
					if (chckbxPrice.isSelected()) {
						double priceStart = Double.parseDouble(textFieldPriceStart.getText());
						double priceEnd = Double.parseDouble(textFieldPriceEnd.getText());
						for (int i = 0; i < collection.getNumberOfBooks(); i++) {
							double price = collection.accessBook(i).getPrice();
							if (price < priceStart || price > priceEnd)
								collection.removeBook(i--);
						}
					}
					
					if (chckbxDiscount.isSelected()) {
						double discountStart = Double.parseDouble(textFieldDiscountStart.getText());
						double discountEnd = Double.parseDouble(textFieldDiscountEnd.getText());
						for (int i = 0; i < collection.getNumberOfBooks(); i++) {
							double discount = collection.accessBook(i).getPercentageDiscount();
							if (discount < discountStart || discount > discountEnd)
								collection.removeBook(i--);
						}
					}
					
					
					if (chckbxShortBy.isSelected()) {
						String shortBy = comboBoxShort.getSelectedItem().toString();
						if (shortBy.equals("ISBN"))
							collection.sortByIsbn();
						else if (shortBy.equals("Price"))
							collection.sortByPrice();
						else if (shortBy.equals("Year of Publish"))
							collection.sortByYearOfPublish();
					}
					
					textAreaDisplay.setText(new BookList().getBookListFullDetails(collection.getBookCollection(),
							collection.getNumberOfBooks()));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Unsupported Input.. Please Try Again", "Something went wrong!",
							JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnFilter.setForeground(Color.BLACK);
		btnFilter.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFilter.setBackground(Color.GREEN);
		btnFilter.setBounds(10, 271, 104, 30);
		panel_2.add(btnFilter);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldAgeStart.setText(null);
				textFieldAgeEnd.setText(null);
				
				textFieldYearOfPublishStart.setText(null);
				textFieldYearOfPublishEnd.setText(null);
				
				textFieldPriceStart.setText(null);
				textFieldPriceEnd.setText(null);
				
				textFieldDiscountStart.setText(null);
				textFieldDiscountEnd.setText(null);
				
				comboBoxGender.setSelectedIndex(0);
				comboBoxGenre.setSelectedIndex(0);
				comboBoxShort.setSelectedIndex(0);
				
				chckbxAuthorAge.setSelected(false);
				chckbxAuthorsGender.setSelected(false);
				chckbxGenre.setSelected(false);
				chckbxYearOfPublish.setSelected(false);
				chckbxPrice.setSelected(false);
				chckbxDiscount.setSelected(false);
				chckbxShortBy.setSelected(false);
				
				
				BookCollection collection = new FileReadWrite().ReadObjectFromFile("bookCollection.dat");
				textAreaDisplay.setText(new BookList().getBookListFullDetails(collection.getBookCollection(), collection.getNumberOfBooks()));
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBackground(Color.GREEN);
		btnReset.setBounds(154, 271, 104, 30);
		panel_2.add(btnReset);
		
		JButton btnGoback = new JButton("Go Back");
		btnGoback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ManageBookShopWindow.main(null);
			}
		});
		btnGoback.setForeground(Color.BLACK);
		btnGoback.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGoback.setBackground(Color.GREEN);
		btnGoback.setBounds(10, 311, 248, 30);
		panel_2.add(btnGoback);
	}
}
