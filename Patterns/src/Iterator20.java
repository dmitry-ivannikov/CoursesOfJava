public class Iterator20 {
    public static void main(String[] args){
        AraContainer araContainer  = new AraContainer();
        Iterator iterator =  araContainer.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
        }
    }
}


interface Iterator{
    boolean hasNext();
    Object next();
}

interface Conteiner{
    Iterator getIterator();
}

class AraContainer implements Conteiner{
    String [] array = {"Max", "Jhon", "Mikhale"};

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return (index < array.length) ? true :false;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return array[index++];
            }
            return null;
        }

    }
}