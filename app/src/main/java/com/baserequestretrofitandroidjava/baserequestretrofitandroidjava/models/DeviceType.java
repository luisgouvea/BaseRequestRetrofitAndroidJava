package com.baserequestretrofitandroidjava.baserequestretrofitandroidjava.models;

public class DeviceType {
    public int Id;
    public String Code;
    public String Name;

    public void setId(int id) {
        Id = id;
    }

    public void setCode(String code) {
        Code = code;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public String getCode() {
        return Code;
    }

    public String getName() {
        return Name;
    }
}
