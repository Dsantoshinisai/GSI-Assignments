package Assignments;

class Book
{
	String title;
	String author ;
	
	static String libraryNmae = " City Library";
	
	final int ISBN = 12345;
	
	String Booktitle = "java";
	Book(String title1,String author1)
	{
		
		this.title=title1;
		this.author=author1;
		
	}
	
	public Book() 
	{
		
	}

	void display()
	{
		System.out.println("Title : " + this.title);
		System.out.println("Author : " + this.author);
	}
	
	void getDescription()
	{
		System.out.println("This is a physical book");
	}
	
   static void showLibrary()
	{
		System.out.println("Library: " +libraryNmae );
	}
}

class EBook extends Book
{
	int FileSize ;
	final double ISBN = 1234565422;

	EBook(String title1, String author1,int FileSize1 )
	{
		super(title1, author1);
		this.FileSize= FileSize1;
		// TODO Auto-generated constructor stub

	}
	
	
	
	void display()
	{
		super.display();
		System.out.println("File Size : "+ this.FileSize+"MB");
		

	}
	@Override
	void getDescription()
	{
		System.out.println("This is an electronIc book.");
	}
	
	 
} 

public class BookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        EBook obj = new EBook("Atomic Habits", "James Clear",5);
        obj.display();
        obj.getDescription();
        
       Book obj2 = new Book();
       Book.showLibrary();
       System.out.println();
		
      System.out.println("ISBN : "+ obj2.ISBN);
     // obj.ISBN = 54123; 
      String Booktitle = "java";
      
      String title1 =   Booktitle.toUpperCase();
    
      System.out.println("Uppercase : "+title1);
      
      int len = title1.length();
      
      System.out.println(" length : " +len);
      
      System.out.println(title1.contains("JAVA"));

      }

}
