package model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoas")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_pessoa")
	private Long codPessoa;
	@Column(name = "nom_pessoa")
	private String nome;
	@Column(name = "apl_pessoa")
	private String aplPessoa;
	@Column(name = "dt_nascimento")
	private Date dataNascimento;
	@Column(name = "dt_acolhimento")
	private Date dataAcolhimento;
	
//	private Medida codmedidas;
	
	@Column(name = "des_observacao")
	private String observacao;
	
	public Pessoa() {
		super();
	}
	
	public Long getcodPessoa() {
		return codPessoa;
	}
	public void setcodPessoa(Long id) {
		this.codPessoa = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return aplPessoa;
	}
	public void setApelido(String apelido) {
		this.aplPessoa = apelido;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}