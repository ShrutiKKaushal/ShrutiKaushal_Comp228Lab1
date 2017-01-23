package exercise3;

import javax.swing.JOptionPane;
public class GameObject {
	
	//Instance Variables
	
	private double objectCenterX;
	private double objectCenterY;
	private double objectVelocity;
	private boolean objectAlive;
	private double objectRotation;
	
	//Constructor
	public GameObject(double objectCenterX, double objectCenterY, double objectVelocity, 
			boolean objectAlive, double objectRotation) {
		
		this.objectCenterX = objectCenterX;
		this.objectCenterY = objectCenterY;
		this.objectVelocity = objectVelocity;
		this.objectAlive = objectAlive;
		this.objectRotation = objectRotation;	
	}
	
	//Default Constructor
	public GameObject(){
		objectCenterX = 1;
		objectCenterY = 2;
		objectVelocity = 5.2;
		objectAlive = true;
		objectRotation = 45;
	}
	
	//Get Methods
	public double getObjectCenterX(){
		return objectCenterX;
	}
	
	public double getObjectCenterY(){
		return objectCenterY;
	}
	
	public double getObjectVelocity(){
		return objectVelocity;
	}
	
	public boolean getObjectAlive(){
		return objectAlive;
	}
	
	public double getObjectRotation(){
		return objectRotation;
	}
	
	//Set Method
	// In order to set status of object to true if velocity is more than 0, otherwise, it will be set to false
	public void setObjectAlive(boolean objectAlive) {
		this.objectAlive = objectAlive; }
	
	//Method 
	public void getGameObject() {
		String message = String.format("The values provided are:%n Center: (%s,%s);%n Velocity: %s;%n Alive: %s;%n Rotation: %s;",getObjectCenterX(), getObjectCenterY(), getObjectVelocity(), getObjectAlive(), getObjectRotation());
		JOptionPane.showMessageDialog(null, message);
	}
}
