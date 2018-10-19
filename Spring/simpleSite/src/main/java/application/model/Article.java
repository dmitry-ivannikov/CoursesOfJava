package application.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Article implements Serializable, Comparable<Article> {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String title;
    @Column(length = 1000000)
    @Lob
    private String context;
    @Column
    private long creationTimestamp;

    public Article(){}

    public Article(String title, String context){
        this.context = context;
        this.title = title;
        this.creationTimestamp = System.currentTimeMillis();
    }

    @Override
    public int compareTo(Article that){
        return Long.compare(this.creationTimestamp, that.creationTimestamp);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
