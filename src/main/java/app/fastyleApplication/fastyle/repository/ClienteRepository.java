package app.fastyleApplication.fastyle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.fastyleApplication.fastyle.model.Cliente;
import app.fastyleApplication.fastyle.model.Esteticista;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}