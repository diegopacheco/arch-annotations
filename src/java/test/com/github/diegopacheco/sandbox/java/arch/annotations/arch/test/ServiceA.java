package com.github.diegopacheco.sandbox.java.arch.annotations.arch.test;

import com.github.diegopacheco.sandbox.java.arch.annotations.arch.Architecture;
import com.github.diegopacheco.sandbox.java.arch.annotations.arch.Bound;
import com.github.diegopacheco.sandbox.java.arch.annotations.arch.Profile;
import com.github.diegopacheco.sandbox.java.arch.annotations.arch.ServiceNature;
import com.github.diegopacheco.sandbox.java.arch.annotations.code.Refactoring;


@ServiceNature(
	bound = Bound.LATENCY,
	profile = Profile.SHORT_RUNNING_JOB,
	main_architecture = Architecture.REQUEST_DRIVEN)
@Refactoring(todo="add code here or kill it",when="23/09/2014",why="clean code matters",who_found="Diego Pacheco")
public class ServiceA {
	
}
