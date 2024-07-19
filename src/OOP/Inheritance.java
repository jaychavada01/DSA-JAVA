package OOP;

class Shape {
    public void area() {
        System.out.println("Display area..");
    }
}

// 1. Single level inheritance
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    } 
}

// 2. Multi-level inheritance
class EquiLateralTriange extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// 3. Hierarchical inheritance - diff class use same one class for inherite properties of class
class Circle extends Shape {
    public void area(int r) {
        System.out.println(Math.PI * r * r);
    }
}

// 4. Hybrid inheritance - same branch we gor multiple inheritance


public class Inheritance {
    public static void main(String[] args) {
        Circle t1 = new Circle();
        t1.area(45);
    }
}