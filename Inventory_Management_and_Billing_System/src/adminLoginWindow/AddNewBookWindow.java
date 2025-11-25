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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.File;
//import java.io.FileInputStream;//reducing warning
import java.io.FileOutputStream;
//import java.io.ObjectInputStream;//reducing warning
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
//import javax.swing.JFormattedTextField;//reducing warning
//import javax.swing.DropMode;//reducing warning

public class AddNewBookWindow extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewBookWindow frame = new AddNewBookWindow();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })//reducing warning
	public AddNewBookWindow() {
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
		
		JLabel lblAddNewBook = new JLabel("Add New Book");
		lblAddNewBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewBook.setForeground(Color.GREEN);
		lblAddNewBook.setFont(new Font("Jokerman", Font.BOLD, 30));
		lblAddNewBook.setBackground(new Color(30, 144, 255));
		panel.add(lblAddNewBook);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(10, 102, 314, 255);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBookDetails = new JLabel("Book Details");
		lblBookDetails.setForeground(Color.GREEN);
		lblBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBookDetails.setBackground(Color.RED);
		lblBookDetails.setBounds(120, 0, 90, 30);
		panel_1.add(lblBookDetails);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setForeground(Color.GREEN);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitle.setBackground(Color.RED);
		lblTitle.setBounds(10, 35, 50, 30);
		panel_1.add(lblTitle);
		
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setForeground(Color.GREEN);
		lblGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGenre.setBackground(Color.RED);
		lblGenre.setBounds(10, 65, 50, 30);
		panel_1.add(lblGenre);
		
		JLabel lblSubGenre = new JLabel("Sub Genre:");
		lblSubGenre.setForeground(Color.GREEN);
		lblSubGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSubGenre.setBackground(Color.RED);
		lblSubGenre.setBounds(10, 95, 90, 30);
		panel_1.add(lblSubGenre);
		
		JLabel lblPublishedYear = new JLabel("Published Year:");
		lblPublishedYear.setForeground(Color.GREEN);
		lblPublishedYear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPublishedYear.setBackground(Color.RED);
		lblPublishedYear.setBounds(10, 125, 115, 30);
		panel_1.add(lblPublishedYear);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setForeground(Color.GREEN);
		lblIsbn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIsbn.setBackground(Color.RED);
		lblIsbn.setBounds(10, 155, 50, 30);
		panel_1.add(lblIsbn);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setForeground(Color.GREEN);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setBackground(Color.RED);
		lblPrice.setBounds(10, 185, 50, 30);
		panel_1.add(lblPrice);
		
		JLabel lblDiscount = new JLabel("Discount:");
		lblDiscount.setForeground(Color.GREEN);
		lblDiscount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiscount.setBackground(Color.RED);
		lblDiscount.setBounds(10, 215, 76, 30);
		panel_1.add(lblDiscount);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setForeground(Color.WHITE);
		textFieldTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldTitle.setColumns(10);
		textFieldTitle.setBackground(new Color(0, 191, 255));
		textFieldTitle.setBounds(58, 38, 115, 24);
		panel_1.add(textFieldTitle);
		
		textFieldGenre = new JTextField();
		textFieldGenre.setForeground(Color.WHITE);
		textFieldGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldGenre.setColumns(10);
		textFieldGenre.setBackground(new Color(0, 191, 255));
		textFieldGenre.setBounds(68, 68, 115, 24);
		panel_1.add(textFieldGenre);
		
		textFieldSubGenre = new JTextField();
		textFieldSubGenre.setForeground(Color.WHITE);
		textFieldSubGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldSubGenre.setColumns(10);
		textFieldSubGenre.setBackground(new Color(0, 191, 255));
		textFieldSubGenre.setBounds(95, 98, 115, 24);
		panel_1.add(textFieldSubGenre);
		
		textFieldYearOfPublish = new JTextField();
		textFieldYearOfPublish.setForeground(Color.WHITE);
		textFieldYearOfPublish.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldYearOfPublish.setColumns(10);
		textFieldYearOfPublish.setBackground(new Color(0, 191, 255));
		textFieldYearOfPublish.setBounds(127, 128, 90, 24);
		panel_1.add(textFieldYearOfPublish);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setForeground(Color.WHITE);
		textFieldISBN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldISBN.setColumns(10);
		textFieldISBN.setBackground(new Color(0, 191, 255));
		textFieldISBN.setBounds(58, 158, 115, 24);
		panel_1.add(textFieldISBN);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setForeground(Color.WHITE);
		textFieldPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBackground(new Color(0, 191, 255));
		textFieldPrice.setBounds(58, 188, 67, 24);
		panel_1.add(textFieldPrice);
		
		textFieldDiscount = new JTextField();
		textFieldDiscount.setForeground(Color.WHITE);
		textFieldDiscount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldDiscount.setColumns(10);
		textFieldDiscount.setBackground(new Color(0, 191, 255));
		textFieldDiscount.setBounds(82, 218, 67, 24);
		panel_1.add(textFieldDiscount);
		
		JComboBox comboBoxGenre = new JComboBox();
		comboBoxGenre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedValue = comboBoxGenre.getSelectedItem().toString();
				textFieldGenre.setText(selectedValue);
			}
		});
		comboBoxGenre.setBackground(new Color(0, 191, 255));
		comboBoxGenre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxGenre.setModel(new DefaultComboBoxModel(new String[] {"Select Genre", "Fiction", "Non-Fiction"}));
		comboBoxGenre.setBounds(190, 68, 115, 24);
		panel_1.add(comboBoxGenre);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(30, 144, 255));
		panel_2.setBounds(334, 102, 242, 255);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAuthorDetails = new JLabel("Author Details");
		lblAuthorDetails.setForeground(Color.GREEN);
		lblAuthorDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAuthorDetails.setBackground(Color.RED);
		lblAuthorDetails.setBounds(75, 0, 122, 30);
		panel_2.add(lblAuthorDetails);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.GREEN);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBackground(Color.RED);
		lblName.setBounds(10, 35, 50, 30);
		panel_2.add(lblName);
		
		JLabel lblEmailId = new JLabel("Email ID:");
		lblEmailId.setForeground(Color.GREEN);
		lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmailId.setBackground(Color.RED);
		lblEmailId.setBounds(10, 65, 66, 30);
		panel_2.add(lblEmailId);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.GREEN);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender.setBackground(Color.RED);
		lblGender.setBounds(10, 95, 66, 30);
		panel_2.add(lblGender);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.GREEN);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAge.setBackground(Color.RED);
		lblAge.setBounds(10, 125, 50, 30);
		panel_2.add(lblAge);
		
		textFieldName = new JTextField();
		textFieldName.setForeground(Color.WHITE);
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldName.setColumns(10);
		textFieldName.setBackground(new Color(0, 191, 255));
		textFieldName.setBounds(66, 38, 115, 24);
		panel_2.add(textFieldName);
		
		textFieldEmailId = new JTextField();
		textFieldEmailId.setForeground(Color.WHITE);
		textFieldEmailId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldEmailId.setColumns(10);
		textFieldEmailId.setBackground(new Color(0, 191, 255));
		textFieldEmailId.setBounds(86, 68, 115, 24);
		panel_2.add(textFieldEmailId);
		
		textFieldGender = new JTextField();
		textFieldGender.setForeground(Color.WHITE);
		textFieldGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldGender.setColumns(10);
		textFieldGender.setBackground(new Color(0, 191, 255));
		textFieldGender.setBounds(70, 98, 85, 24);
		panel_2.add(textFieldGender);
		
		textFieldAge = new JTextField();
		textFieldAge.setForeground(Color.WHITE);
		textFieldAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldAge.setColumns(10);
		textFieldAge.setBackground(new Color(0, 191, 255));
		textFieldAge.setBounds(49, 128, 66, 24);
		panel_2.add(textFieldAge);
		
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
		panel_2.add(comboBoxGender);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(30, 144, 255));
		panel_3.setBounds(10, 383, 566, 70);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BookCollection bookCollection = new FileReadWrite().ReadObjectFromFile("bookCollection.dat");
				
				try {
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
					
					boolean status = bookCollection.addBook(book);
					
					ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
					output.writeObject(bookCollection);
					output.close();
					
					if (status) {
						JOptionPane.showMessageDialog(null, "Book Added Successfully.", "Successfull",
								JOptionPane.PLAIN_MESSAGE);
						dispose();
						AdminPanelWindow.main(null);
					} else {
						JOptionPane.showMessageDialog(null, "Book not added!!!", "Collection is Full!",
								JOptionPane.PLAIN_MESSAGE);
					}
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Book not added!!!", "Something went wrong!",
							JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBackground(Color.GREEN);
		btnAdd.setBounds(10, 10, 175, 30);
		panel_3.add(btnAdd);
		
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
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBackground(Color.GREEN);
		btnReset.setBounds(195, 10, 175, 30);
		panel_3.add(btnReset);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminPanelWindow.main(null);
			}
		});
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBackground(Color.GREEN);
		btnCancel.setBounds(380, 10, 175, 30);
		panel_3.add(btnCancel);
	}
}

