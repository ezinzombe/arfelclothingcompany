package zw.co.arfel.clothing.model;

import javax.persistence.MappedSuperclass;

/**
 * Created by ezinzombe on 7/14/17.
 */
@MappedSuperclass
public abstract class BaseEntityName extends BaseEntityId{

    private String name;
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }
}
