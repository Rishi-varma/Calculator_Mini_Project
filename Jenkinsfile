#!groovy
pipeline {
    agent any
    stages {
     stage('Maven Install and Build Jar') {
      steps {
       sh 'mvn clean package -DskipTests'
       }
     }
     stage('Docker Build') {
      steps {
        sh 'docker build -t rishivarma98/calculator:latest .'
      }
    }
     stage('Docker Hub'){
     steps{
 	  withDockerRegistry([ credentialsId: "17fe4b96-1407-435e-9fef-19375f43a9cd", url: "" ]){
 	   sh 'docker push rishivarma98/calculator:latest'
 	  }
     }
   }
}
}
