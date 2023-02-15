package com.bluecode.repository;

import com.bluecode.entity.ShortenerRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortenerRepository extends JpaRepository<ShortenerRequest, Long> {

}
