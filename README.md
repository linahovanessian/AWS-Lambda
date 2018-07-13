# AWS-Lambda
trying out some AWS Lambda examples
sample SAM command:
sam local invoke LoggingHandler --event input.json
 sam local invoke POJOHandler --event input.json --log-file ./output.log
 
 To do a remote debug :
 sam local invoke EmployeeHandler --event employee.json --log-file ./output.log -d 5858
