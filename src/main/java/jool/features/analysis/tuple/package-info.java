/**
 * Package {@link org.jooq.lambda.tuple} contains Tuple0...Tuple16 & a Range class.
 * A tuple is a collection of hetrogeneous elements mathematically. The Tuple suffix is called the degree of tuple.
 * <p>
 * Tuple allows several operation on tuple like
 * <b>concat</b> another tuple to a tuple,
 * <b>split</b> a tuple of degree n into a tuple of degree j such that it's first element is a tuple of degree j and second element is  tuple of degree n-j
 * <b>limitn</b> returns a tuple of size n
 * <b>skipj</b> returns a tuple of size n-j size
 *
 * <p>
 *
 *
 * A range is a group of two values specifying starting and ending point respectively.
 * A range could be defined in two ways :-
 * <pre>
 * Range<Integer> range = new Range<>(20,30);
 * Range<Integer> range2 = new Range<>(Tuple.tuple(20,30));
 * </pre>
 */
package jool.features.analysis.tuple;