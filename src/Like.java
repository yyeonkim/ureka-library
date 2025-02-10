import java.time.LocalDate;

public class Like {
	private int bookId;               // 예약할 도서의 식별자
    private String userId;               // 예약 요청한 사용자의 식별자
    
    public Like(int bookId, String userId) {
        this.bookId = bookId;
        this.userId = userId;
    }
    
    public void like(Book book) {
    	int likeCount = book.getLikeCount();
        book.setLikeCount(likeCount + 1);
    }
    
    public void cancelLike(Book book) {
    	int likeCount = book.getLikeCount();
        book.setLikeCount(likeCount - 1);
    }
}
