package com.example.demo.request;

public class ListPemakaiKontrasepsiRequest {

	private String jumlah_pemakai;
	private int id_propinsi;
	private int id_kontrasepsi;
	
	public int getId_propinsi() {
		return id_propinsi;
	}
	public void setId_propinsi(int id_propinsi) {
		this.id_propinsi = id_propinsi;
	}
	public int getId_kontrasepsi() {
		return id_kontrasepsi;
	}
	public void setId_kontrasepsi(int id_kontrasepsi) {
		this.id_kontrasepsi = id_kontrasepsi;
	}
	public String getJumlah_pemakai() {
		return jumlah_pemakai;
	}
	public void setJumlah_pemakai(String jumlah_pemakai) {
		this.jumlah_pemakai = jumlah_pemakai;
	}
	
}
