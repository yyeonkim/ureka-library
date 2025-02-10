import java.time.LocalDate;

abstract class Book {
    private int id;                     // 아이디
    private String title;               // 제목
    private Category category;          // 카테고리
    private String author;              // 작가
    private LocalDate publicationDate;  // 출간일
    private boolean checkedOut = false;         // 대출 여부 (대출 중이면 true, 재고 있으면 false)
    private int likeCount = 0;                  // 좋아요 개수
    private int reservationCount = 0;       // 예약 개수
    
    protected Book(int id, String title, Category category, String author,
	            LocalDate publicationDate) {
	    this.id = id;
	    this.title = title;
	    this.category = category;
	    this.author = author;
	    this.publicationDate = publicationDate;
	}
    
    // 대출 여부 설정
    protected void setCheckedOut(boolean status) {
    	this.checkedOut = status;
    }
    
    // 예약 설정
    protected void setReservationCount(int count) {
    	this.reservationCount = count;
    }
    
    // 좋아요 설정
    protected void setLikeCount(int count) {
    	this.likeCount = count;
    }
    
    protected int getId() {
    	return this.id;
    }
    
    protected int getReservationCount() {
    	return this.reservationCount;
    }
    
    protected int getLikeCount() {
    	return this.likeCount;
    }
    
    // 공통 정보를 반환하는 헬퍼 메소드
    protected void printBaseData() {
    	System.out.println("제목: " + title);
    	System.out.println("카테고리: " + category);
    	System.out.println("작가: " + author);
    	System.out.println("출간일: " + publicationDate);
    	System.out.println("상태: " + (checkedOut ? "대출중" : "재고 있음"));
    	System.out.println("좋아요 수: " + likeCount);
    	System.out.println("예약 수: " + reservationCount);
    }

    public abstract void printData();
}