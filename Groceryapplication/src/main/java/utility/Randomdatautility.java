package utility;

import com.github.javafaker.Faker;

public class Randomdatautility 
{
Faker faker=new Faker();
public String randomusername() 
{
	return faker.name().username();
}
public String randompassword()
{
	return faker.internet().password();
}
public String randomfullname() 
{
	return faker.name().fullName();
}
public String randomemail()
{
	return faker.internet().emailAddress();
}
}
