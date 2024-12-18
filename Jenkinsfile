pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                dir('/Users/mohammedjabir/git/Test123'){
                    sh 'docker run -t --rm -v "$(pwd)":/tmp/project katalonstudio/katalon katalonc.sh -projectPath=/tmp/project -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/G2" -browserType="Chrome" -apiKey="18518f73-41ec-469e-b6eb-6422fef6bb2b"'
                }
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'Reports/**/*.*', fingerprint: true
            junit 'Reports/**/JUnit_Report.xml'
        }
    }
}