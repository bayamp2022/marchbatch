package com.harish.interview.liquibase;

public class DriverExam {

	public static void executeExercise(IExercise exercise) {
		try {
			exercise.start();
			exercise.execute();
		} catch (Exception e) {
			exercise.markNegativePoints();
		}

		exercise.end();
	}

	public static void main(String[] args) {
		DriverExam.executeExercise(new Exercise());
	}
}