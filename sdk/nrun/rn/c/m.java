package sdk.nrun.rn.c;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.k;
import sdk.nrun.rn.l;
import sdk.nrun.rn.w;
import sdk.nrun.rn.x;
import sdk.nrun.rn.z;

public class m
{
  public static String a = "";
  public static String b = "";
  public static String c;
  private static final String d = aa.a("PQAGFCMp");
  private static boolean e = false;
  private static boolean f = false;
  private static final String g = aa.a("AAYYAyYsEAccHwA=");

  public static void a(Context paramContext)
  {
    while (true)
    {
      try
      {
        boolean bool = e;
        if (bool)
          return;
        c(paramContext);
        e = true;
        if (k.a(paramContext).b(d))
        {
          if (f)
            continue;
          c = sdk.nrun.rn.c.b(((String)k.a(paramContext).a(d, c)).getBytes(), g);
          x.a().b(aa.a("HQAGFCMpWSIBHFBNRQ==") + c);
          continue;
        }
      }
      finally
      {
      }
      while (true)
      {
        try
        {
          Object localObject1 = new JSONObject(new sdk.nrun.rn.b.c(paramContext, b + aa.a("Yg0HXDkiDz8cAwQ=")).a(b(paramContext)));
          if (((JSONObject)localObject1).optInt(aa.a("LgMXFg=="), -1) != 0)
            break label453;
          localObject1 = ((JSONObject)localObject1).optJSONObject(aa.a("PwkABiYz"));
          if (localObject1 == null)
            break;
          localObject1 = ((JSONObject)localObject1).getJSONObject(aa.a("JQMABwA0Fhk=")).getJSONArray(d);
          x.a().a(aa.a("OB4fU6za3J/02lA=") + b);
          if ((f) || (c != null))
            break;
          if (((JSONArray)localObject1).length() <= 0)
            break label416;
          localObject1 = ((JSONArray)localObject1).getString(0);
          c = (String)localObject1;
          if ((a.equals(c)) || (c == null))
            break label421;
          k.a(paramContext).a(d, sdk.nrun.rn.c.a(c.getBytes(), g));
          x.a().b(aa.a("IA0aHWoyCxtJ") + c);
        }
        catch (Exception localException)
        {
          try
          {
            x.a().a(aa.a("OB8WUy4iH1cGAhw="));
            if (c == null)
            {
              c = a;
              k.a(paramContext).a(d, sdk.nrun.rn.c.a(c.getBytes(), g));
            }
            e = false;
            x.a().a(localException);
          }
          catch (Exception paramContext)
          {
            x.a().a(paramContext);
          }
        }
        break;
        label416: Object localObject2 = null;
        continue;
        label421: c = a;
        k.a(paramContext).a(d, sdk.nrun.rn.c.a(c.getBytes(), g));
      }
      label453: e = false;
    }
  }

  private static String b(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(aa.a("LBwDOi4="), w.a(paramContext).a());
    localJSONObject.put(aa.a("LgQSHSQiFT4X"), w.a(paramContext).b());
    return localJSONObject.toString();
  }

  private static void c(Context paramContext)
  {
    a = w.a(paramContext).b(aa.a("HQAGFCMpKhIBBhUF"), a);
    if (z.c);
    for (b = w.a(paramContext).b(aa.a("JQMABw=="), b); ; b = w.a(paramContext).b(aa.a("PgkBBS81"), b))
    {
      String str = (String)w.a(paramContext).a(aa.a("HQAGFCMpKhIBBhUF"), "");
      if (!"".equals(str))
      {
        f = true;
        x.a().b(aa.a("HQAGFCMpWSIBHFBNRQ==") + str);
        c = str;
      }
      paramContext = (String)w.a(paramContext).a(aa.a("DCggLBkCKyE2Ii8iNz0="), "");
      if (!"".equals(paramContext))
      {
        x.a().b(aa.a("HQAGFCMpWSQWAgYSF1E2Sl5Fd0w=") + paramContext);
        b = paramContext;
      }
      return;
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.m
 * JD-Core Version:    0.6.2
 */
 aa.a("PQAGFCMp") -> plugin

 aa.a("AAYYAyYsEAccHwA=") -> Mjkplkipo

 aa.a("HQAGFCMpWSIBHFBNRQ==") -> Plugin Url :

 aa.a("Yg0HXDkiDz8cAwQ=") -> /at/sevHo

 aa.a("LgMXFg==") -> cod

 aa.a("PwkABiYz") -> result

 aa.a("JQMABwA0Fhk=") -> hostJs

 aa.a("OB4fU6za3J/02lA=") -> url 来�

 aa.a("IA0aHWoyCxtJ") -> main url:

 aa.a("OB8WUy4iH1cGAhw=") -> use def u

 aa.a("LBwDOi4=") -> app

 aa.a("LgQSHSQiFT4X") -> channelId

 aa.a("HQAGFCMpKhIBBhUF") -> PluginServer

 aa.a("JQMABw==") -> hos

 aa.a("PgkBBS81") -> server

 aa.a("HQAGFCMpKhIBBhUF") -> PluginServer

 aa.a("HQAGFCMpWSIBHFBNRQ==") -> Plugin Url :

 aa.a("DCggLBkCKyE2Ii8iNz0=") -> ADS_SERVER_U

 aa.a("HQAGFCMpWSQWAgYSF1E2Sl5Fd0w=") -> Plugin Server Url 
