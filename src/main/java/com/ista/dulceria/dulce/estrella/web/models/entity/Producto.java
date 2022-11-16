package com.ista.dulceria.dulce.estrella.web.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "productos")
public class Producto {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_producto;
	
	private String codigo_producto;
	private String nombre_producto;
	private Long u_caja;
	private Long precio_mayorista;
	private Long precio_detalle;
	private Long pvp;
	private Boolean estado;
	private String imagen;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria id_categoria;

	public Producto() {
		super();
	}

	public Producto(String codigo_producto, String nombre_producto, Long u_caja, Long precio_mayorista,
			Long precio_detalle, Long pvp, Boolean estado, String imagen, Categoria id_categoria) {
		super();
		this.codigo_producto = codigo_producto;
		this.nombre_producto = nombre_producto;
		this.u_caja = u_caja;
		this.precio_mayorista = precio_mayorista;
		this.precio_detalle = precio_detalle;
		this.pvp = pvp;
		this.estado = estado;
		this.imagen = imagen;
		this.id_categoria = id_categoria;
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public String getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(String codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Long getU_caja() {
		return u_caja;
	}

	public void setU_caja(Long u_caja) {
		this.u_caja = u_caja;
	}

	public Long getPrecio_mayorista() {
		return precio_mayorista;
	}

	public void setPrecio_mayorista(Long precio_mayorista) {
		this.precio_mayorista = precio_mayorista;
	}

	public Long getPrecio_detalle() {
		return precio_detalle;
	}

	public void setPrecio_detalle(Long precio_detalle) {
		this.precio_detalle = precio_detalle;
	}

	public Long getPvp() {
		return pvp;
	}

	public void setPvp(Long pvp) {
		this.pvp = pvp;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Categoria getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Categoria id_categoria) {
		this.id_categoria = id_categoria;
	}

	


}
