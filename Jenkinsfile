pipeline {
    agent any

    stages {
        stage('clone repository and clean it') {
            steps {
                sh "mvn clean -f jenkins"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test -f jenkins"
            }
        }
        stage('Deploy') {
            steps {
                sh "mvn package -f jenkins"
            }
        }
    }
}
