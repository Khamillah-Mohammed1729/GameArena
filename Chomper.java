public class Chomper{
  
  //Chomper data
  
  // indexing each part of body to refer to in array
  public static final int BODY = 0;
  public static final int MOUTH = 1;
  public static final int LEFT_EYE = 2;
  public static final int LEFT_PUPIL = 3;
  public static final int RIGHT_EYE = 4;
  public static final int RIGHT_PUPIL = 5;
  
  private Rectangle[] components = new Rectangle[6];
  
  //build
  private Rectangle body;
  private Rectangle leftEye;
  private Rectangle leftPupil;
  private Rectangle rightEye;
  private Rectangle rightPupil;
  private Rectangle mouth;
  
  
  //location
  
  private double xCoordinate;
  private double yCoordinate;
  
  //movement
  private double xSpeed;
  private double ySpeed;
   
  
  
  
  //dimension
  private double widthX;
  private double heightY;
  
  //characteristics
  private String bodyColour;
  private String eyeColour;
  
  
  private GameArena arena;
  
  
  
  
  
  //constructor to initialize Chomper
  public Chomper( double x, double y, double width, double height, String bodyCol, String eyeCol){
    this.xCoordinate = x;
    this.yCoordinate = y;
    this.bodyColour = bodyCol;
    this.eyeColour = eyeCol;
    this.widthX = width;
    this.heightY = height;
    
    //now creating an instance of each part of body, and storing each body part object in component array
    
    body = new Rectangle( x, y, width, height, bodyCol);
    components[BODY] = body;
     
    leftEye = new Rectangle(x-width/2, y-height/2, width/4, height/5, eyeCol);
    components[LEFT_EYE] = leftEye;
    
    leftPupil = new Rectangle(x-width/2, y-height/2, width/4, height/8, "BLACK");
    components[LEFT_PUPIL] = leftPupil;
    
    rightEye = new Rectangle(x+width/2, y-height/2, width/4, height/5, eyeCol);
    components[RIGHT_EYE] = rightEye;
    
    rightPupil = new Rectangle(x+width/2, y-height/2, width/4, height/8, "BLACK");
    components[RIGHT_PUPIL] = rightPupil;
    
    mouth = new Rectangle(x, y+height/2, width, height/6, "RED");
    components[MOUTH] = mouth; 
    
  
  
  
  } 








}