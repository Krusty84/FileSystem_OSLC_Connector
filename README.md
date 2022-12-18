
**Eclipse 2022-03 (4.23.0)** - Eclipse IDE for Enterprise Java and Web Developers

**Eclipse Lyo Designer 5.0.0**

**Apache Maven 3.8.6**

The small, demo project - it represents folder contents via OSLC specification, this adapter (connector) was generated based on filesystem_connector_model model
plus some pieces of code:

Find  **/*krusty84** , or **<%--krusty84**, for identyfing my pieces of code

Find the **readme.txt** files, for getting some extra comments about something in this project

In this project was added the following classes:
- **FileSystemConnect_Helper.java** - the various methods to communicate with file system
- **GlobalConstantsVariables.java**

In **RestDelegate.java:**

**public static String pathToRootFolder="C:\\Temp";**
you may change the path to the exposing folder

The web-app port: **8181**

In Eclipse, create the new Run configuration for Maven Build, Goals: **clean install jetty:run**
