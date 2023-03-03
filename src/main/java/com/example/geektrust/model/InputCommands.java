package com.example.geektrust.model;

import java.util.*;
/**
 * @author Santanu Singha
 * @date 27/02/2023
 */

public class InputCommands {

	private String command;
	private List<String> token;
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public List<String> getToken() {
		return token;
	}
	public void setToken(List<String> token) {
		this.token = token;
	}
	
	public InputCommands(String command, List<String> token) {
		super();
		this.command = command;
		this.token = token;
	}
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || this.getClass() != object.getClass()) {
			return false;
		}
		InputCommands inputCommand = (InputCommands) object;;
		return this.command.equals(inputCommand.command) && this.token.equals(inputCommand.token);
	}
}
