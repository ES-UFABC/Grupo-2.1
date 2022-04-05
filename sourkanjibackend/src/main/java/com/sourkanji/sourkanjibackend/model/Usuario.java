package com.sourkanji.sourkanjibackend.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	//private String token;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	@Column
	@NotNull
	private String nomeUsuario;

	@Column
	@NotNull
	private String senhaUsuario;

	@Column
	@NotNull
	private String emailUsuario;

	@Column
	private Long phoneNumber;
	
	@Column
	private String profilePicture;

	private String token;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public List<Performance> shareProfilePerfomance(List<Performance> performanceModel){
		return null;
	}

	public String getToken() {
	 	return token;
	}

	public void setToken(String token) {
	 	this.token = token;
	}

}
