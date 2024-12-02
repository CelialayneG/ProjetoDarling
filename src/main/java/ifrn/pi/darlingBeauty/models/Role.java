package ifrn.pi.darlingBeauty.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Role {
	

	
	@Id
	@GeneratedValue
	private Long id;
	private String email;
	
	public String getAuthority() {
		return this.email;
		
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
