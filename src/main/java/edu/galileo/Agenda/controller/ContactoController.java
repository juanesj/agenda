package edu.galileo.Agenda.controller;

import edu.galileo.Agenda.model.Contacto;
import edu.galileo.Agenda.service.ContactoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacto")
public class ContactoController {


    private ContactoService contactoService;

   

    ContactoController(ContactoService contactoService) {


        this.contactoService = contactoService;
    }

    @GetMapping
    public List<Contacto> getAll() {
        return this.contactoService.List();
    }

    @PostMapping
    public Contacto add(@RequestBody(required = true) Contacto contacto) {
        return this.contactoService.add(contacto);
    }
}
