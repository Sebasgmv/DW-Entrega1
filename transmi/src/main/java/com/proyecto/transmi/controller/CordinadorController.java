package com.proyecto.transmi.controller;

import com.proyecto.transmi.repository.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cordinador")
public class CordinadorController {
    @Autowired
    ConductorRepository conductorRepository;
}
