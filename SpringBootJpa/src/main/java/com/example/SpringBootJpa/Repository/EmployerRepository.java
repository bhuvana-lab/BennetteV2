package com.example.SpringBootJpa.Repository;


import com.example.SpringBootJpa.Entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {

    public List<Employer> findEmployerByFirstName(String firstName);

    @Transactional
    public List<Employer> deleteEmployerById(int id);

    public Employer findEmployerById(int id);

    /*@Modifying
    @Query(value = "UPDATE employer_personal_details SET E_firstName = :E_firstName, E_lastName = :E_lastName, E_role = :E_role WHERE E_id = :E_id", nativeQuery = true)
    Employer updateEmployerDetailsById(int E_id, String E_firstName, String E_lastName, String E_role);*/
}
