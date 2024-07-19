package gr.aueb.cf.mobilecontacts.dao;

import gr.aueb.cf.mobilecontacts.model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(long id, MobileContact mobileContact);
    void delete(long id);
    void delete(String phoneNumber);
    MobileContact get(long id);
    MobileContact get(String phoneNumber);
    List<MobileContact> getAll();

    boolean phoneNumberExists(String phoneNumber);
    boolean userIdExists(long id);
}
