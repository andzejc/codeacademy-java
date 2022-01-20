package lt.codeacademy;

public enum HolidaySeasons {
    WINTER{
        @Override
        public String getHours() {
            return "10AM";
        }
    },
    SPRING {
        @Override
        public String getHours() {
            return "8AM";
        }
    };

    public abstract String getHours();
}
