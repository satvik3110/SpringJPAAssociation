package SpringBootTest3.Domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class City extends Model {
    @ManyToOne
    private Country country;

    private String name;

    City() {
        super();
    }
    public City(Country country, String name) {
        this();
        this.country = country;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
