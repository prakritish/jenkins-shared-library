@Library("shared-lib@parallel") _
import com.seneshore.Parallel
def Parallel = new Parallel()
def Names = ["Prakritish", "Pravat", "Kusum"]

pipeline {
    agent any
    options {
        timestamps ()
    }
    stages {
        stage("Parallel Execution") {
            steps {
                script {
                    Parallel(Names)
                }
            }
        }
    }
}