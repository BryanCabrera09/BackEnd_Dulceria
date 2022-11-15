package com.ista.dulceria.dulce.estrella.web.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "producto_id")
	private Long id_producto;

	private String categoria_id;
	private String producto;
	private String codigo_p;
	private String u_caja;
	private String precio_detalle;
	private String precio_mayorista;
	private String estado;
	private String pvp;
	private String imagen;

	public Producto(String categoria_id, String producto, String codigo_p, String u_caja, String precio_detalle,
			String precio_mayorista, String estado, String pvp, String imagen) {

		this.categoria_id = categoria_id;
		this.producto = producto;
		this.codigo_p = codigo_p;
		this.u_caja = u_caja;
		this.precio_detalle = precio_detalle;
		this.precio_mayorista = precio_mayorista;
		this.estado = estado;
		this.pvp = pvp;
		this.imagen = imagen;
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public String getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(String categoria_id) {
		this.categoria_id = categoria_id;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getCodigo_p() {
		return codigo_p;
	}

	public void setCodigo_p(String codigo_p) {
		this.codigo_p = codigo_p;
	}

	public String getU_caja() {
		return u_caja;
	}

	public void setU_caja(String u_caja) {
		this.u_caja = u_caja;
	}

	public String getPrecio_detalle() {
		return precio_detalle;
	}

	public void setPrecio_detalle(String precio_detalle) {
		this.precio_detalle = precio_detalle;
	}

	public String getPrecio_mayorista() {
		return precio_mayorista;
	}

	public void setPrecio_mayorista(String precio_mayorista) {
		this.precio_mayorista = precio_mayorista;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPvp() {
		return pvp;
	}

	public void setPvp(String pvp) {
		this.pvp = pvp;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}
