package zw.co.arfel.clothing.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by tafadzwa on 7/14/17.
 */
@Entity
public class Orders extends BaseEntityName {

    private  Customer customer;
    private  Advert advert;

    @ManyToOne
    public Advert getAdvert() {
        return advert;
    }

    public void setAdvert(Advert advert) {
        this.advert = advert;
    }

    @ManyToOne
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
