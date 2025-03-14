# TicTacToe
A simple yet interactive console-based Tic-Tac-Toe game with Two-Player mode and Single-Player mode with Easy and Hard difficulty levels.
### How to Run ?
1. Clone the repository :
```
 git clone https://github.com/dakiyaanoosi/Java-Programs.git
```
2. Navigate to the repository :
```
 cd Java-Programs
 cd TicTacToe
```
Compile and Execute the files :
#### Two Players mode :
```
 javac -d . TwoPlayers.java
```
```
 java TicTacToe.TwoPlayers
```
#### Single Player mode :
```
 cd SinglePlayer
```
- Easy mode
```
 javac -d . Easy.java 
``` 
``` 
 javac TicTacToe.SinglePlayer.Easy
```
- Hard mode
```
 javac -d . Hard.java 
``` 
``` 
 javac TicTacToe.SinglePlayer.Hard
```

### Features
- Autofills the last remaining position
- Easy mode's algorithm : Attempt a winning or blocking move; otherwise, fill a random position.
- Hard mode's algorithm :
  - Ocuupy centre position if available.
  - else attempt a Winning Move.
  - else attempt a Blocking move.
  - else occupy Corner position.
  - else fill any random edge position.
  <br>  
  Altough this algorithm is not as efficient as Minimax - it successfully serves it's purpose - i.e. either the Computer Wins or the game ends in a Tie.
