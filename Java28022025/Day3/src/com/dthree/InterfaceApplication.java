package com.dthree;

interface userId {
    void setUserId(int userId);
}

interface userName {
    void setUserName(String userName);
}

interface userAge {
    void setUserAge(int userAge);
}

interface userAddress {
    void setUserAddress(String userAddress);
}

interface userPhone {
    void setUserPhone(String userPhone);
}

class User implements userId, userName, userAge, userAddress, userPhone {
    private int userId;
    private String userName;
    private int userAge;
    private String userAddress;
    private String userPhone;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
        System.out.println("User Age: " + userAge);
        System.out.println("User Address: " + userAddress);
        System.out.println("User Phone: " + userPhone);
    }
}

public class InterfaceApplication {
    public static void main(String[] args) {
        User user = new User();
        user.setUserId(8085);
        user.setUserName("Oimayak Panja");
        user.setUserAge(23);
        user.setUserAddress("Salap, Howrah, 700210");
        user.setUserPhone("9883668661");
        user.displayUser();
    }
}