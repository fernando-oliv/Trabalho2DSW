package br.ufscar.dc.dsw.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name = "Foto")
public class Foto {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    @Column(nullable = false, unique = false, length = 250)
	private String url;

    @ManyToOne
	@JoinColumn(name = "pacote_id")
	private PacoteTuristico pacote;

    public Foto(PacoteTuristico pacote, String url) {
        this.pacote = pacote;
        this.url = url;
    }

    public Foto(String url) {
        super();
        this.setUrl(url);
    }

    public PacoteTuristico getPacote() {
        return pacote;
    }

    public void setPacote(PacoteTuristico pacote) {
        this.pacote = pacote;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
