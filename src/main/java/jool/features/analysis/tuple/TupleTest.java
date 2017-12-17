package jool.features.analysis.tuple;

import org.jooq.lambda.tuple.Tuple1;
import org.jooq.lambda.tuple.Tuple2;
import org.jooq.lambda.tuple.Tuple3;

/**
 *
 */
public class TupleTest {

    public static void main(String[] args) {

        Tuple3<Integer, String, String> student = new Tuple3<>(23, "Jack", "10th");

        System.out.println(student);

        Tuple2<Tuple1<Integer>, Tuple2<String, String>> student1 = student.split1();

        System.out.println(student1);
    }
}
