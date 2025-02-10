import java.time.LocalDate;

public class PhysicalBook extends Book {
	 private boolean hasEbook;  // 전자책 제공 여부

    public PhysicalBook(int id, String title, Category category, String author,
                        LocalDate publicationDate, boolean hasEbook) {
        super(id, title, category, author, publicationDate);
        this.hasEbook = hasEbook;
    }
    
    @Override
    public void printData() {
    	printBaseData();
    	System.out.println("전자책 제공 여부: " + (hasEbook ? "제공" : "미제공"));

    }
}
