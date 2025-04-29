package com.cg.userdata.controller;



import com.cg.userdata.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("userData")
public class FormController {

    @ModelAttribute("userData")
    public UserData userData() {
        return new UserData();
    }

    @GetMapping("/")
    public String showPage1() {
        return "page1";
    }

    @PostMapping("/page2")
    public String handlePage1(@ModelAttribute("userData") UserData userData,
                              @RequestParam String firstName,
                              @RequestParam String lastName) {
        userData.setFirstName(firstName);
        userData.setLastName(lastName);
        return "page2";
    }

    @PostMapping("/page3")
    public String handlePage2(@ModelAttribute("userData") UserData userData,
                              @RequestParam String email,
                              @RequestParam String phone) {
        userData.setEmail(email);
        userData.setPhone(phone);
        return "page3";
    }

    @PostMapping("/page4")
    public String handlePage3(@ModelAttribute("userData") UserData userData,
                              @RequestParam String city,
                              @RequestParam String country) {
        userData.setCity(city);
        userData.setCountry(country);
        return "page4";
    }

}

