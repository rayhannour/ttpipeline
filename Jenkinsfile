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
	sh 'docker push  090380/smgsapp-v1:v1.01 ' 
      }
    }
  }

}
