package com.example.SpringBootJpa.Service;

import com.example.SpringBootJpa.Entity.Employer;

import com.example.SpringBootJpa.Repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {
    @Autowired
    EmployerRepository employerRepository;
    /*@Autowired
    AddressRepository addressRepository;*/

    public Employer findEmployerById(int id ){
        return employerRepository.findEmployerById(id);
    }

    public List<Employer> findEmployerByFirstName(String firstName ){
        return employerRepository.findEmployerByFirstName(firstName);
    }

    public List<Employer> findAll(){
        return employerRepository.findAll();
    }

    public List<Employer> deleteEmployerById(int id){
        return employerRepository.deleteEmployerById(id);
    }

    public Employer save(Employer employer){
        return employerRepository.save(employer);
    }

    public Employer updateEmployerDetailsById(int id,Employer employer){
       Employer employer1 = employerRepository.findEmployerById(id);
        return employerRepository.save(employer1);
    }

}
