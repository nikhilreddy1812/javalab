interface Sports {
    void play();
}

interface Academics {
    void study();
}

class Student implements Sports, Academics {
    public void play() {
        System.out.println("Student plays sports");
    }

    public void study() {
        System.out.println("Student studies");
    }
}

public class interfaceSports {
    public static void main(String[] args) {
        Student s = new Student();
        s.play();
        s.study();
    }
}