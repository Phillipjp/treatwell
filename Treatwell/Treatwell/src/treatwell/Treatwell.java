/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treatwell;

/**
 *
 * @author phillipperks
 */
public class Treatwell {

    
    /**
     * Makes a rectangle array the size of h x w where h and w are integers. 
     * If the height or width is less than 2 the method throws and exception.
     * @param h - the height of the rectangle
     * @param w - the width of the rectangle
     * @return A 2D array of stings size h x w
     * @throws IllegalDimensionsException
     */
    public static String[][] buildRectangle(int h, int w)throws IllegalDimensionsException{
        //check if the height or width are less than 2
        if(h < 2 || w < 2){
            throw new IllegalDimensionsException("IllegalDimensionsException: "
                    + "The height and width dimenesions must be greater than or"
                    + " equal to 2");
        }
        String [][] rectangle = new String [h][w];
        
        //for h rows
        for(int i=0; i<h;  i++){
            //for w columns
            for(int j=0; j<w; j++){
                 //if the first row of the rectangle;
                if(i==0){
                    //if the top left corner
                    if(j==0){
                        rectangle[i][j]="┌";
                    }
                    //else if top right corner
                    else if(j==w-1){
                        rectangle[i][j]=Character.toString((char)741);
                    }
                    //else it's in the middle 
                    else{
                        rectangle[i][j]="-";
                    }
                }
                //else if the last row of the rectangle
                else if(i==h-1){
                    //if the bottom left corner
                    if(j==0){
                        rectangle[i][j]=Character.toString((char)746);
                    }
                    //else if bottom right corner
                    else if(j==w-1){
                        rectangle[i][j]="┘";
                    }
                    // else it's in the middle
                    else{
                        rectangle[i][j]="-";
                    }
                }
                //else if a middle row
                else{
                    //if an end column
                    if(j==0 || j==w-1){
                        rectangle[i][j]="|";
                    }
                    //else it's in the middle
                    else{
                        rectangle[i][j]=" ";
                    }
                }
            }
        }
     return rectangle;   
    }
    
    /**
     * Prints a 2D array.
     * 
     * @param rectangle - A 2D array to be printed
     */
    public static void printRectangle(String [][] rectangle){
        //for all rows
        for(int i=0; i<rectangle.length; i++){
            //for all columns
            for(int j=0; j<rectangle[i].length;j++){
                System.out.print(rectangle[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) throws IllegalDimensionsException {

        try{
            int h = 4;
            int w = 5;
            String [][] rectangle = buildRectangle(h,w);
            printRectangle(rectangle);
        }
        catch (IllegalDimensionsException e){
            e.printStackTrace();
        }
        
    }
    
}
