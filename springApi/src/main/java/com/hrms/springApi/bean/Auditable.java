package com.hrms.springApi.bean;

 

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable {
	
@CreatedBy
protected String Created_by;

@Temporal(TemporalType.TIMESTAMP)
@CreatedDate
protected Date Created_on;

@LastModifiedBy
protected String Updated_by;

@Temporal(TemporalType.TIMESTAMP)
@LastModifiedDate
protected Date Updated_on;

public String getCreated_by() {
	return Created_by;
}

public void setCreated_by(String created_by) {
	Created_by = created_by;
}

public Date getCreated_on() {
	return Created_on;
}

public void setCreated_on(Date created_on) {
	Created_on = created_on;
}

public String getUpdated_by() {
	return Updated_by;
}

public void setUpdated_by(String updated_by) {
	Updated_by = updated_by;
}

public Date getUpdated_on() {
	return Updated_on;
}

public void setUpdated_on(Date updated_on) {
	Updated_on = updated_on;
}


}
