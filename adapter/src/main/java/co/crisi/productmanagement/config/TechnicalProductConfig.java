package co.crisi.productmanagement.config;

import co.crisi.productmanagement.boundaries.input.extract.ITechnicalProductExtractBoundary;
import co.crisi.productmanagement.boundaries.input.register.ITechnicalProductRegisterBoundary;
import co.crisi.productmanagement.boundaries.output.extract.ITechnicalProductExtractGateway;
import co.crisi.productmanagement.boundaries.output.register.ITechnicalProductRegisterGateway;
import co.crisi.productmanagement.domain.factory.ITechnicalProductFactory;
import co.crisi.productmanagement.domain.factory.impl.TechnicalProductFactory;
import co.crisi.productmanagement.gateways.h2.TechnicalProductCreationH2Gateway;
import co.crisi.productmanagement.gateways.h2.TechnicalProductExtractH2Gateway;
import co.crisi.productmanagement.interactors.extract.TechnicalProductExtractInteractor;
import co.crisi.productmanagement.interactors.register.TechnicalProductInteractor;
import co.crisi.productmanagement.presenter.ITechnicalProductExtractPresenter;
import co.crisi.productmanagement.presenter.ITechnicalProductPresenter;
import co.crisi.productmanagement.presenter.extract.TechnicalProductExtractPresenter;
import co.crisi.productmanagement.presenter.register.TechnicalProductPresenter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TechnicalProductConfig {

    @Bean
    public ITechnicalProductPresenter technicalProductPresenter() {
        return new TechnicalProductPresenter();
    }

    @Bean
    public ITechnicalProductFactory technicalProductFactory() {
        return new TechnicalProductFactory();
    }

    @Bean
    public ITechnicalProductRegisterGateway technicalProductRegisterGateway() {
        return new TechnicalProductCreationH2Gateway();
    }

    @Bean
    public ITechnicalProductRegisterBoundary technicalProductInputBoundary(
            ITechnicalProductPresenter technicalProductPresenter, ITechnicalProductFactory technicalProductFactory,
            ITechnicalProductRegisterGateway technicalProductRegisterGateway) {
        return new TechnicalProductInteractor(technicalProductPresenter, technicalProductRegisterGateway,
                technicalProductFactory);
    }

    @Bean
    public ITechnicalProductExtractPresenter technicalProductExtractPresenter() {
        return new TechnicalProductExtractPresenter();
    }

    @Bean
    public ITechnicalProductExtractGateway technicalProductExtractGateway() {
        return new TechnicalProductExtractH2Gateway();
    }

    @Bean
    public ITechnicalProductExtractBoundary technicalProductExtractBoundary() {
        return new TechnicalProductExtractInteractor(technicalProductExtractGateway(),
                technicalProductExtractPresenter());
    }

}
