import java.util.LinkedList;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    Integer shift = null;


    ROT13(Character cs, Character cf) {
        shift = cf - cs;
    }

    ROT13() { }


    public String crypt(String text) throws UnsupportedOperationException {

        return this.encrypt(text);
    }


    public char shiftText(char inputChar){
        if       (inputChar >= 'a' && inputChar <= 'm') inputChar += shift;
        else if  (inputChar >= 'A' && inputChar <= 'M') inputChar += shift;
        else if  (inputChar >= 'n' && inputChar <= 'z') inputChar -= shift;
        else if  (inputChar >= 'N' && inputChar <= 'Z') inputChar -= shift;
        return inputChar;
    }


    public String encrypt(String text) {
        String result = "";
        for(int i = 0; i <text.length(); i++){
            result += shiftText(text.charAt(i));
        }
        return result;
    }


    public String decrypt(String text) {
        String result = "";
        for(int i = 0; i <text.length(); i++){
            result += shiftText(text.charAt(i));
        }
        return result;
    }


    public static String rotate(String s, Character c) {
        LinkedList newString = new LinkedList();
        int counter = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) != c){
                newString.add(s.charAt(i));
                counter++;
            }
            else{
                break;
            }
        }
        String result = s.substring(counter);
        for(int j = 0; j < newString.size(); j++){
            result += newString.get(j);
        }
        return result;
    }

}