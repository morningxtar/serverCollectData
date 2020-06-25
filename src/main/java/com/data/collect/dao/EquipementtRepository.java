package com.data.collect.dao;

import com.data.collect.entities.Enquete;
import com.data.collect.entities.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface EquipementtRepository extends JpaRepository<Equipement, Long> {

    @RestResource(path = "/byCampementid")
    List<Equipement> findEquipementsByCampementid(@Param("campement") long campement);
}
