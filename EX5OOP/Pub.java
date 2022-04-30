/* Write a program has classes Publisher, Book, Literature and Fiction. Read the
information and print the details of books from either the category, using
inheritance
Class Publisher- Attribute PublisherName, Method display()
Class Book subclass of Publisher- Attribute- Title, Author, Method display()
Class Literature subclass of Book-Attribute-type, Method display()
Class Fiction subclass of Book-Attribute-genre, Method display()*/

import java.util.*;

class Publisher
{
    String pname;
    Publisher(String n)//constructor
    {
      pname=n;
    }
    void display()
   {
      System.out.println("Publisher name : "+pname);

   }

}

class Book extends Publisher//subclass of Publisher
{
   String title,author;
   Book(String n,String t,String a)//constructor
   {
     super(n);//invoking parent constructor
     title=t;
     author=a;
   }
   void display()
   {
      super.display();//invoking parent class display()
      System.out.println("Book title : "+title);
      System.out.println("Author : "+author);
   }

}


class Literature extends Book//subclass of book
{
    String type;
    Literature(String n,String t,String a,String typ)//constructor
    {
       super(n,t,a);//invoking parent constructor
       type=typ;
    }
     void display()
   {
      super.display();//invoking parent class display
      System.out.println("Type : "+type);

   }
}



class Fiction extends Book//subclass of book
{
     String genre;
      Fiction(String n,String t,String a,String r)//constructor
      {
         super(n,t,a);//invoking parent constructor
         genre=r;
       }
      void display()
      {
       super.display();//invoking parent class display
      System.out.println("Genre : "+genre);

     }
}

class Pub
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Number of Books of literature: ");
     
      int n1=s.nextInt();
      System.out.println("Enter Number of Books of Fictoin: ");
     
      int n2=s.nextInt();
    
      Book ref;
         Literature obj1[]=new Literature[n1];
         Fiction obj2[]=new Fiction[n2];
         int i=0;
         int j=0;
 
         do
	{
           System.out.println("\nEnter Literature Book details  "+(i+1));
           System.out.println("Enter Publisher name :  ");
           String p=s.next();
           System.out.println("Enter Book name:");
           String bk=s.next();
           System.out.println("Enter Author name:");
           String au=s.next();
           System.out.println("Enter Literature type:");
           String lt=s.next();
           obj1[i]=new Literature(p,bk,au,lt);
            i++;
          }
	while(i<n1);
         
       
     
           do  {
                System.out.println("\n\nEnter Fiction Book details  "+(j+1));
           System.out.println("Enter Publisher name :  ");
           String p=s.next();
           System.out.println("Enter Book name :  ");
           String bk=s.next();
           System.out.println("Enter Author name :  ");
           String au=s.next();
           
           System.out.println("Enter Fiction type :  ");
           String lt=s.next();
           obj2[j]=new Fiction(p,bk,au,lt);
         j++;

         }while(j<n2);
       
     	while(true)
          {
     	System.out.println("\n\n1.LITERATURE\n2.FICTION\n3.EXIT\n\nEnter work type to show....\n");
             int ch2=s.nextInt();
    switch(ch2){
        case 1:
           for(i=0;i<n1;i++)
        {
               System.out.println("\n____LITERATURE BOOK INFORMATION "+ (i+1)+"___\n");
               obj1[i].display();
             }
       break;
        case 2:
                  for(j=0;j<n2;j++){
               System.out.println("\n____FICTION BOOK INFORMATION "+(j+1)+"___\n");
               obj2[j].display();    
         }
          break;
    	case 3:System.exit(0);
      	default:System.out.println("invalid");
       
      }

     }
}
}
             





