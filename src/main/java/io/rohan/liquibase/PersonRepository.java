package io.rohan.liquibase;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

    @Query("SELECT p FROM Person p WHERE p.name LIKE %:personName%")
    String findByName(String personName);
}
