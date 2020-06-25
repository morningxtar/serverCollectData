package com.data.collect.dao;

import com.data.collect.entities.Enquete;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface EnqueteRepository extends JpaRepository<Enquete, Long> {

    @RestResource(path = "/byZone")
    List<Enquete> findEnqueteByZoneContains(@Param("zone") String zone);

    @RestResource(path = "/byZonePage")
    Page<Enquete> findEnqueteByZoneContains(@Param("zone") String zone, Pageable pageable);

    @RestResource(path = "/byMatricule")
    List<Enquete> findEnqueteByMatriculeContains(@Param("matricule") String matricule);


}
