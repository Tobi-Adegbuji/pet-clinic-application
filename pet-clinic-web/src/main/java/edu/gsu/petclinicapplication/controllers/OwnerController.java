package edu.gsu.petclinicapplication.controllers;

import edu.gsu.petclinicapplication.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")  //<---shortcut if you dont want to keep typing owners in the below requestMapping. (Basically prefixing)
@Controller
public class OwnerController {

    //Declared final so the object can never be changed
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","/index.html"}) //<-- What client will request or type
    public String listOwners(Model model){

        model.addAttribute("owners", ownerService.findAll());
        return "owner/index"; //<---The name of view that we return to front controller to give to the view
    }

}
