package design_pattern.factory.idcard;
import design_pattern.factory.framework.*;

public class IDCard extends Product {
	private String owner;
	private int serial;
	IDCard(String owner, int serial){
		System.out.println(owner + "(" + serial + ")" + "'s credit card created");
		this.owner = owner;
		this.serial = serial;
	}
	public void use(){
		System.out.println(owner + "(" + serial + ")" + "'s credit card used.");
	}
	public String getOwner(){
		return owner;
	}
	public int getSerial(){
		return serial;
	}
}
