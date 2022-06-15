import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		System.out.println("\n********** Lab Task - 3 **********");
		System.out.println("-------------------------------------");
        System.out.println("NAME : MD. SADMAN HOSSAIN");
        System.out.println("ID   : 22-46061-1");
		
		StoryBook sb1 = new StoryBook ();
		StoryBook sb2 = new StoryBook ("9876ML432","Harry Poter","J. K. Rowling",650.56,400,"Fiction");
		
		
		StoryBook.setDiscountRate(20.00);
		StoryBook.getDiscountRate();
		
		sb2.showDetails();
		
		sb2.addQuantity(5);
		sb2.sellQuantity(8);
		
		
		sb2.setIsbn("9876ML9999");
        sb2.setBookTitle("Sherlock Holmes");
        sb2.setAuthorName("Doyle");
        sb2.setPrice(750.55);
        sb2.setCategory("Detective");
		
		
		System.out.println("\nShowing Information of StoryBook by Set Get");
        System.out.println("ISBN                                   : "+sb2.getIsbn());
        System.out.println("Book Title                             : "+sb2.getBookTitle());
        System.out.println("Author Name                            : "+sb2.getAuthorName());
        System.out.println("Price after Discount                   : "+sb2.getPrice()+" USD");
        System.out.println("Available Quantity                     : "+sb2.getAvailableQuantity());
        System.out.println("Category                               : "+sb2.getCategory());
		
		
		
		TextBook t1 = new TextBook();
        TextBook t2 = new TextBook("55555ML9999","Discrete Mathematics And Its Application","Rosen",850.00,7,5);
		
		TextBook.setDiscountRate(30.00);
        TextBook.getDiscountRate();
		
		t2.showDetails();
		
		
		
        t2.setIsbn("44444GLK6543");
        t2.setBookTitle("Head First Java");
        t2.setAuthorName("Kathy Sierra");
        t2.setPrice(700.00);
        t2.setStandard(6);
		
		
		System.out.println("\nShowing Information of TextBook by Set Get");
        System.out.println("ISBN                                  : "+t2.getIsbn());
        System.out.println("Book Title                            : "+t2.getBookTitle());
        System.out.println("Author Name                           : "+t2.getAuthorName());
        System.out.println("Price After Discount                  : "+t2.getPrice()+" USD");
        System.out.println("Available Quantity                    : "+t2.getAvailableQuantity());
        System.out.println("Standard                              : "+t2.getStandard());
	}
}