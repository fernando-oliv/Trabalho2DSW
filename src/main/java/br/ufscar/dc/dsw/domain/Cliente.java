package br.ufscar.dc.dsw.domain;

import java.util.Set;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente extends Usuario {

    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(nullable = false, unique = false, length = 18)
    private String telefone;

    @Column(nullable = false, unique = false, length = 18)
    private String sexo;

    @Column(nullable = false, unique = false, length = 18)
    private Timestamp dataNascimento;


	@ManyToMany(targetEntity = PacoteTuristico.class)
	private Set<PacoteTuristico> pacotesComprados;

	public Cliente(String nome, String email, String senha, String tipo, String cpf, String telefone, String sexo, Timestamp dataNascimento) {
		super(nome, email, senha, tipo);
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Timestamp getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Timestamp dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

	public Set<PacoteTuristico> getPacotesComprados() {
		return pacotesComprados;
	}

	public void setComprados(Set<PacoteTuristico> pacotesComprados) {
		this.pacotesComprados = pacotesComprados;
	}

}
