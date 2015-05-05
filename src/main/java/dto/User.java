package dto;

import java.io.Serializable;


/**
 * <p> user params: </p>
 * @param access - int
 * @param id - int
 * @param email - String
 * @param login - String
 * @param name - String
 * @param surname - String
 * @param birthday - String
 * @param country - String
 * @param city - String
 * @param avatar - String
 * @param vkId - String
 * @param vkToken - String
 * @param fbId - String
 * @param fbToken - String
 */


public class User implements Serializable {
	

	private int access;
	
	private int id;
	private String email;
	private String login;
	private String name;
	private String surname;
	private String birthday;
	private String country;
	private String city;
	private String avatar;
	
	private String vkId;
	private String vkToken;
	private String fbId;
	private String fbToken;
	
	public int getAccess() {
		return access;
	}
	public void setAccess(int access) {
		this.access = access;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getVkId() {
		return vkId;
	}
	public void setVkId(String vkId) {
		this.vkId = vkId;
	}
	public String getVkToken() {
		return vkToken;
	}
	public void setVkToken(String vkToken) {
		this.vkToken = vkToken;
	}
	public String getFbId() {
		return fbId;
	}
	public void setFbId(String fbId) {
		this.fbId = fbId;
	}
	public String getFbToken() {
		return fbToken;
	}
	public void setFbToken(String fbToken) {
		this.fbToken = fbToken;
	}

}
