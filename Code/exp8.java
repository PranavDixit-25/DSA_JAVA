class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, int b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }
}

class Student {

    int rollno;
    String name;
    int age;

    Student() {
        rollno = 0;
        name = null;
        age = 0;
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
        age = 0;
    }

    Student(int r, String n, int a) {
        rollno = r;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + age);
    }
}

public class exp8 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10.5, 20.5));
        System.out.println(c.add(1, 2, 3));
        System.out.println(c.add(10.5, 5));
        System.out.println(c.add(10, 5.5));

        
        Student s1 = new Student();
        Student s2 = new Student(14418, "Pranav Dixit");
        Student s3 = new Student(14616, "Pranav_Dixit", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}