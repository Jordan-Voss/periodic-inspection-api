#!/bin/bash
mvn package
docker buildx build --platform linux/arm/v7 -t api.ppm .
docker save --output ppm.tar api.ppm:latest
scp ppm.tar pi@192.168.0.185:/home/pi
ssh pi@192.168.0.185 'sudo ./packageppm.sh'


