package Day_27;

import java.util.*;
public class asd {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
//int arr[] = new int[n];
for(int arr_i=0; arr_i < n; arr_i++){
Stack st = new Stack();
//arr[arr_i] = in.nextInt();
String ipSeq = in.next();
//System.out.println(ipSeq);
boolean match = true;
for(int ind=0; ind<ipSeq.length(); ind++){
char ch = ipSeq.charAt(ind);
if(ch=='(' || ch=='{' || ch=='['){
st.push(ch);
}else if(st.isEmpty()){
match = false;
break;
}else if(ch==')'){
if('('!=(char)st.pop()){
match = false;
break;
}
}else if(ch=='}'){
if('{'!=(char)st.pop()){
match = false;
break;
}
}else if(ch==']'){
if('['!=(char)st.pop()){
match = false;
break;
}
}
}
if(match){
if(!st.isEmpty()){
System.out.println("NO");
}else{
System.out.println("YES");
}			

}
}
}
}

    

