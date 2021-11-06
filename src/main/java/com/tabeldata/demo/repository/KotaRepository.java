package com.tabeldata.demo.repository;

import com.tabeldata.demo.entity.Kota;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface KotaRepository extends PagingAndSortingRepository<Kota, Integer> {
}
