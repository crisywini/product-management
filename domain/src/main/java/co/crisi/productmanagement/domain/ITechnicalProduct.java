package co.crisi.productmanagement.domain;

public interface ITechnicalProduct extends IProduct {

    String getTechnicalInformation();

    String getInstructionManual();

    boolean isTechnicalInformationValid();

}
