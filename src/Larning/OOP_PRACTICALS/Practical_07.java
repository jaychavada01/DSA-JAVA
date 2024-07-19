package OOP_PRACTICALS;

public class Practical_07 {
    public static void main(String[] args) {

        // double meter;
        // double feet;

        // try (Scanner sc = new Scanner(System.in)) {
        // System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

        // System.out.println("Enter the Parameter in Meter");
        // meter = sc.nextInt();

        // System.out.println("");

        // System.out.println("Parameter in Feet is : " + meter * 3.23);
        // System.out.println("");

        // System.out.println("Enter the Parameter in feet");
        // feet = sc.nextInt();

        // System.out.println("");

        // System.out.println("Parameter in meter is : " + feet * 0.3048);
        // System.out.println("");
        // }
        
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        double d = Double.parseDouble(args[0]);
        String s1 = args[1];
        String s2 = "meter";
        String s3 = "feet";

        if (s1.equals(s2)) {
            System.out.println("meter to feet");
            System.out.println(d * 3.28);
        } else if (s1.equals(s3)) {

            System.out.println("feet to meter");
            System.out.println(d / 3.28);
        } else {
            System.out.println("invalid choice");
        }

    }
}