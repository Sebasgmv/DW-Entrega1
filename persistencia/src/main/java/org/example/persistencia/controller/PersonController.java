package org.example.persistencia.controller;

import java.util.List;

import javax.validation.Valid;

import org.example.persistencia.model.Person;
import org.example.persistencia.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/person")
public class PersonController {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private PersonService personService;

    @GetMapping("/list")
    public String listarPersonas(Model model) {
        List<Person> persons = personService.listarPersonas();
        model.addAttribute("persons", persons);
        return "person-list";
    }

    @GetMapping("/view/{idPersona}")
    String verPersona(Model model, @PathVariable("idPersona") Long id) {
        Person person = personService.recuperarPersona(id);
        model.addAttribute("person", person);
        return "person-view";
    }

    @GetMapping("/edit-form/{id}")
    public String formularioEditarPersona(Model model, @PathVariable Long id) {
        Person p = personService.recuperarPersona(id);
        model.addAttribute("person", p);
        return "person-edit";
    }

    @PostMapping(value = "/save")
    public String guardarPersona(@Valid Person persona, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "person-edit";
        }
        personService.guardarPersona(persona);
        return "redirect:/person/list";
    }

    @GetMapping("/search")
    public String listPersons(@RequestParam(required = false) String searchText, Model model) {
        List<Person> persons;
        if (searchText == null || searchText.trim().equals("")) {
            log.info("No hay texto de búsqueda. Retornando todo");
            persons = personService.listarPersonas();
        } else {
            log.info("Buscando personas cuyo apellido comienza con {}", searchText);
            persons = personService.buscarPorApellido(searchText);
        }
        model.addAttribute("persons", persons);
        return "person-search";
    }
}
