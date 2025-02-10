
public enum FileFormat {
	PDF("PDF"),
    EPUB("EPUB");

    private String format;

    FileFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return format;
    }
}
