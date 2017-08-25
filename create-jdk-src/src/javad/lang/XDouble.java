package javad.lang;
import sun.misc.FloatingDecimal;
import sun.misc.FpUtils;
import sun.misc.DoubleConsts;

public final class XDouble extends Number implements Comparable<Double> {

	public static final double POSITIVE_INFINITY = 1.0 / 0.0;
	public static final double NEGATIVE_INFINITY = -1.0 / 0.0;
	public static final double NaN = 0.0d / 0.0;
	
	public static final double MAX_VALUE = 0x1.fffffffffffffP+1023; // 1.7976931348623157e+308
	
    public static final double MIN_NORMAL = 0x1.0p-1022; // 2.2250738585072014E-308

    public static final double MIN_VALUE = 0x0.0000000000001P-1022; // 4.9e-324
    
    @SuppressWarnings("unchecked")
    public static final Class<Double>   TYPE = (Class<Double>) XClass.getPrimitiveClass("double");
	
	@Override
	public int compareTo(Double o)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int intValue()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
