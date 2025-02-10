import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Overdue {
	// 연체 일수 계산
	public int calculateOverdueDays(LocalDate loanEndDate) {		
		if (isOverdue(loanEndDate)) {
            return (int) ChronoUnit.DAYS.between(loanEndDate, LocalDate.now());
        }
		return 0;
	}
	
	// 연체 여부
	public boolean isOverdue(LocalDate loanEndDate) {
		LocalDate today = LocalDate.now();
		
		if (today.isAfter(loanEndDate)) {
			return true;
		}
		return false;
	}
}
