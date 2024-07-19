package OOP;

abstract class Car {
    abstract void Brand();

    Car(){
        System.out.println("Car constructor is called..");
    }
}

class Bmw extends Car {
    public void Brand() {
        System.out.println("BMW M5 here...");
    }
}

class Mercedes extends Car {
    public void Brand() {
        System.out.println("GLXLS here...");
    }
}

public class AbstactionMethod {
    public static void main(String[] args) {
        Bmw b1 = new Bmw();
        b1.Brand();
    }
}
