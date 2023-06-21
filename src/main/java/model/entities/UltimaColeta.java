package model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dta_ultima_coleta")
public class UltimaColeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_dta_ultima_coleta")
	private Long cod_coleta;
	
//	@Column(name = "cod_pessoa")
//	private Long codPessoa;
	
	@Column(name = "dta_calca")
	private LocalDate dtaCalca;
	@Column(name = "dta_blusa")
	private LocalDate dtaBlusa;
	@Column(name = "dta_jaqueta")
	private LocalDate dtaJaqueta;
	@Column(name = "dta_moletom")
	private LocalDate dtaMoletom;
	@Column(name = "dta_meias")
	private LocalDate dtaMeias;
	@Column(name = "dta_cueca")
	private LocalDate dtaCueca;
	@Column(name = "dta_calcinha")
	private LocalDate dtaCalcinha;
	@Column(name = "dta_top")
	private LocalDate dtaTop;
	@Column(name = "dta_sapato")
	private LocalDate dtaSapato;
	
	public UltimaColeta() {
		super();
	}

	
	
}
