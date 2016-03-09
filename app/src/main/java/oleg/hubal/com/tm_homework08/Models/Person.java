package oleg.hubal.com.tm_homework08.Models;

/**
 * Created by User on 08.03.2016.
 */
public class Person {

    private String firstName, lastName;
    private String gender, phoneNumber;
    private String age;
    private int id;
    public static int sId = 0;

    public Person(String firstName, String phoneNumber) {
        setFirstName(firstName);
        setPhoneNumber(phoneNumber);
        id = sId;
        sId++;
    }

    public int getId() {
        return id;
    };

    public void setAge(String age) {
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

    public String getAge() {
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
