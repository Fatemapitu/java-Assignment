 class Student {

    String name;
    int id;

    void show() {
        System.out.println(name + " " + id);
    }
}
public class Student3Object {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Fahim";
        s1.id = 101;

        s2.name = "Fatema";
        s2.id = 102;

        s3.name = "Pitu";
        s3.id = 103;

        s1.show();
        s2.show();
        s3.show();
    }
}
