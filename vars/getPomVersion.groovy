def call(pomFilePath){
  def pom = readMavenPom file: "${pomFilePath}"
  return pom.version
}
