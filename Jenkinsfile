node{
  stage('SCM Checkout'){
    git 'https://github.com/ktn123/Cars24AutomationUsingCucumber.git'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
