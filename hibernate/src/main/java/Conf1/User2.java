package Conf1 ;

import java.io.Serializable;

public class User2 implements Serializable{
    private  long id;
    private int age;
    private String firstname;
    private String lastname;

    private Role3 role3;

    public Role3 getRole3() {
        return role3;
    }

    public void setRole3(Role3 role3) {
        this.role3 = role3;
    }


    public User2(){

    }

    public User2( long id){
        this.id = id;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
