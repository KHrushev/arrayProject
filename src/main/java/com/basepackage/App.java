package com.basepackage;

import sorters.Sorter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] array = {7,5,4,7,2,1};

        Sorter sorter = new Sorter();

        sorter.Sort(array);
        sorter.printSortedArray(array);
    }
}
