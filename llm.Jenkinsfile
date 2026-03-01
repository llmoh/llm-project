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
           // Compile and run unit tests
           sh './mvnw clean verify'
       }
     }

     stage('Package') {
         steps {
             sh 'mvn package -DskipTests' // optional, if you want to skip tests here
         }
     }
  }
  post {
          always {
              junit 'target/surefire-reports/*.xml'
          }
          success {
              archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
          }
      }
}