pipeline {
  agent none
  stages {
    stage('Typecheck') {
      steps {
        node(label: 'general') {
          sh 'sbt compile'
        }

      }
    }
    stage('Run tests') {
      steps {
        node(label: 'general') {
          sh 'sbt test'
        }

      }
    }
  }
}