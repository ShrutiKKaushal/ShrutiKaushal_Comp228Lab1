package exercise1;

import java.util.Scanner;

import javax.swing.JFrame;
//Used for GUI
import javax.swing.JOptionPane;

public class PatientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patientId = JOptionPane.showInputDialog(null, "Please Enter Patient ID: ");	
		String firstName = JOptionPane.showInputDialog(null, "Please Enter First Name: ");	
		String lastName = JOptionPane.showInputDialog(null, "Please Enter Last Name: ");	
		String address = JOptionPane.showInputDialog(null, "Please Enter The Address:");
		String city = JOptionPane.showInputDialog(null, "Please Enter City:");
		String province = JOptionPane.showInputDialog(null, "Please Enter Province:");
		String postalCode = JOptionPane.showInputDialog(null, "Please Enter Postal Code:");
		
		Patient p = new Patient(patientId, firstName, lastName, address, city, province, postalCode);
		JOptionPane.showMessageDialog(null, p.getPatientInfo());
		

	}

}
