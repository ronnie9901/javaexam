public class assending
{
    public static void main(String[] args) {

        int [] arr = new int [] {5,100,15,90,65};
        int max = arr[0];
        int ase=0;

        for (int i = 0; i < arr.length; i++)
        {
          for (int j=0;j<arr.length;j++)
          {
              if(arr[i] == arr[j])
              {
                  ase = max;
                  max = arr[i];
                  arr[i]=ase;
              }

          }
            System.out.println("Largest element of  array: " +ase);
        }


    }
}
