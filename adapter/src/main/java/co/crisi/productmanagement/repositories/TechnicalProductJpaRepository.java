package co.crisi.productmanagement.repositories;

import co.crisi.productmanagement.gateways.mapper.TechnicalProductJpaMapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalProductJpaRepository extends PagingAndSortingRepository<TechnicalProductJpaMapper, String>,
        CrudRepository<TechnicalProductJpaMapper, String> {

}
