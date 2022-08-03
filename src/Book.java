public class Book implements Comparable<Book> {
    private String name;
    private String writerName;
    private int page;

    private int date;


    public Book(String name, String writerName, int page, int date) {
        this.name = name;
        this.writerName = writerName;
        this.page = page;
        this.date = date;
    }

    @Override
    public int compareTo(Book b) {
        return getName().compareTo(b.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
