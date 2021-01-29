package com.cmi.creditors_microservice.repositories;


import com.cmi.creditors_microservice.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
