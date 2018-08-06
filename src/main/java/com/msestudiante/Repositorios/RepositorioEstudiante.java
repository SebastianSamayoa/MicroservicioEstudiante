package com.msestudiante.Repositorios;

import com.msestudiante.Entidades.ApEstudiante;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface RepositorioEstudiante extends PagingAndSortingRepository<ApEstudiante,Integer> , QueryByExampleExecutor<ApEstudiante>{
}
