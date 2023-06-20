package co.crisi.productmanagement.gateways.h2;

import co.crisi.productmanagement.boundaries.output.extract.ICommonProductExtractGateway;
import co.crisi.productmanagement.domain.CommonProduct;
import co.crisi.productmanagement.gateways.mapper.CommonProductJpaMapper;
import co.crisi.productmanagement.repositories.CommonProductJpaRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonProductExtractH2Gateway implements ICommonProductExtractGateway {

    @Autowired
    private CommonProductJpaRepository repository;

    @Override
    public List<CommonProduct> getAll() {
        var products = new ArrayList<CommonProduct>();
        repository.findAll().forEach(product -> products.add(
                new CommonProduct(product.getId(), product.getName(), product.getDescription(), product.getPrice())));
        return products;
    }

    @Override
    public Optional<CommonProduct> findById(String id) {
        return repository.findById(id)
                .map(commonProductJpaMapper ->
                        new CommonProduct(commonProductJpaMapper.getId(), commonProductJpaMapper.getName(),
                                commonProductJpaMapper.getDescription(), commonProductJpaMapper.getPrice()));
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

}
