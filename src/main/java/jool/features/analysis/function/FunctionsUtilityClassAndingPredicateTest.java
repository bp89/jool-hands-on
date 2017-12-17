package jool.features.analysis.function;

import org.jooq.lambda.function.Functions;

import java.util.List;
import java.util.function.Predicate;

/**
 * Usage : Getting another Predicate and-ed by another set of predicates.
 * Reference {@link Functions#or(Predicate[])}
 *
 * TODO for you {@link Functions#or(Predicate[])}
 */
public class FunctionsUtilityClassAndingPredicateTest {

    public static void main(String[] args) {
        Predicate<Student> ageLessThan18 = student -> student.getAge() < 18;
        Predicate<Student> ageGreaterThan60 = student -> student.getAge() > 60;

        List<Student> students = Student.getMockedStudents();


        System.out.println("Students with Age greater between 18 & 60");
        students.stream()
                .filter(Functions.and(Functions.not(ageLessThan18), Functions.not(ageGreaterThan60)))
                        .forEach(System.out::println);

    }


}
