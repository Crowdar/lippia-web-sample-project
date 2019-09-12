pipeline {
  agent any
  tools {
    maven 'maven-3'
  }
  stages {

    stage('Publish report') {
      steps {
        def reportFolder = sh(script: 'echo $(date +%Y%m%d_%H%M%S)', returnStdout: true)
        def publishFolder  = "/var/jenkins_home/reportsVolume/${reportFolder}"
        
        sh 'mkdir ${publishFolder};
        sh 'mv ./target/cucumber-report/example.html ${publishFolder}

      }
    }
  }
}
