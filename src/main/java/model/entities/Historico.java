package model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "historico")
public class Historico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_historico")
	private Long codHistorico;
	
	@OneToOne
	//@Column(name = "cod_pessoa")
	private Pessoa codPessoa;
	
	@ManyToOne
	//@Column(name = "cod_item")
	private Item codItem;
	
	@Column(name = "dta_ocorrencia")
	private LocalDate dataOcorrencia;
	
	@Column(name = "ind_venda")
	private int indVenda;

	
}
