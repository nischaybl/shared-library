def call (String username ='null')
echo "This is a shared library greetuser: ${username}"
pipeline {
  environment {
    USER_NAME="${username}"
    }
   agent any
    stages{
      stage{
        steps{
          echo "Hi $USER_NAME, How are you! "
       } 
     }
   }
 }
