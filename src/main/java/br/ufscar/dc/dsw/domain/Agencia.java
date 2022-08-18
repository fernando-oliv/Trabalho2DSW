package br.ufscar.dc.dsw.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Agencia")
public class Agencia extends Usuario {


	@Column(nullable = false, unique = true, length = 18)
	private String cnpj;

	@Column(nullable = false, unique = false, length = 100)
	private String descricao;

	@OneToMany(mappedBy = "agencia")
	private List<PacoteTuristico> pacotes;
	
	public Agencia(Long id){
        super(id);
    }

    public Agencia(Long id, String nome, String email, String senha, String tipo, String cnpj, String descricao) {
        super(id, nome, email, senha, tipo);

        this.setCnpj(cnpj);
        this.setDescricao(descricao);
    }

    public Agencia(String nome, String email, String senha, String tipo, String cnpj, String descricao) {
        super(nome, email, senha, tipo);

        this.setCnpj(cnpj);
        this.setDescricao(descricao);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public List<PacoteTuristico> getPacotes() {
		return pacotes;
	}
	public void setPacotes(List<PacoteTuristico> pacotes) {
		this.pacotes = pacotes;
	}
}
