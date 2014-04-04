package com.googlecode.stateless4j.delegates;

/**
 * Represents an operation that accepts an input and returns no result
 *
 * @param <T>  The type of the input to the operation
 * @param <T1> The type of the input to the operation
 * @param <T2> The type of the input to the operation
 */
public interface Action3<T, T1, T2> {
    /**
     * Performs this operation on the given input
     *
     * @param arg1 Input argument
     * @param arg2 Input argument
     * @param arg3 Input argument
     */
    void doIt(T arg1, T1 arg2, T2 arg3) throws Exception;
}