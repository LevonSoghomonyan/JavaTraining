public class Switch {
    public static void main(String[] args) {
        String dayofweek ="Tuesday";
        switch (dayofweek){
            case "Monday":
                System.out.println(2);
                break;
            case"Tuesday":
                System.out.println(3);
                break;
            default:
                System.out.println("otherday");
        }
    }
}
// in case of break followed each Systemout,switch command is equal to If-else,
//braek suspends process of statement.
// if there is no break all conditions will be out printed started satisfying condition.