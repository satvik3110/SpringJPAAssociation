package SpringBootTest3.Preservance;

import SpringBootTest3.Domain.City;
import SpringBootTest3.Domain.Country;
import SpringBootTest3.Domain.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class DataPopulator implements CommandLineRunner {
    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private LanguageRepository languageRepository;

    @Override
    public void run(String... args) throws Exception {
        final var hindi= languageRepository.save(new Language("Hindi"));
        final var english= languageRepository.save(new Language("English"));

        final var country = countryRepository.save(new Country("India"));

        country.setLanguages(Set.of(hindi, english));

        countryRepository.save(country);

        cityRepository.save(new City(country, "New Delhi"));
    }
}
