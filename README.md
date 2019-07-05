


from command lines as administrator execute:

1- go to root project directory

2- vagrant up --provision (wait to virtualbox instance start, this operation will be take several minutes) 

3- mvn clean -P GridParallel test    (execution of tests against selenium grid instance of the sandbox)

4- vagrant halt (to stop and close vagrant service)

