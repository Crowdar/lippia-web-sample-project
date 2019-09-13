
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
          sh "echo ${currentBuild.startTimeInMillis}"
          sh "mkdir /var/jenkins_home/reportsVolume/${currentBuild.startTimeInMillis}"
          sh "mv ./target/cucumber-report/example.html /var/jenkins_home/reportsVolume/${currentBuild.startTimeInMillis}"
        }
    }

  }
}
