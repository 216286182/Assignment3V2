package Run;

import Encapsulation.Person;
import Inheritance.Student;
import Inheritance.UnderGrad;
import Polymorphism.Car;
import Polymorphism.Speedometer;

public class RunModules {
    public static void main(String[] args) {
        Person per = new Person();
        per.toString();
        System.out.println(per);

        Student stud = new Student();
        stud.toString();
        System.out.println(stud);

        Car car = new Speedometer();
        car.drive();
    }
}
