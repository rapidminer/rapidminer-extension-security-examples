/**
 * Copyright (C) 2013-2016 RapidMiner GmbH
 */
package com.rapidminer.extension.security.examples.fasterxml;

import java.io.IOException;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Examples for handling reflection calls.
 *
 * @author Marcel Michel
 */
public class JsonReflection {

	private final static String JSON_EXMAPLE = "{\"firstName\":\"John\", \"lastName\":\"Doe\"}";

	/**
	 * Example demonstrates how to prevent the "java.lang.reflect.ReflectPermission" security
	 * permission issue in regard to JSON parsing.
	 */
	public static void parseJsonExample() {
		ObjectMapper mapper = new ObjectMapper();
		// disable the override access modifiers feature to prevent reflection calls
		// the Person class must be publicly accessible
		mapper.disable(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
		try {
			System.out.println(mapper.readValue(JSON_EXMAPLE, Person.class));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
