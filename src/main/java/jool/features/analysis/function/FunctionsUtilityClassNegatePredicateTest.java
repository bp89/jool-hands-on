package jool.features.analysis.function;

import org.jooq.lambda.function.Functions;

import java.util.List;
import java.util.function.Predicate;

/**
 * Usage : Getting another Predicate negated by another predicate.
 * Reference {@link Functions#not(Predicate)}
 */
public class FunctionsUtilityClassNegatePredicateTest {

    public static void main(String[] args) {
        Predicate<Student> ageLessThan18 = student -> student.getAge() < 18;

        List<Student> students = Student.getMockedStudents();

        System.out.println("Students with Age less than 18");
        students.stream()
                .filter(ageLessThan18)
                .forEach(System.out::println);

        Predicate<Student> ageGreaterThan18 = Functions.not(ageLessThan18); //get negated Predicate

        System.out.println("Students with Age greater than 18");
        students.stream()
                .filter(ageGreaterThan18)
                .forEach(System.out::println);

    }


}
