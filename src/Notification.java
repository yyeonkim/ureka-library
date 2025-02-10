import java.time.LocalDate;

public class Notification {
	private String notificationMessage;        // 알림 내용
    private LocalDate notificationDate;        // 알림을 보낸 날짜
    private NotificationType notificationType; // 알림 유형
    
    // 예약 알림 전송
    public void sendReservationNotification(User user) {
        this.notificationType = NotificationType.RESERVATION;
        this.notificationMessage = "예약이 완료되었습니다.";
        this.notificationDate = LocalDate.now();

        System.out.println("[" + notificationType.toString() + "] " + user.getName() + "님, " + notificationMessage);
        System.out.println("전송일: " + notificationDate);
    }
    
    // 연체 알림 전송
    public void sendOverdueNotification(User user) {
        this.notificationType = NotificationType.OVERDUE;
        this.notificationMessage = "대출하신 도서가 연체되었습니다. 반납해 주세요.";
        this.notificationDate = LocalDate.now();

        System.out.println("[" + notificationType.toString() + "] " + user.getName() + "님, " + notificationMessage);
        System.out.println("전송일: " + notificationDate);
    }
    
    // 대출 알림 전송
    public void sendLoanNotification(User user) {
        this.notificationType = NotificationType.LOAN;
        this.notificationMessage = "대출이 완료되었습니다.";
        this.notificationDate = LocalDate.now();

        System.out.println("[" + notificationType.toString() + "] " + user.getName() + "님, " + notificationMessage);
        System.out.println("전송일: " + notificationDate);
    }
}
