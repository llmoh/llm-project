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

           sh './mvnw clean verify'
       }
     }

     stage('stage 2'){
            steps {
              echo 'stage 2'
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