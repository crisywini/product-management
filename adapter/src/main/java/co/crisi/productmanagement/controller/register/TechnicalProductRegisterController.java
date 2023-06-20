package co.crisi.productmanagement.controller.register;

import co.crisi.productmanagement.boundaries.input.register.ITechnicalProductRegisterBoundary;
import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.request.register.TechnicalProductRequest;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class TechnicalProductRegisterController {

    private final ITechnicalProductRegisterBoundary boundary;

    @PostMapping("/technical")
    public ResponseEntity<TechnicalProductResponse> create(
            @RequestBody
                    TechnicalProductRequest request) throws ProductBusinessException {
        return ResponseEntity.ok(boundary.create(request));
    }

}
