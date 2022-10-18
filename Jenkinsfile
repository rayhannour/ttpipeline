pipeline {
agent any

  environment {
    dockerhub= credentials('dockerhub')   
  }
  
  stages {
  
  stage('Building image') {
      steps{       
        sh 'docker build -t smgsapps-v1:1.01  .'        
      }
    }

  stage('Publish docker hub') {
      steps{       
        sh 'docker tag smgsapps-v1:1.01  090380/smgsapp-v1:v1.01 ' 
	echo 'Hammmmmadi : ' 
	echo '$dockerhub_PSW | docker login -u $dockerhub_USR --password-stdin '   
	echo 'Fin Hammmmmadi'      
	sh 'docker push  090380/smgsapp-v1:v1.01 ' 
      }
    }
  }

}
