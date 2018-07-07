arch-annotations
================

arch-annotations

It`s an open source project that prodive annotations to enable communication trought the code.
The ideia its express and improve things like developer to developer comumunication and architecture and design deceision
that often are not easy to capure and make they explicit thought annotation.

<a href="https://travis-ci.org/diegopacheco/arch-annotations"><img src="https://travis-ci.org/diegopacheco/arch-annotations.svg"></a>

### How to use it

arch-annotations are not in the public repos however is possible to download and add to your project.
build.gradle
```gradle
buildscript {
  repositories {
    jcenter()
    mavenCentral()
    maven { url 'https://oss.sonatype.org/content/groups/public/' }
  }
  dependencies {
    classpath 'org.ajoberstar:gradle-git:1.7.2'
  }
}
apply plugin: 'org.ajoberstar.grgit'
apply   from: 'https://raw.githubusercontent.com/diegopacheco/arch-annotations/master/config.gradle'
apply plugin: 'java'

sourceCompatibility = 1.8
targetCompatibility = 1.8

repositories {
    mavenCentral()
    maven { url 'https://oss.sonatype.org/content/groups/public/' }
    mavenLocal()
}

dependencies {
  // github task downloaded from github now we can use it here :D
  compile 'com.github.diegopacheco.sandbox.java:arch-annotations:1.0-SNAPSHOT'
}

compileJava.dependsOn github
clean.dependsOn githubClean
```
Them just run
```bash
./gradlew clean build eclipse
```
### Sample usage in Java
```java
package com.github.diegopacheco.sandbox.java.sample;

import java.util.Date;

import com.github.diegopacheco.sandbox.java.arch.annotations.arch.Architecture;
import com.github.diegopacheco.sandbox.java.arch.annotations.arch.Bound;
import com.github.diegopacheco.sandbox.java.arch.annotations.arch.Profile;
import com.github.diegopacheco.sandbox.java.arch.annotations.arch.ServiceNature;
import com.github.diegopacheco.sandbox.java.arch.annotations.code.Refactoring;

@ServiceNature(
		bound=Bound.LATENCY,
		main_architecture=Architecture.REQUEST_DRIVEN
)
public class MyDateService {

	@Refactoring(todo="This should not return void",
							 who_found="Diego Pacheco",when="07/07/2018",
							 why="Side effects are bad"
	)
	public void process() {
		System.out.println(new Date());
	}
	
}
```
