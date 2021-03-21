/**
 * 
 */
package edu.fiu.lab1;

/**
 * @author aaron
 *
 */
public class Body {
	String computer;
	String electronics;
	String instruments;
	
	/**
	 * The body carries the entire rover.  
	 */
	void carry() {
		
	}
	
	/**
	 * The body protects the brains and other parts of the rover. 
	 */
	void protect() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brains roverbrains = new Brains();
		roverbrains.runSelfCheck();
		
		Wheel roverwheels = new Wheel();
		roverwheels.runSelfCheck();

	}

}
