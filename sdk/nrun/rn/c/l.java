package sdk.nrun.rn.c;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.c.a.b;
import sdk.nrun.rn.h;
import sdk.nrun.rn.p;
import sdk.nrun.rn.w;
import sdk.nrun.rn.x;

public class l extends j.a
{
  private i b;

  public l(Context paramContext)
  {
    super(paramContext);
    a(x.a());
    try
    {
      File localFile = p.a(paramContext, h.a(p.a(paramContext))).b(h.a(Build.MODEL + aa.a("PQgB")).substring(0, 6));
      this.b = new i.a(paramContext, localFile);
      a(localFile);
      if (w.a(paramContext).a(aa.a("HSESACE="), 0) > 0)
        a(new b(paramContext, w.a(paramContext).a(aa.a("HSESACE="), 0)));
      return;
    }
    catch (IOException paramContext)
    {
    }
    throw new g(aa.a("Lh4WEj4iWQcfBRceC1EPUUERbQkBASU1"), paramContext);
  }

  public i c()
  {
    return this.b;
  }

  public Map<String, String> f()
  {
    return w.a(h()).c();
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.l
 * JD-Core Version:    0.6.2
 */
 aa.a("PQgB") -> pdr

 aa.a("HSESACE=") -> PMa

 aa.a("HSESACE=") -> PMa

 aa.a("Lh4WEj4iWQcfBRceC1EPUUERbQkBASU1") -> create plugin list error
