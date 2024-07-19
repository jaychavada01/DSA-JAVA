package OOP_PRACTICALS;

class circle {
    double radious;
    double x;
    double y;

    public circle(double radious, double x, double y) {
        this.radious = radious;
        this.x = x;
        this.y = y;
    }

    public circle(double radious) {
        // here co-x and co-y are set to 0;
        this.radious = radious;
    }

    public void display() {
        System.out.println("Radious is: " + radious);
        System.out.println("Co-x: " + x);
        System.out.println("Co-y: " + y);
    }
}

public class Practical_27 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

        circle c1 = new circle(15);
        circle c2 = new circle(10, 5, 3);
        
        System.out.println("The result of 1st constructor");
        c1.display();
        System.out.println("The result of 2nd constructor");
        c2.display();
    }
}