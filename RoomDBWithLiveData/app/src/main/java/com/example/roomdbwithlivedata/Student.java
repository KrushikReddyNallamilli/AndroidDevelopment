package com.example.roomdbwithlivedata;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "StudentInfo")

public class Student {
    String name;

    @PrimaryKey @NonNull
    String rollNumber;
    String Mailid;
    String PhoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(@NonNull String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getMailid() {
        return Mailid;
    }

    public void setMailid(String mailid) {
        Mailid = mailid;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
