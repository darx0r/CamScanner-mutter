package sdk.nrun.rn;

import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class s
{
  public static String a;

  public static String a()
  {
    return a(Process.myPid());
  }

  public static String a(int paramInt)
  {
    while (true)
    {
      try
      {
        if (a != null)
        {
          localObject1 = a;
          return localObject1;
        }
        Object localObject1 = new File(aa.a("YhwBHClo") + paramInt + aa.a("Yg8eFyYuFxI="));
        boolean bool = ((File)localObject1).canRead();
        if (bool)
          try
          {
            localObject1 = m.a(new FileInputStream((File)localObject1));
            String str3 = ((BufferedReader)localObject1).readLine();
            ((BufferedReader)localObject1).close();
            if ((str3 == null) || ("".equals(str3.trim())))
              break label159;
            localObject1 = str3.trim();
            a = (String)localObject1;
          }
          catch (IOException localIOException)
          {
            x.a().a(localIOException);
          }
        String str1 = Process.myPid() + "";
        a = str1;
        continue;
      }
      finally
      {
      }
      label159: String str2 = Process.myPid() + "";
      a = str2;
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.s
 * JD-Core Version:    0.6.2
 */
 aa.a("YhwBHClo") -> /proc/

 aa.a("Yg8eFyYuFxI=") -> /cmdli
