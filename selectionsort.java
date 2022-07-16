import java.io.*;
import java.util.*;
class selectionsort
    {
        public void main()
        {
            int size;
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter the size of array");
            size = sc.nextInt();
            
            int arr[] = new int [size];
            System.out.println("please enter the elements in the array");
            for( int i =0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            int i,j;
            for( i=0; i<size;i++)
            {
                int index = i;
                for( j = i;j<size;j++)
                {
                    if(arr[j]<arr[index])
                    {
                         index = j;
                    }
                }
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                
            }
            for( i = 0; i<size;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
                
                
                    