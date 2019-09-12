pipeline {
  agent any
  tools {
    maven 'maven-3'
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean -P GridParallel test'
      }
    }
    stage('Publish report') {
      steps {
        sh 'mkdir --parents /var/jenkins_home/reportsVolume/$(date +%Y%m%d_%H%M%S); mv ${workspace}/nd-volume-needed-for-example-job/target/cucumber-report/example.html $_'
      }
    }
  }
}
