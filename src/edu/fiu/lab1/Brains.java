/**
 * 
 */
package edu.fiu.lab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author aaron
 *
 */
public class Brains implements SelfCheckCapable {
	String processor;
	String memory;
	
	
	/**
	 * The brains control the movement of the rover, which ultimately occurs in the wheels. 
	 * @return
	 */
	Wheel movementcontrol() {
		return null;
		
	}
	
	/**
	 * The Brains of the rover performs a checkup of all systems to identify potential errors or failures. 
	 */
	void fullsystemcheckup() {
		
	}
	
	/**
	 * The brains are also in charge of the handling the communication with NASA operators via the antennas. 
	 */
	Antenna communicate() {
		return null;
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Brains";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
