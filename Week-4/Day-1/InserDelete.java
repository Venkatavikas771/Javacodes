import java.util.Scanner;
class InserDelete
{
public static void insertDelete(int a[],int size,int menu)
{
      Scanner meth=new Scanner(System.in);
      switch(menu)
        {
          case 1:
            System.out.println("Enter the elemenet to insert");
            int ele=meth.nextInt();
             System.out.println("Enter the elemenet in first index only so press 0 ");
            int index=meth.nextInt();
            int b[]=new int[size+1];
            for(int i=0;i<b.length;i++)
              {
                if(i==index)
                {
                  b[i]=ele;
                }
                 if(i>index)
                {
                  b[i]=a[i-1];
                }
              }
            break;
              case 2:
            System.out.println("Enter the elemenet to insert");
            int ele1=meth.nextInt();
             System.out.println("Enter the elemenet in last index only so press (size+1) ");
            int index1=meth.nextInt();
            int c[]=new int[size+1];
            for(int i=0;i<b.length;i++)
              {
                if(i==index1)
                {
                  c[i]=ele1;
                }
                 else
                {
                  c[i]=a[i];
                }
              }
            break;
        case 3:
            System.out.println("Enter the elemenet to insert");
            int ele2=meth.nextInt();
             System.out.println("Enter the index pos");
            int index2=meth.nextInt();
            int d[]=new int[size+1];
            for(int i=0;i<b.length;i++)
              {
                if(i==index2)
                {
                  d[i]=ele2;
                }
                 else if(i>index2)
                {
                  d[i]=a[i-1];
                }
                else
                 {
                   d[i]=a[i];
                 }
            }
            break;
            case 4:
            System.out.println("Enter the elemenet to insert");
            int ele3=meth.nextInt();
             System.out.println("Enter the elemenet in last index only so press size+1 ");
            int inde3=meth.nextInt();
            int e[]=new int[size+1];
            for(int i=0;i<b.length;i++)
              {
                if(i==0)
                {
                  e[i]=a[i-1];
                }
            }
            break;
            case 5:
            System.out.println("Enter the elemenet to insert");
            int ele4=meth.nextInt();
             System.out.println("Enter the elemenet in last index only so press size+1 ");
            int index4=meth.nextInt();
            int f[]=new int[size+1];
            for(int i=0;i<b.length;i++)
              {
                if(i==0)
                {
                  f[i]=a[i-1];
                }
                else
                {
                  f[i]=a[i];
                }
                for(int i=0;i<f.length;i++)
              {
                 f[i]=id.nextInt();
              }
            }
            break;
            case 6:
            System.out.println("Enter the elemenet to insert");
            int ele=meth.nextInt();
             System.out.println("Enter the elemenet in last index only so press size+1 ");
            int index=meth.nextInt();
            for(int i=0;i<b.length;i++)
              {
                if(i==index)
                {
                  b[i]=a[i+1];
                }
                  else if(i>index)
                {
                  b[i]=a[i+1];
                }
                else
                {
                  b[i]=a[i];
                }
            }
            break;
          default:
            System.out.println("Enter valid choices");
      }
    }
    public static void main(String args[])
    {
      Scanner id=new Scanner (System.in);
      System.out.println("Enter the array size");
      int size=id.nextInt();
      System.out.println("Enter the array elements");
      int a[]=new int[size];
      for(int i=0;i<a.length;i++)
        {
          a[i]=id.nextInt();
        }
      System.out.println("Enter the choices");
      System.out.println("Enter 1 for insert an element in first index");
      System.out.println("Enter 2 for Insert an element in last index");
       System.out.println("Enter 3 for Insert an element in specified index");
       System.out.println("Enter 4 for Remove element from first index");
       System.out.println("Enter 5 for Remove element from last index");
       System.out.println("Enter 6 for Remove element from specified index");
      int menu=id.nextInt();
      }
  }
   