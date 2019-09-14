## Servlet API vendors
- Apache Tomcat [Apache foundation]
- JBoss [RedHat]
- WebLogic [Oracle]
- WebSphere [IBM]
- Glassfish
- Jetty
- Undertow

## HttpServlet
- is an abstract class
- So to work with HttpServlet we need one child class
- That's by in out project we create servlets and extends HttpServlet
- Now HttpServlet has doGet and doPost method with dummy implementation
- but we don't want dummy implementation,
- that's by we override doGet and doPost methods in our servlet.


# Examples
## We want to learn about HttpServletRequest, ServletConfig and ServletContext.
  - We will have one training institute where PHP and Java trainings are provided.
  Trainee can come and enroll for either PHP or Java, in response of enrolment
  trainee gets trainer name, trainer mobile number and institute name.
  Points to focus here is all students who enrolled for PHP should get PHP
  trainer information and all students who enrolled for Java should get Java
  trainer information. Obviously trainee should get same institute name in
  response. They should also see there name in response.
  - java-enrollment.html, php-enrollment.html
  - JavaServlet.java, PhpServlet.java
  - data
    - trainee name - changes always for different users - HttpServletRequest
    - trainer info - change on the basis of courses - ServletConfig
    - institute name - never changes, common for all - ServletContext
