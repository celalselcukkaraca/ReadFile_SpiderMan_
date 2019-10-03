package com.csk.filereader.FileReader_Spiderman;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
	
	public static void main( String[] args )
    {
  
    	
    	//System.out.println(new File("Spider-Man.Far.from.Home.srt").getAbsoluteFile());
		
		DecimalFormat decimalFormat = new DecimalFormat("#.000");
	
    	
    	try(Scanner scan=new Scanner(new FileReader("Spider-Man.Far.from.Home.srt") )){
    		
    		while(scan.hasNextLine()){
    			
    			String lineinfo=scan.nextLine();
    			System.out.println(lineinfo);
    			
    			int a=17;
    			
    			if(lineinfo.contains("-->")){
    				
    		//		System.out.println(lineinfo);
    				String[] parts=lineinfo.split("-->");
    		//		System.out.print(parts[0]);
    		//		System.out.println(parts[1]);
    				
    				String[] hrs=parts[0].split(":",3);
    		//		System.out.println("hrs * "+hrs[0]);
    		//		System.out.println("min *"+hrs[1]);
    		//		System.out.println("sec *"+hrs[2]);
    				
    				String[] hrs_end=parts[1].split(":",3);
    				
    				double x=Integer.parseInt(hrs[2].substring(0,2))+a+(Integer.parseInt(hrs[2].substring(3,6)))*(0.001); 				
    		//		System.out.println("x =" + x);
    		//		System.out.println(decimalFormat.format((x-60)));
    				
    				//System.out.println("x =" + new DecimalFormat("##.###").format(x));
    				// System.out.println(new DecimalFormat("##.###").format(x-60));
    				//x =Double.parseDouble(new DecimalFormat("##.###").format(x));
    				//System.out.println("x = "+ new DecimalFormat("##.##").format(x-60));
    				if(x>=60){
    				//	hrs[2]="*"+new DecimalFormat("##.###").format(x-60);
    					hrs[2]=(decimalFormat.format((x-60)));
    					hrs[1]=Integer.toString(Integer.parseInt(hrs[1])+1);
    				}else{
    					
    					hrs[2]=decimalFormat.format(x);
    				}
    				
    				
    		//		double y=Integer.parseInt(hrs_end[2].substring(0,2))+(Integer.parseInt(hrs_end[2].substring(3,6)))*(0.0001)+a; 
    				double y=Integer.parseInt(hrs_end[2].substring(0,2))+a+(Integer.parseInt(hrs_end[2].substring(3,6)))*(0.001);
    		//		System.out.println("y =" + y);
    				//System.out.println("x = "+ new DecimalFormat("0.000").format(x-60));
    				if(y>=60){
    					
    				//	hrs_end[2]=(Double.toString((y-60))).substring(0,4);
    					hrs_end[2]=(decimalFormat.format((y-60)));
    					hrs_end[1]=Integer.toString(Integer.parseInt(hrs_end[1])+1);
    				}else{
    					
    					//hrs_end[2]=Double.toString(y);
    					hrs_end[2]=decimalFormat.format(y);
    				}
    				
    				
    		//		System.out.println("yeni saat :"+ hrs[0]);
    		//		System.out.println("yeni dakika :"+hrs[1]);
    		//		System.out.println("yeni saniye :"+hrs[2]);
    				//Integer.parseInt(hrs[2])
    		//		System.out.println("Eski Saat Aralığı  " +lineinfo);
    				System.out.println("Yeni Düzenlenmiş saat : "+hrs[0]+":"+hrs[1]+":"+hrs[2]+" --> "+hrs_end[0]+":"+hrs_end[1]+":"+hrs_end[2] );
    			
    				
    				
    			}
    			
    			
    		}
    		
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	/**	System.out.println(new File("journal_list.html").getAbsoluteFile());
    	FileReader fr;
        try{ 
        	fr=new FileReader("journal_list.html");
        	int i;
        	while((i=fr.read())!=-1){
        		System.out.print((char)i);
        		
        		
        	}
        	fr.close();
        	
        } catch(IOException e){
        	e.printStackTrace();
        }   **/
    } 
    
}
