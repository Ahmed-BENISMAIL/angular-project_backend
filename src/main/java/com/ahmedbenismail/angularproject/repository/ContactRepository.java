package com.ahmedbenismail.angularproject.repository;
import com.ahmedbenismail.angularproject.model.Contact;
import com.ahmedbenismail.angularproject.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {



}