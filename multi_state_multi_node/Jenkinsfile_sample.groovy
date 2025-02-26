pipeline {
    agent none
    stages {
        stage ("back-end"){
            agent {
                docker { image 'maven:latest'}
            }
            steps {
                sh 'mvn --version'
            }
        }
        stage ("front-end") {
            agent {
                docker { image 'nginx:latest'}
            }
            steps {
                sh 'nginx --version'
            }
        }
    }
}