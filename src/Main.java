import models.Employee;
import models.Student;
import models.Person;
import models.Payable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyApplication {
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee emp2 = new Employee("George", "Harrison", "Developer", 50000.00);
        Student stu1 = new Student("Ringo", "Starr", 2.5);  
        Student stu2 = new Student("Paul", "McCartney", 3.8);


        List<Person> people = new ArrayList<>();
        people.add(emp1);
        people.add(emp2);
        people.add(stu1);
        people.add(stu2);


        Collections.sort(people);

        printData(people);
    }

    public static void printData(List<Person> payables) {
        for (Payable payable : payables) {
            System.out.println(payable.toString() + " earns " + String.format("%.2f", payable.getPaymentAmount()) + " tenge");
        }
    }
}
