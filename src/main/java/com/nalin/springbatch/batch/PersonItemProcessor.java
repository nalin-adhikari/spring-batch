/**
 * 
 */
package com.nalin.springbatch.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.nalin.springbatch.domain.Person;

/**
 * A common paradigm in batch processing is to ingest data, transform it, 
 * and then pipe it out somewhere else. Here we write a simple transformer 
 * that converts the names to uppercase.
 * 
 * PersonItemProcessor implements Spring Batch’s ItemProcessor interface. 
 * This makes it easy to wire the code into a batch job that we define further. 
 * According to the interface, we receive an incoming Person object, after 
 * which we transform it to an upper-cased Person.
 * 
 * There is no requirement that the input and output types be the same. In fact, 
 * after one source of data is read, sometimes the application’s data flow needs a different data type.
 * 
 * @author nalin
 * @since June 8, 2017
 *
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person>{

	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
	
	@Override
	public Person process(Person person) throws Exception {
		final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Converting ( {} ) into ( {} )",person, transformedPerson);

        return transformedPerson;
	}

}
