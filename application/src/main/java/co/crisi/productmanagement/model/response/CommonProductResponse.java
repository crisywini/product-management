package co.crisi.productmanagement.model.response;

import lombok.Builder;

@Builder(toBuilder = true)
public record CommonProductResponse(String id, String name, String description, double price) {

}
