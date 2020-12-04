node {
       properties([parameters([string(defaultValue: '142.93.194.83', description: 'Please provide IP for container to build', name: 'IP', trim: true), string(defaultValue: 'latest', description: 'What version would you like to deploy', name: 'VER', trim: true), string(defaultValue: '4000', description: 'Please provide what port do you want to use', name: 'PORT', trim: true)])])     
       stage("Remove container"){
        try{
            sh "ssh root@${IP} docker rm -f Flaskex"
        }
        catch(exc){
            sh "echo container deleted"
        }
    }
    stage("Run Container"){
        sh "ssh root@${IP} docker run -d --name Flaskex -p ${PORT}:4000 murodbey/flaskex:${VER}"
    }
}