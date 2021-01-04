package com.spring.practice;

public class VotingMachineClient {

	public static void main(String[] args) {
		VotingMachineService vMachineService = new VotingMachineService();
		vMachineService.getVotingMachine();
	}

}
