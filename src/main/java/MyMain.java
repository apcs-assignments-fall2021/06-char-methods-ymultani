public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        char x = Character.toLowerCase(ch);
        return x;
    }


    public static char toUpper(char ch) {
        char x = Character.toUpperCase(ch);
        return x;
    }


    public static String removeNumbers(String str) {
        String empty_string = "";

        for (int i = 0; i < str.length(); i++){
            char x = str.charAt(i);
            if (x >= 48 && x<=57){
                continue;
            }
            else{
                empty_string += x;
            }
        }
        return empty_string;
        
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        // ADD SOME TESTING CODE HERE
    }
}
