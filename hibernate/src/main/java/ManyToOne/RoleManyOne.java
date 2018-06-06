package ManyToOne;

import java.util.Set;

public class RoleManyOne {
    private  Long id;
    private String title;

    private Set<UserManyOne> userManyOnes;

    public Set<UserManyOne> getUserManyOnes() {
        return userManyOnes;
    }

    public void setUserManyOnes(Set<UserManyOne> userManyOnes) {
        this.userManyOnes = userManyOnes;
    }

    public RoleManyOne(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
