class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Marks extends Student {
    int a, b, c, d, e;

    Marks(int id, String name, int a, int b, int c, int d, int e) {
        super(id, name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
}

class Result extends Marks {
    Result(int id, String name, int a, int b, int c, int d, int e) {
        super(id, name, a, b, c, d, e);
    }

    void display() {
        int total = a + b + c + d + e;
        double avg = total / 5.0;

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + (avg >= 90 ? "A" :
                           avg >= 75 ? "B" :
                           avg >= 60 ? "C" :
                           avg >= 50 ? "D" : "F"));
    }
}

public class classStudent {
    public static void main(String[] args) {
        Result r = new Result(101, "Ram", 97, 90, 95, 90, 92);
        r.display();
    }
}