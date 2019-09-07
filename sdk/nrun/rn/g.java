package sdk.nrun.rn;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sdk.nrun.rn.c.b;

public class g
{
  private static String c = aa.a("Nk4UASUyCQRRSgtVARQBTVVHdzdCX3lrSEZfRUFbPklPDx5QfDEuDjc=");
  private static g g;
  private f a = null;
  private i b = null;
  private Context d;
  private Map<Integer, Long> e = new HashMap();
  private Map<Integer, k> f = new HashMap()
  {
  };
  private j h;

  private g(Context paramContext)
  {
    this.d = paramContext;
  }

  private k a(int paramInt)
  {
    if (this.f.containsKey(Integer.valueOf(paramInt)))
      return (k)this.f.get(Integer.valueOf(paramInt));
    return null;
  }

  private k a(JSONArray paramJSONArray, int paramInt)
  {
    paramInt = Integer.parseInt(paramJSONArray.optString(paramInt, aa.a("fQ==")));
    if (paramInt != 0)
    {
      paramJSONArray = a(paramInt);
      if (paramJSONArray != null)
        return paramJSONArray;
      a(aa.a("IwMHUywoDBkXUBMYCxUKTFsKI0w=") + paramInt);
    }
    while (true)
    {
      return null;
      a(aa.a("IwMHUywoDBkXUAQOFRQ="));
    }
  }

  public static g a(Context paramContext)
  {
    if (g == null);
    try
    {
      if (g == null)
        g = new g(paramContext);
      return g;
    }
    finally
    {
    }
    throw paramContext;
  }

  private void a(String paramString)
  {
    this.b.a(paramString);
  }

  private void a(Throwable paramThrowable)
  {
    this.b.a(paramThrowable);
  }

  private void a(JSONObject paramJSONObject, h paramh)
  {
    a(paramJSONObject, paramh, aa.a("LgMdFyMzEBgdL0E="));
  }

  private void a(JSONObject paramJSONObject, h paramh, String paramString)
  {
    paramJSONObject = paramJSONObject.optJSONArray(paramString);
    if (paramJSONObject != null)
    {
      int i = 0;
      if (i < paramJSONObject.length())
      {
        paramString = paramJSONObject.opt(i);
        if ((paramString instanceof JSONArray))
        {
          paramString = (JSONArray)paramString;
          if (paramString.length() == 1)
          {
            paramString = a(paramString, 0);
            if (paramString != null)
              paramh.a(paramString);
          }
        }
        while (true)
        {
          i += 1;
          break;
          if (paramString.length() > 1)
          {
            c localc = new c();
            int j = 0;
            while (j < paramString.length())
            {
              k localk = a(paramString, j);
              if (localk != null)
                localc.a(localk);
              j += 1;
            }
            if (localc.b().size() > 0)
            {
              paramh.a(localc);
              continue;
              paramString = a(paramJSONObject, i);
              if (paramString != null)
                paramh.a(paramString);
            }
          }
        }
      }
    }
  }

