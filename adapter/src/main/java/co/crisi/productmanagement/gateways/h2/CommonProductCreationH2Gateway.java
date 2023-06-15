package co.crisi.productmanagement.gateways.h2;

import co.crisi.productmanagement.boundaries.output.register.ICommonProductRegisterGateway;
import co.crisi.productmanagement.domain.IProduct;
import co.crisi.productmanagement.gateways.mapper.CommonProductJpaMapper;
import co.crisi.productmanagement.repositories.CommonProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonProductCreationH2Gateway implements ICommonProductRegisterGateway {

    @Autowired
    private CommonProductJpaRepository repository;

    @Override
    public void save(IProduct product) {
        var entity = new CommonProductJpaMapper(product.getId(), product.getName(), product.getDescription(),
                product.getPrice());
        repository.save(entity);
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

}
