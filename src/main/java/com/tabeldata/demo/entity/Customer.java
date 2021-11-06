package com.tabeldata.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer custId;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @ManyToOne
    @JoinColumn(name = "id_kota")
    private Kota idKota;

    @Column(name = "pendapatan")
    private BigDecimal pendapatan;


    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Kota getIdKota() {
        return idKota;
    }

    public void setIdKota(Kota idKota) {
        this.idKota = idKota;
    }

    public BigDecimal getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(BigDecimal pendapatan) {
        this.pendapatan = pendapatan;
    }
}
