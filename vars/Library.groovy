def download(git)
{
   https://github.com/somashekar4522/${git}.git
}
def build()
{
   sh 'mvn package'
}
  
