package gr.aueb.cf.mobilecontacts.dto;

public class MobileContactInsertDTO extends BaseDTO {
    private UserDetailsInsertDTO userDetailsInsertDTO;
    private String phoneNumber;

    public MobileContactInsertDTO() {}

    public MobileContactInsertDTO(long id, UserDetailsInsertDTO userDetailsInsertDTO, String phoneNumber) {
        setId(id);
        this.userDetailsInsertDTO = new UserDetailsInsertDTO(userDetailsInsertDTO);
        this.phoneNumber = phoneNumber;
    }

    public UserDetailsInsertDTO getUserDetailsInsertDTO() {
        return new UserDetailsInsertDTO(userDetailsInsertDTO);
    }

    public void setUserDetailsInsertDTO(UserDetailsInsertDTO userDetailsInsertDTO) {
        this.userDetailsInsertDTO = new UserDetailsInsertDTO(userDetailsInsertDTO);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
