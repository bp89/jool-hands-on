package jool.features.analysis.seq;

import org.jooq.lambda.Seq;

import java.util.stream.Stream;

/**
 * Seq basically provides a set of utility methods on stream
 * Remember Seq always returns a sequential stream of objects
 */
public class SeqIntroduction {

    public static void main(String[] args) {

        //Parallel Stream created using Seq
        Seq.of("I", "work", "for", "ION").parallel()
                .map(s -> s + " ")
                .forEach(System.out::print);

        System.out.println();
        //Parallel stream created using Stream
        Stream.of("I", "work", "for", "ION").parallel()
                .map(s -> s + " ")
                .forEach(System.out::print);

    }
}
