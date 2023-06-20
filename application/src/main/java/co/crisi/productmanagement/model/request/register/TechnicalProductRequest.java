package co.crisi.productmanagement.model.request.register;

import lombok.Builder;

@Builder(toBuilder = true)
public record TechnicalProductRequest(String id, String name, String description, double price,
                                      String technicalInformation, String instructionManual) {

}
