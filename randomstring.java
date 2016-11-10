import java.util.Random;
/**
 * Created by Muhammad Rizwan on 11/9/2016.
 */
public class RandomStrings {

    char[] alp = new char[26];

    public RandomStrings()
    {
        int j =0;
        for (int i = 97;i <= 122;i++){
            alp[j] = (char)i;
            j++;
        }
    }
    public String randomString(int length)
    {
        String s = "";
        for (int i =0;i <=length;i++)
        {
            Random r = new Random();
            s += alp[r.nextInt(alp.length)];
        }
        return s;
    }
    public String randomString()
    {
        String s = "";
        Random rr = new Random();
        int j = r.nextInt(10);
        for (int i =0;i <=j;i++)
        {
            Random r = new Random();
            s += alp[r.nextInt(alp.length)];
        }
        return s;
    }
    public String randomParagraph(int words)
    {
        String s = "";
        for(int i = 0 ;i <= words;i++)
        {
            Random r = new Random();
            s += " " + randomString(r.nextInt(9));
            int j = r.nextInt(15);
            if(j >=4 && j <=6)
                s += ".";
        }
        if(s.substring(s.length()-1,s.length()) != ".")
             s += ".";
        return s;
    }
    public String randomParagraph()
    {
        String s = "";
        Random rr = new Random();
	  int j = r.nextInt(35);
        for(int i = 0 ;i <= j.;i++)
        {
            Random r = new Random();
            s += " " + randomString(r.nextInt(9));
            int j = r.nextInt(15);
            if(j >=4 && j <=6)
               s += ".";
        }
        if(s.substring(s.length()-1,s.length()) != ".")
            s += ".";
        return s;
    }

    public String randomPage(int paragraph)
    {
        String s = "";
        for(int i = 0 ;i <= paragraph;i++)
        {
            Random r = new Random();
            int j = r.nextInt(10) + r.nextInt(50);
            s += randomParagraph(j) + "\n" ;
        }
       return s;
    }

    public String randomPage()
    {
        String s = "";
        Random rr = new Random();
	  int j = r.nextInt(4) + 2;
        for(int i = 0 ;i <= j;i++)
        {
            Random r = new Random();
            int j = r.nextInt(10) + r.nextInt(50);
            s += randomParagraph(j) + "\n" ;
        }
        return s;
    }
}
