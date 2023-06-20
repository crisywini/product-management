package co.crisi.productmanagement.controller.extract;

import co.crisi.productmanagement.boundaries.input.extract.ICommonProductExtractBoundary;
import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.CommonProductResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/common")
public class CommonProductExtractController {

    @Autowired
    private ICommonProductExtractBoundary boundary;

    @GetMapping("/{id}")
    public ResponseEntity<CommonProductResponse> getById(
            @PathVariable(name = "id")
                    String id) throws ProductBusinessException {
        return ResponseEntity.ok(boundary.getById(id));

    }

    @GetMapping
    public ResponseEntity<List<CommonProductResponse>> findAll() {
        return ResponseEntity.ok(boundary.getAll());
    }

}
