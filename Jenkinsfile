pipeline {
  agent any
  stages {
   
    stage('TESTS') {
      withMaven(maven: 'maven-3') {
        sh "mvn clean verify"
      }
    }
  }
}