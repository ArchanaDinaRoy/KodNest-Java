package track.ClassQuestion01;

public class EmployeeApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.id = 10;
        e1.name = "Archana";

        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
        Employee e2;
        e2 = e1;
        e2.id = 100;
        e2.name = "Arti";

        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
    }

}
