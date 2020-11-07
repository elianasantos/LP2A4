package br.ifsp.edu.galeriadearte;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 

@Entity
public class ObraDeArte implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;	
	
	@Column(name = "autor_da_obra" ) 	
	private String autor;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_obra", nullable = false)
	private Calendar dataObra;
	private String tipo;
	private String procedencia;
	private String tecnica;
	private String imagem;

	public ObraDeArte() {		
			
	}
	
	public ObraDeArte(Long id, String titulo, String autor, Calendar data,
			String tipo, String procedencia, String tecnica, String imagem) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.dataObra = data;
		this.tipo = tipo;
		this.procedencia = procedencia;
		this.tecnica = tecnica;
		this.imagem = imagem;	
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Calendar getDataObra() {
		return dataObra;
	}

	public void setData(Calendar data) {
		this.dataObra = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	 
		
		
		
	}

 