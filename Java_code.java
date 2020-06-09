public class SpinWords {

  public String spinWords(String sentence) {
   
   String ret = "";
   String[] local;
   
   local = sentence.split(" ",50);
   
   if(local.length > 1)
   {
       for(int i=0;i<local.length;i++)
       {
           if(local[i].length()>4)
             ret += retWorlds(local[i]);
           else
             ret+=local[i];
        
           
           if(i+1!=local.length)
             ret+=" ";
       }
   }
   else
   {
       if(sentence.length()>4)
         ret += retWorlds(sentence);
       else
         ret += sentence;
   }
   return ret;
   
  }
  
  private String retWorlds(String s){
    String returns = "";
    char[] localCh = s.toCharArray();
    char[] newLocal = new char[s.length()];
     
     
     for(int i=0;i<s.length();i++)
     {
       newLocal[i] = localCh[s.length()-i-1];
     }
     
     for(int i=0;i<s.length();i++)
     {
       returns += newLocal[i];
     }
     
     return returns;
  }
}
