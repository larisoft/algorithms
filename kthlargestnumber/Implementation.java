package kthlargestnumber; 

import java.util.*;

public class Implementation{


    private int[] numbers;
    private int desiredRank;


    public Implementation(int[] numbers, int desiredRank){

        Arrays.sort(numbers);

        this.numbers = numbers;
        this.desiredRank = desiredRank;

        confirm_number_is_sorted();

    }



    public void add(int number){

        int position = getIndexToPlaceNumber(number, numbers); 
        this.numbers = addToArray(numbers, position, number);

        int kth= numbers[numbers.length-desiredRank];

        System.out.println( desiredRank+ " th largest number is " + kth + " Proof : "  + Arrays.toString(numbers)); 

    }



    private void confirm_number_is_sorted(){

        System.out.println("");
        for(int i = 0; i < numbers.length; i++){

            System.out.print(" " + i);
        }

        System.out.println("");
    }


    private int getIndexToPlaceNumber(int number, int numbers[]){


        int left = 0;
        int right = numbers.length-1;
        int middle = (left+right)/2;


        int breaker  = 0;

        while(left < middle && right > middle){ 
  
           if(number > numbers[middle]){
                left = middle;
                middle = (middle+ right)/2; 
           }  
           else{ 
                right = middle;
                middle = (left+middle)/2; 
           }
           
           
           System.out.println("should be at position " + middle +  " " + Arrays.toString(numbers) + " " + left + " " + middle + " " + right);

           
         
        }

        if(numbers[middle]<number) return middle+=1;
        if(numbers[middle]> number) return middle-1;

        return middle;

    }


    private int[] addToArray(int[] array, int index, int number){

        int[] new_array = new int[array.length+1];
        
        for(int i = 0; i < index; i++){

            new_array[i] = array[i];

        }

        new_array[index] = number;
        index+=1;

        for(int i = index; i < new_array.length; i++){

            new_array[i] = array[i-1];
            
        }

        return new_array;

    }

}
     