package lt.codeacademy;

public enum HolidaySeasons {
    WINTER{
        @Override
        public String getSunSetHours() {
            return "10AM";
        }
    }, SPRING {
        public String getSunSetHours() {
            return "8AM";
        }
    }, SUMMER{
        @Override
        public String getSunSetHours() {
            return "6AM";
        }
    }, FALL{
        @Override
        public String getSunSetHours() {
            return "8AM";
        }
    };

    public abstract String getSunSetHours();
}
