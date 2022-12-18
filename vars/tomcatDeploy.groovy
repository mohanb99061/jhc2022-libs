def call(ip,creds,user){
  sshagent (["${creds}"]){
    sh "scp -o StrictHostKeyChecking=no target/*.war ${user}@${ip}:/opt/tomcat9/webapps"
    sh "ssh ${user}@${id} /opt/tomcat9/bin/shutdown.sh"
    sh "ssh ${user}@${id} /opt/tomcat9/bin/startup.sh"
  }

}
