package src.com.model;

import src.com.interfaces.PhoneNumber;

public class MobilePhoneNomber implements PhoneNumber {
    private final String prefix = "+34";
    private final String phoneNumber;

    public MobilePhoneNomber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return prefix + phoneNumber;
    }

    @Override
    public String toString() {
        return getPhoneNumber();
    }
}
