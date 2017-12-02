boolean reverse;
void setup(){
  size(2000,1000);
  
  
  
  
  
}
int xpos1 = 500;
int xpos2 = 1500;


void draw(){
  background(213,123,123);
  noFill();
  for(int i=0;i<500;i++){
    if( i%10==0){
   ellipse(xpos1,500,25+i,25+i);
   ellipse(xpos2,500,25+i,25+i);
    }
  }
  if(reverse == false){
 xpos1 += 5;
 xpos2 -= 5;
  reverse=true;
 
}