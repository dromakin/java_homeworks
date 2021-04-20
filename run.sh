#!/bin/bash

# using read command without any variable

echo "1. homework"
commando1="java ./homework_1/src/basics/Main.java"
echo "2. homework"
commando2="java ./homework_2/src/generics/Main.java"
echo "Enter number of project : "

read

# echo "Name : $REPLY"

if [ $REPLY  -eq  1 ]
then
    echo "Welcome to homework №1 project!"
    eval $commando1
elif [ $REPLY  -eq  2 ]
then
    echo "Welcome to homework №2 project!"
    eval $commando2
else
    echo "Error input. Rerun program please."
fi