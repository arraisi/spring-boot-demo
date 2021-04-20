package com.tabeldata.demo.service;

import com.tabeldata.demo.repository.KotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KotaService {
    @Autowired
    KotaRepository repository;
}
