import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		PhysicalBook historyPBook = new PhysicalBook(
                1,
                "역사의 발견",
                Category.HISTORY,
                "홍길동",
                LocalDate.of(2022, 1, 15),
                true
        );
		Ebook fantasyEbook = new Ebook(
                2,
                "판타지 세계",
                Category.FANTASY,
                "김마법",
                LocalDate.of(2021, 6, 10),
                FileFormat.EPUB
        );
		Ebook historyEBook = new Ebook(
                5,
                "역사의 발견",
                Category.HISTORY,
                "홍길동",
                LocalDate.of(2022, 2, 10),
                FileFormat.EPUB
        );
		historyEBook.printData(); // 책 정보 출력
		printHorizontalRule();
		
		User user1 = new User("김용연", "yyeonkim");
		Notification notification = new Notification();
		Loan loan = new Loan(user1.getId(), historyEBook.getId(), LocalDate.now()); // 대출
		
		loan.checkOutBook(historyEBook);
		notification.sendLoanNotification(user1);
		printHorizontalRule();
		historyEBook.printData(); // 책 정보 출력
		printHorizontalRule();
		
		User user2 = new User("유레카", "ureka");
		Reservation reservation = new Reservation(historyEBook.getId(), user2.getId());
		
		reservation.reserve(historyEBook);
		notification.sendReservationNotification(user2);
		printHorizontalRule();
		
		Like likeInst = new Like(historyEBook.getId(), user2.getId());
		likeInst.like(historyEBook);		
		historyEBook.printData(); // 책 정보 출력
	}
	
	static void printHorizontalRule() {
		System.out.println("-----------------------");
	}

}
