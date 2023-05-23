package pjwstk.pl.wyszukiwarkarowerow.dto;

import pjwstk.pl.wyszukiwarkarowerow.model.Bike;

public class BikeDTO {
    private String model;
    private CompanyDTO company;
    private String type;
    private String imageURL;
    private String size;
    private Double price;
    private Double weight;

    public String getModel() {
        return model;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public String getSize() {
        return size;
    }

    public Double getPrice() {
        return price;
    }

    public Double getWeight() {
        return weight;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    private String equipment;
    private final String description;

    public BikeDTO (Bike bike){
        this.model = bike.getModelName();
        this.company = new CompanyDTO(bike.getCompany());
        this.type = bike.getType();
        this.size = bike.getSize();
        this.price = bike.getPrice();
        this.weight = bike.getWeight();
        this.equipment = bike.getEquipment();
        this.description = bike.getDescription();
        this.imageURL = bike.getImageUrl();
    }
}
