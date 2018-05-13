import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dimas on 08.09.17.
 */
public class Main {

   // List list = Collections.synchronizedList(new ArrayList());

    public static void main(String[] args){
        final NameList nameList = new NameList();
        nameList.add("first");

        class MyTread extends Thread{
            @Override
            public void run(){
                System.out.println(nameList.removeFirst());
            }
        }

        MyTread myTread = new MyTread();
        myTread.setName("one");
        myTread.start();
        new MyTread().start();


    }

    static class NameList{
        private List list = Collections.synchronizedList(new ArrayList());

        public void add(String name){
            list.add(name);
        }

        public synchronized String removeFirst(){
            if (list.size() > 0)
            {return (String)list.remove(0);} return null;
        }
    }
}
