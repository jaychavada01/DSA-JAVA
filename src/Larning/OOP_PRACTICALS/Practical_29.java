package OOP_PRACTICALS;

class circle {
    float r;
    float h;
    
    public double area(){
        return (Math.PI * r * r);
    }
}
class cylinder extends circle{
    @Override
    public double area(){
        return (2 * Math.PI * r * h);
    }
}
public class Practical_29 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

        circle c1 = new cylinder();
        c1.r = 2;
        c1.h = 3;
        System.out.println("Area of circle after override: ");
        System.out.println(+c1.area());
    }
}