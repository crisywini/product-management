package co.crisi.productmanagement.config;

import co.crisi.productmanagement.boundaries.input.register.ICommonProductRegisterBoundary;
import co.crisi.productmanagement.boundaries.output.register.ICommonProductRegisterGateway;
import co.crisi.productmanagement.domain.factory.ICommonProductFactory;
import co.crisi.productmanagement.domain.factory.impl.CommonProductFactory;
import co.crisi.productmanagement.gateways.h2.CommonProductCreationH2Gateway;
import co.crisi.productmanagement.interactors.CommonProductInteractor;
import co.crisi.productmanagement.presenter.CommonProductPresenter;
import co.crisi.productmanagement.presenter.ICommonProductPresenter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonProductConfig {


    @Bean
    public ICommonProductPresenter commonProductPresenter() {
        return new CommonProductPresenter();
    }

    @Bean
    public ICommonProductFactory commonProductFactory() {
        return new CommonProductFactory();
    }

    @Bean
    public ICommonProductRegisterGateway commonProductRegisterGateway() {
        return new CommonProductCreationH2Gateway();
    }

    @Bean
    public ICommonProductRegisterBoundary commonProductInputBoundary(ICommonProductPresenter commonProductPresenter,
            ICommonProductFactory commonProductFactory, ICommonProductRegisterGateway commonProductRegisterGateway) {
        return new CommonProductInteractor(commonProductPresenter, commonProductFactory, commonProductRegisterGateway);
    }


}
