pipeline {
  agent any
  tools {
    maven 'maven-3'
  }
  stages {

    stage('Publish report') {
      steps {
        def publishFolder = sh(script: 'mkdir /var/jenkins_home/reportsVolume/$(date +%Y%m%d_%H%M%S)', returnStdout: true) 
        sh 'mv ./target/cucumber-report/example.html ${publishFolder}

      }
    }
  }
}
