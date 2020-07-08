package com.example.demo.controller;

import com.example.demo.model.Host;
import com.example.demo.service.impl.HostServiceImpl;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@CrossOrigin("*")
@RestController
public class HostController {
    @Autowired
    private HostServiceImpl hostService;

    @RequestMapping(value = "/api/hosts", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Host>> listAllHost() {
        Iterable<Host> hosts = hostService.findAll();
        if (hosts == null) {
            return new ResponseEntity<Iterable<Host>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Iterable<Host>>(hosts, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/hosts/{id}", method = RequestMethod.GET)
    public ResponseEntity<Host> getHost(@PathVariable("id") Long id) {
        Host host = hostService.findById(id);
        if (host == null) {
            return new ResponseEntity<Host>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Host>(host, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/hosts", method = RequestMethod.POST)
    public ResponseEntity<Void> createHost(@RequestBody Host host, UriComponentsBuilder ucBuilder) {
        hostService.save(host);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/houses/{id}").buildAndExpand(host.getIdChuNha()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/api/hosts/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Host> updateHost(@PathVariable("id") Long id, @RequestBody Host host) {
        Host host1 = hostService.findById(id);

        if (host1 == null) {
            return new ResponseEntity<Host>(HttpStatus.NOT_FOUND);
        }
        host1.setDiaChi(host.getDiaChi());
        host1.setPassword(host.getPassword());
        host1.setHoTen(host.getHoTen());
        host1.setSdt(host.getSdt());

        hostService.save(host1);
        return new ResponseEntity<Host>(HttpStatus.OK);
    }

    @RequestMapping(value = "/api/hosts/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Host> deleteHost(@PathVariable("id") Long id) {
        Host host = hostService.findById(id);
        if (host == null) {
            return new ResponseEntity<Host>(HttpStatus.NOT_FOUND);
        }
        hostService.remove(id);
        return new ResponseEntity<Host>(HttpStatus.NO_CONTENT);
    }
}
