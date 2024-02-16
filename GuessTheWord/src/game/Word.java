package game;

import java.util.Random;

public class Word {
    private String[] randomWords={"animals","happiness","indefinite","steady",
    		"birthday","extreme","rights",
    		"properties","ceremony","independence","breath",
    		"information","students","employee"};
    private String selectedword;
    private Random random=new Random();
    private char[] letters;
    public Word() {
    	selectedword=randomWords[random.nextInt(randomWords.length)];
    	letters=new char[selectedword.length()];
    }
  
   public String toString() {
	   StringBuilder text=new StringBuilder();
	   for(char letter:letters) {
		   text.append(letter=='\u0000'?'-':letter);
		   text.append(' ');
		   
	   }
	   return text.toString();	   
   }
   
   public boolean isGuessedRight() {
	   for(char letter:letters) {
		   if(letter=='\u0000') {
			   return false;
		   }
	   }
	   return true;
	   
	   
   }

public boolean guess(char letter) {
	
	boolean guessedRight=false;
	for(int i=0;i<selectedword.length();i++) {
		if(letter==selectedword.charAt(i)) {
			letters[i]=letter;
			guessedRight=true;
		}
	}
	return guessedRight;
	
}
}

    
