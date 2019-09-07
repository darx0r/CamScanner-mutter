package sdk.nrun.rn.c;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.c;
import sdk.nrun.rn.k;

public abstract class i
{
  public abstract Set<String> a();

  public abstract h a(String paramString);

  public abstract void a(h paramh);

  public abstract void b();

  public abstract void b(h paramh);

  public static class a extends i
  {
    private k a;

    public a(Context paramContext, File paramFile)
    {
      this.a = new k(paramContext, paramFile, aa.a("PQoU"));
    }

    private boolean a(String paramString1, String paramString2)
    {
      return this.a.a(paramString1, c.a(paramString2.getBytes(), aa.a("Az87MQMsChUKLyM=")));
    }

    private boolean b(String paramString)
    {
      return this.a.b(paramString);
    }

    private String c(String paramString)
    {
      return c.b(((String)this.a.a(paramString, "")).getBytes(), aa.a("Az87MQMsChUKLyM="));
    }

    public Set<String> a()
    {
      try
      {
        HashSet localHashSet = new HashSet();
        Iterator localIterator = this.a.c().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (!str.endsWith(aa.a("EgMGBxUuFxEc")))
            localHashSet.add(str);
        }
      }
      finally
      {
      }
      return localSet;
    }

    public final h a(String paramString)
    {
      if (aa.a("KQkF").equals(paramString))
      {
        paramString = new h();
        paramString.a(aa.a("KQkF"));
        paramString.a(0);
        paramString.c(aa.a("KQkF"));
        return paramString;
      }
      String str = c(paramString);
      if ((str == null) || ("".equals(str)))
        throw new g(paramString + aa.a("bR4WAj8iCgNTOR4RClEKSxILOAAfUyU1WRIeAAQO"));
      paramString = new h();
      paramString.g(str);
      return paramString;
    }

    public final void a(h paramh)
    {
      try
      {
        String str = paramh.g();
        if (!a(paramh.b(), str))
          throw new g(paramh.b() + aa.a("bTwfBi0uFz4dFh9XEgMKTFdFKw0aHw=="));
      }
      finally
      {
      }
    }

    public void b()
    {
      this.a.b();
    }

    public final void b(h paramh)
    {
      try
      {
        if (b(paramh.b()))
        {
          a(paramh);
          return;
        }
        throw new g(paramh.b() + aa.a("bTwfBi0uFz4dFh9XCx4XGFcdJB8H"));
      }
      finally
      {
      }
      throw paramh;
    }

    public String toString()
    {
      return a().toString();
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.i
 * JD-Core Version:    0.6.2
 */
 aa.a("PQoU") -> pfg

 aa.a("Az87MQMsChUKLyM=") -> NSHBIksby

 aa.a("Az87MQMsChUKLyM=") -> NSHBIksby

 aa.a("EgMGBxUuFxEc") -> _out_info

 aa.a("KQkF") -> dev

 aa.a("KQkF") -> dev

 aa.a("KQkF") -> dev

 aa.a("bR4WAj8iCgNTOR4RClEKSxILOAAfUyU1WRIeAAQO") ->  request Info is null or empty

 aa.a("bTwfBi0uFz4dFh9XEgMKTFdFKw0aHw==") ->  PluginInfo write fai

 aa.a("bTwfBi0uFz4dFh9XCx4XGFcdJB8H") ->  PluginInfo not exist
