class Student {
    int rno;
    String name;
    void setdata(int r, String n) {
        rno = r;
        name = n;
    }
    void display() {
        System.out.println(rno);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setdata(101, "Pranav");
        s1.display();
    }
}
