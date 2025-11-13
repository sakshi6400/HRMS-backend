package com.hrms.springApi.bean;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="user_master")
public class User implements UserDetails{
 
	@GeneratedValue(strategy= GenerationType.AUTO)	 
	 @Id
	private long userId;
	private String username;
	private String password;
	 
	@JoinColumn(name="department_id")
	@ManyToOne 
	  @JsonIgnore
    private department Department;
	 
	 
	@JoinColumn(name="role_id")
	@ManyToOne 
	@JsonProperty
	  @JsonIgnore
    private Role role;

	public User() {
		 
	}

	public User(long userId, String username, String password, department department, Role role) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		Department = department;
		this.role = role;
	}
	

 
	public long getUserId() {
		return userId;
	}
 
	public void setUserId(long userId) {
		this.userId = userId;
	}
 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}

 
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

 
	public department getDepartment() {
		return Department;
	}
 
	public void setDepartment(department department) {
		Department = department;
	}
 
	public Role getRole() {
		return role;
	}
 
	public void setRole(Role role) {
		this.role = role;
	}
 

	@Override 
 

    public Collection<? extends GrantedAuthority> getAuthorities() {

        Set<Authority> set = new HashSet<>();
         
            set.add(new Authority(role.getRoleName()));
 
        return set;
    }
 
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
	
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
 
}
