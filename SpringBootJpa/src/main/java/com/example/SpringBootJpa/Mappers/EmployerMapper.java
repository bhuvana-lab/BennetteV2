package com.example.SpringBootJpa.Mappers;

import com.example.SpringBootJpa.Dto.EmployerDto;
import com.example.SpringBootJpa.Entity.Employer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployerMapper {
    public EmployerDto entityToDto(Employer employer){
       /* List<EmployerDto> employerDto= new EmployerDto();
        employerDto.setId(employer.getId());
        employerDto.setFirstName(employer.getFirstName());
        employerDto.setLastName(employer.getLastName());
        employerDto.setRole(employer.getRole());
        return employerDto;*/

        ModelMapper mapper = new ModelMapper();
        EmployerDto map= mapper.map(employer,EmployerDto.class);
        return map;

    }

    public List<EmployerDto> entityToDto(List<Employer> employerList) {
        return employerList.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
    }

    public Employer dtoToEntity(EmployerDto employerDto){
       /* Employer employer = new Employer();
        employer.setId(employerDto.getId());
        employer.setFirstName(employerDto.getFirstName());
        employer.setLastName(employerDto.getLastName());
        employer.setRole(employerDto.getRole());
        return  employer;*/

        ModelMapper mapper =new ModelMapper();
        Employer map = mapper.map(employerDto, Employer.class);
        return map;

    }

    public List<Employer> dtoToEntity(List<EmployerDto> employerDto){
        return employerDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }

}
