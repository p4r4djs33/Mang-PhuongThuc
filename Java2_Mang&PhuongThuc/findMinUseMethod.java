public class findMinUseMethod {
    public static int minValue(int array[]) {
        int min = array[0];
        int index = 0;
        for (int i =0; i< array.length; i++){
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {5,21,3,4,2,6,2,6};
        int index = minValue(arr);
        System.out.println("The min element in the array is :" + arr[index]);
    }
}
