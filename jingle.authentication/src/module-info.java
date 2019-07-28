module jingle.authentication {
	requires java.persistence;
	requires java.validation;
	
	requires jingle.shareddata;
	
	exports com.jingle.authentication;
}