import java.time.LocalDate;

public class Loan {
	private String userId;         // 대출한 사용자 ID
    private int bookId;         // 대출한 책 ID
    private int loanPeriod = 14; // 대출 기간
    private LocalDate startDate; // 대출 시작일
    private LocalDate endDate;   // 대출 종료일 (startDate + loanPeriod)    
    
    public Loan(String userId, int bookId, LocalDate startDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.startDate = startDate;
        this.endDate = startDate.plusDays(loanPeriod); // 대출 종료일 계산
    }
    
    // 대출하다
    public void checkOutBook(Book book) {
    	book.setCheckedOut(true);
    }
}
