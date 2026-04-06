pipeline {
    agent any

    tools {
        maven 'Maven'  // Assuming Maven is configured in Jenkins as 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                // Code is already checked out by Jenkins
                echo 'Checking out code...'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed.'
        }
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}