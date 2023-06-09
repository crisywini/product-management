package co.crisi.productmanagement.gateways.h2;

import co.crisi.productmanagement.boundaries.output.register.ITechnicalProductRegisterGateway;
import co.crisi.productmanagement.domain.ITechnicalProduct;
import co.crisi.productmanagement.gateways.mapper.TechnicalProductJpaMapper;
import co.crisi.productmanagement.repositories.TechnicalProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnicalProductCreationH2Gateway implements ITechnicalProductRegisterGateway {

    @Autowired
    private TechnicalProductJpaRepository repository;

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void save(ITechnicalProduct product) {
        var entity = new TechnicalProductJpaMapper(product.getId(), product.getName(), product.getDescription(),
                product.getPrice(), product.getTechnicalInformation(),
                product.getInstructionManual());
        repository.save(entity);
    }

}
