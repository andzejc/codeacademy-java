package lt.codeacademy;

public class Main {
    public static void main(String[] args) {
        System.out.println(String.format("Mano vardas %s man yra %d metai", "Andzej", 34));
        System.out.println(String.format("|%20d|", 99));
        System.out.println(String.format("|%-20d|", 99));
        String isTrue = String.format("%b", null);
        String isTrue2 = String.format("%s", 10);
        System.out.println(isTrue);
        System.out.println(isTrue2);
        System.out.println("Hello\tworld");
    }
}


//%b any type
//%c char
//%d int,byte, short
//%f float
//%s any type

// \t Insert a tab in the text at this point
// \n new line
// \' Insert a single quote character in the text at this point.
// \" Insert a double quote character in the text at this point.
// \\ Insert a backslash character in the text at this point.
