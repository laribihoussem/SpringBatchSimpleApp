 pipeline {
    agent any
  options {
      buildDiscarder(logRotator(numToKeepStr: '3', daysToKeepStr: '5'))    }
    stages {
       stage('check pipeline') {
          steps {
             echo 'Checking pipeline'
          }
       }
    }
 }
