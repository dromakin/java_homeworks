#!/bin/bash

# using read command without any variable

echo "homework №1 - basics"
commando1="javac ./homework_1/src/basics/Main.java --class-path ."
commando1_r="java ./homework_1/src/basics/Main.java"
echo "homework №2 - generics"
commando2="javac ./homework_2/src/generics/Main.java --class-path ."
commando2_r="java ./homework_2/src/generics/Main.java"
echo "Enter number of project : "

read

# echo "Name : $REPLY"

if [ $REPLY  -eq  1 ]
then
    echo "Welcome to homework №1 project!"
    eval $commando1
    eval $commando1_r
elif [ $REPLY  -eq  2 ]
then
    echo "Welcome to homework №2 project!"
    eval $commando2
    eval $commando2_r
else
    echo "Error input. Rerun program please."
fi