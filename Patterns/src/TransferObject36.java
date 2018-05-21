public class TransferObject36 {
    public static void main(String[] args) {
        BO bo = new BO();
        System.out.println(bo.getUser().getName());
    }
}
class User{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class SService{
    public User getUser(){
        User user = new User();
        user.setName("Sem");
        return new User();
    }
}
class BO{
    SService sService = new SService();
    public User getUser(){
      return sService.getUser();
    }
}