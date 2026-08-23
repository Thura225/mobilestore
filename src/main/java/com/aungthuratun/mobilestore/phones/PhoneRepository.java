package com.aungthuratun.mobilestore.phones;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhoneRepository extends JpaRepository<Phone,Long> {
    @Query("SELECT p FROM Phone p WHERE p.name = ?1")
    Optional<Phone> findPhoneByName(String name);
}
