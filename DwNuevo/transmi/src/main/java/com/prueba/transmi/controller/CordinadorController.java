package com.prueba.transmi.controller;

import com.prueba.transmi.model.Conductor;
import com.prueba.transmi.repository.ConductorRepository;
import com.prueba.transmi.service.CoordiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cordinador")
public class CordinadorController {

    @Autowired
    private CoordiService coordiService;

    @GetMapping("/list")
    public String listarConductores(Model model) {
        List<Conductor> conductores = coordiService.listarConductores();
        model.addAttribute("conductores", conductores);
        return "conductor-list";
    }


}
