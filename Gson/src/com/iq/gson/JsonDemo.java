package com.iq.gson;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonDemo {
	public static void Jsonwriter(Student student) throws JSONException {

	Object json=new Object();
		System.out.println(json);
		JSONObject json1 =new JSONObject();
		json1.put("id", 100);
		json1.put("name", "abc");
		json1.put("fee", 12000.00);
		json1.put("sname", "anil");
		System.out.println(json1+"");
	}

	public static void gsonWriter(Student student) throws IOException {
		FileWriter fw = new FileWriter("student.json");
		Gson gson = new Gson();
		String output = gson.toJson(student);
		System.out.println(output);
		gson.toJson(student, fw);
		System.out.println("success");
		fw.close();
		
	}

	public static void jacksonWriter(Student student) throws IOException {
		FileOutputStream fos = new FileOutputStream("std.json");
		ObjectMapper objectMapper = new ObjectMapper();
		String output = objectMapper.writeValueAsString(student);
		System.out.println(output);
		objectMapper.writeValue(fos, student);
		System.out.println("success");
		fos.close();
	}

	public static void main(String[] args) throws IOException, JSONException {
		Student student = new Student(100, "anil");
		System.out.println("okay");
		gsonWriter(student);
		
		JsonDemo d=new JsonDemo();
		d.jacksonWriter(student);
//	
	//jacksonWriter(student);
	Jsonwriter(student);
	}


}


