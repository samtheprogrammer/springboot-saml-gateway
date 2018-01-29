# springboot-saml-gateway

#Simple Sample gateway to protect rest services 

You can add service endpoints you want to protect in application.yml file 

You can also add a zuul filter and pass additional headers to the services. (not implemented)

Also exposed /user endpoint to retrieve currently logged in user. 


To access the protected UI/service 

 http://localhost:8080/ui/** 
 
for accessing services 
 http://localhost:8080/service/**
