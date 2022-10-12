package SpringBootTest3.Domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Language extends Model{

    @ManyToMany()
    private Set<Country> countries;

    private String name;


    Language(){
        super();
    }
    public Language(String name) {
        this.name = name;
    }

    public Set<Country> getCountries() {
        return countries;
    }
    public String getName() {
        return name;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }
}
