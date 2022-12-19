public class CommandPrompt { 
    public static void main(String[] args) {
        System.out.println("\nRun Java in Command Prompt");

        try {
        System.out.println("\nPrint User Input " +args[0]);
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("\nNo user input was given");
        }

    }
    
}


/*
# COMMAND PROMPT NAVIGATION

Finish Name                     TAB
Directory List                  dir
Open Directory                  cd <NAME>
Prev Directory                  cd .. 
Remove lines                    clear
Create new directory            mkdir <NAME>
Cancel current action           ctrl + c
Create File                     New-Item <NAME>.java
Open File in VCode              code <NAME>.java



# JAVA COMPILE COMMANDS

Compile in directory            javac <NAME>.java  
Compile in new directory        javac -d classes <NAME>.java



# JAVA EXECUTION COMMANDS

Run class file                  java <NAME>.java
Run class + user Input          java <NAME>.java Hello
Run class in next directory     java -cp <DIRECTORY> <NAME>
Run 1 Method java file          java <NAME>.java



# CREATE GITHUB REPOSITORY

https://github.com/new



# INIT GIT & GITHUB

git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/LucasHartman/<REPOSITORY>.git
git push -u origin main



# PUSH COMMITTED

git add *
git commit -m "added some changes to my repo!"
git push --all 'https://github.com/LucasHartman/Cookbook_Java_2023.git'

*/