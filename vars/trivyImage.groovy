def call() {
    sh 'trivy image manjunk/youtube:latest > trivyimage.txt'
}