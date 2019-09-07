package sdk.nrun.rn.c;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.u;
import sdk.nrun.rn.u.b;

public class a
{
  private static Instrumentation a;

  public static void a(Context paramContext)
  {
    try
    {
      Object localObject = u.a(aa.a("LAIXASUuHVkSAABZJBIXUUQMORUnGzgiGBM="), aa.a("LhkBAS8pDTYQBBkBDAUabFoXKA0X"), new Class[0]).a(null, new Object[0]);
      if ((a != null) && (a == localObject))
        return;
      String str = aa.a("ICUdAD41DBoWHgQWERgMVg==");
      paramContext = new Instrumentation()
      {
        public void callActivityOnCreate(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
        {
          super.callActivityOnCreate(paramAnonymousActivity, paramAnonymousBundle);
        }

        public void callActivityOnNewIntent(Activity paramAnonymousActivity, Intent paramAnonymousIntent)
        {
          if ((paramAnonymousActivity instanceof d))
          {
            f localf = f.a(paramAnonymousIntent.getStringExtra(aa.a("HQAGFCMpNxYeFQ==")));
            if (localf != null)
              u.b(paramAnonymousActivity, aa.a("IC4SAC8="), localf.b());
          }
          super.callActivityOnNewIntent(paramAnonymousActivity, paramAnonymousIntent);
        }

        public Activity newActivity(ClassLoader paramAnonymousClassLoader, String paramAnonymousString, Intent paramAnonymousIntent)
        {
          Object localObject = paramAnonymousIntent.getStringExtra(aa.a("HQAGFCMpNxYeFQ=="));
          String str = paramAnonymousString;
          if (localObject != null)
          {
            str = paramAnonymousString;
            if (((String)localObject).length() > 0)
            {
              str = paramAnonymousIntent.getStringExtra(aa.a("DgASADkJGBoW"));
              try
              {
                paramAnonymousString = new HashMap();
                paramAnonymousString.put(aa.a("HQASEC8="), aa.a("DA8HGjwuDQ4="));
                localObject = e.a(this.a).a((String)localObject, paramAnonymousString).b(str);
                ((f.c)localObject).a(paramAnonymousString);
                paramAnonymousString = (Activity)((f.c)localObject).a();
                return paramAnonymousString;
              }
              catch (g paramAnonymousString)
              {
                paramAnonymousString.printStackTrace();
              }
            }
          }
          return super.newActivity(paramAnonymousClassLoader, str, paramAnonymousIntent);
        }
      };
      a = paramContext;
      u.b(localObject, str, paramContext);
      return;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.a
 * JD-Core Version:    0.6.2
 */
 aa.a("LAIXASUuHVkSAABZJBIXUUQMORUnGzgiGBM=") -> android.app.ActivityThre

 aa.a("LhkBAS8pDTYQBBkBDAUabFoXKA0X") -> currentActivityThread

 aa.a("ICUdAD41DBoWHgQWERgMVg==") -> mInstrumentatio

 aa.a("HQAGFCMpNxYeFQ==") -> PluginNam

 aa.a("IC4SAC8=") -> mBa

 aa.a("HQAGFCMpNxYeFQ==") -> PluginNam

 aa.a("DgASADkJGBoW") -> ClassName

 aa.a("HQASEC8=") -> Pla

 aa.a("DA8HGjwuDQ4=") -> Activi
