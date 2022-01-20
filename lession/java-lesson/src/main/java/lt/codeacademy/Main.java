package lt.codeacademy;

public class Main {
    public static void main(String[] args) {
        Seasons seasons = Seasons.FALL;
        System.out.println(seasons);
        System.out.println(Seasons.FALL == seasons);
        System.out.println("---------1------------");
        System.out.println(Seasons.SUMMER == seasons);
        System.out.println("----------2-----------");
        for (Seasons seasons1: Seasons.values()) {
            System.out.println(seasons1.name() + seasons1.ordinal());
        }
        System.out.println("-----------3----------");
        System.out.println(seasons.ordinal() == 3);
//      System.out.println(Seasons.SPRING == 2); not possible
        System.out.println("-----------4----------");
        Seasons s = Seasons.valueOf("WINTER");
//      Seasons s2 = Seasons.valueOf("winter");// not possible
        System.out.println(s);
        System.out.println("-----------5----------");
        PeopleWithDriverLicense user = new PeopleWithDriverLicense();
        user.setName("Vilius");
        user.setAge(30);
        user.setHaveCar(true);
        user.setCarBrand("BMW");
        System.out.println("-----------6----------");
        System.out.println(user);

        System.out.println("-----------7----------");
        Seasons seasons1 = Seasons.SUMMER;
        switch (seasons1) {
            case FALL:
                System.out.println("Ruduo");
                break;
            case SUMMER:
                System.out.println("Vasara");
//          case Seasons.SPRING: taip negalima naudoti
        }
        System.out.println("-----------7----------");
        Seasons.SUMMER.printExpectedVisitors();
        System.out.println("-----------8----------");
        System.out.println("Begin");
        OnlyOne first = OnlyOne.ONCE;
        OnlyOne second = OnlyOne.TWO;
        System.out.println("end");
        System.out.println("-----------9----------");
        System.out.println(HolidaySeasons.SUMMER.getSunSetHours());
    }
 }

