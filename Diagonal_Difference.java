import java.util.Scanner;
class Solution
{
    public static void main(String [] args)
    {   
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr [][] = new int[len][len];
        int mirror_arr[][] = new int [len][len];
        for (int i =0 ; i < len ; i++)
        {
            for (int j =0 ; j < len ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int dia1 = 0 ;
        int dia2 = 0 ;
        //  calculate the left-to-right diagonal.
        for (int i =0 ; i < len ; i++)
        {
            for (int j =0 ; j < len ; j++)
            {
               if ( i == j)
               {
                   dia1 = dia1 + arr[i][j];
               }
            }
        }
        // mirror the array
        for (int i =0 ; i < len ; i++)
        {
            for (int j =0 ; j < len ; j++)
            {
                mirror_arr[i][len - 1 - j] = arr[i][j];
            }
        }
        // calculate the left-to-right diagonal in mirror array.
        for (int i =0 ; i < len ; i++)
        {
            for (int j =0 ; j < len ; j++)
            {
                if (i == j)
                {
                    dia2 = dia2 + mirror_arr[i][j];
                }
            }
        }
        System.out.println(Math.abs(dia1-dia2));
    }
}
