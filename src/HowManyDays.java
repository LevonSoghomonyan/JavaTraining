public class HowManyDays {
    public static void main(String[] args){

        int calculateDays = calc(50);
        System.out.println(calculateDays);
    }

    public static int calc(int years){
        years = years * 365;

        return years;
    }
}