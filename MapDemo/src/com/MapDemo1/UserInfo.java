package com.MapDemo1;

public class UserInfo {
    private String userName;
    private String uid;
    private String occupation;
    private int age;
    private double salary;

    public UserInfo() {
    }

    public UserInfo(String userName, String uid, String occupation, int age, double salary) {
        this.userName = userName;
        this.uid = uid;
        this.occupation = occupation;
        this.age = age;
        this.salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", uid='" + uid + '\'' +
                ", occupation='" + occupation + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
