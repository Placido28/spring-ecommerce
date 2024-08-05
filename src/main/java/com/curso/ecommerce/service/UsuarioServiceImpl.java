package com.curso.ecommerce.service;

import com.curso.ecommerce.model.Usuario;
import com.curso.ecommerce.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private IUsuarioRepository IUsuarioRepository;

    @Override
    public Optional<Usuario> findById(Integer id) {
        return IUsuarioRepository.findById(id);
    }
}
