package model.entities;

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
//	private int codPessoa;
	
	@Column(name = "dta_calca")
	private int dtaCalca;
	@Column(name = "dta_blusa")
	private int dtaBlusa;
	@Column(name = "dta_jaqueta")
	private int dtaJaqueta;
	@Column(name = "dta_moletom")
	private int dtaMoletom;
	@Column(name = "dta_meias")
	private int dtaMeias;
	@Column(name = "dta_cueca")
	private int dtaCueca;
	@Column(name = "dta_calcinha")
	private int dtaCalcinha;
	@Column(name = "dta_top")
	private int dtaTop;
	@Column(name = "dta_sapato")
	private int dtaSapato;
	
	public UltimaColeta() {
		super();
	}

	public Long getCod_coleta() {
		return cod_coleta;
	}

	public void setCod_coleta(Long cod_coleta) {
		this.cod_coleta = cod_coleta;
	}

	public int getDtaCalca() {
		return dtaCalca;
	}

	public void setDtaCalca(int dtaCalca) {
		this.dtaCalca = dtaCalca;
	}

	public int getDtaBlusa() {
		return dtaBlusa;
	}

	public void setDtaBlusa(int dtaBlusa) {
		this.dtaBlusa = dtaBlusa;
	}

	public int getDtaJaqueta() {
		return dtaJaqueta;
	}

	public void setDtaJaqueta(int dtaJaqueta) {
		this.dtaJaqueta = dtaJaqueta;
	}

	public int getDtaMoletom() {
		return dtaMoletom;
	}

	public void setDtaMoletom(int dtaMoletom) {
		this.dtaMoletom = dtaMoletom;
	}

	public int getDtaMeias() {
		return dtaMeias;
	}

	public void setDtaMeias(int dtaMeias) {
		this.dtaMeias = dtaMeias;
	}

	public int getDtaCueca() {
		return dtaCueca;
	}

	public void setDtaCueca(int dtaCueca) {
		this.dtaCueca = dtaCueca;
	}

	public int getDtaCalcinha() {
		return dtaCalcinha;
	}

	public void setDtaCalcinha(int dtaCalcinha) {
		this.dtaCalcinha = dtaCalcinha;
	}

	public int getDtaTop() {
		return dtaTop;
	}

	public void setDtaTop(int dtaTop) {
		this.dtaTop = dtaTop;
	}

	public int getDtaSapato() {
		return dtaSapato;
	}

	public void setDtaSapato(int dtaSapato) {
		this.dtaSapato = dtaSapato;
	}
	
}
