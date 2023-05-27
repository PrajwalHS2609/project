package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class login_dto {

private int mid;
private String name;
@Id
private String email;
private long pwd;
public int getId() {
	return mid;
}
public void setId(int mid) {
	this.mid = mid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPwd() {
	return pwd;
}
public void setPwd(long pwd) {
	this.pwd = pwd;
}

}
