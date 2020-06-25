package com.data.collect;

import com.data.collect.dao.*;
import com.data.collect.entities.Campement;
import com.data.collect.entities.Equipement;
import com.data.collect.entities.Localisation;
import com.data.collect.file.StorageProperties;
import org.hibernate.tool.hbm2ddl.TableMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class CollectDataApplication implements CommandLineRunner {

    private RepositoryRestConfiguration restConfiguration;

    private final UserRepository userRepository;
    @Autowired
    private final LocalisationRepository localisationRepository;
    @Autowired
    private final CampementRepository campementRepository;
    private final ExploitantRepository exploitantRepository;
    private final EnqueteRepository enqueteRepository;
    private final EquipementtRepository equipementtRepository;

    public CollectDataApplication(UserRepository userRepository, LocalisationRepository localisationRepository, CampementRepository campementRepository, ExploitantRepository exploitantRepository, EnqueteRepository enqueteRepository, EquipementtRepository equipementtRepository) {
        this.userRepository = userRepository;
        this.localisationRepository = localisationRepository;
        this.campementRepository = campementRepository;
        this.exploitantRepository = exploitantRepository;
        this.enqueteRepository = enqueteRepository;
        this.equipementtRepository = equipementtRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CollectDataApplication.class, args);
    }


    @Override
    public void run(String... args) throws SQLException {

        userRepository.findAll().forEach(user -> {
            System.out.println(user.toString());
        });
        // equipementtRepository.save(new Equipement());
        System.out.println(equipementtRepository.findEquipementsByCampementid(1));


    }
}

