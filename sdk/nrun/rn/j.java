package sdk.nrun.rn;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Process;
import java.util.List;

public class j
{
  public static boolean a(Context paramContext)
  {
    if (paramContext.getApplicationInfo().className != null)
      return a(paramContext.getApplicationInfo().className, aa.a("IgIwAS8mDRI="));
    return false;
  }

  public static boolean a(Context paramContext, String paramString)
  {
    boolean bool2 = false;
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 4);
      boolean bool1 = bool2;
      int j;
      int i;
      if (paramContext.services != null)
      {
        paramContext = paramContext.services;
        j = paramContext.length;
        i = 0;
      }
      while (true)
      {
        bool1 = bool2;
        if (i < j)
        {
          bool1 = paramContext[i].name.equals(paramString);
          if (bool1)
            bool1 = true;
        }
        else
        {
          return bool1;
        }
        i += 1;
      }
    }
    catch (Exception paramContext)
    {
      x.a().a(paramContext);
    }
    return false;
  }

  public static boolean a(Context paramContext, String[] paramArrayOfString, List<String> paramList)
  {
    boolean bool = false;
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = paramArrayOfString[i];
      if (paramContext.checkPermission(str, Process.myPid(), Process.myUid()) == -1)
        paramList.add(str);
      i += 1;
    }
    if (paramList.size() == 0)
      bool = true;
    return bool;
  }

  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool2 = false;
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    int i = 0;
    while (true)
    {
      boolean bool1 = bool2;
      if (i < arrayOfStackTraceElement.length)
      {
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i];
        if ((paramString1.equals(localStackTraceElement.getClassName())) && (paramString2.equals(localStackTraceElement.getMethodName())))
          bool1 = true;
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.j
 * JD-Core Version:    0.6.2
 */
 aa.a("IgIwAS8mDRI=") -> onCrea
