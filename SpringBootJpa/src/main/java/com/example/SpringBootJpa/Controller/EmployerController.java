package com.example.SpringBootJpa.Controller;

import com.example.SpringBootJpa.Delegates.EmployerDelegate;
import com.example.SpringBootJpa.Dto.EmployerDto;
import com.example.SpringBootJpa.Entity.Employer;
import com.example.SpringBootJpa.Mappers.EmployerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @RequestMapping("/Employer")
@CrossOrigin("*")
public class EmployerController {

    @Autowired
    EmployerMapper employerMapper;
    @Autowired
    EmployerDelegate employerDelegate;

    @GetMapping("/")
    public String login(){
        return "Welcome";
    }

    @GetMapping("/findAll")
    public List<EmployerDto> getEmployers(){
        return employerDelegate.findAll();
    }

    @GetMapping("/findEmployerById/{id}")
    public EmployerDto findEmployerById(@PathVariable int id ){
        return employerDelegate.findEmployerById(id);
    }

     @GetMapping("/getEmployerByFirstName/{firstName}")
        public List<EmployerDto> getEmployerByFirstName(@PathVariable String firstName ){
            return employerDelegate.findEmployerByFirstName(firstName);
    }
    @DeleteMapping(value = "/deleteEmployerById/{id}")
    public List<EmployerDto> deleteEmployerById(@PathVariable  int id){
        return employerDelegate.deleteEmployerById(id);
    }

    @PostMapping(value = "/addEmployer",consumes = MediaType.APPLICATION_JSON_VALUE)
    public EmployerDto addEmployer(@RequestBody Employer employer){
        return employerDelegate.addEmployer(employer);

    }


    @PutMapping(value = "/updateEmployerDetailsById/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public EmployerDto updateEmployerDetailsById(@PathVariable int id,@RequestBody Employer employer){
        return employerDelegate.updateEmployerDetailsById(id,employer);
    }

   /* public void saveUpdate(Employer employer){
        return employerDelegate.updateEmployerDetailsById(employer);
    }*/

}
