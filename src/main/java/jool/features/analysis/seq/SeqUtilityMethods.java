package jool.features.analysis.seq;

import org.jooq.lambda.Seq;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Following are some of useful methods from Seq
 * filter {@link Seq#filter(Predicate)}
 * contains {@link Seq#contains(Object)}
 * containsAll {@link Seq#containsAll(Seq)}, {@link Seq#containsAll(Object[])},
 * containsAny {@link Seq#containsAny(Object[])}
 * crossJoin {@link Seq#crossJoin(Seq)}
 * cycle {@link Seq#cycle()} {@link Seq#cycle(long)}
 * zip {@link Seq#zip(Seq)}
 * slice {@link Seq#slice(Stream, long, long)} {@link Seq#slice(long, long)}
 * shuffle {@link Seq#shuffle()}
 */
public class SeqUtilityMethods {

    public static void main(String[] args) {

        //Filter example
        Seq<Integer> seq = Seq.range(1, 5);
        seq.filter(number -> number < 3)
                .forEach(System.out::println);


        //Cycle
        // (1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, ...)
        Seq.range(1, 4).cycle(3)
                .forEach(System.out::println);

        //groupBy
        // (tuple(1, (1, 3)), tuple(0, (2, 4)))
        Seq.range(1, 8).groupBy(i -> i % 2)
                .forEach((key,value)-> {
                    System.out.println(key +", "+value);
                });

        //join
        Seq.of(1, 2, 3,4).toString(", ");

    }
}
