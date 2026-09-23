node('vaishnavi') {

    properties([
        parameters([
            choice(
                name: 'Select Environment',
                choices: ['Dev', 'QA', 'Prod'],
                description: 'Select deployment environment'
            ),

            string(
                name: 'Version',
                defaultValue: '1.0',
                description: 'Select application version'
            ),

            booleanParam(
                name: 'RUN_COMPILE',
                defaultValue: true,
                description: 'Run compile for Build'
            )
        ])
    ])

    stage('Checkout') {
        git(
            branch: 'vaishnavi',
            changelog: false,
            poll: false,
            url: 'https://github.com/applyn-devops/Sample-maven-project.git'
        )
    }

    stage('Validate') {
        sh 'mvn validate'
    }

    stage('Build') {
        if (params.RUN_COMPILE) {
            sh 'mvn clean compile'
        } else {
            echo 'Compile skipped'
        }
    }

    stage('Test') {
        sh 'mvn test'
    }

    stage('Package') {
        sh 'mvn package'
    }

    stage('Deploy') {
        echo "Deploying version ${params.Version}"
        echo "Environment: ${params.'Select Environment'}"
    }
}

