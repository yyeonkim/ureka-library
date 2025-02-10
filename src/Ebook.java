import java.time.LocalDate;

public class Ebook extends Book {
	private FileFormat fileFormat;  // 파일 형식 (PDF, EPUB)

    public Ebook(int id, String title, Category category, String author,
                 LocalDate publicationDate, FileFormat fileFormat) {
        super(id, title, category, author, publicationDate);
        this.fileFormat = fileFormat;
    }
    
    @Override
    public void printData() {
    	printBaseData();
    	System.out.println("파일 형식: " + fileFormat);
    }
}
