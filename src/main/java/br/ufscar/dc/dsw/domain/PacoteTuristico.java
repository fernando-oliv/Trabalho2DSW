package br.ufscar.dc.dsw.domain;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.FetchType;


@Entity
@Table(name = "PacoteTuristico")
public class PacoteTuristico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @ManyToOne
	@JoinColumn(name = "agencia_id")
	private Agencia agencia;


    @ManyToMany(targetEntity = Destino.class)
	private List<Destino> destino;

    @Column(nullable = false)
    private Timestamp dataPartida;

    @Column(nullable = false)
    private Integer duracaoDias;

	@Column(nullable = false)
	private Float valor;
    
	@Column(nullable = false, unique = false, length = 100)
	private String descricao;

	@OneToMany(mappedBy = "pacote")
	private List<Foto> fotos;

    @ManyToMany(targetEntity = Cliente.class, mappedBy = "pacotesComprados", fetch = FetchType.EAGER)
    private List<Cliente> clientes;


    public PacoteTuristico(Long id, Agencia agencia, List<Destino> destino, Timestamp dataPartida, Integer duracaoDias,
            Float valor, String descricao, List<Foto> fotos) {
        this.setId(id);
        this.setAgencia(agencia);
        this.setDestino(destino);
        this.setDataPartida(dataPartida);
        this.setDuracaoDias(duracaoDias);
        this.setValor(valor);
        this.setDescricao(descricao);
        this.setFotos(fotos);
    }

    public PacoteTuristico(Agencia agencia, List<Destino> destino, Timestamp dataPartida, Integer duracaoDias,
            Float valor, String descricao, List<Foto> fotos) {
        super();
        this.setAgencia(agencia);
        this.setDestino(destino);
        this.setDataPartida(dataPartida);
        this.setDuracaoDias(duracaoDias);
        this.setValor(valor);
        this.setDescricao(descricao);
        this.setFotos(fotos);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }


    public Timestamp getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Timestamp dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Integer getDuracaoDias() {
        return duracaoDias;
    }

    public void setDuracaoDias(Integer duracaoDias) {
        this.duracaoDias = duracaoDias;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Destino> getDestino() {
		return destino;
	}
	public void setDestino(List<Destino> destino) {
		this.destino = destino;
	}


    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }
}
