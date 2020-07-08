package com.example.demo.controller;

import com.example.demo.model.CheckLogin;
import com.example.demo.model.Customer;
import com.example.demo.service.CheckLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@CrossOrigin("*")
@RestController
public class CheckLoginController {
    @Autowired
    private CheckLoginService checkLoginService;
    @RequestMapping(value = "/api/checks", method = RequestMethod.GET)
    public ResponseEntity<Iterable<CheckLogin>> listAllCheck() {
        Iterable<CheckLogin> checkLogins = checkLoginService.findAll();
        if (checkLogins == null) {
            return new ResponseEntity<Iterable<CheckLogin>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Iterable<CheckLogin>>(checkLogins, HttpStatus.OK);
    }
    @RequestMapping(value = "/api/checks/{id}", method = RequestMethod.GET)
    public ResponseEntity<CheckLogin> getCheckLoginId(@PathVariable("id") Long id) {
        CheckLogin checkLogin = checkLoginService.findById(id);
        if (checkLogin == null) {
            return new ResponseEntity<CheckLogin>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<CheckLogin>(checkLogin, HttpStatus.OK);
    }
    @RequestMapping(value = "/api/checks/{id}", method = RequestMethod.PUT)
    public ResponseEntity<CheckLogin> updateCheckLogin(@PathVariable("id") Long id, @RequestBody CheckLogin checkLogin) {
        CheckLogin checkLogin1 = checkLoginService.findById(id);

        if (checkLogin1 == null) {
            return new ResponseEntity<CheckLogin>(HttpStatus.NOT_FOUND);
        }
        checkLogin1.setCheckLogin(checkLogin.getCheckLogin());
        checkLoginService.save(checkLogin1);
        return new ResponseEntity<CheckLogin>(HttpStatus.OK);
    }
}
