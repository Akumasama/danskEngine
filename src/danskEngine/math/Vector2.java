package danskEngine.math;

public class Vector2 {

    public float x;
    public float y;

    /**
     * Construct a new {@link Vector2}
     * @param x Length on X axis
     * @param y Length on Y axis
     */
    public Vector2(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * Retrieve this {@link Vector2}'s length
     *
     * @return Returns this {@link Vector2}'s length
     */
    public float length(){
    	float tempx = x;
    	float tempy = y;
    	
    	if(tempx < 0) tempx *= -1;
    	if(tempy < 0) tempy *= -1;
    	
    	return (float) Math.sqrt(Math.pow(tempx, 2) + Math.pow(tempy, 2));
    }
    
    /**
     * Normalizes the vector to length 1
     *
     * @return Returns this {@link Vector2} where length is 1
     */
    public Vector2 Normalize(){
    	float l = length();
    	x /= l;
    	y /= l;
    	return this;
    }
    
    /**
     * Adds the specified {@link Vector2} to this
     *
     * @param a Vector2 a
     * @return {@link Vector2} where Vector2(x1 + x2, y1 + y2)
     */
    public Vector2 Add(Vector2 a){
    	x += a.x;
    	y += a.y;
    	return this;
    }
    
    /**
     * Substracs the specified {@link Vector2} from this
     *
     * @param a Vector2 a
     * @return {@link Vector2} where Vector2(x1 - x2, y1 - y2)
     */
    public Vector2 Substract(Vector2 a){
    	x -= a.x;
    	y -= a.y;
    	return this;
    }
    
    /**
     * Checks if the {@link Vector2} is the same as the one provided
     *
     * @param obj Vector2 Object
     * @return true if vectors are same, false if not.
     */
    public boolean Equals (Object obj){
    	if(obj instanceof Vector2){
    		return this.equals((Vector2)obj);
    	}
    	
    	return false;
    }
    
    /* ========================================================================================
     * Static functions
     * ========================================================================================
     */
    /**
     * Calculate the dot product of two {@link Vector2}
     *
     * @param a Vector2 a
     * @param b Vector2 b
     * @return {@link Vector2} where Vector2(a.x * b.x) + (a.y + b.y)
     */
    public static float Dot(Vector2 a, Vector2 b){
    	return (a.x * b.x) + (a.y + b.y);
    }
    
    
    /**
     * Adds two {@link Vector2}
     *
     * @param a Vector2 a
     * @param b Vector2 b
     * @return {@link Vector2} where Vector2(x1 + x2, y1 + y2)
     */
    public static Vector2 add(Vector2 a, Vector2 b){
    	return new Vector2(a.x + b.x, a.y + b.y);
    }
    
    /**
     * Substracs two {@link Vector2}
     *
     * @param a Vector2 a
     * @param b Vector2 b
     * @return {@link Vector2} where Vector2(x1 - x2, y1 - y2)
     */
    public static Vector2 subtract(Vector2 a, Vector2 b){
    	return new Vector2(a.x - b.x, a.y - b.y);
    }
    
    /**
     * Get a new {@link Vector2} with length 0
     *
     * @return Returns a new {@link Vector2} where length is 0
     */
    public static Vector2 Zero(){
    	return new Vector2(0,0);
    }
    
    /**
     * Get a new {@link Vector2} with length 1
     *
     * @return Returns a new {@link Vector2} where length is 1
     */
    public static Vector2 One(){
    	return new Vector2(1,0);
    }
    
    /**
     * Returns the Vector2 as a string
     */
    @Override
    public String toString(){
    	StringBuilder string = new StringBuilder(); //String builder is faster than string + string
    	string.append("X: ");
    	string.append(x);
    	string.append(" Y: ");
    	string.append(y);
    	return string.toString();
    }
}