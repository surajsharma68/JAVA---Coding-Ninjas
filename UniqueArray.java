package array;
import java.util.Scanner;
public class UniqueArray
{
    public static int[] Input(int n)
      { Scanner sc= new Scanner(System.in);
          int arr1[] = new int[n];
          for (int i = 0; i<n; i++)
          { arr1[i]= sc.nextInt();}
          return arr1;
      }

    public static int Unique(int[] arr){
           int num=0;
           boolean check;

           for(int i=0;i<arr.length;i++)
           {    check=false;

                     for(int j=0;j<arr.length;j++)
                       {
                         if(i==j)
                         continue;
                         if(arr[i]==arr[j])
                         {check=true;
                         break;
                         }
                       }

               if(check==false){
                   num= arr[i];
               }
           }

           return num;
       }

    public static void main(String args[])
      { Scanner sc =new Scanner(System.in);
      int t = sc.nextInt();
      int arr1[]= new int[t];
      for (int i=0; i<t; i++)
      {
         int n = sc.nextInt();
        int arrMain[] = Input(n);
        arr1[i] = Unique(arrMain);
      }
      for (int i =0;i<t;i++)
         {System.out.println(arr1[i]);
         }
      }
}