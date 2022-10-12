package SpringBootTest3.Controller;

import SpringBootTest3.Domain.Country;
import SpringBootTest3.Preservance.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class Controller {
    @Autowired
    private CountryRepository repository;

    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }
}
