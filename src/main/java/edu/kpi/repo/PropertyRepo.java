/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kpi.repo;

import edu.kpi.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hmelmin
 */
@Repository
public interface PropertyRepo extends JpaRepository<Property, Integer> {

    Property findOneByRegistrationNumber(Integer registrationNumber);

}
