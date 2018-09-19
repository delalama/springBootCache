# springBootCache
Convenience of using cache in spring boot controllers

# Why to use it?
The purpose of a cache is to optimize resources to offer better performances.

# Explanation
We've a spring boot application that expose data in a URL.
The data we're exposing is 200 rows of Person entity , in an URL defined in PersonController.

![Image of Yaktocat](https://github.com/delalama/springBootCache/blob/master/pics/1)

Impossible to explain better than [Eugen Paraschiv](https://www.baeldung.com/spring-boot-start)

When we've created the basic structure we only need to add this annotation

![Image of Yaktocat](https://github.com/delalama/springBootCache/blob/master/pics/2)

When we ask to the controller we recieve this parsed JSON in our browser

![Image of Yaktocat](https://github.com/delalama/springBootCache/blob/master/pics/3)

The we ask for the same information and we can analyze the results.

![Image of Yaktocat](https://github.com/delalama/springBootCache/blob/master/pics/4)

# Conclusion
We can appreciate a big time optimization working with simplest queries and entities. 
