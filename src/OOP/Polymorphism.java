package OOP;

// overloading - compile time polymorphism
// overriding - runtime polymorphism

class Car{
    public void Speed(){
        System.out.println("Speed constructor called...");
    }

    public void Type(){
        System.out.println("Type constructor called...");
    }
}

class Tata extends Car{
    @Override
    public void Speed(){
        System.out.println("Speed of tata motor...");
    }

    // overloading
    public void Type(String cartype){
        System.out.println("Car type is: " + cartype);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Tata t = new Tata();
        t.Speed();
        t.Type();

        Tata t2 = new Tata();
        t2.Speed();
        t2.Type("4 Seater car");
    }
}
