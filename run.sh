#!/bin/bash

cd homeworks
find . -name "*.java" > sources.txt

sources=$(<sources.txt)
javac -d ../bin $sources

cd ..

eval "java -cp bin HomeworkManager"

rm homeworks/sources.txt
rm -rf bin
