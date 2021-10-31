package com.onlinebanking.mortgage.data;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.IdClass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;	

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@Embeddable
public class UserPropertyId implements Serializable {

	private static final long serialVersionUID = -2192592724644665795L;
	
	Long propertyId;
	Long userId;
	
	
	public UserPropertyId() {
		super();
	}
	public UserPropertyId(Long propertyId, Long userId) {
		super();
		this.propertyId = propertyId;
		this.userId = userId;
	}
	public Long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (propertyId ^ (propertyId >>> 32));
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPropertyId other = (UserPropertyId) obj;
		if (propertyId != other.propertyId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserPropertyId [propertyId=" + propertyId + ", userId=" + userId + "]";
	}
	
	
	

}
