package design_pattern.factory.idcard;
import java.util.*;
import design_pattern.factory.framework.*;

public class IDCardFactory extends Factory{
/*	private List owners = new ArrayList();
	protected Product createProduct(String owner){
		return new IDCard(owner);
	}
	protected void registerProduct(Product product){
		owners.add(((IDCard)product).getOwner());
	}
	public List getOwners(){
		return owners;
	}*/
	private HashMap database = new HashMap();
	private int serial = 100;
	protected synchronized Product createProduct(String owner){
		return new IDCard(owner, serial++);
	}
	protected void registerProduct(Product product){
		IDCard card = (IDCard) product;
		database.put(new Integer(card.getSerial()), card.getOwner());
	}
	public HashMap getDatabase(){
		return database;
	}
}
