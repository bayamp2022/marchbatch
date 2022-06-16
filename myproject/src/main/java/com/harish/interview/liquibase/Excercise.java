package com.harish.interview.liquibase;
class Exercise implements IExercise {
	public void start() {
		System.out.println("Start");
	}

	public void execute() {
		System.out.println("Execute");
	}

	public void markNegativePoints() {
		System.out.println("MarkNegativePoints");
	}

	public void end() {
		System.out.println("End");
	}
}
