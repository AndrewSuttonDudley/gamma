#!/bin/bash

./gradlew clean
./gradlew build
docker image build -t sleepyheadlabs-gamma:latest .
docker compose up
