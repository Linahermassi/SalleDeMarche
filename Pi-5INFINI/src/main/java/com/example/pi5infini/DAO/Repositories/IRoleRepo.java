package com.example.pi5infini.DAO.Repositories;



import com.example.pi5infini.DAO.Entities.ERole;
import com.example.pi5infini.DAO.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface IRoleRepo extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERole name);
    boolean existsByName(ERole name);

}
