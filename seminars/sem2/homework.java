package seminars.sem2;

public class homework {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 4, 3, 7, 8, 2, 6, 5, 9};
        DisplayArray(myArray);
        MergeSort(myArray);
        DisplayArray(myArray);

    }
    

    static void MergeSort(int[] array){
        if (array.length < 2){
            return;
        }
        int mid = array.length / 2;
        int [] left = new int[mid];
        int [] right = new int[array.length - mid];

        for (int i=0; i<mid; i++){
            left[i] = array[i];
        }
        for (int i=mid; i<array.length; i++){
            right[i-mid] = array[i];
        }
        MergeSort(left);
        MergeSort(right);
        Merge(array, left, right);
    }


    static void Merge(int[] targetArray, int[] a, int[] b){
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)  
        targetArray[k++] = a[i] < b[j] ? a[i++] :  b[j++];

        while (i < a.length)  
        targetArray[k++] = a[i++];

        while (j < b.length)    
        targetArray[k++] = b[j++];
    }


    static void DisplayArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}