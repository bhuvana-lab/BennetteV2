package com.example.SpringBootJpa.Delegates;

import com.example.SpringBootJpa.Dto.EmployerDto;
import com.example.SpringBootJpa.Entity.Employer;
import com.example.SpringBootJpa.Mappers.EmployerMapper;
import com.example.SpringBootJpa.Service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployerDelegate {
    @Autowired
    EmployerService employerService;
    @Autowired
    EmployerMapper employerMapper;

    public EmployerDto findEmployerById(int id ){
        Employer employer = employerService.findEmployerById(id);
        return employerMapper.entityToDto(employer);
    }

    public List<EmployerDto> findEmployerByFirstName(String firstName ){
        List<Employer> employer = employerService.findEmployerByFirstName(firstName);
        return employerMapper.entityToDto(employer);
    }

    public List<EmployerDto> findAll() {
        List<Employer> employer = employerService.findAll();
        return employerMapper.entityToDto(employer);
    }

    public EmployerDto addEmployer(Employer employer){
        Employer employerList= employerService.save(employer);
        return employerMapper.entityToDto(employerList);
    }

    public EmployerDto updateEmployerDetailsById(int id, Employer employer){
        Employer employerList= employerService.updateEmployerDetailsById(id,employer);
        return employerMapper.entityToDto(employerList);
    }

    public List<EmployerDto> deleteEmployerById(int id){
        List<Employer> employer= employerService.deleteEmployerById(id);
        return employerMapper.entityToDto(employer);
    }


}
