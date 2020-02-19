package org.jersey.project.hellojersey.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {
	private long id;

	private String ProfileName;
	private String FirstName;
	private String SecondName;
    private Date created;
    
    public Profile()
    {
    	
    }
	
    public Profile(long id,String ProfileName,String FirstName,String SecondName)
    {
    	this.id=id;
    	this.ProfileName=ProfileName;
    	this.FirstName=FirstName;
    	this.SecondName=SecondName;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfileName() {
		return ProfileName;
	}

	public void setProfileName(String profileName) {
		ProfileName = profileName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getSecondName() {
		return SecondName;
	}

	public void setSecondName(String secondName) {
		SecondName = secondName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
