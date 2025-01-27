def call(String ProjectName, String ImageTag, String dockerHubUser){
  echo "This is push image to dockerhub"
  withCredentials([userNamePassword(
  credentialsId:"DockerHubCred",
  passwoordVariable:"dockerHubPass",
  usernameVariale:"dockerHubUser")])
  {
  sh 'docker login -u ${dockerHubUser} -p ${dockerHubPass}'
  sh 'docker image tag ${ProjectName}:${ImageTag} ${dockerHubUser}/${ProjectName}:${ImageTag}'
  sh 'docker push ${dockerHubUser}/${ProjectName}:${ImageTag}'
}
