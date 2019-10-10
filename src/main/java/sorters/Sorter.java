package sorters;

public class Sorter {
    private int[] array;

    public void Sort(int[] arr){
        int i, temp;
        array = arr;

        for(i = array.length-1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public void printSortedArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
