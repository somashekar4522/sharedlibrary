def download(repo)
{
  git url: 'https://github.com/somashekar4522/${repo}.git', credentialsId: 'github-creds'
}
def build()
{
   sh 'mvn package'
}
  
