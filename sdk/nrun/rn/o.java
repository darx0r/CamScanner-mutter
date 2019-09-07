package sdk.nrun.rn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

public class o
{
  public static void a(Context paramContext, a parama)
  {
    paramContext.getApplicationContext().registerReceiver(new BroadcastReceiver()
    {
      public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        if (o.a(paramAnonymousContext))
        {
          paramAnonymousContext.getApplicationContext().unregisterReceiver(this);
          if (this.a != null)
            this.a.a(paramAnonymousContext);
        }
      }
    }
    , new IntentFilter(aa.a("LAIXASUuHVkdFQRZBh4NVhwmAiI9NgkTMCE6JCkoJjkidnUg")));
  }

  public static boolean a(Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService(aa.a("LgMdHS8kDR4FGQQO"))).getActiveNetworkInfo();
      if (paramContext != null)
        return (paramContext.isAvailable()) && (paramContext.isConnected());
    }
    return false;
  }

  public static byte b(Context paramContext)
  {
    try
    {
      Object localObject = (ConnectivityManager)paramContext.getSystemService(aa.a("LgMdHS8kDR4FGQQO"));
      if (localObject == null)
        return 0;
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject == null)
        return 0;
      if (((NetworkInfo)localObject).getType() == 0);
      switch (((TelephonyManager)paramContext.getSystemService(aa.a("PQQcHS8="))).getNetworkType())
      {
      case 11:
        int i = ((NetworkInfo)localObject).getType();
        if (i == 1)
          return 3;
        break;
      case 12:
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 13:
      case 0:
      }
    }
    catch (Exception paramContext)
    {
      x.a().a(paramContext);
      return 0;
    }
    return 0;
    return 1;
    return 2;
    return 5;
    return 4;
  }

  public static abstract interface a
  {
    public abstract void a(Context paramContext);
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.o
 * JD-Core Version:    0.6.2
 */
 aa.a("LAIXASUuHVkdFQRZBh4NVhwmAiI9NgkTMCE6JCkoJjkidnUg") -> android.net.conn.CONNECTIVITY_CHANGE

 aa.a("LgMdHS8kDR4FGQQO") -> connectivity

 aa.a("LgMdHS8kDR4FGQQO") -> connectivity

 aa.a("PQQcHS8=") -> pho
