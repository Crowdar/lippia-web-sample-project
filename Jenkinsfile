pipeline {
  agent any
  tools {
    maven 'maven-3'
  }
  stages {

    stage('Publish report') {
      steps {
        def publishFolder = /var/jenkins_home/reportsVolume/$(date +%Y%m%d_%H%M%S);
        sh 'mkdir ${publishFolder};
        sh 'mv ./target/cucumber-report/example.html ${publishFolder}

      }
    }
  }
}
