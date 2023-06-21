package model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historico")
public class Historico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_historico")
	private Long codHistorico;
	
	@Column(name = "cod_pessoa")
	private int codPessoa;
	
	@Column(name = "cod_item")
	private int codItem;
	
	@Column(name = "dta_ocorrencia")
	private LocalDate dataOcorrencia;
	
	@Column(name = "ind_venda")
	private int indVenda;

	public Long getCodHistorico() {
		return codHistorico;
	}

	public void setCodHistorico(Long codHistorico) {
		this.codHistorico = codHistorico;
	}

	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

	public int getCodItem() {
		return codItem;
	}

	public void setCodItem(int codItem) {
		this.codItem = codItem;
	}

	public LocalDate getDataDada() {
		return dataOcorrencia;
	}

	public void setDataDada(LocalDate dataDada) {
		this.dataOcorrencia = dataDada;
	}

	public int getIndVenda() {
		return indVenda;
	}

	public void setIndVenda(int indVenda) {
		this.indVenda = indVenda;
	}
	
}
