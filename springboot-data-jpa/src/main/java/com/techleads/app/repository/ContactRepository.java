package com.techleads.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techleads.app.model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
