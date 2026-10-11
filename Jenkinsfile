pipeline {
    agent any

    environment {
        MAVEN_CMD = 'C:\\apache-maven-3.9.x\\bin\\mvn.cmd'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Source code checked out from GitHub.'
            }
        }

        stage('Build') {
            steps {
                bat '"%MAVEN_CMD%" -B -DskipTests compile'
            }
        }

        stage('Test') {
            steps {
                bat '"%MAVEN_CMD%" -B test'
            }
        }

        stage('Package') {
            steps {
                bat '"%MAVEN_CMD%" -B -DskipTests package'
            }
        }
    }

    post {
        always {
            junit testResults: 'target/surefire-reports/*.xml',
                  allowEmptyResults: true
            archiveArtifacts artifacts: 'target/*.jar',
                             allowEmptyArchive: true
        }
    }
}