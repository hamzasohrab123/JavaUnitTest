public class Holiday {

    public String NAME;
    public int DAY;
    public String MONTH;

    Holiday(String name, int day, String month){

        NAME = name;
        DAY = day;
        MONTH = month;

    }

    public static boolean inSameMonth(Holiday holiday1, Holiday holiday2){

        if (holiday1.MONTH == holiday2.MONTH) {
            return true;
        }

        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Holiday holiday1 = new Holiday("tahir", 8, "march");

        Holiday holiday2 = new Holiday("munir", 9, "july");

        boolean month = inSameMonth(holiday1, holiday2);

        System.out.println(month);

    }
}
