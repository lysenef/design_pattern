package design_pattern.adapter;

public class PrintBanner extends Banner implements Print{
	//This is adapter.
	public PrintBanner(String string){
		super(string);
	}
	public void printWeak(){
		showWithParen();
	}
	public void printStrong(){
		showWithAster();
	}
}
