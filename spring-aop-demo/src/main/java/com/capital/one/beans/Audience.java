package com.capital.one.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
	
	@Before("execution(* com.capital.one.beans.Movie.watchMovie(..))")
	public void buyTicket() {
		System.out.println("Buying ticket...");
	}

	@Before("execution(* com.capital.one.beans.Movie.watchMovie(..))")
	public void findSeat() {
		System.out.println("Finding seat...");
	}
	
	@AfterReturning("execution(* com.capital.one.beans.Movie.watchMovie(..))")
	public void clap() {
		System.out.println("Clap at the end...");
	}
	
	@AfterThrowing("execution(* com.capital.one.beans.Movie.watchMovie(..))")
	public void boo() {
		System.out.println("Booing at the end...");
	}
	
	//@After("execution(* com.capital.one.beans.Movie.watchMovie(..))")
	public void goHome() {
		System.out.println("Going home...");
	}
	
	@Around("execution(* com.capital.one.beans.Movie.watchMovie(..))")
	public void useRestroom(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Using restroom before movie...");
		jp.proceed();
		System.out.println("Using restroom after movie...");
	}
}






