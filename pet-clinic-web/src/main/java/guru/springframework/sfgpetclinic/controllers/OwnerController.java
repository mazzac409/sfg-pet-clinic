package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chrismazza on 2019-01-27
 **/

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
