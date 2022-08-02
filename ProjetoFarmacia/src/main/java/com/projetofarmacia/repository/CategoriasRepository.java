package com.projetofarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.projetofarmacia.model.Categorias;


@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {
	public List<Categorias> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);
}
