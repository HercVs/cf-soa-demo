package gr.aueb.cf.mobilecontacts.dto;

public class MobileContactUpdateDTO extends BaseDTO {
    private UserDetailsUpdateDTO userDetailsUpdateDTO;
    private String phoneNumber;

    public MobileContactUpdateDTO() {}

    public MobileContactUpdateDTO(long id, UserDetailsUpdateDTO userDetailsUpdateDTO, String phoneNumber) {
        setId(id);
        this.userDetailsUpdateDTO = new UserDetailsUpdateDTO(userDetailsUpdateDTO);
        this.phoneNumber = phoneNumber;
    }

    public UserDetailsUpdateDTO getUserDetailsUpdateDTO() {
        return new UserDetailsUpdateDTO(userDetailsUpdateDTO);
    }

    public void setUserDetailsUpdateDTO(UserDetailsUpdateDTO userDetailsUpdateDTO) {
        this.userDetailsUpdateDTO = new UserDetailsUpdateDTO(userDetailsUpdateDTO);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
