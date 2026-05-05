def download(repo)
{
  git url: 'https://github.com/somashekar4522/sharedlibrary.git', credentialsId: 'github-creds'
}
def build()
{
   sh 'mvn package'
}
  
