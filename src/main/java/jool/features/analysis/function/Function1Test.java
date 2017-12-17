package jool.features.analysis.function;

import org.jooq.lambda.function.Function1;

/**
 * Note that apply is standard method to be called for Function0...Function16.
 */
public class Function1Test {

    public static void main(String[] args) {
        Function1<String, Integer> lengthOfString = string -> string.length();
        lengthOfString.apply("Master");
    }
}
