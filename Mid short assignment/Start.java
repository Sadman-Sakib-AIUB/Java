import java.lang.*;

public class Start {
    public static void main(String[] args) 
	{
		System.out.println("\n================== MID SHORT ASSIGNMENT===================");
        System.out.println("\n             NAME: MD.SADMAN HOSSAIN");
        System.out.println("\n             ID: 22-46061-1");
		System.out.println("\n==========================================================");
        
        StoryBook sb1 = new StoryBook();
        StoryBook sb2 = new StoryBook("1111111","Harry Poter","J. K. Rowling",650.50,500,"Fiction");
		
		
		sb2.setIsbn("1111111");
        sb2.setBookTitle("Harry Poter2");
        sb2.setAuthorName("J. K. Rowling");
        sb2.setPrice(450.00);
        sb2.setAvailableQuantity(500);
		sb2.setCategory("Fiction");
		sb2.addQuantity(30);
		sb2.sellQuantity(20);
		sb2.showDetails();
		
		
		System.out.println("\n");
        System.out.println("ISBN                                  : "+sb2.getIsbn());
        System.out.println("Book Title                            : "+sb2.getBookTitle());
        System.out.println("Author Name                           : "+sb2.getAuthorName());
        System.out.println("Price including discount              : "+sb2.getPrice()+" USD");
        System.out.println("Available Quantity                    : "+sb2.getAvailableQuantity());
        System.out.println("Category                              : "+sb2.getCategory());
	
	
        TextBook tb1 = new TextBook();
        TextBook tb2 = new TextBook("2222222","Discrete Mathematics And Its Application","Rosen",850.00,80,5);



        tb2.setIsbn("22222222");
        tb2.setBookTitle("Discrete Mathematics And Its Application2");
        tb2.setAuthorName("Rosen");
        tb2.setPrice(550.00);
        tb2.setAvailableQuantity(80);
        tb2.setStandard(7);
		tb2.addQuantity(30);
		tb2.sellQuantity(20);
        tb2.showDetails();
		
        System.out.println("\n");
        System.out.println("ISBN                                  : "+tb2.getIsbn());
        System.out.println("Book Title                            : "+tb2.getBookTitle());
        System.out.println("Author Name                           : "+tb2.getAuthorName());
        System.out.println("Price including discount              : "+tb2.getPrice()+" USD");
        System.out.println("Available Quantity                    : "+tb2.getAvailableQuantity());
        System.out.println("Standard                              : "+tb2.getStandard());


    }
}
