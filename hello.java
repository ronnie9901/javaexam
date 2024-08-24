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


