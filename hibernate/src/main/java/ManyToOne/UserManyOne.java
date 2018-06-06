package ManyToOne;

import java.io.Serializable;

public class UserManyOne implements Serializable {
    private long id;
    private  int age;
    private String firstName;
    private  String lastNmae;

    public RoleManyOne getRoleManyOne() {
        return roleManyOne;
    }

    public void setRoleManyOne(RoleManyOne roleManyOne) {
        this.roleManyOne = roleManyOne;
    }

    private RoleManyOne roleManyOne;

    public UserManyOne(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNmae() {
        return lastNmae;
    }

    public void setLastNmae(String lastNmae) {
        this.lastNmae = lastNmae;
    }
}
