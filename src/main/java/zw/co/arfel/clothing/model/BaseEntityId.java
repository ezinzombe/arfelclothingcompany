package zw.co.arfel.clothing.model;

import javax.persistence.*;

/**
 * Created by ezinzombe on 7/14/17.
 */
@MappedSuperclass
public abstract class BaseEntityId {

    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Transient
    public boolean isNew() {
        return (getId() == null);
    }
}
