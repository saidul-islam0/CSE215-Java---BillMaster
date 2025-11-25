package helperPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import mainPackage.BookCollection;

public class FileReadWrite {
	
	
	public BookCollection ReadObjectFromFile(String filepath) {
		
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(filepath));
			
			Object obj = objectIn.readObject();
			BookCollection collection = (BookCollection)obj;
			
//			JOptionPane.showMessageDialog(null, "You can add new Book now.", "Previous Collection Read successfully.",
//					JOptionPane.PLAIN_MESSAGE);
			
			objectIn.close();
			return collection;
			
		} catch (Exception ex) {
			
//			JOptionPane.showMessageDialog(null, "Add your first Book in your Collection.", "Database is Empty",
//					JOptionPane.PLAIN_MESSAGE);
			
			return new BookCollection();
		}
	}
	
	
	
	public User ReadAdmin(String userName, String password) {
		
		try {
			File file = new File("admin.dat");
			
			User user = new User(userName, password);
			
			boolean status = file.exists();
			
			if(status) {
				ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(file));
				
				Object obj = objectIn.readObject();
				user = (User)obj;
				objectIn.close();
			}
			
			else {
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
				output.writeObject(user);
				output.close();
				
				JOptionPane.showMessageDialog(null, "User Name: admin\nPassword: password", "Default ID-Password",
						JOptionPane.PLAIN_MESSAGE);
			}
			
//			JOptionPane.showMessageDialog(null, "You can add new Book now.", "Previous Collection Read successfully.",
//					JOptionPane.PLAIN_MESSAGE);
			return user;
			
		} catch (Exception ex) {
			
			JOptionPane.showMessageDialog(null, "File not Created" + ex.getMessage(), "Something went wrong!!",
					JOptionPane.PLAIN_MESSAGE);
			return new User(userName, password);
		}
	}
	
	
	
public User ReadCashier(String userName, String password) {
		
		try {
			File file = new File("cashier.dat");
			
			User user = new User(userName, password);
			
			boolean status = file.exists();
			
			if(status) {
				ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(file));
				
				Object obj = objectIn.readObject();
				user = (User)obj;
				objectIn.close();
			}
			
			else {
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
				output.writeObject(user);
				output.close();
				
				JOptionPane.showMessageDialog(null, "User Name: cashier\nPassword: password", "Default ID-Password",
						JOptionPane.PLAIN_MESSAGE);
			}
			
//			JOptionPane.showMessageDialog(null, "You can add new Book now.", "Previous Collection Read successfully.",
//					JOptionPane.PLAIN_MESSAGE);
			return user;
			
		} catch (Exception ex) {
			
			JOptionPane.showMessageDialog(null, "File not Created" + ex.getMessage(), "Something went wrong!!",
					JOptionPane.PLAIN_MESSAGE);
			return new User(userName, password);
		}
	}
}
