package design_pattern.template;

public class Main {
	public static void main(String[] args) {
		//CharDisplay 1 instance
		AbstractDisplay d1 = new CharDisplay('H');
		//StringDisplay 1 instance
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		//StringDisplay another 1 instance
		AbstractDisplay d3 = new StringDisplay("ªªªÏªèª¦ª´ª¶ª¤ªÞª¹£¡");
		//Same AbstractDisplay sub class d1,d2,d3.
		//Actual display function is different d1 and d2,d3.
		d1.display();
		d2.display();
		d3.display();
	}
}
