package Models;



import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Role extends Model{


    @Column(name = "title")
    private String title;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<User>();


    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

//    public Role(long id) {this.id = id;}
    public Role() {}



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
