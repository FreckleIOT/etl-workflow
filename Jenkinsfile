pipeline {
    agent none
    
    stages {
      stage('Typecheck') {
        agent {
          node {
            label 'general'
          }
        }
        steps {
          ansiColor('xterm') {
            sh '''
            sbt compile
            '''
          }
        }
      }

      stage('Test') {  
        agent {
              node {
                  label 'general'
              }
        }
        steps {
          ansiColor('xterm') {
            sh '''
            sbt test
            '''
          }
        }
      }
    }
}
