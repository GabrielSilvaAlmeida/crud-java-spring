package br.com.portifolio.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
