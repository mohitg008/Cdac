//assignment 3 Q.5


class GetNum{

public static void main(String arg[])

{
int i=getnumber();
while(i<10){        // suppose i=9
i++;                // i=10
int j= getnumber(); // suppose j=1
if(j==0){break;}    // false
else if(j==1){continue;} // program will jump to while loop but i<10 and i=10 hence out of loop and Nothing will print.
System.out.println(i);


}
System.out.println("finished");
  
}

}