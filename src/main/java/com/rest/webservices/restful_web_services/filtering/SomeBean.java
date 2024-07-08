package com.rest.webservices.restful_web_services.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//@JsonIgnoreProperties({"field1", "field2"})
@JsonFilter("SomeBeanFilter")
public class SomeBean {
	private String field1;
	
//	@JsonIgnore
	private String field2;
	
	private String field3;
	public SomeBean(String field1, String field2, String field3) {
		super();
		field1 = field1;
		field2 = field2;
		field3 = field3;
	}
	public String getField1() {
		return field1;
	}
	public String getField2() {
		return field2;
	}
	public String getField3() {
		return field3;
	}
	@Override
	public String toString() {
		return "SomeBean [Field1=" + field1 + ", Field2=" + field2 + ", Field3=" + field3 + "]";
	}
}
