package co.crisi.productmanagement.model.response;

public record TechnicalProductResponse(String id, String name, String description, double price,
                                       String technicalInformation, String instructionManual) {

}
