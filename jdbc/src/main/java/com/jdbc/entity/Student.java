package com.jdbc.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {

	private int id;
	private String name;
	private int mobile;
	private String country;
}
