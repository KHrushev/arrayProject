package com.basepackage;

import sorters.Sorter;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        int[] array = {9,5,4,7,2,1};

        Sorter sorter = new Sorter();

        sorter.sort(array);
        sorter.printSortedArray(array);
    }
}
