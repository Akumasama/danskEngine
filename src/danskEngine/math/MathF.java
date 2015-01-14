package danskEngine.math;

public class MathF {
	
    /**
     * Calculates the linear interpolation between 2 values
     * @param a Starting value
     * @param b Ending value
     * @param time Value between 0.0 and 1.0
     */
	public static float Lerp(float a, float b, float time){
		return ((b - a) * Clamp(time,0,1)) + a;
	}
	
    /**
     * Clamps a value to a specific range
     * @param value Value to be clamped
     * @param min Minimum clamp value
     * @param max Maximum clamp value
     */
	public static float Clamp(float value, float min, float max){
		if(value < min) return min;
		if(value > max) return max;
		return value;
	}
}
