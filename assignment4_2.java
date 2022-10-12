package Assignments;



public class assignment4_2
{
    public static void main(String[] args) {
        int array[] = new int[25];
        int min = 999;
        int max = 10000;
        int range = max - min+1;
        int randomNum = 0;

        for (int i = 0; i < array.length; i++) {
            randomNum = (int) (Math.random() * range+min);
            array[i] = randomNum;
        }


        System.out.println("Array before bubble sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        bubbleSort(array);

        System.out.println("Array after Bubble sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");


        }
    }
    private static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
//swap the elements!
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}
