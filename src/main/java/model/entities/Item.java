package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itens")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_item")
	private Long codItem;
	
	@Column(name = "des_item")
	private String desItem;
	
	@Column(name = "qtd_item")
	private int qtdItem;
	
	@Column(name = "tipo_cor")
	private Double tipoCor;
	
	@ManyToOne
	//@Column(name = "cod_tipoItem")
	private TipoItem codTipoItem;

	@Column(name = "nro_item")
	private Double nroItem;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tam_item")
	private TamanhoItemEnum tipoItem;
	
	@Column(name = "vlr_item")
	private Double vlrItem;
	
	@Column(name = "des_observacao")
	private String desObservacao;
	
	public Item() {
		super();
	}

}