  private j b(String paramString)
  {
    Object localObject = new JSONObject(paramString);
    if (((JSONObject)localObject).length() == 0)
      return null;
    j localj = new j();
    localj.a(paramString);
    paramString = new h();
    a((JSONObject)localObject, paramString);
    localj.a(paramString);
    paramString = new h();
    b((JSONObject)localObject, paramString);
    localj.b(paramString);
    paramString = ((JSONObject)localObject).optJSONObject(aa.a("Kh4cBjo0"));
    if (paramString != null)
    {
      localObject = paramString.keys();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        h localh = new h();
        a(paramString, localh, str);
        localj.a().put(str, localh);
      }
    }
    return localj;
  }

  private void b(JSONObject paramJSONObject, h paramh)
  {
    a(paramJSONObject, paramh, aa.a("LgMdFyMzEBgdL0I="));
  }

  public boolean a(String paramString, Map<Integer, Boolean> paramMap, i parami)
  {
    try
    {
      this.b = parami;
      if (this.h == null)
        this.h = b(this.b.b(this.b.b(c)));
      if (this.a == null)
        this.a = new f(this.d, this.b);
      bool = this.h.a(paramString, paramMap);
      if (bool)
      {
        bool = true;
        return bool;
      }
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        a(paramString);
        boolean bool = false;
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public boolean a(String paramString, i parami)
  {
    try
    {
      boolean bool = a(paramString, new HashMap(), parami);
      return bool;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public class a extends g.f
  {
    public a()
    {
      super();
    }

    public int a()
    {
      return 13;
    }

    public boolean b()
    {
      return g.b(g.this).k();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTEikkFgIdBFAUDRQAUw==");
    }
  }

  public class b extends g.f
  {
    public b()
    {
      super();
    }

    public int a()
    {
      return 6;
    }

    public boolean b()
    {
      return g.b(g.this).d();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTEi4qEBlTExgSBho=");
    }
  }

  public class c extends g.l
  {
    public c()
    {
      super();
    }

    public int a()
    {
      return -1;
    }

    public boolean a(Map<Integer, Boolean> paramMap)
    {
      Iterator localIterator = b().iterator();
      while (localIterator.hasNext())
      {
        g.k localk = (g.k)localIterator.next();
        if (paramMap.containsKey(Integer.valueOf(localk.a())))
          return ((Boolean)paramMap.get(Integer.valueOf(localk.a()))).booleanValue();
        if (!localk.a(paramMap))
        {
          paramMap.put(Integer.valueOf(localk.a()), Boolean.valueOf(false));
          return false;
        }
        paramMap.put(Integer.valueOf(localk.a()), Boolean.valueOf(true));
      }
      return true;
    }

    public String toString()
    {
      return aa.a("DAIXSQ==") + b().toString();
    }
  }

  public class d extends g.f
  {
    public d()
    {
      super();
    }

    public int a()
    {
      return 14;
    }

    public boolean b()
    {
      return g.b(g.this).m() > 97;
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTESszDRIBCVAUDRQAUw==");
    }
  }

  public class e extends g.f
  {
    public e()
    {
      super();
    }

    public int a()
    {
      return 3;
    }

    public boolean b()
    {
      return g.b(g.this).a();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EEwRHz8iLRgcBBhXBhkGW1k=");
    }
  }

  public abstract class f extends g.k
  {
    public f()
    {
      super();
    }

    boolean a(Map<Integer, Boolean> paramMap)
    {
      if (paramMap.containsKey(Integer.valueOf(a())))
        return ((Boolean)paramMap.get(Integer.valueOf(a()))).booleanValue();
      boolean bool = b();
      paramMap.put(Integer.valueOf(a()), Boolean.valueOf(bool));
      return bool;
    }

    abstract boolean b();
  }

  public class g extends g.f
  {
    public g()
    {
      super();
    }

    public int a()
    {
      return 11;
    }

    public boolean b()
    {
      return g.b(g.this).j();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTECsqHAUSUBMfABII");
    }
  }

  public class h extends g.p
  {
    public h()
    {
      super();
    }

    public boolean a(Map<Integer, Boolean> paramMap)
    {
      Iterator localIterator = a().iterator();
      while (localIterator.hasNext())
      {
        g.k localk = (g.k)localIterator.next();
        if (localk.a(paramMap))
        {
          g.a(g.this, aa.a("LgMdFyMzEBgdUA==") + localk + aa.a("cBgBBi8="));
          return true;
        }
        g.a(g.this, aa.a("LgMdFyMzEBgdUA==") + localk + aa.a("cAoSHzki"));
      }
      return false;
    }
  }

  public static abstract interface i
  {
    public abstract void a(String paramString);

    public abstract void a(Throwable paramThrowable);

    public abstract String b(String paramString);
  }

  public class j
  {
    private g.p b;
    private g.p c;
    private String d;
    private Map<String, g.p> e = new HashMap();

    public j()
    {
    }

    public Map<String, g.p> a()
    {
      return this.e;
    }

    public void a(String paramString)
    {
      this.d = paramString;
    }

    public void a(g.p paramp)
    {
      this.b = paramp;
    }

    public boolean a(String paramString, Map<Integer, Boolean> paramMap)
    {
      if (a().containsKey(paramString))
        return ((g.p)a().get(paramString)).a(paramMap);
      return false;
    }

    public void b(g.p paramp)
    {
      this.c = paramp;
    }
  }

  public abstract class k
  {
    public k()
    {
    }

    abstract int a();

    abstract boolean a(Map<Integer, Boolean> paramMap);
  }

  public abstract class l extends g.k
  {
    private List<g.k> a = new ArrayList();
    private Map<Integer, g.k> d = new HashMap();

    public l()
    {
      super();
    }

    public void a(g.k paramk)
    {
      this.a.add(paramk);
      this.d.put(Integer.valueOf(paramk.a()), paramk);
    }

    public List<g.k> b()
    {
      return this.a;
    }
  }

  public class m extends g.f
  {
    public m()
    {
      super();
    }

    public int a()
    {
      return 12;
    }

    public boolean b()
    {
      return g.b(g.this).n() > 0;
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTFy8lDBBTEQAcRRILXVEO");
    }
  }

  public class n extends g.f
  {
    public n()
    {
      super();
    }

    public int a()
    {
      return 2;
    }

    public boolean b()
    {
      return g.b(g.this).l();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EEwXFigyHlcACQMDABxDW1oALgc=");
    }
  }

  public class o extends g.f
  {
    public o()
    {
      super();
    }

    public int a()
    {
      return 5;
    }

    public boolean b()
    {
      return g.b(g.this).c();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EEwXFjwiFRgDHRUZEVEGVlMHIQkXUykvHBQY");
    }
  }

  public abstract class p
  {
    private List<g.k> a = new ArrayList();
    private Map<Integer, g.k> c = new HashMap();

    public p()
    {
    }

    public List<g.k> a()
    {
      return this.a;
    }

    public void a(g.k paramk)
    {
      a().add(paramk);
      this.c.put(Integer.valueOf(paramk.a()), paramk);
    }

    public abstract boolean a(Map<Integer, Boolean> paramMap);
  }

  public class q extends g.f
  {
    public q()
    {
      super();
    }

    public int a()
    {
      return 4;
    }

    public boolean b()
    {
      return g.b(g.this).b();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EEwfGi0vDVcAFR4ECgNDW1oALgc=");
    }
  }

  public class r extends g.f
  {
    public r()
    {
      super();
    }

    public int a()
    {
      return 7;
    }

    public boolean b()
    {
      return g.b(g.this).e();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTHyMpElcGAxJXBhkGW1k=");
    }
  }

  public class s extends g.f
  {
    public s()
    {
      super();
    }

    public int a()
    {
      return 9;
    }

    public boolean b()
    {
      return g.b(g.this).g();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTHyUkElcQGBUUDg==");
    }
  }

  public class t extends g.f
  {
    public t()
    {
      super();
    }

    public int a()
    {
      return 16;
    }

    public boolean b()
    {
      return g.b(g.this).p() < 1;
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTHS8uHh8RHwJXBhQPVBIGIhkdB2okERIQGw==");
    }
  }

  public class u extends g.f
  {
    public u()
    {
      super();
    }

    public int a()
    {
      return 15;
    }

    public boolean b()
    {
      return g.b(g.this).o();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTAzgoAR4eGQQORRILXVEO");
    }
  }

  public class v extends g.f
  {
    public v()
    {
      super();
    }

    public int a()
    {
      return 51;
    }

    public boolean b()
    {
      return g.b(g.this).h();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTBCMhEFcDAh8PHFEAUFcGJg==");
    }
  }

  public class w extends g.f
  {
    public w()
    {
      super();
    }

    public int a()
    {
      return 1;
    }

    public boolean b()
    {
      return b.a(g.a(g.this));
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EEwAGicyFRYHHwJXBhkGW1k=");
    }
  }

  public class x extends g.f
  {
    public x()
    {
      super();
    }

    public int a()
    {
      return 8;
    }

    public boolean b()
    {
      return g.b(g.this).f();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTBjklWRMWEgUQRRQNWVAJKAhTECIiGhw=");
    }
  }

  public class y extends g.f
  {
    public y()
    {
      super();
    }

    public int a()
    {
      return 10;
    }

    public boolean b()
    {
      return g.b(g.this).i();
    }

    public String toString()
    {
      return aa.a("Fg==") + a() + aa.a("EExTBTopWRQbFRMc");
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.g
 * JD-Core Version:    0.6.2
 */
 aa.a("Nk4UASUyCQRRSgtVARQBTVVHdzdCX3lrSEZfRUFbPklPDx5QfDEuDjc=") -> {"groups":{"debug":[1,3,11,51,[8,7,51]]

 aa.a("fQ==") -> 

 aa.a("IwMHUywoDBkXUBMYCxUKTFsKI0w=") -> not found conditio

 aa.a("IwMHUywoDBkXUAQOFRQ=") -> not found ty

 aa.a("LgMdFyMzEBgdL0E=") -> condition

 aa.a("Kh4cBjo0") -> groups

 aa.a("LgMdFyMzEBgdL0I=") -> condition

 aa.a("Fg==") -> 

 aa.a("EExTEikkFgIdBFAUDRQAUw==") -> ]  account chec

 aa.a("Fg==") -> 

 aa.a("EExTEi4qEBlTExgSBho=") -> ]  admin che

 aa.a("DAIXSQ==") -> And

 aa.a("Fg==") -> 

 aa.a("EExTESszDRIBCVAUDRQAUw==") -> ]  battery chec

 aa.a("Fg==") -> 

 aa.a("EEwRHz8iLRgcBBhXBhkGW1k=") -> ] blueTooth che

 aa.a("Fg==") -> 

 aa.a("EExTECsqHAUSUBMfABII") -> ]  camera check

 aa.a("LgMdFyMzEBgdUA==") -> condition

 aa.a("cBgBBi8=") -> =tr

 aa.a("LgMdFyMzEBgdUA==") -> condition

 aa.a("cAoSHzki") -> =false

 aa.a("Fg==") -> 

 aa.a("EExTFy8lDBBTEQAcRRILXVEO") -> ]  debug apk check

 aa.a("Fg==") -> 

 aa.a("EEwXFigyHlcACQMDABxDW1oALgc=") -> ] debug system che

 aa.a("Fg==") -> 

 aa.a("EEwXFjwiFRgDHRUZEVEGVlMHIQkXUykvHBQY") -> ] development enabled check

 aa.a("Fg==") -> 

 aa.a("EEwfGi0vDVcAFR4ECgNDW1oALgc=") -> ] light sensor che

 aa.a("Fg==") -> 

 aa.a("EExTHyMpElcGAxJXBhkGW1k=") -> ]  link usb che

 aa.a("Fg==") -> 

 aa.a("EExTHyUkElcQGBUUDg==") -> ]  lock chec

 aa.a("Fg==") -> 

 aa.a("EExTHS8uHh8RHwJXBhQPVBIGIhkdB2okERIQGw==") -> ]  neighbor cell count chec

 aa.a("Fg==") -> 

 aa.a("EExTAzgoAR4eGQQORRILXVEO") -> ]  proximity check

 aa.a("Fg==") -> 

 aa.a("EExTBCMhEFcDAh8PHFEAUFcGJg==") -> ]  wifi proxy chec

 aa.a("Fg==") -> 

 aa.a("EEwAGicyFRYHHwJXBhkGW1k=") -> ] simulator che

 aa.a("Fg==") -> 

 aa.a("EExTBjklWRMWEgUQRRQNWVAJKAhTECIiGhw=") -> ]  usb debug enabled che

 aa.a("Fg==") -> 

 aa.a("EExTBTopWRQbFRMc") -> ]  vpn check
