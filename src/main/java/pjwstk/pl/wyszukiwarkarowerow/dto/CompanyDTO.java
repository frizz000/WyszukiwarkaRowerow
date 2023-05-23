package pjwstk.pl.wyszukiwarkarowerow.dto;

import pjwstk.pl.wyszukiwarkarowerow.model.Company;

public class CompanyDTO {
    private String name;
    private String country;
    private String contact;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getContact() {
        return contact;
    }

    public CompanyDTO (Company company){
        this.name = company.getName();
        this.country = company.getCountry();
        this.contact = company.getContact();
    }
}
