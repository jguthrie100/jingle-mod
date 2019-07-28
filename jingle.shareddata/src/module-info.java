module jingle.shareddata {
	requires java.persistence;
	requires java.validation;
	
	exports com.jingle.shareddata.models;
	exports com.jingle.shareddata.exceptions;
}