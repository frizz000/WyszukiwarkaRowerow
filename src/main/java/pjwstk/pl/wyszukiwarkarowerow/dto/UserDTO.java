package pjwstk.pl.wyszukiwarkarowerow.dto;

import pjwstk.pl.wyszukiwarkarowerow.model.User;

public class UserDTO {
    private final String name;
    private final String surname;
    private final String email;
    private final String phoneNumber;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserDTO(User user){
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        this.phoneNumber = user.getPhoneNumber();
    }
}
