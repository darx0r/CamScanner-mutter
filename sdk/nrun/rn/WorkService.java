package sdk.nrun.rn;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sdk.nrun.rn.c.e;

public class WorkService extends Service
{
  private q a = new q();

  private void a(final String paramString, Bundle paramBundle)
  {
    new Thread(new Runnable()
    {
      public void run()
      {
        try
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put(aa.a("HQASEC8="), aa.a("HgkBBSMkHA=="));
          localHashMap.put(aa.a("DgMdBy8/DQ=="), this);
          e.a(WorkService.this.getApplicationContext()).a(paramString, localHashMap);
          return;
        }
        catch (Exception localException1)
        {
          do
            x.a().a(localException1);
          while (!w.a(WorkService.this.getApplicationContext()).a(aa.a("CQkRBi0LFhBdIxQc"), false));
          try
          {
            b.b(WorkService.this.getApplicationContext()).d(z.b).e(aa.a("PggY")).a(aa.a("PQAGFCMpNRgSFDUFFx4R")).a(1, paramString).a(3, aa.a("HgkBBSMkHA==")).a(6, x.b(localException1)).h();
            return;
          }
          catch (Exception localException2)
          {
            x.a().a(localException1);
          }
        }
      }
    }).start();
  }

  public IBinder onBind(Intent paramIntent)
  {
    return new r.a()
    {
      public List<String> a()
      {
        return WorkService.a(WorkService.this).a();
      }
    };
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Bundle localBundle;
    if (paramIntent != null)
    {
      localBundle = paramIntent.getBundleExtra(aa.a("CQ0HEg=="));
      if (localBundle != null)
      {
        String str = this.a.a(localBundle);
        if (str == null)
          break label52;
        a(str, localBundle);
      }
    }
    while (true)
    {
      return super.onStartCommand(paramIntent, paramInt1, paramInt2);
      label52: x.a().d(aa.a("IQMSF2o3FQIUGR5XDAJDSkcLIwUdFGo=") + localBundle);
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.WorkService
 * JD-Core Version:    0.6.2
 */
 aa.a("HQASEC8=") -> Pla

 aa.a("HgkBBSMkHA==") -> Servic

 aa.a("DgMdBy8/DQ==") -> Contex

 aa.a("CQkRBi0LFhBdIxQc") -> DebugLog.Sdk

 aa.a("PggY") -> sdk

 aa.a("PQAGFCMpNRgSFDUFFx4R") -> pluginLoadError

 aa.a("HgkBBSMkHA==") -> Servic

 aa.a("CQ0HEg==") -> Dat

 aa.a("IQMSF2o3FQIUGR5XDAJDSkcLIwUdFGo=") -> load plugin is runnin
