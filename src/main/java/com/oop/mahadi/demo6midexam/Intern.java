package com.oop.mahadi.demo6midexam;

public class Intern {
    int id;
    String InternName,uniname,paymentstatus;

    public Intern() {
    }

    @Override
    public String toString() {
        return "Intern{" +
                "id=" + id +
                ", InternName='" + InternName + '\'' +
                ", uniname='" + uniname + '\'' +
                ", paymentstatus='" + paymentstatus + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInternName() {
        return InternName;
    }

    public void setInternName(String internName) {
        InternName = internName;
    }

    public String getUniname() {
        return uniname;
    }

    public void setUniname(String uniname) {
        this.uniname = uniname;
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    public Intern(int id, String internName, String uniname, String paymentstatus) {
        this.id = id;
        InternName = internName;
        this.uniname = uniname;
        this.paymentstatus = paymentstatus;
    }
}
