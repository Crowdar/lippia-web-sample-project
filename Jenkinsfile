pipeline {
  agent any
  tools {
    maven 'maven-3'
  }
  stages {

    stage('Publish report') {
      steps {
        sh 'pwd | cat'
        sh 'mkdir --parents /var/jenkins_home/reportsVolume/$(date +%Y%m%d_%H%M%S); mv ./target/cucumber-report/example.html $_'

      }
    }
  }
}
