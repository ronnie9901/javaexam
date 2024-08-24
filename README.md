
# javaexam
```
assending 
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
```

lastgest

```
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

```
even sun 
```
import java.util.Scanner;

public class hello {

    public static void main(String[] args)
    {

        int a ;
        int sum = 0;
        Scanner  input =  new  Scanner(System.in);

        System.out.println(" enter the a");
        a = input.nextInt();

            for (int i=1;i<a;i++){

                if(i%2==0)
                {
                    System.out.println(i);
                }

            }

    }
}



