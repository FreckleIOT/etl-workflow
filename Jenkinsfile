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

      stage('Typecheck') {  
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
