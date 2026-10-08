class Employee {
    int id = 101;
    String name = "Rahul";
    double salary = 25000;

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
    }
}