import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<Book>();
        Book book1 = new Book("Harry Potter","J.K. Rowling",300,1995);
        Book book2 = new Book("Yüzüklerin Efendisi","J.R.R. Tolkien", 375,1990);
        Book book3 = new Book("Da Vinci'nin Şifresi","Dan Brown",350,2005);
        Book book4 = new Book("Homo Sapiens","Yuval Noah Harrari",450, 2002);
        Book book5 = new Book("Hayvan Çiftliği", "George Orwell", 260 , 1940);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("Kitap ismine göre sıralama ;");
        for (Book book : books){
            System.out.println("Kitap ismi : " + book.getName() +
                    " Yazar : " + book.getWriterName() +
                    " Sayfa : " + book.getPage() +
                    " Tarih : " + book.getDate());
        }

        TreeSet<Book> books2= new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage()-o2.getPage();
            }
        });

        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);
        System.out.println();
        System.out.println("Sayfa sayısına göre sıralama :");
        for (Book book : books2){
            System.out.println("Kitap ismi : " + book.getName() +
                    " Yazar : " + book.getWriterName() +
                    " Sayfa : " + book.getPage() +
                    " Tarih : " + book.getDate());
        }

    }
}
