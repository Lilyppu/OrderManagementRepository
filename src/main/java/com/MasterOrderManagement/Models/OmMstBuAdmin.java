package com.MasterOrderManagement.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "OM_MST_BU_ADMIN")
@IdClass(OmMstBuAdminCompKey.class)
public class OmMstBuAdmin {
	@Id
    @Column(name = "BUSS_UNIT", length = 15)
    private String ombaBusinessUnit;
	
	@Id
    @Column(name = "PRINCIPAL_START")
    private Integer ombaPrincipalStart;
	
	@Id
    @Column(name = "PRINCIPAL_END")
    private Integer ombaPrincipalEnd;

    @Column(name = "ADMIN", nullable = false)
    private Integer ombaAdmin;

    @Column(name = "CREATE_BY", length = 12, nullable = false)
    private String ombaCreatedBy;

    @Column(name = "CREATE_DATE", nullable = false)
    private Date ombaCreateDate;

    @Column(name = "UPDATE_BY", length = 12)
    private String ombaUpdatedBy;

    @Column(name = "UPDATE_DATE")
    private Date ombaUpdateDate;
}
