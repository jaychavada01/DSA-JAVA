package OOP_PRACTICALS;

class I2 {

    public String getDescription() {
        return "I2";
    }
}

class J2 extends I2 {

    public String getDescription() {
        return (super.getDescription() + ", J2");
    }
}

class K2 extends J2 {

    public String getDescription() {
        return (super.getDescription() + ", K2");
    }
}

public class Practical_31 {

    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

        I2 i2 = new I2();
        System.out.println(i2.getDescription());

        J2 j2 = new J2();
        System.out.println(j2.getDescription());

        K2 k2 = new K2();
        System.out.println(k2.getDescription());
    }
}
