package com.example.q.testapplication02;

/**
 * Created by q on 2016-12-26.
 */

public class ContactItem {
    private String nameStr;
    private String phoneStr;

    public void setName(String name) {
        nameStr = name;
    }

    public void setPhone(String phone) {
        phoneStr = phone;
    }

    public String getName() {
        return this.nameStr;
    }

    public String getPhone() {
        return this.phoneStr;
    }
}
