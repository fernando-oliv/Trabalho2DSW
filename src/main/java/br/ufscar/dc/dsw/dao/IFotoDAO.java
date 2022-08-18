package br.ufscar.dc.dsw.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.ufscar.dc.dsw.domain.Foto;
import br.ufscar.dc.dsw.domain.PacoteTuristico;



@SuppressWarnings("unchecked")
public interface IFotoDAO extends CrudRepository<Foto, Long>{

    Foto findById(long id);

    Foto findBypacote(PacoteTuristico pacote);

    List<Foto> findAllByPacote(PacoteTuristico pacote);

    Foto save(Foto foto);

    void deleteById(Long id);
}
