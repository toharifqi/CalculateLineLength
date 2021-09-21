# Problem Statement
As a fan of geometry, Client want to model a line based on points consisting of (x, y) coordinates using the cartesian system. So that Client can calculate its length.

# Requirement
- JDK version 11.0  <br><br>
  Windows : https://docs.oracle.com/en/java/javase/13/install/installation-jdk-microsoft-windows-platforms.html <br><br>
  Linux
  https://docs.oracle.com/en/java/javase/11/install/installation-jdk-linux-platforms.html  
  <br>
  Ubuntu
```bash
sudo apt install openjdk-11-jdk
```
- JUnit : At least Version 3.0 (For Testing)
- Repl  : (For Testing)
- Gradle version 7

# Instruction

Clone the repo first to your desired directory.

## Build App
### IDE
If you use Intellij or Eclipse IDE, you can build the project directly by clicking green hammer button.

### Terminal
```
./gradlew build
```

## Run App
### IDE
1. If you use Intellij or Eclipse IDE just run the project directly by clicking green play button.
2. You have to input x1,y1 (point 1) and x2,y2 (point 2).
3. You will get the distance between the two point.

### Terminal
1. Use terminal and go to the project directory.
2. Use command below
```bash
./gradlew run
```
4. You have to input x1,y1 (point 1) and x2,y2 (point 2).
5. You will get the distance between the two point.

## Run Test
###IDE
1. Open test folder
2. Run the app by clicking the green play button beside the class or the method

### Terminal
1. Use terminal and go to the project directory.
2. Use command below
```bash
./gradlew test
```
