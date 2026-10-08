import studentInfo.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
    }
}
package studentInfo;

public class Student {
    public void displayInfo() {
        System.out.println("Student Name: Rahul");
        System.out.println("Roll No: 101");
    }
}