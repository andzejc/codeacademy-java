package test;

interface D {

    default int getRequiredFoodAmount() {
        return 12;
    }

    public default void eatMeat() {

    };


//   private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE
//   protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE
//   public static String TYPE; // DOES NOT COMPILE

}
