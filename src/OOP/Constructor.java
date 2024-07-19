package OOP;

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Default Constructor is called...");
    }

    // constructor with parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with parameters is called...");
    }

    // copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
        System.out.println("Copy Constructor is called...");
    }

}

public class Constructor {
    public static void main(String[] args) {
        // Student s1 = new Student("Jay",21);
        // s1.printInfo();

        // for the use of copy constructor
        Student s1 = new Student();
        s1.age = 21;
        s1.name = "Jay";
        Student s2 = new Student(s1);
        s2.printInfo();
    }

}
