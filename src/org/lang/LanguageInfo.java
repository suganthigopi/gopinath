package org.lang;
//parent class
public class LanguageInfo {
	public void tamilLanguage() {
		System.out.println("Tamillanguage");
	}
    public void englishLanguage() {
    	System.out.println("Englishlanguage");
}
    public void hindiLanguage() {
    	System.out.println("hindilanguage");
    }
public static void main(String args[]) {
	LanguageInfo a=new LanguageInfo();
	a.tamilLanguage();
	a.englishLanguage();
	a.hindiLanguage();
	
}
	
}
