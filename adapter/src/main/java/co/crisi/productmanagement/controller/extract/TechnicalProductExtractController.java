package co.crisi.productmanagement.controller.extract;

import co.crisi.productmanagement.boundaries.input.extract.ITechnicalProductExtractBoundary;
import co.crisi.productmanagement.exceptions.ProductBusinessException;
import co.crisi.productmanagement.model.response.TechnicalProductResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/technical")
public class TechnicalProductExtractController {

    @Autowired
    private ITechnicalProductExtractBoundary boundary;

    @GetMapping("/{id}")
    public ResponseEntity<TechnicalProductResponse> getById(
            @PathVariable(name = "id")
                    String id) {
        try {
            return ResponseEntity.ok(boundary.getById(id));
        } catch (ProductBusinessException e) {
            return (ResponseEntity<TechnicalProductResponse>) ResponseEntity.notFound();
        }
    }

    @GetMapping
    public ResponseEntity<List<TechnicalProductResponse>> getAll() {
        return ResponseEntity.ok(boundary.getAll());
    }

}
