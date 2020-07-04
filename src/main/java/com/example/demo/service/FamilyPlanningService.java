package com.example.demo.service;

import java.util.List;

import com.example.demo.request.ListPemakaiKontrasepsiRequest;

public interface FamilyPlanningService {

	public ListPemakaiKontrasepsiRequest upload(ListPemakaiKontrasepsiRequest propinsiKontrasepsi);
	public List<ListPemakaiKontrasepsiRequest> getAllData () throws Exception;
}
