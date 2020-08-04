package baiwa.mysql.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "USERS")
@Data
@Builder
public class Users implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8093555045596458611L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String fullName;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
}
