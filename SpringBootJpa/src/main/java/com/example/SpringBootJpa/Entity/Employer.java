package com.example.SpringBootJpa.Entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "employer_personal_details")
public class Employer {
    @Id
   //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="E_id")
    private int id;
    @Column(name= "E_first_name")
    private String firstName;
    @Column(name="E_last_name")
    private String lastName;
    @Column(name="E_role")
    private String role;

    /*@OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "line1", referencedColumnName = "id")
    private Set<Address> address;
*/
    public Employer() {
    }

    public Employer(int id, String firstName, String lastName, String role){ //, Set<Address> address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        // this.address = address;
    }


    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
               // ", address=" + address +
                '}';
    }


    /*public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
