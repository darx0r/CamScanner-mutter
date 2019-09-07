package sdk.nrun.rn;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import sdk.nrun.rn.d.c;

public class k
{
  private static k a;
  private SharedPreferences b;
  private Context c;
  private String d;
  private File e;
  private File f;

  public k(Context paramContext, File paramFile, String paramString)
  {
    if (w.a(paramContext).a(aa.a("AQ0GHSkvNxIEIwQYFxAEXQ=="), true))
      this.b = new c(new File(paramFile, paramString + aa.a("YxQeHw==")), 4);
    do
    {
      return;
      this.b = paramContext.getSharedPreferences(paramString, 0);
    }
    while (paramFile == null);
    File localFile = new File(paramFile, paramString + aa.a("YxQeHw=="));
    paramFile = new File(paramFile, paramString + aa.a("YxQeH2QlGBw="));
    u.a(this.b, aa.a("ICoaHy8="), localFile);
    u.a(this.b, aa.a("IC4SECEyCTEaHBU="), paramFile);
    paramContext.getSharedPreferences(paramString, 4);
    a(this.b);
  }

  public static k a(Context paramContext)
  {
    try
    {
      p localp;
      if (a == null)
        localp = p.a(paramContext, h.a(p.a(paramContext)));
      try
      {
        a = new k(paramContext, localp.b(h.a(Build.MODEL + aa.a("PQAQ")).substring(0, 6)), aa.a("PQAQFS0="));
        paramContext = a;
        return paramContext;
      }
      catch (IOException paramContext)
      {
        while (true)
          x.a().a(paramContext);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public static k a(Context paramContext, String paramString)
  {
    try
    {
      p localp;
      if (a == null)
        localp = p.a(paramContext, h.a(p.a(paramContext)));
      try
      {
        a = new k(paramContext, localp.b(h.a(Build.MODEL + aa.a("PQAQ")).substring(0, 6)), paramString);
        paramContext = a;
        return paramContext;
      }
      catch (IOException paramContext)
      {
        while (true)
          x.a().a(paramContext);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  private void a(SharedPreferences paramSharedPreferences)
  {
    try
    {
      Method localMethod = paramSharedPreferences.getClass().getDeclaredMethod(aa.a("PhgSAT4LFhYXNgIYCDUKS1k="), new Class[0]);
      localMethod.setAccessible(true);
      localMethod.invoke(paramSharedPreferences, new Object[0]);
      return;
    }
    catch (Exception paramSharedPreferences)
    {
      x.a().a(paramSharedPreferences);
    }
  }

  private String c(String paramString)
  {
    return paramString + aa.a("EgMGBxUuFxEc");
  }

  public <T> T a(String paramString, T paramT)
  {
    paramString = this.b.getAll().get(paramString);
    if (paramString == null)
      return paramT;
    return paramString;
  }

  public a a(long paramLong)
  {
    return new b(paramLong);
  }

  public void a()
  {
    if ((this.e != null) && (this.e.exists()))
      this.e.delete();
    if ((this.f != null) && (this.f.exists()))
      this.f.delete();
  }

  public void a(String paramString)
  {
    if (this.b.getAll().containsKey(paramString))
      this.b.edit().remove(paramString).commit();
  }

  public boolean a(String paramString1, String paramString2)
  {
    if (!this.b.contains(paramString1))
      return this.b.edit().putString(paramString1, paramString2).putLong(c(paramString1), System.currentTimeMillis()).commit();
    return this.b.edit().putString(paramString1, paramString2).commit();
  }

  public void b()
  {
    this.c.getSharedPreferences(this.d, 4);
    a(this.b);
  }

  public boolean b(String paramString)
  {
    return this.b.contains(paramString);
  }

  public Set<String> c()
  {
    return this.b.getAll().keySet();
  }

  public abstract class a
  {
    public a()
    {
    }

    public <T> T a(String paramString, T paramT)
    {
      Object localObject = paramT;
      if (a(paramString))
        localObject = k.this.a(paramString, paramT);
      return localObject;
    }

    abstract boolean a(long paramLong);

    public boolean a(String paramString)
    {
      long l;
      if (k.a(k.this).contains(paramString))
      {
        l = k.a(k.this).getLong(k.a(k.this, paramString), -1L);
        if (l != -1L);
      }
      else
      {
        return false;
      }
      if (a(l))
      {
        k.a(k.this).edit().remove(paramString).remove(k.a(k.this, paramString)).commit();
        return false;
      }
      return true;
    }
  }

  public class b extends k.a
  {
    private long c;

    public b(long arg2)
    {
      super();
      Object localObject;
      this.c = localObject;
    }

    boolean a(long paramLong)
    {
      return System.currentTimeMillis() - paramLong >= this.c;
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.k
 * JD-Core Version:    0.6.2
 */
 aa.a("AQ0GHSkvNxIEIwQYFxAEXQ==") -> LaunchNewStorag

 aa.a("YxQeHw==") -> .xm

 aa.a("YxQeHw==") -> .xm

 aa.a("YxQeH2QlGBw=") -> .xml.b

 aa.a("ICoaHy8=") -> mFi

 aa.a("IC4SECEyCTEaHBU=") -> mBackupFi

 aa.a("PQAQ") -> plc

 aa.a("PQAQFS0=") -> plc

 aa.a("PQAQ") -> plc

 aa.a("PhgSAT4LFhYXNgIYCDUKS1k=") -> startLoadFromDi

 aa.a("EgMGBxUuFxEc") -> _out_info
