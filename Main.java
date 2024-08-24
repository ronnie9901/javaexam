public class Main {
    public static void main(String[] args) {

        int [] arr = new int [] {5,10,15,50,65};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Largest element of  array: " +max);

}
}