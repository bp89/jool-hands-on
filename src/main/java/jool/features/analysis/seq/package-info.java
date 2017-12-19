/**
 * This package contains examples for {@link org.jooq.lambda.Seq} interface usage.
 * Seq It's a wrapper over streams and returns a  sequentially executing stream. t gives some useful methods that are available in Scala like languages
 * Please reference {@link org.jooq.lambda.Seq} documentation to take a look at all methods available
 *
 * Gotcha - All Seq's are sequential and ordered streams, so don't bother to call parallel() on it, it will return the same Seq.
 */
package jool.features.analysis.seq;