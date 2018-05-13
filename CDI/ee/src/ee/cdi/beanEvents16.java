package ee.cdi;

import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@WebServlet("/beve")
public class beanEvents16 extends HttpServlet{
    @Inject
    BookServise bookServise;
    @Inject
    Subscriber subscriber;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book one = new Book("one");
        bookServise.addBook(one);
        bookServise.addBook(new Book("two"));
        bookServise.removeBook(one);
        bookServise.addBook(new Book("three"));

        resp.getWriter().write(subscriber.list.size() + "");
        resp.getWriter().write(subscriber.list.get(0).getName());
    }

}
@Qualifier
@Retention(RUNTIME)
@Target({METHOD, TYPE, FIELD, PARAMETER})
@interface Add{}

@Qualifier
@Retention(RUNTIME)
@Target({METHOD, TYPE, FIELD, PARAMETER})
@interface Remove{}

class Book{
    String name;

    Book(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class BookServise{
    @Inject
            @Add
    Event<Book> addEvent;
    @Inject
            @Remove
    Event<Book> removeEvent;
    public void addBook(Book book){
        System.out.println(book.getName() + "Book was added");
        addEvent.fire(book);
    }


    public void removeBook(Book book){
        System.out.println(book.getName() + "book was deleted");
        removeEvent.fire(book);
    }
}

@Singleton
class Subscriber {
    List<Book> list = new ArrayList<>();
    public void add(@Observes @Add Book book){
        System.out.println(book.getName() + "added to list");
        list.add(book);
    }
    public void delete(@Observes @Remove Book book){
        System.out.println(book.getName() + "delete book");
        list.remove(book);
    }
}