pipeline {
agent any

  environment {
    dockerhub= credentials('dockerhub')   
  }
  
  stages {
  
  	stage('Building image') {
      		steps{       
        		sh 'docker build -t 090380/sms-sapp-v1:1.02  .'        
      		}
    	}
	stage('Push image') {
	 steps{
        	withDockerRegistry([ credentialsId: "dockerhub", url: "" ]) {
        		sh 'docker push  090380/sms-sapp-v1:1.02 ' 
			sh 'docker pull  090380/sms-sapp-v1:1.02 '			
		}
         }
        }
   }

}
