package mil.pusdalops.domain.user;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import mil.pusdalops.domain.common.IdBasedObject;
import mil.pusdalops.domain.common.SchemaUtil;

@Entity
@Table(name = "user", schema = SchemaUtil.SCHEMA_COMMON)
public class User extends IdBasedObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7663200087477288797L;

	//  `user_name` varchar(255) DEFAULT NULL,
	@Column(name="user_name")
	private String user_name;
	
	//  `user_password` varchar(255) DEFAULT NULL,
	@Column(name="user_password")	
	private String user_password;
	
	//  `enabled` char(1) DEFAULT NULL,
	@Column(name = "enabled")
	@Convert(converter = org.hibernate.type.TrueFalseConverter.class)
	private boolean enabled;
	
	// Use Set instead of List to avoid duplicate roles for one user
	@OneToMany(cascade={ CascadeType.ALL }, orphanRemoval=false, fetch=FetchType.EAGER)
	@JoinTable(
			name="user_join_role", 
			joinColumns = {@JoinColumn(name="id_user")}, 
			inverseJoinColumns = @JoinColumn(name="id_role"))
	private Set<UserRole> user_roles;

	@Override
	public String toString() {
		return "User [id=" + super.getId() // + ", createDate=" + super.getCreateDate() + ", modifiedDate=" + super.getModifiedDate() 
				+ ", user_name=" + user_name + ", user_password=" + user_password
				+ ", enabled=" + enabled + ", createDate=" + super.getCreateDate() + ", lastEditDate=" + super.getLastEditDate()
				+ ", user_roles=" + user_roles + "]";
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public boolean isEnabled() { return enabled; }
	  
	public void setEnabled(boolean enabled) { this.enabled = enabled; }
	 
	public Set<UserRole> getUser_roles() {
		return user_roles;
	}

	public void setUser_roles(Set<UserRole> user_roles) {
		this.user_roles = user_roles;
	}	
	
}
