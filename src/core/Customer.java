/** SER 216
 * Assignment 3 - Unit Testing JUnit
 * Description: Create BankAccount & Customer classes. Create unit tests for each method and test.
 * @Author: Steven Treadway
 * @version: 1.0
 * Date: 03/29/2018
 * Time: 1 hour
 */

package core;

/**
 * Customer class
 * @author steven
 *
 */
public class Customer {

    private String name, streetAddress, city, state, zip;
    private int age;

    /** Customer class constructor with params
     * @param name name of customer
     * @param streetAddress address of customer
     * @param city city where customer lives
     * @param state state where customer lives
     * @param zip zip where customer lives
     */
    public Customer(String name, String streetAddress, String city, String state, String zip) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /** Name getter
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Name setter
     * @param name name of customer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Street address getter
     * @return streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Street address setter
     * @param streetAddress address of customer
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     * City getter
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * City setter
     * @param city city where customer lives
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * State getter
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * State setter
     * @param state state where customer lives
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Zip getter
     * @return zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * Zip setter
     * @param zip zip where customer lives
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Age getter
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Age setter
     * @param age age of customer
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Displays address in the format "address city, state zip"
     * @return address
     */
    public String displayAddress () {
        return this.streetAddress + " " + this.city + ", "
                + this.state + " " + this.zip;
    }

    /**
     * Displays name and address in the format "Name: name\nAddress: address city, state zip"
     * @return name, address
     */
    public String displayAddressLabel () {
        return "Name: " + this.name + "\nAddress: " + this.displayAddress();
    }
}
