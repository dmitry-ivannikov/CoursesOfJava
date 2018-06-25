package Models;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class Model implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    public Model(){

    }

    public Model(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
