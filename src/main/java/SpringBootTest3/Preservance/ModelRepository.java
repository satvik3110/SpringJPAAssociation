package SpringBootTest3.Preservance;

import SpringBootTest3.Domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ModelRepository <T extends Model>
        extends JpaRepository<T, Long> {

}
