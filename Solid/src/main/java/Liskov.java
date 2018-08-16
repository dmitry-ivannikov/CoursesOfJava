public class Liskov {
    static Rectangle getRect(){
        return new Rectangle();
    }
    public static void main(String[] args) {
        Rectangle rectangle = getRect();
        rectangle.setHeight(7);
        rectangle.setWith(4);
        System.out.println(rectangle.getSquare());
    }
}
interface Shape{
    int getSquere();
}

class Rectangle implements Shape{
    int with;
    int height;

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getSquare(){
        return with * height;
    }

    public int getSquere() {
        return 0;
    }
}

class Square implements Shape{
    int with;

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getSquere() {
        return with * with ;
    }

}