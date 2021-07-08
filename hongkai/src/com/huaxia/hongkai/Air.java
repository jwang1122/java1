package com.huaxia.hongkai;

/** 
 * Abstract object in real world to our class (Abstraction)
 * you only include the attribute or characteristics interesting you.
 * 
 * @author John
 *
 */
public class Air {
	boolean isPoison;
	String type;
	double smogSize; 
	double OxygenPercentage;
	double NitrogenPercentage;
	
	Air(boolean isPoison, String type, double smogSize){
		this.isPoison = isPoison;
		this.type = type;
		this.smogSize = smogSize;
	}
	
	public String toString() {
		return "isPoison=" + this.isPoison + ", type=" + this.type;
	}
	
	public void blow() {
		System.out.println("Blow the air now... ...");
	}
	
	public void pumpFlatTire() {
		System.out.println("pump air into flat tire... ...");
	}
	
	public static void main(String[] args) {
		Air air1 = new Air(false, "Oxygen", 0.25);
		System.out.println(air1);
		air1.blow();
		air1.pumpFlatTire();
		System.out.println();

		Air air2 = new Air(true, "carbon dioxide", 0.0);
		System.out.println(air2);
		air2.blow();
		air2.pumpFlatTire();
	}

}
