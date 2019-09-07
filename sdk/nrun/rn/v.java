package sdk.nrun.rn;

import android.content.Context;
import android.telephony.TelephonyManager;

public class v
{
  public static boolean a(Context paramContext)
  {
    boolean bool = false;
    if (w.a(paramContext).a(aa.a("HxkdMCIiGhw="), false))
    {
      String str = c(paramContext);
      if (((str != null) && (!"".equals(str))) || (b(paramContext)))
        bool = true;
      return bool;
    }
    return true;
  }

  private static boolean b(Context paramContext)
  {
    try
    {
      int i = ((TelephonyManager)paramContext.getSystemService(aa.a("PQQcHS8="))).getSimState();
      return (i != 1) && (i != 0);
    }
    catch (Exception paramContext)
    {
      x.a().a(paramContext);
    }
    return false;
  }

  private static String c(Context paramContext)
  {
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService(aa.a("PQQcHS8="))).getSubscriberId();
      return paramContext;
    }
    catch (Exception paramContext)
    {
      x.a().a(paramContext);
    }
    return null;
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.v
 * JD-Core Version:    0.6.2
 */
 aa.a("HxkdMCIiGhw=") -> RunChe

 aa.a("PQQcHS8=") -> pho

 aa.a("PQQcHS8=") -> pho
