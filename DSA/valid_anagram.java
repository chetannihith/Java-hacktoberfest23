import java.util.HashMap;

public class valid_anagram {

  static HashMap<Character , Integer> makeFreqMap(String str)
  {
    HashMap<Character , Integer> mp = new HashMap<>();
    for(int i=0;i<str.length();i++)
    {
      Character ch = str.charAt(i);
      if(!mp.containsKey(ch))
      {
        mp.put(ch,1);
      } 
      else
      {
        int currFreq = mp.get(ch);
        mp.put(ch, currFreq+1);
      }
    }
    return mp;
  }

  public boolean isAnagram1(String s,String t) {
    if(s.length()!=t.length())
    return false;
    HashMap<Character , Integer> mp1 = makeFreqMap(s);
    HashMap<Character , Integer> mp2 = makeFreqMap(t);
    return mp1.equals(mp2);
  }

  public boolean isAnagram2(String s,String t) {
    if(s.length()!=t.length())
    return false;
    HashMap<Character , Integer> mp = makeFreqMap(s);
    for(int i=0;i<t.length();i++)
    {
      Character ch = t.charAt(i);
      if(!mp.containsKey(ch)) return false;
      int currFreq = mp.get(ch);
      mp.put(ch, currFreq-1);
    }

    //All values should be zero for s and t to be anagram
    for(Integer i : mp.values())
    {
      if(i!=0) return false;
    }
    return true;
  }
}
