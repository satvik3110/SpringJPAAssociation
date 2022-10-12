package SpringBootTest3.Domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Country extends Model {

    @OneToMany(mappedBy = "country")
    private Set<City> city;

    @ManyToMany
    private Set<Language> languages;

    private String name;

    Country() {
        super();
    }
    public Country(String name) {
        this.name = name;
    }

    public Set<City> getCity() {
        return city;
    }
    public String getName() {
        return name;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }
}
