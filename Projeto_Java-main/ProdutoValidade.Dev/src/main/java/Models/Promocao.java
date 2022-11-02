package Models;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Promocao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Estoque estoque;
	
	@Column(name = "Data_Inicio_Promocao", columnDefinition = "DATE")
	private Date dataInicio;
	@Column(name = "Data_Termino_Promocao", columnDefinition = "DATE")
	private Date dataTermino;
	
	@Column(precision = 2, scale = 2)
	private double porcentagem;
	
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	public double getProcentagem() {
		return porcentagem;
	}
	public void setProcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}

}
