#!/bin/bash
cd /home/ec2-user/server
mvn clean install
sudo java -jar target/rest-example-ws-0.0.1-SNAPSHOT.jar  >/dev/null 2>&1 &