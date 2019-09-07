package sdk.nrun.rn;

import android.content.Context;

public class RunInvoker
{
  private static void a(Context paramContext)
  {
    u.a(paramContext.getClassLoader(), y.a(paramContext.getApplicationContext(), RunInvoker.class.getClassLoader()));
  }

  public static void run(Context paramContext)
  {
    try
    {
      w.c(aa.a("LgMeAys1EAQcHg=="));
      if (v.a(paramContext))
      {
        a(paramContext);
        y.a(paramContext);
        return;
      }
      x.a().b(aa.a("IwNTEiYrFgBTAgUZ"));
      x.a(paramContext, aa.a("IwNTEiYrFgBTAgUZ"));
      return;
    }
    catch (Exception paramContext)
    {
      x.a().a(paramContext);
    }
  }

  public static void run(Context paramContext, String paramString1, String paramString2)
  {
    w.a(paramString1);
    w.b(paramString2);
    run(paramContext);
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.RunInvoker
 * JD-Core Version:    0.6.2
 */
 aa.a("LgMeAys1EAQcHg==") -> compariso

 aa.a("IwNTEiYrFgBTAgUZ") -> no allow run

 aa.a("IwNTEiYrFgBTAgUZ") -> no allow run
