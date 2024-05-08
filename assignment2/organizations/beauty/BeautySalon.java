package assignment2.organizations.beauty;

import assignment2.commons.Organization;
import assignment2.commons.Person;
import assignment2.commons.Contactable;

import java.util.List;

public class BeautySalon extends Organization implements Contactable {

    private List<Service> services;

    public BeautySalon(String name, String description, List<Person> members, List<Service> services) {
        super(name, description);
        this.services = services;
    }

    @Override
    public String getEmail() {
        // TODO: Implement getEmail method
        return null; // Return an appropriate email address
    }

    @Override
    public String getPhoneNumber() {
        // TODO: Implement getPhoneNumber method
        return null; // Return an appropriate phone number
    }

    @Override
    public String getAddress() {
        // TODO: Implement getAddress method
        return null; // Return an appropriate address
    }
}

