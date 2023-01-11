def newDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}
def newbuild()
{
  sh 'mvn package'
}
def newdeploy(jobname,ip,appname)
{
  sh 'scp /var/lib/jenkins/workspace/${jobname}/server/target/server.jar ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war'
}
