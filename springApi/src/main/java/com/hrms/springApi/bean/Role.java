package com.hrms.springApi.bean;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.hrms.springApi.bean.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="role")
public class Role extends Auditable {
 
	 @GeneratedValue(strategy= GenerationType.AUTO)	 
	 @Id
	    private Long roleId;
	 @Column(unique=true)
	    private String roleName;
  
	    

	 


	    public Role() {
	    }


	   

	    public Role(Long roleId, String roleName) {
	        this.roleId = roleId;
	        this.roleName = roleName;
	    }

	    public Long getRoleId() {
	        return roleId;
	    }

	    public void setRoleId(Long roleId) {
	        this.roleId = roleId;
	    }

	    public String getRoleName() {
	        return roleName;
	    }

	    public void setRoleName(String roleName) {
	        this.roleName = roleName;
	    }
}
