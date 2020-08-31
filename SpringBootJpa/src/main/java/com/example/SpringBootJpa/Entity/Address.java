/*

package com.example.SpringBootJpa.Entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name="Address")
public class Address {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "E_id")
    private Set<Employer> line1;
    @Column(name ="line2")
    private String line2;
    @Column(name ="city")
    private String  city;
    @Column(name ="state")
    private String state;
    @Column(name ="zipCode")
    private int zipCode;

    public Address(){

    }

    public Address(Set<Employer> line1, String line2, String city, String state, int zipCode) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    public Set<Employer> getLine1() {
        return line1;
    }

    public void setLine1(Set<Employer> line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
*/
