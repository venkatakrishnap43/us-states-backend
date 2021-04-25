# Read Me First
Following will provide commands to run the project locally:

* The original package name 'com.main-service.' is invalid and this project uses 'com.mainservice' instead.

# Getting Started
* Requirement for this project is 
    * RabbitMq should listen to port 15672 and 5672
    * Mysql Database should be running on port 127.0.0.1:13306
    * Minio on port 9000
    

* Alternate way to run these services locally is to install docker locally and follow these commands

Command to run minio locally on docker
------
______
docker run -d --rm -p 9000:9000 -e "MINIO_ACCESS_KEY=minio" -e "MINIO_SECRET_KEY=changeme" minio/minio server /data
______

Command to run mysql locally on docker
------
______
docker run --name mysql -p 13306:3306 -e MYSQL_DATABASE=bookstore -e MYSQL_ROOT_PASSWORD=test123 -d mysql:5.7
______

Command to Rabbit locally on docker
-----
_____
docker run --rm -it --hostname my-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
_____

To login to Mysql Cli Open Git bash and follow this command
------
______
winpty docker exec -it mysql mysql -u root -ptest123
______

Create respective databases in Mysql
---------
________
create database logdb;
________

Following are the Mysql Commands that could be helpful
----------
________
* To show all tables in database: show tables;
* To change database: use [database name];
* To drop table: drop table [table name];
* To show data in table: select * from [table name];
* To show data based on condition: select * from [table name] where [condition1];
* To apply multiple conditions: select * from [table name] where [condition1] and [condition2];


To Login to RabbitMQ
-------
_______
* Go to docker work-bench and navigate to Rabbit and click on "Open in a browser", or you can do "localhost:15672"
* To login username: guest and password: guest
_______

To Login to Minio
-------
_______
* Go to docker work-bench and navigate to Minio and click on "Open in a browser", or you can do "localhost:9000"
_* To login username: minio and password: changeme
_______
