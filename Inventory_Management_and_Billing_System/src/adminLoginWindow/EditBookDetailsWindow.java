package adminLoginWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import helperPackage.FileReadWrite;
import mainPackage.Author;
import mainPackage.Book;
import mainPackage.BookCollection;
import mainPackage.Fiction;
import mainPackage.NonFiction;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class EditBookDetailsWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//reducing warning
	
	
	private JPanel contentPane;
	private JTextField textFieldTitle;
	private JTextField textFieldGenre;
	private JTextField textFieldSubGenre;
	private JTextField textFieldYearOfPublish;
	private JTextField textFieldISBN;
	private JTextField textFieldPrice;
	private JTextField textFieldDiscount;
	private JTextField textFieldName;
	private JTextField textFieldEmailId;
	private JTextField textFieldGender;
	private JTextField textFieldAge;
	private JTextField textFieldISBNSearch;
	private JTextField textFieldIndex;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditBookDetailsWindow frame = new EditBookDetailsWindow();
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
	public EditBookDetailsWindow() {
		
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
		
		JLabel lblEditBookDetails = new JLabel("Edit Book Details");
		lblEditBookDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditBookDetails.setForeground(Color.GREEN);
		lblEditBookDetails.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblEditBookDetails.setBackground(new Color(30, 144, 255));
		panel.add(lblEditBookDetails);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.BLACK);
		panel_3.setBackground(new Color(30, 144, 255));
		panel_3.setBounds(10, 118, 314, 255);
		contentPane.add(panel_3);
		
		JLabel lblBookDetails = new JLabel("Book Details Index at:");
		lblBookDetails.setForeground(Color.GREEN);
		lblBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBookDetails.setBackground(Color.RED);
		lblBookDetails.setBounds(10, 0, 173, 30);
		panel_3.add(lblBookDetails);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setForeground(Color.GREEN);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitle.setBackground(Color.RED);
		lblTitle.setBounds(10, 35, 50, 30);
		panel_3.add(lblTitle);
		
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setForeground(Color.GREEN);
		lblGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGenre.setBackground(Color.RED);
		lblGenre.setBounds(10, 65, 50, 30);
		panel_3.add(lblGenre);
		
		JLabel lblSubGenre = new JLabel("Sub Genre:");
		lblSubGenre.setForeground(Color.GREEN);
		lblSubGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSubGenre.setBackground(Color.RED);
		lblSubGenre.setBounds(10, 95, 90, 30);
		panel_3.add(lblSubGenre);
		
		JLabel lblPublishedYear = new JLabel("Published Year:");
		lblPublishedYear.setForeground(Color.GREEN);
		lblPublishedYear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPublishedYear.setBackground(Color.RED);
		lblPublishedYear.setBounds(10, 125, 115, 30);
		panel_3.add(lblPublishedYear);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setForeground(Color.GREEN);
		lblIsbn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIsbn.setBackground(Color.RED);
		lblIsbn.setBounds(10, 155, 50, 30);
		panel_3.add(lblIsbn);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setForeground(Color.GREEN);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setBackground(Color.RED);
		lblPrice.setBounds(10, 185, 50, 30);
		panel_3.add(lblPrice);
		
		JLabel lblDiscount = new JLabel("Discount:");
		lblDiscount.setForeground(Color.GREEN);
		lblDiscount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiscount.setBackground(Color.RED);
		lblDiscount.setBounds(10, 215, 76, 30);
		panel_3.add(lblDiscount);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setForeground(Color.WHITE);
		textFieldTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldTitle.setColumns(10);
		textFieldTitle.setBackground(new Color(0, 191, 255));
		textFieldTitle.setBounds(58, 38, 115, 24);
		panel_3.add(textFieldTitle);
		
		textFieldGenre = new JTextField();
		textFieldGenre.setForeground(Color.WHITE);
		textFieldGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldGenre.setColumns(10);
		textFieldGenre.setBackground(new Color(0, 191, 255));
		textFieldGenre.setBounds(68, 68, 115, 24);
		panel_3.add(textFieldGenre);
		
		textFieldSubGenre = new JTextField();
		textFieldSubGenre.setForeground(Color.WHITE);
		textFieldSubGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldSubGenre.setColumns(10);
		textFieldSubGenre.setBackground(new Color(0, 191, 255));
		textFieldSubGenre.setBounds(95, 98, 115, 24);
		panel_3.add(textFieldSubGenre);
		
		textFieldYearOfPublish = new JTextField();
		textFieldYearOfPublish.setForeground(Color.WHITE);
		textFieldYearOfPublish.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldYearOfPublish.setColumns(10);
		textFieldYearOfPublish.setBackground(new Color(0, 191, 255));
		textFieldYearOfPublish.setBounds(127, 128, 90, 24);
		panel_3.add(textFieldYearOfPublish);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setForeground(Color.WHITE);
		textFieldISBN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldISBN.setColumns(10);
		textFieldISBN.setBackground(new Color(0, 191, 255));
		textFieldISBN.setBounds(58, 158, 115, 24);
		panel_3.add(textFieldISBN);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setForeground(Color.WHITE);
		textFieldPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBackground(new Color(0, 191, 255));
		textFieldPrice.setBounds(58, 188, 67, 24);
		panel_3.add(textFieldPrice);
		
		textFieldDiscount = new JTextField();
		textFieldDiscount.setForeground(Color.WHITE);
		textFieldDiscount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldDiscount.setColumns(10);
		textFieldDiscount.setBackground(new Color(0, 191, 255));
		textFieldDiscount.setBounds(82, 218, 67, 24);
		panel_3.add(textFieldDiscount);
		
		JComboBox comboBoxGenre = new JComboBox();
		comboBoxGenre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedValue = comboBoxGenre.getSelectedItem().toString();
				textFieldGenre.setText(selectedValue);
			}
		});
		comboBoxGenre.setModel(new DefaultComboBoxModel(new String[] {"Select Genre", "Fiction", "Non-Fiction"}));
		comboBoxGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxGenre.setBackground(new Color(0, 191, 255));
		comboBoxGenre.setBounds(190, 68, 115, 24);
		panel_3.add(comboBoxGenre);
		
		textFieldIndex = new JTextField();
		textFieldIndex.setEditable(false);
		textFieldIndex.setForeground(Color.WHITE);
		textFieldIndex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldIndex.setColumns(10);
		textFieldIndex.setBackground(new Color(0, 191, 255));
		textFieldIndex.setBounds(175, 0, 50, 30);
		panel_3.add(textFieldIndex);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(30, 144, 255));
		panel_4.setBounds(334, 118, 242, 255);
		contentPane.add(panel_4);
		
		JLabel lblAuthorDetails = new JLabel("Author Details");
		lblAuthorDetails.setForeground(Color.GREEN);
		lblAuthorDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAuthorDetails.setBackground(Color.RED);
		lblAuthorDetails.setBounds(75, 0, 122, 30);
		panel_4.add(lblAuthorDetails);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.GREEN);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBackground(Color.RED);
		lblName.setBounds(10, 35, 50, 30);
		panel_4.add(lblName);
		
		JLabel lblEmailId = new JLabel("Email ID:");
		lblEmailId.setForeground(Color.GREEN);
		lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmailId.setBackground(Color.RED);
		lblEmailId.setBounds(10, 65, 66, 30);
		panel_4.add(lblEmailId);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.GREEN);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender.setBackground(Color.RED);
		lblGender.setBounds(10, 95, 66, 30);
		panel_4.add(lblGender);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.GREEN);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAge.setBackground(Color.RED);
		lblAge.setBounds(10, 125, 50, 30);
		panel_4.add(lblAge);
		
		textFieldName = new JTextField();
		textFieldName.setForeground(Color.WHITE);
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldName.setColumns(10);
		textFieldName.setBackground(new Color(0, 191, 255));
		textFieldName.setBounds(66, 38, 115, 24);
		panel_4.add(textFieldName);
		
		textFieldEmailId = new JTextField();
		textFieldEmailId.setForeground(Color.WHITE);
		textFieldEmailId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldEmailId.setColumns(10);
		textFieldEmailId.setBackground(new Color(0, 191, 255));
		textFieldEmailId.setBounds(86, 68, 115, 24);
		panel_4.add(textFieldEmailId);
		
		textFieldGender = new JTextField();
		textFieldGender.setForeground(Color.WHITE);
		textFieldGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldGender.setColumns(10);
		textFieldGender.setBackground(new Color(0, 191, 255));
		textFieldGender.setBounds(70, 98, 85, 24);
		panel_4.add(textFieldGender);
		
		textFieldAge = new JTextField();
		textFieldAge.setForeground(Color.WHITE);
		textFieldAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldAge.setColumns(10);
		textFieldAge.setBackground(new Color(0, 191, 255));
		textFieldAge.setBounds(49, 128, 66, 24);
		panel_4.add(textFieldAge);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedValue = comboBoxGender.getSelectedItem().toString();
				textFieldGender.setText(selectedValue);
			}
		});
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBoxGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxGender.setBackground(new Color(0, 191, 255));
		comboBoxGender.setBounds(160, 98, 78, 24);
		panel_4.add(comboBoxGender);
		
		JButton btnRemoveThisBook = new JButton("Remove this Book?");
		btnRemoveThisBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmation = JOptionPane.showConfirmDialog(
					    null,
					    "Are you sure you want to delete this?" + "\nThis operation can't be undone.",
					    "Warning!!",
					    JOptionPane.YES_NO_OPTION);
				if(confirmation == 0) {
					try {
						int index = Integer.parseInt(textFieldIndex.getText());
						BookCollection bookCollection = new FileReadWrite().ReadObjectFromFile("bookCollection.dat");
						File file = new File("bookCollection.dat");
						boolean status = bookCollection.removeBook(index);
						ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
						output.writeObject(bookCollection);
						output.close();
						if (status) {
							JOptionPane.showMessageDialog(null, "Book deleted successfully", "Successful",
									JOptionPane.PLAIN_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Book not deleted", "Something went wrong!",
									JOptionPane.PLAIN_MESSAGE);
						} 
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Book not deleted", "Something went wrong!",
								JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
		});
		btnRemoveThisBook.setForeground(Color.BLACK);
		btnRemoveThisBook.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRemoveThisBook.setBackground(Color.GREEN);
		btnRemoveThisBook.setBounds(10, 215, 228, 30);
		panel_4.add(btnRemoveThisBook);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(30, 144, 255));
		panel_5.setBounds(10, 383, 566, 70);
		contentPane.add(panel_5);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int index = Integer.parseInt(textFieldIndex.getText());
				
				try {
					BookCollection bookCollection = new FileReadWrite().ReadObjectFromFile("bookCollection.dat");
					File file = new File("bookCollection.dat");
					
					//getting Book Details
					String title = textFieldTitle.getText();
					String genre = textFieldGenre.getText();
					String subGenre = textFieldSubGenre.getText();
					String isbn = textFieldISBN.getText();
					//Getting Author Details
					String name = textFieldName.getText();
					String emailId = textFieldEmailId.getText();
					String gender = textFieldGender.getText();
					//can throw exception
					double price = Double.parseDouble(textFieldPrice.getText());
					double discount = Double.parseDouble(textFieldDiscount.getText());
					int yearOfPublish = Integer.parseInt(textFieldYearOfPublish.getText());
					int age = Integer.parseInt(textFieldAge.getText());
					
					Author author = new Author(name, emailId, age, gender);
					Book book;
					
					if (genre.equals("Fiction"))
						book = new Book(title, price, author, discount, new Fiction(subGenre), isbn, yearOfPublish);
					else
						book = new Book(title, price, author, discount, new NonFiction(subGenre), isbn, yearOfPublish);
					
					
					boolean status = bookCollection.replaceBook(book, index);
					
					ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
					output.writeObject(bookCollection);
					output.close();
					
					if (status) {
						JOptionPane.showMessageDialog(null, "Book Updated Successfully.", "Successfull",
								JOptionPane.PLAIN_MESSAGE);
						dispose();
						ManageBookShopWindow.main(null);
					} else {
						JOptionPane.showMessageDialog(null, "Book not Updated!!!", "Wrong Index!",
								JOptionPane.PLAIN_MESSAGE);
					}
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Book not Updated!!!", "Something went wrong!",
							JOptionPane.PLAIN_MESSAGE);
				}
			
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBackground(Color.GREEN);
		btnUpdate.setBounds(10, 10, 175, 30);
		panel_5.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBoxGenre.setSelectedIndex(0);
				comboBoxGender.setSelectedIndex(0);
				
				textFieldTitle.setText(null);
				textFieldGenre.setText(null);
				textFieldSubGenre.setText(null);
				textFieldYearOfPublish.setText(null);
				textFieldISBN.setText(null);
				textFieldPrice.setText(null);
				textFieldDiscount.setText(null);
				textFieldName.setText(null);
				textFieldEmailId.setText(null);
				textFieldGender.setText(null);
				textFieldAge.setText(null);
				textFieldIndex.setText(null);
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBackground(Color.GREEN);
		btnReset.setBounds(195, 10, 175, 30);
		panel_5.add(btnReset);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ManageBookShopWindow.main(null);
			}
		});
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBackground(Color.GREEN);
		btnCancel.setBounds(380, 10, 175, 30);
		panel_5.add(btnCancel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(30, 144, 255));
		panel_2.setBounds(10, 75, 566, 37);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEnterIsbnNumber = new JLabel("Enter ISBN Number");
		lblEnterIsbnNumber.setForeground(Color.GREEN);
		lblEnterIsbnNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnterIsbnNumber.setBackground(Color.RED);
		lblEnterIsbnNumber.setBounds(10, 0, 145, 30);
		panel_2.add(lblEnterIsbnNumber);
		
		textFieldISBNSearch = new JTextField();
		textFieldISBNSearch.setForeground(Color.WHITE);
		textFieldISBNSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldISBNSearch.setColumns(10);
		textFieldISBNSearch.setBackground(new Color(0, 191, 255));
		textFieldISBNSearch.setBounds(155, 3, 242, 24);
		panel_2.add(textFieldISBNSearch);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BookCollection bookCollection = new FileReadWrite().ReadObjectFromFile("bookCollection.dat");
					
					String ISBN = textFieldISBNSearch.getText();
					int index = bookCollection.searchBook(ISBN);
					textFieldIndex.setText(String.valueOf(index));
					textFieldTitle.setText(bookCollection.accessBook(index).getName());
					textFieldGenre.setText(bookCollection.accessBook(index).getGenre().getGenre());
					textFieldSubGenre.setText(bookCollection.accessBook(index).getGenre().getSubGenre());
					textFieldYearOfPublish.setText(String.valueOf(bookCollection.accessBook(index).getYearOfPublish()));
					textFieldISBN.setText(bookCollection.accessBook(index).getIsbn());
					textFieldPrice.setText(String.valueOf(bookCollection.accessBook(index).getPrice()));
					textFieldDiscount.setText(String.valueOf(bookCollection.accessBook(index).getPercentageDiscount()));
					textFieldName.setText(bookCollection.accessBook(index).getWriter().getName());
					textFieldEmailId.setText(bookCollection.accessBook(index).getWriter().getEmailId());
					textFieldGender.setText(bookCollection.accessBook(index).getWriter().getGender());
					textFieldAge.setText(String.valueOf(bookCollection.accessBook(index).getWriter().getAge()));
					if (bookCollection.accessBook(index).getGenre().getGenre().equals("Fiction"))
						comboBoxGenre.setSelectedIndex(1);
					else
						comboBoxGenre.setSelectedIndex(2);
					if (bookCollection.accessBook(index).getWriter().getGender().equals("Male"))
						comboBoxGender.setSelectedIndex(1);
					else
						comboBoxGender.setSelectedIndex(2);
				} catch (Exception e2) {
					textFieldIndex.setText(null);
					
					JOptionPane.showMessageDialog(null, "Book not found", "Something went wrong!",
							JOptionPane.PLAIN_MESSAGE);
					
				}
			}
		});
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBackground(Color.GREEN);
		btnSearch.setBounds(419, 2, 125, 24);
		panel_2.add(btnSearch);
	}

}
