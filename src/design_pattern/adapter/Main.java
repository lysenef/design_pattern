package design_pattern.adapter;

import java.io.IOException;

public class Main {
	//This is client.
	public static void main(String[] args){
		//Interface
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
		//Abstract class
		PrintInstance pInstance = new PrintBannerInstance("Hello Instance");
		pInstance.printWeak();
		pInstance.printStrong();
		
		//Adapter pattern example.
		FileIO f = new FileProperties();
		try{
			f.readFormFile("C:/Users/lysen/workspace/design_pattern/etc/file.txt");
			f.setValue("year", "2017");
			f.setValue("month", "02");
			f.setValue("day", "11");
			f.writeToFile("C:/Users/lysen/workspace/design_pattern/etc/newfile.txt");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
