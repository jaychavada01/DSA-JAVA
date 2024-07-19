package OOP;

interface Bike{
    public void Speed();
}

interface Engine{
    public void FourStroke();
}

class Yamaha implements Bike{
    public void Speed(){
        System.out.println("Speed is out of range...");
    }
}
class JavaBike implements Bike, Engine{
    public void Speed(){
        System.out.println("Speed is out of range...");
    }
    public void FourStroke(){
        System.out.println("FourStroke is here...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Yamaha y = new Yamaha();
        y.Speed();

        JavaBike jb = new JavaBike();
        jb.Speed();
        jb.FourStroke();
    }
}
