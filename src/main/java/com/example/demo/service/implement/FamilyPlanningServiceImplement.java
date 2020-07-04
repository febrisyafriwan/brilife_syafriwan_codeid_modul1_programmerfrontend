package com.example.demo.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.ListPemakaiKontrasepsi;
import com.example.demo.repository.ListPemakaiKontrasepsiRepository;
import com.example.demo.request.ListPemakaiKontrasepsiRequest;
import com.example.demo.service.FamilyPlanningService;
@Service
public class FamilyPlanningServiceImplement implements FamilyPlanningService {
	@Autowired
	ListPemakaiKontrasepsiRepository listpemakaikontrasepsirepository ;
	@Override
	@CrossOrigin
	public ListPemakaiKontrasepsiRequest upload(ListPemakaiKontrasepsiRequest input)  {
		// TODO Auto-generated method stub
		ListPemakaiKontrasepsi modelPemakaiKontrasepsi = new ListPemakaiKontrasepsi();
		modelPemakaiKontrasepsi.setId_kontrasepsi(input.getId_kontrasepsi());
		modelPemakaiKontrasepsi.setId_propinsi(input.getId_propinsi());
		modelPemakaiKontrasepsi.setJumlah_pemakai(Integer.parseInt(input.getJumlah_pemakai()));
		listpemakaikontrasepsirepository.save(modelPemakaiKontrasepsi);
		return input;
	}
	@Override
	@CrossOrigin
	public List<ListPemakaiKontrasepsiRequest> getAllData() throws Exception {
		List<ListPemakaiKontrasepsiRequest> list = new ArrayList<>();
		List<ListPemakaiKontrasepsi> data = listpemakaikontrasepsirepository.getAllData();
		System.out.println(data);
		for (ListPemakaiKontrasepsi row : data) {
			ListPemakaiKontrasepsiRequest temp = new ListPemakaiKontrasepsiRequest();
			temp.setId_propinsi(row.getId_propinsi());
			temp.setId_kontrasepsi(row.getId_kontrasepsi());
			temp.setJumlah_pemakai(String.valueOf(row.getJumlah_pemakai()));
			list.add(temp);
		}
		return list;
	}
}
