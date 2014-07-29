## git sample commands 
# git clone https://github.com/sandakith/SandBox.git
# git status
# git add README.md 
# git reset HEAD <Folder> 
# git checkout README.md
# git commit -m "Update Readme"
# git status
# git diff
# git push origin master 

#git log origin/master..HEAD
#git diff origin/master..HEAD


git config --global user.name "username"
git config --global user.email "emila""

echo "Updating git settings"
git config user.name
git config user.email


#####################################################
# How to remove sensitive data from git
# remove file commit from git and push
# download a fresh clone to anohter place 
# use bfg java -jar bfg.har --delete-files <file>
# git push : commits will be there file content gone
#####################################################

# Revert Details 

git revert dd61ab32

git push mathnet +dd61ab32^:master

git reset HEAD^ --hard
git push mathnet -f

git rebase -i dd61ab32^
git push mathnet -f
