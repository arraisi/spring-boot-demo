package com.tabeldata.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "kota")
public class Kota {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idKota;

    @Column(name = "nama")
    private String nama;

    @JsonIgnore
    @OneToMany(mappedBy = "idKota", fetch = FetchType.LAZY)
    public List<Customer> customers = new ArrayList<>();

    public Integer getIdKota() {
        return idKota;
    }

    public void setIdKota(Integer idKota) {
        this.idKota = idKota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
