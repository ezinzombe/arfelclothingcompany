package zw.co.arfel.clothing.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by tafadzwa on 7/14/17.
 */
@Entity
@RequestMapping("/advert")
public class Advert extends BaseEntityName {

    private BigDecimal price;
    @Column(name = "email")
    @NotEmpty(message = "*Please provide a description")
    private String notes;
    private AdvertCategory advertCategory;
    private Comment comment;
    private MultipartFile advertImage;

    @Transient
    public MultipartFile getAdvertImage() {
        return advertImage;
    }

    public void setAdvertImage(MultipartFile advertImage) {
        this.advertImage = advertImage;
    }

    @ManyToOne
    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Enumerated(EnumType.STRING)
    public AdvertCategory getAdvertCategory() {
        return advertCategory;
    }

    public void setAdvertCategory(AdvertCategory advertCategory) {
        this.advertCategory = advertCategory;
    }


}
