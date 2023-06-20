package co.crisi.productmanagement.interactors;

import co.crisi.productmanagement.boundaries.output.register.ICommonProductRegisterGateway;
import co.crisi.productmanagement.domain.IProduct;
import co.crisi.productmanagement.domain.factory.ICommonProductFactory;
import co.crisi.productmanagement.domain.factory.impl.CommonProductFactory;
import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.interactors.register.CommonProductInteractor;
import co.crisi.productmanagement.model.CommonProductRequestMother;
import co.crisi.productmanagement.model.response.CommonProductResponse;
import co.crisi.productmanagement.presenter.ICommonProductPresenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

class CommonProductInteractorTest {

    @Mock
    private ICommonProductPresenter presenter;

    private ICommonProductFactory factory;

    @Mock
    private ICommonProductRegisterGateway gateway;

    private CommonProductInteractor interactor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        factory = new CommonProductFactory();
        interactor = new CommonProductInteractor(presenter, factory, gateway);
    }


    @Test
    void createWhenNormalRequest_shouldPrepareSuccessfulView() throws ProductBusinessException {
        //Given
        var request = CommonProductRequestMother.random();
        given(gateway.existsById(request.id()))
                .willReturn(false);

        //When
        var response = interactor.create(request);

        //Then
        verify(gateway).save(any(IProduct.class));
        verify(presenter).prepareSuccessfulView(any(CommonProductResponse.class));
    }


}