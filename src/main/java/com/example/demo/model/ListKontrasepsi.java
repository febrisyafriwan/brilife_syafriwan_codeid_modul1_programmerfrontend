package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_kontrasepsi")
public class ListKontrasepsi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_kontrasepsi")
	private int id_kontrasepsi;
	
	@Column(name = "nama_kontrasepsi")
	private String nama_kontrasepsi;
	
	public String getNama_kontrasepsi() {
		return nama_kontrasepsi;
	}
	public void setNama_kontrasepsi(String nama_kontrasepsi) {
		this.nama_kontrasepsi = nama_kontrasepsi;
	}
}
