package sdk.nrun.rn.b;

import android.content.Context;
import java.util.HashMap;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.l;
import sdk.nrun.rn.w;
import sdk.nrun.rn.x;

public class c extends a
{
  private String a;
  private Context b;

  public c(Context paramContext, String paramString)
  {
    this.a = paramString;
    this.b = paramContext;
    a(true);
    a(w.a(paramContext).a(aa.a("HwkCBi80DTIBAh8FIRQPWUs="), -1L));
  }

  private void a(Exception paramException)
  {
    x.a().a(paramException);
  }

  public String a(String paramString)
  {
    try
    {
      if (w.a(this.b).a(aa.a("HR4aHT4VHAYGFQMD"), false))
        x.a().a(aa.a("PwkCBi80DVc=") + this.a + "\n" + paramString);
      paramString = paramString.getBytes();
      HashMap localHashMap = new HashMap();
      localHashMap.put(aa.a("DgMdBy8pDVonCQAS"), aa.a("LBwDHyMkGAMaHx5YDwIMVgkGJQ0BAC8zRAIHFl1P"));
      paramString = a(this.a, localHashMap, paramString);
      if (paramString == null)
        throw new b(aa.a("PwkFUy4mDRZTGQNXCwQPVA=="));
    }
    catch (b paramString)
    {
      throw paramString;
      paramString = new String(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      a(paramString);
    }
    throw new b(aa.a("PgkdFxgiCAIWAwRXARAXWRIDLAUf"), paramString);
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.b.c
 * JD-Core Version:    0.6.2
 */
 aa.a("HwkCBi80DTIBAh8FIRQPWUs=") -> RequestErrorDel

 aa.a("HR4aHT4VHAYGFQMD") -> PrintRequest

 aa.a("PwkCBi80DVc=") -> reques

 aa.a("DgMdBy8pDVonCQAS") -> Content-Type

 aa.a("LBwDHyMkGAMaHx5YDwIMVgkGJQ0BAC8zRAIHFl1P") -> application/json;charset=utf-8

 aa.a("PwkFUy4mDRZTGQNXCwQPVA==") -> rev data is nul

 aa.a("PgkdFxgiCAIWAwRXARAXWRIDLAUf") -> sendRequest data fail
