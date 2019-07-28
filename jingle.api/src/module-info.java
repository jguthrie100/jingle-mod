module jingle.api {
	requires spring.beans;
	requires spring.web;
	requires spring.context;
	requires spring.data.jpa;
	requires spring.core;
	
	requires spring.data.commons;
	requires tomcat.embed.core;
	requires spring.tx;
	
	requires jingle.shareddata;
	requires jingle.authentication;
	
	exports com.jingle.api.controllers;
	exports com.jingle.api.repositories;
	exports com.jingle.api.services;
}