package oleg.hubal.com.tm_homework08.Models;

/**
 * Created by User on 08.03.2016.
 */
public class Person {

    private String firstName, lastName;
    private String gender, phoneNumber;
    private short age;

    public Person(String firstName, String phoneNumber) {
        setFirstName(firstName);
        setPhoneNumber(phoneNumber);
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public short getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
