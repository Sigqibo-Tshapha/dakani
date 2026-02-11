# All the useful spring annotations

* #### @SpringBootApplication:
  * Annotates the main application class. 
  * Instances create the _Spring Context_. 
  * Convenience annotation that combines three key functions: @Configuration (defines bean sources), @EnableAutoConfiguration (activates automatic configuration based on classpath), and @ComponentScan (detects components in the package). 

* #### @Entity:
  * Annotates a persistant JPA component.
  * Indicates to the JPA provider (eg. Hibernate) that class can be mapped to a table.

* #### @Inheritance(strategy = InheritanceType.SINGLE_TABLE):
  * Defines how class hierarchies are mapped to database tables

* #### @DiscriminatorColumn
  * Used in an entity inheritance hierarchy to specify the column that differentiates one subclass from another within the same database table.

* #### @DiscriminatorValue("DISCRIMINATOR")
  * Specify the exact value that will be stored in the discriminator column of the database table for a particular entity class

* #### @Embedded
  * Maps a dependent object (@Embeddable) directly into the parent entity's table, rather than creating a separate table. 

* 