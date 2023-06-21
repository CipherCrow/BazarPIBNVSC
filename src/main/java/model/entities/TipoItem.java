package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoItem")
public class TipoItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_tipoItem")
	private Long codTipoItem;
	
	@Column(name = "nom_tipo")
	private String tipoItem;
		
	public TipoItem() {
		super();
	}
		
	
}