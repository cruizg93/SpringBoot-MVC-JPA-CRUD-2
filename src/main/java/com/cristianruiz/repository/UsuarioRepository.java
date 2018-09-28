package com.cristianruiz.repository;

import org.springframework.data.repository.CrudRepository;

import com.cristianruiz.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
