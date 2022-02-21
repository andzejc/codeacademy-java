package lt.codeacademy;

public class App {
    public static void main(String[] args) {
        // standartinis budas per klases implementacija
        Interfeisas intf = new InterfeisasImpl();
        System.out.println(intf.sumok(2, 3)); // 5

        // Kuriant anonimines klases objekta
        Interfeisas anonim = new Interfeisas() {
            @Override
            public String sumok(int a, int b) {
                return "" + (a + b);
            }
        };
        System.out.println(anonim.sumok(2, 3)); // 5

        // Panaudojam lambda expression by functional interface example
        Interfeisas lambdaAnonim = (int sk1, int sk2) -> {
            return "" + (sk1 + sk2);
        };
        System.out.println(lambdaAnonim.sumok(2, 3)); // 5

        // Make it shorter
        Interfeisas lambdaAnonimShort = (int sk1, int sk2) -> "" + (sk1 + sk2);
        System.out.println(lambdaAnonimShort.sumok(2, 3)); // 5
    }
}
