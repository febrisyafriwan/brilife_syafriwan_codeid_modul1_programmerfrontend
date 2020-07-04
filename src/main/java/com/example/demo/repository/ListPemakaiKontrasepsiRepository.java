package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.ListPemakaiKontrasepsi;

public interface ListPemakaiKontrasepsiRepository extends JpaRepository<ListPemakaiKontrasepsi, Integer>  {

	@Transactional
	@Query(value = "SELECT id_list, id_kontrasepsi, id_propinsi, jumlah_pemakai FROM list_pemakai_kontrasepsi ORDER BY id_list", nativeQuery = true)
	List<ListPemakaiKontrasepsi> getAllData();
}
