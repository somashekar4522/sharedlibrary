def download(repo)
{
  git "https://github.com/somashekar4522/${repo}.git"
}
def build()
{
   sh 'mvn package'
}
  
