# how-to
Step by step answer to some common how-to.

## How to convert **Java Project** to **Dynamic Web Project** in Eclipse
- Select the Project
- Right click on Project
- Click **Properties** option
- Search **Facets**
- Click on **Convert to Faceted form...** link
- Select **Dynamic Web Module** checkbox
- Click **Apply**
- Click **Apply and Close**

## How to add **Apache Tomcat** into Eclipse
- Open Eclipse
- Click **Windows** option at top
- Click on **Show View** option
- Click **Others...** option
- Type **Servers**
- Select **Servers**
- Click **Open**
- At bottom you will see **Servers** tab
- Click on link **No servers are available. Click this link to create a new server...**
- Type **Apache**
- Expand **Apache** option
- Scroll down and select **Tomcat v9.0 Server** option
- Click **Next**
- Click on **Browse..** option
- Navigate to Apache Tomcat installation directory   
  Example: **D:\learn-java\server\apache-tomcate-9.0.10**
- Click on **Installed JRE**
- Un-ckeck previously selected JRE
- Click on **Add**
- Select on **Standard VM** option
- click **Next**
- Click on **Directory**
- Navigate to JDK installation Directory    
  Example: **C:\Program Files\Java\jdk1.8.0_121**
- Click **select Folder**
- Click **Finish**
- Select JDK option checkbox
- Click **Apply**
- Click **Apply and Close**
- Click on **JRE** dropdown
- Select **jdk1.8** option
- Click **Next**
- Click **Finish**

## How to Add **Apache Tomcat** to **Dynamic Web Project**
- Select the Project
- Right click on Project
- Click **Build Path**
- Click **Configure Build Path**
- Click **libraries**
- Click **Add Library**
- Select **Server Runtime** option
- Click **Next**
- Select **Apache Tomcat v9.0**
- Click **Finish**

## How to change Apache Tomcat server port from **8080** to something else
- Open Eclipse
- Click **Windows** option at top
- Click on **Show View** option
- Click **Others...** option
- Type **Servers**
- Select **Servers**
- Click **Open**
- Double click on **Tomcat v9.0 Server at localhost**
- Expand **Ports** option
- Click **Port Number** in front of *HTTP/1.1**
- Change port **8080** to something else Example: **8089**
- Save (`ctr + s`)

## How to change start and stop time of Apache Tomcat server
- Open Eclipse
- Click **Windows** option at top
- Click on **Show View** option
- Click **Others...** option
- Type **Servers**
- Select **Servers**
- Click **Open**
- Double click on **Tomcat v9.0 Server at localhost**
- Expand **Timeouts** option
- Set **Start** time to **120**
- Set **Stop** time to **60**
- Save (`ctr + s`)
