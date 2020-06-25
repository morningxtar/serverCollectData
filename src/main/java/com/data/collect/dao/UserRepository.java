package com.data.collect.dao;

import com.data.collect.entities.User;
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
public interface UserRepository extends JpaRepository<User, Long> {

    @RestResource(path = "/byNom")
    List<User> findUserByNomContains(@Param("name") String nom);

    @RestResource(path = "/byNomPage")
    Page<User> findUserByNomContains(@Param("name") String des, Pageable pageable);

    @RestResource(path = "/byUserConnexion")
    User findUserByMatriculeAndPassword(@Param("mat")String matricule, @Param("pass")String password);
}
