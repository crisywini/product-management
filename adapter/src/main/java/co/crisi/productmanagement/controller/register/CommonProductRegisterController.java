package co.crisi.productmanagement.controller.register;

import co.crisi.productmanagement.boundaries.input.register.ICommonProductRegisterBoundary;
import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.request.CommonProductRequest;
import co.crisi.productmanagement.model.response.CommonProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommonProductRegisterController {

    private final ICommonProductRegisterBoundary boundary;

    @PostMapping
    public ResponseEntity<CommonProductResponse> create(
            @RequestBody
                    CommonProductRequest request) throws ProductBusinessException {
        return ResponseEntity.ok(boundary.create(request));
    }

}
