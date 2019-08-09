pipeline {
  agent any
  stages {
        stage('Tests') {
            def mvn_version = 'maven-3'
            withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
                sh 'mvn -version'
            }
        }
    }
}