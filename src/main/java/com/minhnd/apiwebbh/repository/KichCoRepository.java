package com.minhnd.apiwebbh.repository;

import com.minhnd.apiwebbh.entity.KichCo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KichCoRepository extends JpaRepository<KichCo, Long> {
}
