package com.MasterOrderManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MasterOrderManagement.Models.OmMstScoreHouse;
import com.MasterOrderManagement.Services.ServiceOmMstScoreHouse;

@RestController
public class ControllerOmMstScoreHouse {
	@Autowired
	ServiceOmMstScoreHouse servOMSH;
	
	@GetMapping("/MasterOrderManagement/getOmshAll")
	public List<OmMstScoreHouse> getOmshAll(){
		return servOMSH.getOmshAll();
	}
	
	@GetMapping("/MasterOrderManagement/getOmshByBussUnitCU")
	public Optional<OmMstScoreHouse> getOmshByBussUnitCU(String bussunit){
		return servOMSH.getOmshByBussUnitCU(bussunit);
	}
}
