package Section_7;

public class P08_Pojo1 {   // Outer Class Declaration
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            P09_Pojo_Record student = new P09_Pojo_Record("112233" + i,
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
        
        P08_Pojo2 pojoStudent = new P08_Pojo2("78321479", "Aditya",
            "12/11/1999", "Masters");
        P09_Pojo_Record recordStudent = new P09_Pojo_Record("fds567", "Chukundar",
            "23/08/2002", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
} 

