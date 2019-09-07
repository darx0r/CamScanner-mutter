package sdk.nrun.rn.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.d;
import sdk.nrun.rn.g;
import sdk.nrun.rn.g.i;
import sdk.nrun.rn.l;
import sdk.nrun.rn.w;
import sdk.nrun.rn.w.a;
import sdk.nrun.rn.x;
import sdk.nrun.rn.z;

public class k
{
  private Context a;
  private l b = x.a();
  private g.i c;

  public k(Context paramContext)
  {
    this.a = paramContext;
    this.c = new d(paramContext);
  }

  private void a(Exception paramException)
  {
    this.b.a(paramException);
  }

  private void a(String paramString)
  {
    this.b.b(paramString);
  }

  private void a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      sdk.nrun.rn.k.a(this.a).a(aa.a("OB8WLCsuHQ=="), sdk.nrun.rn.c.a(paramString1.getBytes(), aa.a("ASMmKggPMT8=")));
      x.a().a(aa.a("OB8WUys3CR4XUA==") + paramString1);
    }
    if (paramString2 != null)
    {
      sdk.nrun.rn.k.a(this.a).a(aa.a("OB8WLCkuHQ=="), sdk.nrun.rn.c.a(paramString2.getBytes(), aa.a("ASMmKggPMT8=")));
      x.a().a(aa.a("OB8WUykvGBkdFRweAVE=") + paramString2);
    }
  }

  private void a(String paramString, List<a> paramList)
  {
    paramString = new JSONObject(paramString);
    int i = paramString.optInt(aa.a("LgMXFg=="), -1);
    if (i == 0)
    {
      paramString = paramString.getJSONObject(aa.a("PwkABiYz")).getJSONArray(aa.a("IQUABw=="));
      i = 0;
      while (i < paramString.length())
      {
        Object localObject1 = paramString.getJSONObject(i);
        Object localObject2 = ((JSONObject)localObject1).optString(aa.a("Iw0eFg=="));
        if ((localObject2 != null) && (aa.a("PQAfGjkz").equals(localObject2)))
        {
          a(((JSONObject)localObject1).optString(aa.a("LAUX"), null), ((JSONObject)localObject1).optString(aa.a("LgUX"), null));
          localObject1 = ((JSONObject)localObject1).getJSONArray(aa.a("JBgWHjk="));
          int j = 0;
          while (j < ((JSONArray)localObject1).length())
          {
            localObject2 = ((JSONArray)localObject1).optJSONObject(j);
            if (localObject2 != null)
            {
              a locala = new a();
              locala.a = ((JSONObject)localObject2).optString(aa.a("Iw0eFg=="));
              locala.b = ((JSONObject)localObject2).optString(aa.a("OB4f"));
              locala.c = ((JSONObject)localObject2).optString(aa.a("PggYBS81"));
              locala.d = ((JSONObject)localObject2).optString(aa.a("IAhG"), null);
              x.a().a(aa.a("KgkHUw==") + locala.a + aa.a("dw==") + locala.c + aa.a("bQoBHCdnChIBBhUF"));
              paramList.add(locala);
            }
            j += 1;
          }
        }
        i += 1;
      }
    }
    x.a().d(aa.a("PQAGFCMpWQUWAwAYCwIGGFEKKQlTGjln") + i);
  }

  // ERROR //
  private boolean a(Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_1
    //   5: invokestatic 194	sdk/nrun/rn/w:a	(Landroid/content/Context;)Lsdk/nrun/rn/w;
    //   8: ldc 196
    //   10: invokestatic 57	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   13: iconst_1
    //   14: invokevirtual 199	sdk/nrun/rn/w:a	(Ljava/lang/String;Z)Z
    //   17: istore_3
    //   18: iload_3
    //   19: ifne +7 -> 26
    //   22: aload_0
    //   23: monitorexit
    //   24: iload_2
    //   25: ireturn
    //   26: invokestatic 205	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   29: invokevirtual 206	java/util/UUID:toString	()Ljava/lang/String;
    //   32: astore 6
    //   34: invokestatic 210	sdk/nrun/rn/s:a	()Ljava/lang/String;
    //   37: astore 5
    //   39: aload 5
    //   41: astore 4
    //   43: aload 5
    //   45: ifnonnull +10 -> 55
    //   48: ldc 212
    //   50: invokestatic 57	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   53: astore 4
    //   55: aload_1
    //   56: new 75	java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   63: ldc 214
    //   65: invokestatic 57	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   68: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload 4
    //   73: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: invokestatic 217	sdk/nrun/rn/h:a	(Ljava/lang/String;)Ljava/lang/String;
    //   82: invokestatic 220	sdk/nrun/rn/k:a	(Landroid/content/Context;Ljava/lang/String;)Lsdk/nrun/rn/k;
    //   85: astore_1
    //   86: invokestatic 24	sdk/nrun/rn/x:a	()Lsdk/nrun/rn/l;
    //   89: ldc 222
    //   91: invokestatic 57	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   94: invokeinterface 88 2 0
    //   99: aload_1
    //   100: ldc 212
    //   102: invokestatic 57	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   105: aload 6
    //   107: invokevirtual 73	sdk/nrun/rn/k:a	(Ljava/lang/String;Ljava/lang/String;)Z
    //   110: ifne +21 -> 131
    //   113: invokestatic 24	sdk/nrun/rn/x:a	()Lsdk/nrun/rn/l;
    //   116: ldc 224
    //   118: invokestatic 57	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   121: invokeinterface 44 2 0
    //   126: iconst_0
    //   127: istore_2
    //   128: goto -106 -> 22
    //   131: aload 6
    //   133: aload_1
    //   134: ldc 212
    //   136: invokestatic 57	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   139: ldc 226
    //   141: invokevirtual 229	sdk/nrun/rn/k:a	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   144: invokevirtual 135	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   147: ifeq +15 -> 162
    //   150: aload_1
    //   151: ldc 212
    //   153: invokestatic 57	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   156: invokevirtual 230	sdk/nrun/rn/k:a	(Ljava/lang/String;)V
    //   159: goto -137 -> 22
    //   162: invokestatic 24	sdk/nrun/rn/x:a	()Lsdk/nrun/rn/l;
    //   165: ldc 232
    //   167: invokestatic 57	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   170: invokeinterface 44 2 0
    //   175: aload_1
    //   176: ldc 212
    //   178: invokestatic 57	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   181: invokevirtual 230	sdk/nrun/rn/k:a	(Ljava/lang/String;)V
    //   184: aload_1
    //   185: invokevirtual 234	sdk/nrun/rn/k:a	()V
    //   188: iconst_0
    //   189: istore_2
    //   190: goto -168 -> 22
    //   193: astore_1
    //   194: aload_0
    //   195: monitorexit
    //   196: aload_1
    //   197: athrow
    //   198: astore_1
    //   199: iconst_0
    //   200: istore_2
    //   201: goto -179 -> 22
    //
    // Exception table:
    //   from	to	target	type
    //   4	18	193	finally
    //   26	39	193	finally
    //   48	55	193	finally
    //   55	126	193	finally
    //   131	159	193	finally
    //   162	188	193	finally
    //   26	39	198	java/lang/Exception
    //   48	55	198	java/lang/Exception
    //   55	126	198	java/lang/Exception
    //   131	159	198	java/lang/Exception
    //   162	188	198	java/lang/Exception
  }

  private String b()
  {
    return aa.a("HSAwEikvHChB");
  }

  private String c()
  {
    int i = 0;
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put(aa.a("ORUDFg=="), aa.a("PR8="));
    JSONObject localJSONObject2 = new JSONObject();
    Object localObject = w.a(this.a).b(this.a);
    localJSONObject2.put(aa.a("JR8eEiQ="), ((w.a)localObject).d());
    localJSONObject2.put(aa.a("JR8HCjoi"), ((w.a)localObject).e());
    localJSONObject2.put(aa.a("Ih8lFjg="), ((w.a)localObject).f());
    localJSONObject2.put(aa.a("Pg8BFi8pLh4XBBg="), ((w.a)localObject).g());
    localJSONObject2.put(aa.a("Pg8BFi8pMRIaFxgD"), ((w.a)localObject).h());
    localJSONObject2.put(aa.a("Pw0eICM9HA=="), ((w.a)localObject).i());
    localJSONObject2.put(aa.a("JAEAGg=="), ((w.a)localObject).j());
    localJSONObject2.put(aa.a("JAEWGg=="), ((w.a)localObject).k());
    localJSONObject2.put(aa.a("IwkHBCU1EiMKABU="), ((w.a)localObject).l());
    localJSONObject2.put(aa.a("LBwDOi4="), w.a(this.a).a());
    localJSONObject2.put(aa.a("LgQSHSQiFT4X"), w.a(this.a).b());
    localJSONObject2.put(aa.a("IA0Q"), ((w.a)localObject).m());
    localJSONObject2.put(aa.a("PggYOiQzLxIBAxkYCw=="), ((w.a)localObject).n());
    localJSONObject2.put(aa.a("LAIXASUuHT4X"), ((w.a)localObject).o());
    localJSONObject2.put(aa.a("IwMgGyMiFRMA"), ((w.a)localObject).p());
    localJSONObject2.put(aa.a("KwASFA=="), ((w.a)localObject).q());
    localJSONObject2.put(aa.a("LBwDJzM3HA=="), ((w.a)localObject).r());
    localJSONObject2.put(aa.a("LgQSAS0i"), ((w.a)localObject).s());
    localJSONObject2.put(aa.a("JB8+EjIGDA=="), ((w.a)localObject).b());
    localJSONObject2.put(aa.a("LBwDIyskEhYUFQ=="), this.a.getPackageName());
    localJSONObject1.put(aa.a("JAIABysrFScSExsWAhQvUUER"), d());
    JSONObject localJSONObject3 = new JSONObject();
    localJSONObject3.put(aa.a("PggYOiQzLxIBAxkYCw=="), ((w.a)localObject).n());
    localJSONObject3.put(aa.a("LBwDJzM3HA=="), ((w.a)localObject).r());
    localJSONObject3.put(aa.a("LgQSAS0i"), ((w.a)localObject).s());
    localJSONObject3.put(aa.a("JB8+EjIGDA=="), ((w.a)localObject).b());
    localJSONObject3.put(aa.a("PQ0QGCsgHDkSHRU="), this.a.getPackageName());
    localJSONObject3.put(aa.a("KwASFA=="), ((w.a)localObject).q());
    localJSONObject3.put(aa.a("LBwDPyUk"), ((w.a)localObject).a());
    localJSONObject3.put(aa.a("IwMgGyMiFRMA"), ((w.a)localObject).p());
    localJSONObject3.put(aa.a("IQURJS81Ch4cHg=="), z.b);
    localJSONObject3.put(aa.a("PggYPiUjHA=="), w.a(this.a).e(aa.a("HggYPiUjHA=="), aa.a("KQkV")));
    localObject = aa.a("JB8jEjgiFwM=");
    if (w.a(this.a).a(aa.a("BB8jEjgiFwM="), false))
      i = 1;
    localJSONObject3.put((String)localObject, i);
    localJSONObject3.put(aa.a("Ih8wHC4i"), Build.VERSION.SDK_INT);
    localJSONObject3.put(aa.a("PQUX"), w.a(this.a).e(aa.a("HQASBywoCxonCQAS"), ""));
    if (w.a(this.a).a(aa.a("DgQWECEDHAEaExU="), true))
      b.a(this.a, localJSONObject3);
    localJSONObject1.put(aa.a("OQkBHiMpGBs6HhYY"), localJSONObject2);
    localJSONObject1.put(aa.a("Jx8cHRkiCwEaExU="), localJSONObject3);
    return localJSONObject1.toString();
  }

  private JSONArray d()
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = this.a.getPackageManager().getInstalledPackages(0).iterator();
    while (localIterator.hasNext())
      localJSONArray.put(((PackageInfo)localIterator.next()).packageName);
    return localJSONArray;
  }

  public List<a> a()
  {
    while (true)
    {
      try
      {
        ArrayList localArrayList1;
        if (!a(this.a))
        {
          x.a().b(aa.a("IQ0GHSkvWRQbFRMcRQIXV0AEKglTFSsuFQ=="));
          localArrayList1 = new ArrayList();
          return localArrayList1;
        }
        if ((w.a(this.a).a(aa.a("DgQWECEDHAEaExU="), true)) && (g.a(this.a).a(aa.a("KQkRBi0="), this.c)))
        {
          x.a().b(aa.a("LgQWECFnHRIFGRMSRR0CTVwGJUwVEiMr"));
          localArrayList1 = new ArrayList();
          continue;
        }
      }
      finally
      {
      }
      ArrayList localArrayList2 = new ArrayList();
      try
      {
        String str = (String)sdk.nrun.rn.k.a(this.a).a(28800000L).a(b(), null);
        if (str != null)
        {
          a(sdk.nrun.rn.c.b(str.getBytes(), aa.a("BysxIB8ACigAL0A=")), localArrayList2);
          continue;
        }
        str = w.a(this.a).d(aa.a("HQAGFCMpKhIBBhUF"));
        str = (String)w.a(this.a).a(aa.a("HQAGFCMpKhIBBhUF"), str);
        if (str == null)
        {
          a(aa.a("Lw0AGilnDAUfUBkERR8WVF4="));
          continue;
        }
        m.a(this.a);
        if ((m.c == null) || ("".equals(m.c.trim())))
          m.c = str;
        str = new sdk.nrun.rn.b.c(this.a, m.c + aa.a("Yg0HXDor")).a(c());
        sdk.nrun.rn.k.a(this.a).a(b(), sdk.nrun.rn.c.a(str.getBytes(), aa.a("BysxIB8ACigAL0A=")));
        a(str, localArrayList2);
      }
      catch (Exception localException)
      {
        while (true)
          a(localException);
      }
    }
  }

  public Map<String, a> a(List<a> paramList)
  {
    HashMap localHashMap = new HashMap();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      a locala = (a)paramList.next();
      localHashMap.put(locala.a, locala);
    }
    return localHashMap;
  }

  public static class a
    implements Parcelable
  {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator()
    {
      public k.a a(Parcel paramAnonymousParcel)
      {
        return new k.a(paramAnonymousParcel);
      }

      public k.a[] a(int paramAnonymousInt)
      {
        return new k.a[paramAnonymousInt];
      }
    };
    public String a;
    public String b;
    public String c;
    public String d;

    public a()
    {
    }

    protected a(Parcel paramParcel)
    {
      this.a = paramParcel.readString();
      this.b = paramParcel.readString();
      this.c = paramParcel.readString();
      this.d = paramParcel.readString();
    }

    public int a()
    {
      try
      {
        int i = Integer.parseInt(this.c);
        return i;
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
      return 0;
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.a);
      paramParcel.writeString(this.b);
      paramParcel.writeString(this.c);
      paramParcel.writeString(this.d);
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.k
 * JD-Core Version:    0.6.2
 */
 aa.a("OB8WLCsuHQ==") -> use_ai

 aa.a("ASMmKggPMT8=") -> LOUYBH

 aa.a("OB8WUys3CR4XUA==") -> use appid

 aa.a("OB8WLCkuHQ==") -> use_ci

 aa.a("ASMmKggPMT8=") -> LOUYBH

 aa.a("OB8WUykvGBkdFRweAVE=") -> use channeli

 aa.a("LgMXFg==") -> cod

 aa.a("PwkABiYz") -> result

 aa.a("IQUABw==") -> lis

 aa.a("Iw0eFg==") -> nam

 aa.a("PQAfGjkz") -> pllist

 aa.a("LAUX") -> aid

 aa.a("LgUX") -> cid

 aa.a("JBgWHjk=") -> ite

 aa.a("Iw0eFg==") -> nam

 aa.a("OB4f") -> url

 aa.a("PggYBS81") -> sdkver

 aa.a("IAhG") -> md5

 aa.a("KgkHUw==") -> get

 aa.a("dw==") -> 

 aa.a("bQoBHCdnChIBBhUF") ->  from server

 aa.a("PQAGFCMpWQUWAwAYCwIGGFEKKQlTGjln") -> plugin response code is 

 aa.a("HSAwEikvHChB") -> PLCache_2

 aa.a("ORUDFg==") -> typ

 aa.a("PR8=") -> 

 aa.a("JR8eEiQ=") -> hsm

 aa.a("JR8HCjoi") -> hstype

 aa.a("Ih8lFjg=") -> osV

 aa.a("Pg8BFi8pLh4XBBg=") -> screenWid

 aa.a("Pg8BFi8pMRIaFxgD") -> screenHeight

 aa.a("Pw0eICM9HA==") -> ramSiz

 aa.a("JAEAGg==") -> ims

 aa.a("JAEWGg==") -> ime

 aa.a("IwkHBCU1EiMKABU=") -> networkTy

 aa.a("LBwDOi4=") -> app

 aa.a("LgQSHSQiFT4X") -> channelId

 aa.a("IA0Q") -> mac

 aa.a("PggYOiQzLxIBAxkYCw==") -> sdkIntVersio

 aa.a("LAIXASUuHT4X") -> androidId

 aa.a("IwMgGyMiFRMA") -> noShields

 aa.a("KwASFA==") -> fla

 aa.a("LBwDJzM3HA==") -> appTyp

 aa.a("LgQSAS0i") -> charge

 aa.a("JB8+EjIGDA==") -> isMaxA

 aa.a("LBwDIyskEhYUFQ==") -> appPackag

 aa.a("JAIABysrFScSExsWAhQvUUER") -> installPackageList

 aa.a("PggYOiQzLxIBAxkYCw==") -> sdkIntVersio

 aa.a("LBwDJzM3HA==") -> appTyp

 aa.a("LgQSAS0i") -> charge

 aa.a("JB8+EjIGDA==") -> isMaxA

 aa.a("PQ0QGCsgHDkSHRU=") -> packageNa

 aa.a("KwASFA==") -> fla

 aa.a("LBwDPyUk") -> appLoc

 aa.a("IwMgGyMiFRMA") -> noShields

 aa.a("IQURJS81Ch4cHg==") -> libVersio

 aa.a("PggYPiUjHA==") -> sdkMod

 aa.a("HggYPiUjHA==") -> SdkMod

 aa.a("KQkV") -> def

 aa.a("JB8jEjgiFwM=") -> isPare

 aa.a("BB8jEjgiFwM=") -> IsPare

 aa.a("Ih8wHC4i") -> osCode

 aa.a("PQUX") -> pid

 aa.a("HQASBywoCxonCQAS") -> PlatformType

 aa.a("DgQWECEDHAEaExU=") -> CheckDevi

 aa.a("OQkBHiMpGBs6HhYY") -> terminalInfo

 aa.a("Jx8cHRkiCwEaExU=") -> jsonServi

 aa.a("IQ0GHSkvWRQbFRMcRQIXV0AEKglTFSsuFQ==") -> launch check storage fai

 aa.a("DgQWECEDHAEaExU=") -> CheckDevi

 aa.a("KQkRBi0=") -> deb

 aa.a("LgQWECFnHRIFGRMSRR0CTVwGJUwVEiMr") -> check device launch fail

 aa.a("BysxIB8ACigAL0A=") -> JGBSUGs_s

 aa.a("HQAGFCMpKhIBBhUF") -> PluginServer

 aa.a("HQAGFCMpKhIBBhUF") -> PluginServer

 aa.a("Lw0AGilnDAUfUBkERR8WVF4=") -> basic url is nu

 aa.a("Yg0HXDor") -> /at/pl

 aa.a("BysxIB8ACigAL0A=") -> JGBSUGs_s
