package com.iq.gson;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class UserTest {

	public static void main(String[] args) throws JsonIOException, IOException {
		User user=new User(12, "kath", "vinny", "ven123", "12345");
		System.out.println(user);
		Gson gson=new Gson();
	String output=gson.toJson(user);
	System.out.println(output);
	
	FileWriter fw=new FileWriter("user.json");
	gson.toJson(user,fw);
	fw.flush();
	fw.close();
	
	System.out.println("sucess");
	
	
	}

	}


