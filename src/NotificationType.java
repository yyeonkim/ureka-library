
public enum NotificationType {
	RESERVATION("예약 알림"),
	OVERDUE("연체 알림"),
	LOAN("대출 알림");

    private String displayName;

	NotificationType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
