package co.crisi.productmanagement.gateways.mapper;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "technical_product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TechnicalProductJpaMapper {

    @Id
    private String id;

    private String name;

    private String description;

    private double price;

    private String technicalInformation;

    private String instructionManual;

}
