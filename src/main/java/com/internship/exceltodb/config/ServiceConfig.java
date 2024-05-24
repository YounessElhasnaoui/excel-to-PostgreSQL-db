package com.internship.exceltodb.config;

import com.internship.exceltodb.repository.*;
import com.internship.exceltodb.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class ServiceConfig {

    @Bean
    public ApplicationsService applicationsService(@Qualifier("applicationsRepository") ApplicationsRepository repository) {
        return new ApplicationsService(repository);
    }

    @Bean
    public AppOwnerService appOwnerService(@Qualifier("appOwnerRepository") AppOwnerRepository repository) {
        return new AppOwnerService(repository);
    }

    @Bean
    public AppTagService appTagService(@Qualifier("appTagRepository") AppTagRepository repository) {
        return new AppTagService(repository);
    }

    @Bean
    public AppRTPOService appRTPOService(@Qualifier("appRTPORepository") AppRTPORepository repository) {
        return new AppRTPOService(repository);
    }

    @Bean
    public PersonnesService personnesService(@Qualifier("personnesRepository") PersonnesRepository repository) {
        return new PersonnesService(repository);
    }

    @Bean
    public AppTechnoService appTechnoService(@Qualifier("appTechnoRepository") AppTechnoRepository repository) {
        return new AppTechnoService(repository);
    }

    @Bean
    public TechnoTypeService technoTypeService(@Qualifier("technoTypeRepository") TechnoTypeRepository repository) {
        return new TechnoTypeService(repository);
    }

    @Bean
    public TypeService typeService(@Qualifier("typeRepository") TypeRepository repository) {
        return new TypeService(repository);
    }

    @Bean
    public CapacityService capacityService(@Qualifier("capacityRepository") CapacityRepository repository) {
        return new CapacityService(repository);
    }
}
