package mil.pusdalops.domain.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mil.pusdalops.domain.common.IdBasedObject;
import mil.pusdalops.domain.common.SchemaUtil;

@Entity
@Table(name = "user_role", schema = SchemaUtil.SCHEMA_COMMON)
public class UserRole extends IdBasedObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3704996438997906155L;

	@Column(name="user_role")
	private String role_name;

	@Override
	public String toString() {
		return "UserRole [id=" + super.getId() // + ", createDate=" + super.getCreateDate() + ", modifiedDate=" + super.getModifiedDate()
				+ ", role_name=" + role_name + "]";
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	 
}
