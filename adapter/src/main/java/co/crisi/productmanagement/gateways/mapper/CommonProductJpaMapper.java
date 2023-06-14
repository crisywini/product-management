package co.crisi.productmanagement.gateways.mapper;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "common_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonProductJpaMapper {

    @Id
    private String id;

    private String name;

    private String description;

    private double price;

}
