import java.util.LinkedList;
import java.util.List;

public class ObjectPool8 {
    public static void main(String[] args){
        //переисползуем объекты, которые сложно создавать
        ObjectPool objectPool = new ObjectPool();
        PooledObject pooledObject = objectPool.getPooledObject();
        objectPool.relesePooledObject(pooledObject);
    }
}

class PooledObject{}

class ObjectPool{
    List<PooledObject> free = new LinkedList<>();
    List<PooledObject> used = new LinkedList<>();

    public PooledObject getPooledObject(){
        if(free.isEmpty()){
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        } else {
            PooledObject pooledObject = free.get(0);
            used.add(pooledObject);
            free.remove(pooledObject);
            return pooledObject;
        }
    }

    public void relesePooledObject(PooledObject pooledObject){
        used.remove(pooledObject);
        free.add(pooledObject);
    }
}
