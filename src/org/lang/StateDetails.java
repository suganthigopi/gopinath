package org.lang;
//child Class
public class StateDetails {
	private void southIndia() {
		System.out.println("SouthChennai");
	}
    private void northindia() {
    	System.out.println("NorthChennai");
    }
    public static void main (String args[]) {
    	StateDetails b=new StateDetails();
    	LanguageInfo c=new LanguageInfo();
    	c.tamilLanguage();
    	c.englishLanguage();
    	c.hindiLanguage();
    	b.southIndia();
    	b.northindia();
    }
    
}
