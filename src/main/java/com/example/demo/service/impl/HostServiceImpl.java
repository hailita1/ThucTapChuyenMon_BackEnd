package com.example.demo.service.impl;

import com.example.demo.model.Host;
import com.example.demo.repository.HostRepository;
import com.example.demo.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HostServiceImpl implements HostService {
    @Autowired
    private HostRepository hostRepository;

    @Override
    public Iterable<Host> findAll() {
        return hostRepository.findAll();
    }

    @Override
    public Host findById(Long id) {
        return hostRepository.findById(id).get();
    }

    @Override
    public void save(Host host) {
        hostRepository.save(host);
    }

    @Override
    public void remove(Long id) {
        hostRepository.deleteById(id);
    }
}
