package co.crisi.productmanagement.gateways.h2;

import co.crisi.productmanagement.boundaries.output.extract.ITechnicalProductExtractGateway;
import co.crisi.productmanagement.domain.TechnicalProduct;
import co.crisi.productmanagement.repositories.TechnicalProductJpaRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnicalProductExtractH2Gateway implements ITechnicalProductExtractGateway {


    @Autowired
    private TechnicalProductJpaRepository repository;

    @Override
    public Optional<TechnicalProduct> getById(String id) {
        return repository.findById(id)
                .map(tp -> new TechnicalProduct(tp.getId(), tp.getName(), tp.getDescription(), tp.getPrice(),
                        tp.getTechnicalInformation(), tp.getInstructionManual()));
    }

    @Override
    public List<TechnicalProduct> getAll() {
        var technicalProducts = new ArrayList<TechnicalProduct>();
        repository.findAll().forEach(tp -> technicalProducts.add(new TechnicalProduct(tp.getId(), tp.getName(), tp.getDescription(), tp.getPrice(),
                tp.getTechnicalInformation(), tp.getInstructionManual())));
        return technicalProducts;
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

}
