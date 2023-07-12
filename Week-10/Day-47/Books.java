import java.util.*;

class Book {
  private static int nextid = 1;
  int id;
  String title;
  String author;
  int price;

  Book(String title, String author, int price) {
    this.id = nextid++;
    this.title = title;
    this.author = author;
    this.price = price;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}

class Services

{
  HashMap<Integer, Book> h = new HashMap<Integer, Book>();

  public void addBook(Book b) {
    h.put(b.getId(), b);
    System.out.println("Added succesfully");
  }

  public void price() {
   for(Map<K,V>.Entry
     {
       int sum=b.getPrice();
       System.out.println(sum);
     }

  }

  public void deleteId(int del) {
    h.remove(del);
    System.out.println("deleted succesfully");

  }

  public void searchAu(String au) {
    for (Book o : h.values()) {
      if (au.equalsIgnoreCase(o.getAuthor())) {
        System.out.println("The title is :" + o.getTitle());
        System.out.println("The author is :" + o.getAuthor());
        System.out.println("The PRICE is :" + o.getPrice());
      } else {
        System.out.println("No book with that author");
      }
    }

  }

  public void getBookById(int ids) {
    Book b = h.get(ids);
    if (b != null) {
      System.out.println("The title is :" + b.getTitle());
      System.out.println("The author is :" + b.getAuthor());
      System.out.println("The PRICE is :" + b.getPrice());
    } else {
      System.out.println("No book is found with that id");
    }
  }

  public void displayAll() {
    for (Book b : h.values()) {
      if (b != null) {
        System.out.println("The title is :" + b.getTitle());
        System.out.println("The author is :" + b.getAuthor());
        System.out.println("The PRICE is :" + b.getPrice());
      } else {
        System.out.println("Empty collection");
      }
    }
  }

}

class Books {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    Services s = new Services();

    int v = 0;
    while (v == 0) {
      System.out.println("Welcome to book store");
      System.out.println(
          "1.Add book\n2.Calculate total price of all books\n3.Remove a book by book_id\n4.Search books by author\n5.Search books by author by id\n6.Display all the books\n7.Display");
      System.out.println("Enter the choice");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter the book title");
          String title = sc.next();
          System.out.println("Enter the author name");
          String author = sc.next();
          System.out.println("Enter the book price");
          int price = sc.nextInt();
          /*
           * System.out.println("Enter the book title");
           * String title1=sc.next();
           * System.out.println("Enter the author name");
           * String author1=sc.next();
           * System.out.println("Enter the book price");
           * int price1=sc.nextInt();
           */
          Book b1 = new Book(title, author, price);

          s.addBook(b1);

          break;
        case 2:
          
          
          
          break;

        case 3:
          System.out.println("Enter the book id to delete");
          int del = sc.nextInt();
          s.deleteId(del);
          break;
        case 4:
          System.out.println("Enter the book author");
          String au = sc.next();
          s.searchAu(au);
          break;
        case 5:
          System.out.println("Enter the book idd to search");
          int ids = sc.nextInt();
          s.getBookById(ids);
          break;
        case 6:

          s.dislayAllBooks();
          break;
        case 7:

          System.exit(0);
          break;
        default:
          System.out.println("Enter the valid input");

      }

    }
  }
}
/*
 * import java.util.*;
 * 
 * class Stack {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * Stack st = new Stack();
 * System.out.println("ENTER THE CHOICE");
 * int choice = sc.nextInt();
 * System.out.println(
 * "1.Adding a element\n2.Remove element\n3. Display the element at the top of the stack\n4.Display all the elements in the stack\n5.Exit"
 * );
 * switch (choice)
 * {
 * case 1:
 * System.out.println("Enter the elements to push");
 * st.push(9);
 * st.push(1);
 * st.push(2);
 * st.push("integer");
 * System.out.println(st);
 * break;
 * case 2:
 * st.pop();
 * System.out.println(st);
 * break;
 * case 3:
 * st.peek();
 * System.out.println(st);
 * break;
 * case 4:
 * System.out.println(st);
 * break;
 * case 5:
 * System.exit(0);
 * break;
 * default:
 * System.out.println("Enter valid input");
 * 
 * }
 * 
 * }
 * }
 */