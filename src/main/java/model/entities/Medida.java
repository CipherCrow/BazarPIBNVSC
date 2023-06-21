package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medidas")
public class Medida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_medidas")
	private Long codMedidas;
	@Column(name = "cod_pessoas")
	private Long codPessoa;
	
	@Column(name = "nro_pes")
	private Double nroPes;
	@Column(name = "nro_calca")
	private Double nroCalca;
	@Column(name = "nro_blusa")
	private Double nroBlusa;
	
	@Column(name = "tam_pes")
	private String tamanhoPes;
	@Column(name = "tam_calca")
	private String tamanhoCalca;
	@Column(name = "tam_blusa")
	private String tamanhoBlusa;
	
	@Column(name = "des_observacao")
	private String observacao;
	
	public Medida() {
		super();
	}
	
	
	
}