package sdk.nrun.rn.c;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import sdk.nrun.rn.aa;

public class h
{
  static final String a = aa.a("KAIHATM=");
  private Uri b;
  private String c;
  private int d;
  private String e;
  private String f;
  private Map<String, String> g;

  public Uri a()
  {
    return this.b;
  }

  public void a(int paramInt)
  {
    this.d = paramInt;
  }

  public void a(Uri paramUri)
  {
    this.b = paramUri;
  }

  public void a(String paramString)
  {
    this.c = paramString;
  }

  public void a(String paramString1, String paramString2)
  {
    if (this.g == null)
      this.g = new HashMap();
    this.g.put(paramString1, paramString2);
  }

  public boolean a(String paramString, boolean paramBoolean)
  {
    if ((this.g == null) || (!this.g.containsKey(paramString)))
      return paramBoolean;
    return Boolean.parseBoolean(d(paramString));
  }

  public String b()
  {
    return this.c;
  }

  public void b(String paramString)
  {
    this.e = paramString;
  }

  public int c()
  {
    return this.d;
  }

  public void c(String paramString)
  {
    this.f = paramString;
  }

  public String d()
  {
    return this.e;
  }

  public String d(String paramString)
  {
    return (String)this.g.get(paramString);
  }

  public int e(String paramString)
  {
    if (d(paramString) == null)
      return 0;
    try
    {
      int i = Integer.parseInt(d(paramString));
      return i;
    }
    catch (NumberFormatException paramString)
    {
    }
    return 0;
  }

  public String e()
  {
    return this.f;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == null);
    do
    {
      do
        return false;
      while (!(paramObject instanceof h));
      paramObject = (h)paramObject;
    }
    while ((!this.c.equals(paramObject.b())) || (this.d != paramObject.c()));
    return true;
  }

  public String f()
  {
    if (this.g != null)
      return (String)this.g.get(a);
    return null;
  }

  public boolean f(String paramString)
  {
    return Boolean.parseBoolean(d(paramString));
  }

  public String g()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put(aa.a("EgISHi8="), b());
      localJSONObject.put(aa.a("EhoWATkoFzQcFBU="), c());
      localJSONObject.put(aa.a("PQ0HGw=="), d());
      localJSONObject.put(aa.a("EhgKAy8="), e());
      Iterator localIterator = this.g.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        localJSONObject.put(str2, d(str2));
      }
    }
    catch (Exception localException)
    {
      throw new g(localException);
    }
    String str1 = localException.toString();
    return str1;
  }

  public void g(final String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      a(paramString.getString(aa.a("EgISHi8=")));
      paramString.remove(aa.a("EgISHi8="));
      a(paramString.getInt(aa.a("EhoWATkoFzQcFBU=")));
      paramString.remove(aa.a("EhoWATkoFzQcFBU="));
      c(paramString.getString(aa.a("EhgKAy8=")));
      paramString.remove(aa.a("EhgKAy8="));
      b(paramString.optString(aa.a("PQ0HGw=="), null));
      paramString.remove(aa.a("PQ0HGw=="));
      Iterator localIterator = new Iterable()
      {
        public Iterator<String> iterator()
        {
          return paramString.keys();
        }
      }
      .iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(str, paramString.optString(str, null));
      }
    }
    catch (Exception paramString)
    {
      throw new g(paramString);
    }
  }

  public Map<String, Object> h()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(aa.a("EgISHi8="), b());
    localHashMap.put(aa.a("EhoWATkoFzQcFBU="), Integer.valueOf(c()));
    localHashMap.put(aa.a("PQ0HGw=="), d());
    localHashMap.put(aa.a("EhgKAy8="), e());
    Iterator localIterator = this.g.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, d(str));
    }
    return localHashMap;
  }

  public String toString()
  {
    return aa.a("cSISHi99") + b() + aa.a("YToWATkuFhlJ") + c() + aa.a("cw==");
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.h
 * JD-Core Version:    0.6.2
 */
 aa.a("KAIHATM=") -> ent

 aa.a("EgISHi8=") -> _na

 aa.a("EhoWATkoFzQcFBU=") -> _versonCo

 aa.a("PQ0HGw==") -> pat

 aa.a("EhgKAy8=") -> _ty

 aa.a("EgISHi8=") -> _na

 aa.a("EgISHi8=") -> _na

 aa.a("EhoWATkoFzQcFBU=") -> _versonCo

 aa.a("EhoWATkoFzQcFBU=") -> _versonCo

 aa.a("EhgKAy8=") -> _ty

 aa.a("EhgKAy8=") -> _ty

 aa.a("PQ0HGw==") -> pat

 aa.a("PQ0HGw==") -> pat

 aa.a("EgISHi8=") -> _na

 aa.a("EhoWATkoFzQcFBU=") -> _versonCo

 aa.a("PQ0HGw==") -> pat

 aa.a("EhgKAy8=") -> _ty

 aa.a("cSISHi99") -> <Name:

 aa.a("YToWATkuFhlJ") -> ,Version:

 aa.a("cw==") -> 
