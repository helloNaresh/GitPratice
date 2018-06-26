package com.example.dbcommunication.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class FacultyFetch {
	@ApiModelProperty(value="This field is mandatory to fill",required=true)
	private Integer facultyId;

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}
	

}
