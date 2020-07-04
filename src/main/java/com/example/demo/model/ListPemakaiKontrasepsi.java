package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="list_pemakai_kontrasepsi")
public class ListPemakaiKontrasepsi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_list")
	private int id_list;
	@Column(name = "id_propinsi")
	private int id_propinsi;
	@Column(name = "id_kontrasepsi")
	private int id_kontrasepsi;
	@Column(name = "jumlah_pemakai")
	private int jumlah_pemakai;
	
	public int getId_list() {
		return id_list;
	}
	public void setId_list(int id_list) {
		this.id_list = id_list;
	}
	public int getId_propinsi() {
		return id_propinsi;
	}
	public void setId_propinsi(int id_propinsi) {
		this.id_propinsi = id_propinsi;
	}
	public int getJumlah_pemakai() {
		return jumlah_pemakai;
	}
	public void setJumlah_pemakai(int jumlah_pemakai) {
		this.jumlah_pemakai = jumlah_pemakai;
	}
	public int getId_kontrasepsi() {
		return id_kontrasepsi;
	}
	public void setId_kontrasepsi(int id_kontrasepsi) {
		this.id_kontrasepsi = id_kontrasepsi;
	}
}
