package design_pattern.factory;
import design_pattern.factory.framework.*;
import design_pattern.factory.idcard.*;

public class Main {
	public static void main(String[] args){
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Momotaro");
		Product card2 = factory.create("Taro");
		Product card3 = factory.create("Kintaro");
		card1.use();
		card2.use();
		card3.use();
	}
}
