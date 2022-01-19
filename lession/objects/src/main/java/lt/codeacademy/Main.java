package lt.codeacademy;

public class Main {

    String s1;
    String s2, s3;
    String s4, s5, s6 = "test";
    // turi prasideti raide arba _ ar $
    //negali kintamieji vadintis rezervuotais pavadinimais ar skaiciais


    public static void main(String[] args) {
        byte a = 100; // -128 iki 127
//        int b = 3000000000;
        User user = new User();
        User user1 = new User(30, "Jonas");
        User user2 = new User(23, "Arturas");
        System.out.println("userName: " + user.name + " Age: " + user.age);
        user.age = 40;
        user.name = "Antanas";
        System.out.println("userName: " + user.name + " Age: " + user.age);
        System.out.println(user2.fullname);
//        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);

        //--------------------

        String c = "hello";
        int d = c.length();
        System.out.println(d);
        System.out.println("-----------------------------------");
        user1.makeSomeStuff("10");
        System.out.println(user.isTrue);
        System.out.println(user.newStr);
    }
}
