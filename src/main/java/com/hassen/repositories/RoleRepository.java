package com.hassen.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hassen.models.ERole;
import com.hassen.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

	Optional<Role> findByName(ERole name);

}
