package com.example.demo.repository;

import com.example.demo.entity.users.Admin;
import com.example.demo.repository.core.BaseRepository;

import java.util.Optional;

public interface AdminRepository extends BaseRepository<Admin> {
    Optional<Admin> findById(Long id);
}
