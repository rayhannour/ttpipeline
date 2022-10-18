pipeline {
agent any

  environment {
    dockerhub= credentials('dockerhub')   
  }
  
  stages {
  
  	stage('Building image') {
      		steps{       
        		sh 'docker build -t 090380/smgsapp-v1:1.01  .'        
      		}
    	}
	stage('Push image') {
        	withDockerRegistry([ credentialsId: "dockerhub", url: "" ]) {
        		sh 'docker push  090380/smgsapp-v1:v1.01 ' 
		}
        }
   }

}
