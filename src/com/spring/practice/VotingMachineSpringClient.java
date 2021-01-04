package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VotingMachineSpringClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		VotingMachineService vMachineService = (VotingMachineService) context.getBean("votingMachineService");

		vMachineService.getVotingMachine();

	}

}
