public class oopsSorter123{
public static void doIt(int[] sOrry){
for(int i=0;i<sOrry.length-1;i++){
for(int j=0;j<sOrry.length-1;j++){ // BUG: should be sOrry.length - i - 1 OoO
if(sOrry[j+1]<sOrry[j])
{
int tmp= sOrry[j];
sOrry[j]=sOrry[j+1];
sOrry[j+1]=tmp;
}
}
}
System.out.println("Sorted? Maybe.");
for(int i=0;i<=sOrry.length;i++) // BUG: should be i<sOrry.length
System.out.print(sOrry[i]+" ");
System.out.println();
}
}
