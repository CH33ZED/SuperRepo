//skeleton file for class Binary
/*
Ziyan Lin
APCS1 pd9
HW43 -- This or That
2015 12 07 
*/

public class Binary implements Comparable{

    private int _decNum;
    private String _binNum;


    /*=====================================
      default constructor
      pre:  n/a
      post: initializes _decNum to 0, _binNum to "0"
      =====================================*/
    public Binary() { 
        _decNum = 0;
        _binNum = "0";
	/****** YOUR IMPLEMENTATION HURRR ******/   
    }

    public int getNum(){
    	return _decNum;
    }

    /*=====================================
      overloaded constructor
      pre:  n >= 0
      post: sets _decNum to n, _binNum to equiv string of bits
      =====================================*/
    public Binary( int n ) {
        _decNum = n;
        _binNum = n + "";
	/****** YOUR IMPLEMENTATION HURRR ******/   
    }


    /*=====================================
      overloaded constructor
      pre:  s is String representing non-negative binary number
      post: sets _binNum to input, _decNum to decimal equiv
      =====================================*/
    public Binary( String s ) {
        _binNum = s;
        _decNum = Integer.parseInt(s);
	/****** YOUR IMPLEMENTATION HURRR ******/   
    }


    /*=====================================
      String toString() -- returns String representation of this Object
      pre:  n/a
      post: returns String of 1's and 0's representing value of this Object
      =====================================*/
    public String toString() {
        return decToBin(_decNum);
	/****** YOUR IMPLEMENTATION HURRR ******/   
    }


    /*=====================================
      String decToBin(int) -- converts base-10 input to binary
      pre:  n >= 0
      post: returns String of bits
      eg  decToBin(0) -> "0"
      decToBin(1) -> "1"
      decToBin(2) -> "10"
      decToBin(3) -> "11"
      decToBin(14) -> "1110"
      =====================================*/
    public static String decToBin( int n ) {
        String a = "";
        while (n != 0){
            a = n % 2 + a;
	    n /= 2;
        }
        return a;        
	/****** YOUR IMPLEMENTATION HURRR ******/   
    }


    /*=====================================
      String decToBinR(int) -- converts base-10 input to binary, recursively
      pre:  n >= 0
      post: returns String of bits
      eg  decToBinR(0) -> "0"
      decToBinR(1) -> "1"
      decToBinR(2) -> "10"
      decToBinR(3) -> "11"
      decToBinR(14) -> "1110"
      =====================================*/
    public static String decToBinR( int n ) { 
        String a = "";
        if (n != 0){
            a += decToBinR(n / 2) + n % 2;
        }
        return a;
	/****** YOUR IMPLEMENTATION HURRR ******/   
    }


    /*=====================================
      String binToDec(String) -- converts binary input to base-10
      pre:  s represents non-negative binary number
      post: returns String of bits
      eg  
      binToDec("0") -> 0
      binToDec("1") -> 1
      binToDec("10") -> 2
      binToDec("11") -> 3
      binToDec("1110") -> 14
      =====================================*/
    public static int binToDec( String s ) { 
        int a = 0;
        int b = Integer.parseInt(s);
        int c = 1;
        while (b != 0){
            a += (b % 10) * c;
            b /= 10;
            c *= 2;
        }            
        return a;
	/****** YOUR IMPLEMENTATION HURRR ******/   
    }


    /*=====================================
      String binToDecR(String) -- converts binary input to base-10 recursively
      pre:  s represents non-negative binary number
      post: returns String of bits
      eg  
      binToDecR("0") -> 0
      binToDecR("1") -> 1
      binToDecR("10") -> 2
      binToDecR("11") -> 3
      binToDecR("1110") -> 14
      =====================================*/
    public static int binToDecR( String s ) { 
        int a = 0;
        if (s != 0){
            a += (s.substring(0,1)* Math.pow(2,s.length()) + binToDecR(s.substring(1));
	}
        return a;
	/****** YOUR IMPLEMENTATION HURRR ******/   
    }


    /*=============================================
      boolean equals(Object) -- tells whether 2 Objs are equivalent
      pre:  other is an instance of class Binary
      post: Returns true if this and other are aliases (pointers to same 
      Object), or if this and other represent equal binary values
      =============================================*/
    public boolean equals( Object other ) { 
        boolean a = this == other;
        if (!a)
            a = other instanceof Binary 
            && this._decNum == ((Binary)other)._decNum 
            && this._binNum.equals(((Binary)other)._binNum);
        return a;
	/****** YOUR IMPLEMENTATION HURRR ******/   
    }

     public int val(Comparable a){
    	if (b instanceof Rational){
             return num;
    	}
    	return _decNum;
    	}
    }
    
    /*=============================================
      int compareTo(Object) -- tells which of two Binary objects is greater
      pre:  other is instance of class Binary
      post: Returns 0 if this Object is equal to the input Object,
      negative integer if this<input, positive integer otherwise
      =============================================*/
    public int compareTo( Object other ) {
       try{
        if (this._decNum < val((Comparable)other)){
	    return -1;
        }
        if (this._decNum == val((Comparable)other)){
	    return 0;
        }
        return 1; 
       }
      catch(Exception e){
      	if(!(other instanceof Binary)){
      	    throw new classCastException("\n Wrong class type! input not a Binary")
        }
      	if(other == null){
            throw new NullPointerException("\n No input detected.")
      	}
      }
	/****** YOUR IMPLEMENTATION HURRR ******/   
    }


    //main method for testing
    public static void main( String[] args ) {

	
	System.out.println();
	System.out.println( "Testing ..." );

	Binary b1 = new Binary(5);
	Binary b2 = new Binary(5);
	Binary b3 = b1;
	Binary b4 = new Binary(7);
        Binary b5 = new Binary(10);

	System.out.println( b1 );
	System.out.println( b2 );
	System.out.println( b3 );       
	System.out.println( b4 );
        System.out.println( b5 );
        System.out.println(binToDec("1011"));
	System.out.println(binToDecR("1011"));       
	System.out.println( "\n==..." );
	System.out.println( b1 == b2 ); //should be false
	System.out.println( b1 == b3 ); //should be true

	System.out.println( "\n.equals()..." );
	System.out.println( b1.equals(b2) ); //should be true
	System.out.println( b1.equals(b3) ); //should be true
	System.out.println( b3.equals(b1) ); //should be true
	System.out.println( b4.equals(b2) ); //should be false
	System.out.println( b1.equals(b4) ); //should be false
        
        
	System.out.println( "\n.compareTo..." );
	System.out.println( b1.compareTo(b2) ); //should be 0
	System.out.println( b1.compareTo(b3) ); //should be 0
	System.out.println( b1.compareTo(b4) ); //should be neg
	System.out.println( b4.compareTo(b1) ); //should be pos
        /*=========================================
	  =========================================*/
    }//end main()

} //end class
