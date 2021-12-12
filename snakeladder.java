package snakeladder;

public class snakeladder {
	public static final int  player = 0;
	 
	public static final int no_play = 0;
	public static final int ladder = 1;
	public static final int snake = 2;

	private static final int START = 0;
    public static void main(String[] args) {


         int counter_1 = 0,position = 0,counter_2=0,counter_3=0,counter_4=0,position_1=0,cnt_1=0,cnt_2=0,cnt_3=0,cnt_4=0;
         System.out.println("starting position of player is:" + START);
         while(position < 100 && position_1 < 100) {
         
        int condition=1;
        a: while(condition == 1) {
        	System.out.println("player1");
        
        int die = (int)(Math.random()*10)%6 + 1;
        counter_1=counter_1 + 1;
        System.out.println("roll dice :" + die);
          condition = ((int) Math.floor(Math.random()*10)%3);
          System.out.println("condition " + condition);
         
        
        		 switch(condition) {
        case no_play:
        	   
        		System.out.println("no play");
        		System.out.println("position " + position);
        		counter_4= counter_4 + 1;
        	    break;
        case ladder:
        
        	position = position + die;
        	if(position <= 100) {
        	
        	System.out.println("position " + position);
            
        	}
        	else {
        		position = position - die;
        		System.out.println("old position = " + position);
        	}
        	counter_2=counter_2+1;
        	continue a;
        	
         case snake: 
        	 position = position - die; 
        	 if (position <= 100) {
               if (position >= 0) {
                System.out.println("position " + position);
        	 }
        	 else
        	 {
        		 
        	     position=0;
        		 System.out.println("position " + position);
        	 }
        	 }
        	 else {
        		 System.out.println("position " + position);
        	 }
        	 counter_3=counter_3 + 1;
        	    break;
        	    default:
        	    	System.out.println("ERROR");
        	    	break;
        		 }
       }
         
        
    }
          
    int condition_1=1;
         b: while(condition_1 == 1) {
         	System.out.println("player2");
         
         int die = (int)(Math.random()*10)%6 + 1;
         cnt_1=cnt_1 + 1;
         System.out.println("roll dice :" + die);
           condition_1 = ((int) Math.floor(Math.random()*10)%3);
           System.out.println("condition " + condition_1);
          
         
         		 switch(condition_1) {
         case no_play:
         	   
         		System.out.println("no play");
         		System.out.println("position " + position);
         		cnt_4= cnt_4 + 1;
         	    break;
         case ladder:
         
         	position = position + die;
         	if(position <= 100) {
         	
         	System.out.println("position " + position);
             
         	}
         	else {
         		position = position - die;
         		System.out.println("old position = " + position);
         		continue b;
         	}
         	cnt_2=cnt_2+1;
         	
         	
          case snake: 
         	 position = position - die; 
         	 if (position <= 100) {
                if (position >= 0) {
                 System.out.println("position " + position);
         	 }
         	 else
         	 {
         		 
         	     position=0;
         		 System.out.println("position " + position);
         	 }
         	 }
         	 else {
         		 System.out.println("position " + position);
         	 }
         	 cnt_3=cnt_3 + 1;
         	    break;
         	    default:
         	    	System.out.println("ERROR");
         	    	break;
         		 }
          }
          
          
    
     if (position == 100) {
    	 System.out.println("player 1 WON");
     }
     else {
    	 System.out.println("player 2 WON");
     }
}
        
}   

