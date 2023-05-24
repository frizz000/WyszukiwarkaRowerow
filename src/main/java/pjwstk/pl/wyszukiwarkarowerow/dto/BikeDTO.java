package pjwstk.pl.wyszukiwarkarowerow.dto;

import pjwstk.pl.wyszukiwarkarowerow.model.Bike;

public class BikeDTO {
    private final String model;
    private final CompanyDTO company;
    private String type;
    private String imageURL;
    private final String size;
    private final Double price;
    private final UserDTO owner;
    private final Double weight;
    private final String equipment;
    private final String description;

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

    public BikeDTO (Bike bike){
        this.model = bike.getModelName();
        this.company = new CompanyDTO(bike.getCompany());
        this.owner = new UserDTO(bike.getOwner());
        this.type = bike.getType();
        this.size = bike.getSize();
        this.price = bike.getPrice();
        this.weight = bike.getWeight();
        this.equipment = bike.getEquipment();
        this.description = bike.getDescription();
        this.imageURL = bike.getImageUrl();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserDTO getOwner() {
        return owner;
    }
}
