package jool.features.analysis.fi;

import jool.features.analysis.function.Student;
import org.jooq.lambda.fi.lang.CheckedRunnable;
import org.jooq.lambda.fi.util.CheckedComparator;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * TODO: {@link org.jooq.lambda.fi.util.CheckedComparator} example impl
 */
public class TestCheckedComparator {

    public static void main(String[] args) throws Throwable {
        CheckedComparator<Student> compareName = (s1, s2) ->
                s1.getName().compareTo(s2.getName());


        System.out.println(
                compareName.compare(new Student(20, "Ajey"), new Student(25, "Vijay"))
        );
    }
}
