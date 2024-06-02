package com.moskovsky.itService.repository;

import com.moskovsky.itService.model.Users;
import com.moskovsky.itService.model.Vacancy;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacancyRepository extends CrudRepository<Vacancy, Integer> {
    @Query("SELECT v FROM Vacancy v WHERE " +
            "(:company IS NULL OR v.company = :company) AND " +
            "(:title IS NULL OR v.title LIKE %:title%) AND " +
            "(:description IS NULL OR v.description LIKE %:description%) AND " +
            "(:city IS NULL OR v.city LIKE %:city%) AND " +
            "(:specialist IS NULL OR v.specialist LIKE %:specialist%) AND " +
            "(:experience IS NULL OR v.experience LIKE %:experience%) AND " +
            "(:employment_type IS NULL OR v.employment_type LIKE %:employment_type%) AND " +
            "(:hasHigherEducation IS NULL OR v.hasHigherEducation = :hasHigherEducation) AND " +
            "(:workSchedule IS NULL OR v.workSchedule LIKE %:workSchedule%)")
    List<Vacancy> findByFilters(@Param("company") Boolean company,
                                @Param("title") String title,
                                @Param("description") String description,
                                @Param("city") String city,
                                @Param("specialist") String specialist,
                                @Param("experience") String experience,
                                @Param("employment_type") String employment_type,
                                @Param("hasHigherEducation") Boolean hasHigherEducation,
                                @Param("workSchedule") String workSchedule);
}
