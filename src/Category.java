
public enum Category {
	FICTION("소설"),
    SCIENCE("과학"),
    HISTORY("역사"),
    FANTASY("판타지"),
    BUSINESS("비즈니스");

    private String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
