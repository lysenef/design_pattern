package design_pattern.adapter;

public class PrintBannerInstance extends PrintInstance{
	private Banner banner;
	public PrintBannerInstance (String string){
		this.banner = new Banner(string);
	}
	public void printWeak(){
		banner.showWithParen();
	}
	public void printStrong(){
		banner.showWithAster();
	}
}
