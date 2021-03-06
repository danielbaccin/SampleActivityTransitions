package br.com.kenuiapps.sampleactivitytransitions.model;

/**
 * Created by daniel on 07/08/15.
 */
public class Contact {

    // The fields associated to the person
    private final String mName, mPhone, mEmail, mCity, mColor;

    Contact(String name, String color, String phone, String email, String city) {
        mName = name; mColor = color; mPhone = phone; mEmail = email; mCity = city;
    }

    // This method allows to get the item associated to a particular id,
    // uniquely generated by the method getId defined below
    public static Contact getItem(int id) {
        for (Contact item : CONTACTS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    // since mName and mPhone combined are surely unique,
    // we don't need to add another id field
    public int getId() {
        return mName.hashCode() + mPhone.hashCode();
    }

    public static enum Field {
        NAME, COLOR, PHONE, EMAIL, CITY
    }
    public String get(Field f) {
        switch (f) {
            case COLOR: return mColor;
            case PHONE: return mPhone;
            case EMAIL: return mEmail;
            case CITY: return mCity;
            case NAME: default: return mName;
        }
    }
    public static final Contact[] CONTACTS = new Contact[] {
            new Contact("John", "#33b5e5", "+01 123456789", "john@example.com", "Venice"),
            new Contact("Valter", "#ffbb33", "+01 987654321", "valter@example.com", "Bologna"),
            new Contact("Eadwine", "#ff4444", "+01 123456789", "eadwin@example.com", "Verona"),
            new Contact("Teddy", "#99cc00", "+01 987654321", "teddy@example.com", "Rome"),
            new Contact("Ives", "#33b5e5", "+01 11235813", "ives@example.com", "Milan"),
            new Contact("Alajos", "#ffbb33", "+01 123456789", "alajos@example.com", "Bologna"),
            new Contact("Gianluca", "#ff4444", "+01 11235813", "me@gian.lu", "Padova"),
            new Contact("Fane", "#99cc00", "+01 987654321", "fane@example.com", "Venice"),
    };

}
