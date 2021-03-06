import java.lang.*;

public class TextBook extends Book {

    private int standard;

    public TextBook()
	{
        System.out.println("Empty TextBook Called!");
    }
    public TextBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,int standard)
	{

        super(isbn,bookTitle,authorName,price,availableQuantity);
        System.out.println("Parameterized TextBook Called!");
        this.standard=standard;
    }

    
    public void setStandard(int standard)
	{
        this.standard=standard;
    }
    public int getStandard()
	{
        return standard;
    }

    public void showDetails()
	{

        System.out.println("\nShowing Details for TextBook");
        super.showDetails();
        System.out.println("Standard                               : "+standard);
    }
}
