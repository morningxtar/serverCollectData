package com.data.collect.dao;

import com.data.collect.entities.Campement;
import com.data.collect.entities.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface LocalisationRepository extends JpaRepository<Localisation, Long> {

    @RestResource(path = "/lastLocalisation")
    Localisation findTopByOrderByIdDesc();
}
