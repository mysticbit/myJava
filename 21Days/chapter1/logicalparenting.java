/*
 * Create an inheritance hierarchy for the pieces of a chess set. 
 * Decide where the instance variables color, startingPosition, 
 * forwardMovement, and sideMovement should be defined in the 
 * hierarchy. */


Object
  |
  |__Parent Chess (Color,moveForward, moveBack, moveLeft, moveRight,
                   superAllMoves, allMoves, moveL, Starting Position)
           |
           |
           |
  [                            ]
  
  Pawn(moveForward)
  Rook(moveForward, moveBack, moveLeft, moveRight)
  Bishop(moveDiagnally)
  Knight(moveL)
  Queen(superAllMoves)
  King(allMoves)
  
  
  /*I could put all the moves at the parent and then let the 
   * child class inherit all the moves. But only execute the
   * methods required for each child class. For the color
   * it would also be stated on the parent class the selections
   * and it would be assigned by the child class
   * The same goes for the Starting position. It appears
   * that most of it can be parent class since all these attributes
   * are fixed and can be assigned/used by the child class*/
  
  
  
  
  
  
              
           