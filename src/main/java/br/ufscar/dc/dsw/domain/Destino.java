package br.ufscar.dc.dsw.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.FetchType;


@Entity
@Table(name = "Destino")
public class Destino {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


    @Column(nullable = false, unique = false, length = 50)
	private String cidade;

    @Column(nullable = false, unique = false, length = 50)
    private String estado;

    @Column(nullable = false, unique = false, length = 50)
    private String pais;

    @ManyToMany(targetEntity = PacoteTuristico.class, mappedBy = "destino", fetch = FetchType.EAGER)
	private Set<PacoteTuristico> pacotes;


    public Destino(String cidade, String estado, String pais) {
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
