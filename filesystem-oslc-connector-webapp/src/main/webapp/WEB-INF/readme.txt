The files here was taken from ....\lyo-adaptor-sample-modelling-main-5.x.zip\lyo-adaptor-sample-modelling-main-5.x\adaptor-rm-webapp\
https://github.com/OSLC/lyo-adaptor-sample-modelling




In web.xml set the follow parameters:
listener->listener-class (it must be aligined with project structure)
servlet->param-value (it must be aligined with project structure)
context-param->param-value (the port and hostname values must be aligned with oslc model project (server configuration block) and ServletListener.java file - fallbackBase variable)
servlet-mapping->url-pattern (the value must be aligned with oslc model project (server configuration block))
