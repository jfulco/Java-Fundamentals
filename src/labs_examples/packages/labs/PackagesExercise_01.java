package labs_examples.packages.labs;

/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new labs_examples.packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */
//Flow:

//Volunteer controller has the volunteer Person objects. It adds them to a list,
//        then prompts user to identify the day of the week for the event.
//
//Then it passes the number to a volunteers method in the Services class.
//        That returns a new list of volunteers for that specific
//        day of the week
//
//Then it tells the user what the volunteers' pay will be with additional percent for volunteer hours
//
//In the Person class, there are several protected methods -
//        two methods calculate the person's bonus for years of service & weekly pay
//        the setters are set to protected so the only place you can run those methods is in the employeeinfo package
//        the getters are set to public so they can be called in the community_service package