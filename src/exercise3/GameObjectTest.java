package exercise3;

import javax.swing.JOptionPane;

public class GameObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double centerX = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Value of X-Center: "));
		double centerY = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Value of Y-Center: "));
		double velocity = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Value of Velocity: "));
		Boolean status = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Is object Alive? (Enter True or False): "));
		double rotation = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Angle of Rotation:"));
		
		// Instantiating gameObject
		GameObject gObject = new GameObject(centerX, centerY, velocity, status, rotation);
		gObject.getGameObject(); 
		
		
		
	}

}
