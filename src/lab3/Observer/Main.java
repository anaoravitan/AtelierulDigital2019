package lab3.Observer;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s1 = new Student("Oravitan");
        Student s2 = new Student("Varzoiu");
        Student s3 = new Student("Popescu");

        s1.listenTo(teacher);
        s2.listenTo(teacher);
        s3.listenTo(teacher);

        teacher.NotifyObserver("oo");

        teacher.unregister(s3);

        teacher.NotifyObserver("design patterns");

        String[] javaTopics = new String[]{ "basics", "oo", "design patterns"};

    }
}
