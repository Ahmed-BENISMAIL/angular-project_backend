// ContactController.java
package com.ahmedbenismail.angularproject.controller;

import com.ahmedbenismail.angularproject.model.Contact;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @PostMapping("/submit")
    public ResponseEntity<?> submitContactForm(@RequestBody Contact contact) {
        // Here, you can add logic to process the contact form data
        // For simplicity, returning a success response here
        return ResponseEntity.ok("Contact form submitted successfully");
    }
}
