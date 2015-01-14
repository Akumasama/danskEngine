package danskEngine.math;

public class Vector2 {

    public float x;
    public float y;

    public Vector2(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public Vector2 Zero(){
    	return new Vector2(0,0);
    }
    
    public float length(){
    	float tempx = x;
    	float tempy = y;
    	
    	if(tempx < 0) tempx *= -1;
    	if(tempy < 0) tempy *= -1;
    	
    	return (float) Math.sqrt(Math.pow(tempx, 2) + Math.pow(tempy, 2));
    }
    
    public Vector2 Normalize(){
    	float l = length();
    	x /= l;
    	y /= l;
    	return this;
    }
    
    //STATIC STUFF
    public static Vector2 add(Vector2 a, Vector2 b){
    	return new Vector2(a.x + b.x, a.y + b.y);
    }
    
    public static Vector2 subtract(Vector2 a, Vector2 b){
    	return new Vector2(a.x - b.x, a.y - b.y);
    }
}