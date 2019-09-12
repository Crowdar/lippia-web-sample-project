
pipeline {
  agent any
  tools {
    maven 'maven-3'
  }
  stages {

    stage('Publish report') {
      steps {
        sh 'mkdir ${currentBuild.startTimeInMillis}'
        sh 'mv ./target/cucumber-report/example.html ${currentBuild.startTimeInMillis}'

      }
    }
  }
}
