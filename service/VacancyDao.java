    package com.moskovsky.itService.service;

    import com.moskovsky.itService.model.Users;
    import com.moskovsky.itService.model.Vacancy;
    import com.moskovsky.itService.repository.UserRepository;
    import com.moskovsky.itService.repository.VacancyRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;
    import java.util.Optional;

    @Service
    public class VacancyDao {

        @Autowired
        private VacancyRepository repository;

        public void save(Vacancy vacancy) {
            repository.save(vacancy);
        }

        public List<Vacancy> getAllVacancies() {
            return (List<Vacancy>) repository.findAll();
        }

        public List<Vacancy> searchVacancies(Boolean company, String title, String description, String city, String specialist, String experience, String employment_type, Boolean hasHigherEducation, String workSchedule) {
            return repository.findByFilters(company, title, description, city, specialist, experience, employment_type, hasHigherEducation, workSchedule);
        }

    }
