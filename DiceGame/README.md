# DiceGame
A basic console-based Dice-Game developed using Java's Random class for roll simulations.
### How to run ?
1. Clone the repository :
```
 git clone https://github.com/dakiyaanoosi/Java-Programs.git
```
2. Navigate to the repository :
```
 cd Java-Programs
 cd DiceGame
```
3. Compile any file :
```
javac -d . RoundsManual.java
```
4. Execute the file :
```
java DiceGame.RoundsManual
```

### Files
1. *Initial.java* : Simply prints the userRoll & computerRoll and declares the winner.<br>
2. *SideBySide.java* : Prints the userRoll & computerRoll in horizontal format and declares the winner.<br>
3. *Rounds.java* : Takes user input for the number of rounds - displays ScoreBoard after each round and finally declares the winner.<br>
4. *RoundsManual.java* : Similar to *Rounds.java* - but the next round proceeds only after user presses Enter. If the user presses any other character the game stops in between and the overall result is declared.<br>
5. *UntilStopped.java* : Similar to *RoundsManual.java* - but this program allows the user to play any number of rounds.
