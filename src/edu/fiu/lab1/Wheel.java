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
public class Wheel implements SelfCheckCapable {
	int aluminumcover;
	int cleats;
	int spokes;
	
	/**
	 * The rover moves forward by rolling its wheels forward.
	 */
	void rollforward() {
		
	}
	
	/**
	 * The rover moves backwards by rolling its wheels backwards.
	 */
	void rollbackwards() {
		
	}
	
	/**
	 * The rover turns left by turning its wheels left.
	 */
	void turnleft() {
		
	}
	
	/**
	 * The rover turns right by turning its wheels right. 
	 */
	void turnright() {
		
	}
	
	/**
	 * The rover spins entirely. 
	 */
	void spin() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Wheel";
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

}
