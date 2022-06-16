package com.harish.interview.liquibase;

interface IExercise {
	void start() throws Exception;

	void execute();

	void markNegativePoints();

	void end();
}
