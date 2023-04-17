package librarypatron;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a new address
       
        
    	

        // create a new person and set their name and address
        Patron patron1 = new Patron("John Doe", 2, "AnyStreet, San Jose, CA, 95110");
        Patron patron2 = new Patron("Francis Ford", 1, "AnotherStreet, San Francisco, CA, 94127");
        Patron patron3= new Patron("Alec Mann",2, "One street, San Mateo, CA, 94404");
        
        Book book1= new Book("Tom Sawyer", "Mark Twain", true);
        Book book2= new Book("War and Peace","Leo Tolstoy", false);
        Book book3= new Book("Of Mice and Men","John Steinbeck", true);
        Book book4= new Book("Huckleberry Finn","Mark Twain", false);
        Book book5= new Book("Ford County","John Grisham", true);
        Book book6= new Book("The Sound and The Fury","William Faulkner", false);
        Book book7= new Book("Old Man and The Sea","Ernest Hemingway", true);
        Book book8= new Book("The Gift of The Magi","O. Henry", false);
        Book book9= new Book("Carrie","Stephen King", true);
        Book book10= new Book("The Fall of the House of Usher","Edgar Allan Poe", false);
        Book book11= new Book("A Brighter Garden","Emily Dickinson", true);
        // print out the person's name and address
        Library library= new Library();
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);
        String title = null;
        String name=null;
        if (args.length > 1) {
            title = args[0];
            name= args[1];
        } else {
        
        System.out.println("Type in the title you are looking for.");
    	Scanner scanner1 = new Scanner(System.in);
        
    	title=scanner1.nextLine();
    	System.out.println(library.findBook(title));
        
    	System.out.println("Please type in your full name.");
    	
    	
    	Scanner scanner2 = new Scanner(System.in); 
    	
    	 name= scanner2.nextLine();
    	
    	
    	if(name.equalsIgnoreCase(patron3.getName())) {
			
    		System.out.println("You are a patron, welcome to the library.");
  	}
    	else if (name.equalsIgnoreCase(patron2.getName())) 
    	{System.out.println("You are a patron, welcome to the library.");
    		}
    	
    	else if (name.equalsIgnoreCase(patron1.getName())) {
    		System.out.println("You are a patron, welcome to the library.");
    	}
    			
   	else	
   	System.out.println("Welcome to the library, if you like our environment consider becoming a patron.");      
    		       
        }
    	
    	//following commented lines of code allow one to chose an author among listed ones and returns
        // the name of a book by the author from library collection.
       
//    	  System.out.println("Select from the authors below");
//          System.out.println("1. "+ book1.getAuthor());
//          System.out.println("2. "+ book2.getAuthor());
//          System.out.println("3. "+ book3.getAuthor());
//          System.out.println("4. "+ book4.getAuthor());
//          System.out.println("5. "+ book5.getAuthor());
          
    	
    	
//       Scanner scanner = new Scanner(System.in);
//       int choice = 0;
//
//       while (choice != 6) {
//           System.out.println("Select an Author from above ");
//           System.out.println("6. Quit");
//
//           System.out.print("Enter your choice: ");
//           choice = scanner.nextInt();
//           System.out.println("=========================================");
//           switch (choice) {
//               case 1:
//            	   System.out.println("You selected "+ book1.getAuthor());
//                   System.out.println(book1.getTitle()+": "+ "Availibility is " +book1.isAvailable());
//                   break;
//               case 2:
//                   System.out.println(book2.getTitle()+": "+ "Availibility is " +book2.isAvailable());
//                   break;
//               case 3:
//                   System.out.println(book3.getTitle()+": "+ "Availibility is " +book3.isAvailable());
//                   break;
//               case 4:
//                   System.out.println(book4.getTitle()+": "+"Availibility is " +book4.isAvailable());
//                   break;
//               case 5:
//                   System.out.println(book5.getTitle()+": "+"Availibility is " +book5.isAvailable());
//                   break;
//               case 6:
//                   System.out.println("Have a good day!");
//                   break;
//               default:
//                   System.out.println("Invalid choice.");
//                   break;
  //        }
   //    }
       
    } 
    }


