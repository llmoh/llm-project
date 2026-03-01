pipeline {
  agent any
  tools {
     maven 'maven-3.9.12'
  }
  stages {
     stage('build project'){
       steps {
           echo 'maven version'
           sh 'mvn --version'

           sh './mvnw clean package'
       }
     }

     stage('stage 2'){
            steps {
              echo 'stage 2'
            }
          }
  }
}