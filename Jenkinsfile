pipeline {
    agent any 
echo "Started Pipeline"
    stages {
        stage('Build') { 
            steps {
               bat "mvn clean"
            }
        }
        stage('Test') { 
            steps {
               bat "mvn test"
            }
        }
        stage('Deploy') { 
            steps {
             bat "mvn package"
            }
        }
    }
}
