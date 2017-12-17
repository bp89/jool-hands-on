package jool.features.analysis.function;

import org.jooq.lambda.function.Consumer0;

/**
 * Note that accept is standard method to be called for Consumer0...Consumer16.
 */
public class Consumer0Test {

    public static void main(String[] args) {
        Consumer0 sayHello = () -> System.out.println("Hello Guys!!!");
        sayHello.accept();
    }
}
