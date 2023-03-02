package com.prueba.transmi.controller;

import com.prueba.transmi.repository.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cordinador")
public class CordinadorController {
<<<<<<< HEAD

    @Autowired
    private CoordiService coordiService;

    @GetMapping("/list")
    public String listarConductores(Model model) {
        List<Conductor> conductores = coordiService.listarConductores();
        model.addAttribute("conductores", conductores);
        return "conductor-list";
    }


=======
    @Autowired
    ConductorRepository conductorRepository;
>>>>>>> parent of c394fa2 (cambios)
}
