package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="list_propinsi")
public class ListPropinsi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_propinsi")
	private int id_propinsi;
	
	@Column(name = "nama_propinsi")
	private String nama_propinsi;

	public String getNama_propinsi() {
		return nama_propinsi;
	}
	public void setNama_propinsi(String nama_propinsi) {
		this.nama_propinsi = nama_propinsi;
	}

}
