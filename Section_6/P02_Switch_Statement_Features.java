package Section_6;

public class P02_Switch_Statement_Features {
    public static void main(String[] args) {
        
        // int value = 1;
        // if (value == 1) {
        //     System.out.println("Value was 1");
        // } else if (value == 2){
        //     System.out.println("Value was 2");
        // } else {
        //     System.out.println("Was not 1 or 2");
        // }

        int switchValue = 3;
        
        switch (switchValue) {
            case 1:
            System.out.println("Value was 1");
            break;
            case 2:
            System.out.println("Value was 2");
            break;
            case 3: case 4: case 5:
            System.out.println("Was a 3, a 4, a 5");
            System.out.println("Actually it was a " + switchValue);
            // break;
            default:
            System.out.println("Was not 1, 2, 3, 4, or 5");
            break;

        }
        String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter ");
    }

    public static String getQuarter(String month) {
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
            return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
            return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
            return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
            return "4th";
        }
        return "bad";
    }
}
