import java.util.Scanner;
class InsertionSort
  {
    public void insertionSort(int ar[],int size)
    {
      for(int i=1;i<ar.length;i++)
        {
          int key=a[i];
         int j=i-1;
              while(j>=0)
              {
                if(key<a[j])
                {
                  a[j+1]=a[j];
                  j=j-1;
                }
                else
                  break;
              }
                      a[j+1]=key;




                
          InsertionSort.printArr(ar,size);
        }
      InsertionSort.printArr(ar,size);
    }
    static void printArr(int ar[],int size)
  {
  for(int i=0;i<ar.length;i++)
    {
      System.out.println(ar[i]);
    }
  }
  }
class Insertion
  {
    public static void main(String args[])
    {
        InsertionSort b=new InsertionSort();
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size");
          int size=sc.nextInt();
       System.out.println("Enter the array values");
            int ar[]=new int[size];
          for (int k=0;k<ar.length;k++)
            {
              ar[k]=sc.nextInt();
            }
      b.insertionSort(ar,size);
    }
  }


