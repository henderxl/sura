package com.gastos.sura.repositories;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import com.gastos.sura.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByAsume(String asume);

    @Query(value="SELECT SUM(gasto) FROM sura.usuario;",nativeQuery=true)
    public List<UsuarioModel> getValues(Integer Gasto);
}

