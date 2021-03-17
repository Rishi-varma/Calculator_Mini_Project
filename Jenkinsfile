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
    stage('Deploy using Rundeck') {
      agent any
      steps {
        script {
          step([$class: "RundeckNotifier",
                  includeRundeckLogs: true,
                  jobId: "efca4934-7807-46ca-b866-36a2b7169dc7",
                  rundeckInstance: "Rundeck",
                  shouldFailTheBuild: true,
                  shouldWaitForRundeckJob: true,
                  tailLog: true])
        }
      }
    }
}
}
