package com.example.demo.repository.core;

import com.example.demo.entity.core.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T,Long> {
}
