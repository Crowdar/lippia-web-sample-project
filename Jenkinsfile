pipeline {
  agent any
  tools {
    maven 'maven-3'
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B clean test'
      }
    }
  }
}