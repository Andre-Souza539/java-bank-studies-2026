package com.nerdlab.bank.repository;

import com.nerdlab.bank.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<Users, UUID> {
}
