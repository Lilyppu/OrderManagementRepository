package com.MasterOrderManagement.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OmMstObjCodeCompKey implements Serializable {
	private String omocObjCode;
	private String omocObjGrp;
	private String omocObjDescr;
	private String omocObjBrand;
	private String omocObjType;
}
