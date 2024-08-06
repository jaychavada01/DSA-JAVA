package OOP;

class Details {
    private String name;
    private int age;

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Details person = new Details();
        person.setName("John");
        person.setAge(25);

        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
