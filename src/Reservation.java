import java.time.LocalDate;

public class Reservation {
	private int bookId;               // 예약할 도서의 식별자
    private String userId;               // 예약 요청한 사용자의 식별자
    private LocalDate reservationDate;   // 예약 가능(대출 가능) 날짜
    
    public Reservation(int bookId, String userId) {
        this.bookId = bookId;
        this.userId = userId;
    }
    
    public void reserve(Book book) {
    	int reservationCount = book.getReservationCount();
        book.setReservationCount(reservationCount + 1);
        
        this.reservationDate = LocalDate.now();
    }
    
    public void cancleReservation(Book book) {
    	int reservationCount = book.getReservationCount();
        book.setReservationCount(reservationCount - 1);
        
        this.reservationDate = null;
    }
}
