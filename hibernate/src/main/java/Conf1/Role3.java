package Conf1;

import java.util.Set;

public class Role3 {
    private Long id;
    private String title;
    private User2 user2;

    public User2 getUser2() {
        return user2;
    }

    public void setUser2(User2 user2) {
        this.user2 = user2;
    }


    public Role3(){}



//       private Set<User2> user2s;//many to many
//
//        public Set<User2> getUser2s() {//many to many
//            return user2s;
//        }
//
//        public void setUser2s(Set<User2> user2s) {//many to many
//            this.user2s = user2s;
//        }

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
