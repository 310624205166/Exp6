
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Regression Test Report') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }

    post {
        success {
            echo 'Regression testing passed!'
        }

        failure {
            echo 'Regression testing failed!'
        }

        always {
            echo 'Pipeline execution completed.'
        }
    }
}
