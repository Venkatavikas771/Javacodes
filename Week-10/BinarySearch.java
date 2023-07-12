 import java.util.Scanner;

class Binary {
  public static void binarySearch(int ar[], int size, int key) {
    System.out.println("Binary search");
    int mid, low = 0, high = ar.length - 1, flag = 0;
    while (low <= high) {
      mid = (low + high) / 2;

      if (ar[mid] == key) {
        System.out.println("The value found at index :" + mid);
        flag = 1;
        int count = 0;
        for (int i = 1; i <= ar[mid]; i++) {
          if (ar[mid] % i == 0) {
            count++;
          }
        }
        if (count == 2) {
          System.out.println("key"+"Is a prime number");
        } else {
          System.out.println("Not  a prime number");
        }
        break;
      } else if (key > ar[mid]) {          /*key value greater unte aa value mid right side aa untadi so already high value 
                                                 untadi manam start value mid+1 */
        low = mid + 1;
      } else if (key < ar[mid]) {
        high = mid - 1;
      }
    }
    if (flag == 0) {
      System.out.println("Element not found");
    }  ``  

  }
}

class BinarySearch {
  public static void main(String args[]) {
    Binary l = new Binary();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size");
    int size = sc.nextInt();
    System.out.println("Enter the key to search");
    int key = sc.nextInt();
    System.out.println("Enter the array values");
    int ar[] = new int[size];
    for (int k = 0; k < ar.length; k++) {
      ar[k] = sc.nextInt();
    }
    l.binarySearch(ar, size, key);
  }
}
