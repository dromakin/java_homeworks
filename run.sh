#!/bin/bash

url=https://get.sdkman.io
script_path="/home/runner/.sdkman/bin/sdkman-init.sh"

eval "curl -s ${url} | bash"

wait

eval "cd /home/runner/.sdkman/bin/ && . ./sdkman-init.sh && cd && cd ./javahomeworks"

wait

eval "sdk install ant"

wait

eval "ant compile"

wait

eval "clear"

echo "homework №1 - basics"

commando1="java -classpath result/homework_1 com.dromakin.starter.Starter"
echo "homework №2 - generics"

commando2="java -classpath result/homework_2 com.dromakin.starter.Starter"
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

eval "ant clean && clear"
echo "Bye!"
