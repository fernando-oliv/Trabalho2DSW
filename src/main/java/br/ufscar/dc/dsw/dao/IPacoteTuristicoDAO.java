package br.ufscar.dc.dsw.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.ufscar.dc.dsw.domain.PacoteTuristico;
import br.ufscar.dc.dsw.domain.Cliente;


@SuppressWarnings("unchecked")
public interface IPacoteTuristicoDAO extends CrudRepository<PacoteTuristico, Long>{

	PacoteTuristico findById(long id);

	List<PacoteTuristico> findAll();

    List<PacoteTuristico> findAllByClientes(Cliente cliente);
	
  	PacoteTuristico save(PacoteTuristico pacote);

	void deleteById(Long id);


}
