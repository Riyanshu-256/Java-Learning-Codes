package Section_7;

public class P08_Pojo1 {   // Outer Class Declaration
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            P08_Pojo2 student = new P08_Pojo2("112233" + i,
            switch(i){
                case 1 -> "Riyanshu" ;
                case 2 -> "Saloni";
                case 3 -> "Supriya";
                case 4 -> "Aisha";
                case 5 -> "Deepsakshi";
                default -> "Anonymous";
            },
            "06/02/2005", "Java Masterclass");

            System.out.println(student);
        }
    }
}
