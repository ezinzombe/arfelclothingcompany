package zw.co.arfel.clothing.model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ezinzombe on 7/14/17.
 */
public enum AdvertCategory {

    GENTS("Gents"),
    LADIES("Ladies"),
    CHILDREN("Children");


    private final String name;

    AdvertCategory(String name) {
        this.name = name;
    }

    public static List<AdvertCategory> asList() {
        return Arrays.asList(AdvertCategory.values());
    }

    public String getName() {
        return name;
    }
}
