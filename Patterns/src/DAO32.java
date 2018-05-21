public class DAO32 {
    //static Db db = new Db();
    //static FileSystem fileSystem = new FileSystem();
    static Data data = new FileSystem();
    public static void main(String[] args){
        System.out.println(data.getData());
    }
}
interface Data{
    String getData();
}
class Db implements Data{
    String getFromTable() {
        return "data from table";
    }

    @Override
    public String getData() {
        return getFromTable();
    }
}
class FileSystem implements Data{
    String getDataFromFs(){
        return "data from fs";
    }

    @Override
    public String getData() {
        return getDataFromFs();
    }
}