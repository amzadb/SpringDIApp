package com.spring.practice;

public class VotingMachineService {
	private IVotingMachine votingMachine;

	public void getVotingMachine() {
		System.out.println(votingMachine.showVotingMachine());
	}

	public void setVotingMachine(IVotingMachine votingMachine) {
		this.votingMachine = votingMachine;
	}

}
