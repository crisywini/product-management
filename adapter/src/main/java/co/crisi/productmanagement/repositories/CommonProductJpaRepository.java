package co.crisi.productmanagement.repositories;

import co.crisi.productmanagement.gateways.mapper.CommonProductJpaMapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonProductJpaRepository extends PagingAndSortingRepository<CommonProductJpaMapper, String>,
        CrudRepository<CommonProductJpaMapper, String> {

}
