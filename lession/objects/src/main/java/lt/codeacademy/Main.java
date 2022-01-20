package lt.codeacademy;

public class Main {
    public static void main(String[] args) {

        PeopleWithDriverLicense user = new PeopleWithDriverLicense();
        user.setName("Dominykas");
        user.setAge(40);
        user.setHaveCar(true);
//        System.out.println(user.toString());

        Seasons seasons = Seasons.SPRING;
        System.out.println(seasons);
//        System.out.println(seasons == Seasons.SPRING);

        for(Seasons season : Seasons.values()){
            System.out.println(season.name() + " - " +season.ordinal());
        }

        Seasons s1 = Seasons.FALL;

        switch (s1){
            case FALL:
                System.out.println("Ruduo");
                break;
            case SPRING:
                System.out.println("Pavasaris");
                break;
            case WINTER:
                System.out.println("Ziema");
                break;

        }

        Seasons.SUMMER.printExceptedVisitors();

        OnlyOne a = OnlyOne.ONCE;
        OnlyOne b = OnlyOne.TWO;

        System.out.println(HolidaySeasons.SPRING.getHours());


    }
}
