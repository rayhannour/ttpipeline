pipeline {

  environment {
    registry = "https://hub.docker.com/repository/docker/090380/smgsapp-v1"
    registryCredential = 'dockerhub'
  }
  agent any

  stages {
stage('Building image') {
      steps{
        script {
          docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Checkout Source') {
      steps {
        git url:'https://github.com/rayhannour/ttpipeline.git', branch:'main'
      }
    }

    stage('Deploy App') {
      steps {
        script {
          kubernetesDeploy(configs: "deployment.yaml", kubeconfigId: "kubernetes")
        }
      }
    }

  }

}
