package sdk.nrun.rn.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Proxy;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.l;
import sdk.nrun.rn.x;

public class b
{
  private static String[] a = { aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0VxYDAB0WFwVOCRwEPQc="), aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0VzUABDMYCBwCVlY1PwMQFjk0FgVeQV4WFRo="), aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0Vx8WHABaVF8CSFk="), aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0Vx8cHRVaVF8CSFk="), aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0VwRBAF1GSxATUw=="), aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0VwQWEQIUDRATSB9UYw0DGA=="), aa.a("YggSBytoGxsGFQMDBBIISxwVPwMD"), aa.a("YggSBytoHRYHEV8UChxNWVwBPwMlPmQxFBQcHhYeAg=="), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkSExMSCRQRV18AOQkBBiM="), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkSAAARDB8HXUA="), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkSAAAaBAMX"), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkSAAAEAAUXUVwCPg=="), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkxAwQ0ChwOWVwBHR4cEC80ChgB"), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkRAwQRCh0HXUA="), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkbFRwH"), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkbHx0S"), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkAQgA="), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkAFREFBhkCSEI="), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkAFQQDDB8ESw=="), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkAFQQCFQ=="), aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkAAB8DCRgEUEY="), aa.a("YgEdB2U3CxIRBR4TCRQHWUIVPkMRHz8iCgMSExsESwERV0JLIh4aFA==") };
  private static Boolean b;

  public static void a(Context paramContext, JSONObject paramJSONObject)
  {
    while (true)
    {
      try
      {
        String str3 = aa.a("PjMHCjoi");
        String str1;
        if (Build.TYPE.equals(aa.a("KAIU")))
        {
          str1 = aa.a("fA==");
          paramJSONObject.put(str3, str1);
          paramJSONObject.put(aa.a("PjMXFigyHg=="), a.a(aa.a("PwNdFy8lDBAUERIbAA==")));
          paramJSONObject.put(aa.a("PjMAFikyCxI="), a.a(aa.a("PwNdAC8kDAUW")));
          str3 = aa.a("PjMSAzoDHBUGFw==");
          if (!b(paramContext))
            continue;
          str1 = aa.a("fA==");
          paramJSONObject.put(str3, str1);
        }
        try
        {
          if (Build.VERSION.SDK_INT >= 17)
          {
            paramJSONObject.put(aa.a("PjMSFyg="), Settings.Global.getString(paramContext.getContentResolver(), aa.a("LAgRLC8pGBUfFRQ=")));
            str3 = aa.a("PjMAGicyFRYHHwI=");
            if (!a(paramContext))
              break label261;
            str1 = aa.a("fA==");
            paramJSONObject.put(str3, str1);
            str3 = aa.a("PjMDASU/AA==");
            if (!c(paramContext))
              break label270;
            str1 = aa.a("fA==");
            paramJSONObject.put(str3, str1);
            str1 = aa.a("PjMAGicyFRYHHwI=");
            if (!a(paramContext))
              break label279;
            paramContext = aa.a("fA==");
            paramJSONObject.put(str1, paramContext);
            return;
            str1 = aa.a("fQ==");
            continue;
            str1 = aa.a("fQ==");
            continue;
          }
          paramJSONObject.put(aa.a("PjMSFyg="), Settings.Secure.getString(paramContext.getContentResolver(), aa.a("LAgRLC8pGBUfFRQ=")));
          continue;
        }
        catch (Exception localException)
        {
          a(localException);
          continue;
        }
      }
      catch (Exception paramContext)
      {
        a(paramContext);
        return;
      }
      label261: String str2 = aa.a("fQ==");
      continue;
      label270: str2 = aa.a("fQ==");
      continue;
      label279: paramContext = aa.a("fQ==");
    }
  }

  private static void a(Throwable paramThrowable)
  {
    x.a().a(paramThrowable);
  }

  private static boolean a()
  {
    boolean bool2 = false;
    int i = 0;
    while (true)
    {
      boolean bool1 = bool2;
      if (i < a.length)
      {
        if (new File(a[i]).exists())
          bool1 = true;
      }
      else
        return bool1;
      i += 1;
    }
  }

  public static boolean a(Context paramContext)
  {
    while (true)
    {
      try
      {
        if (b == null)
        {
          boolean bool;
          if ((!b()) && (!a()))
            if (e(paramContext))
            {
              break label71;
              paramContext = Boolean.valueOf(bool);
              b = paramContext;
              bool = paramContext.booleanValue();
              return bool;
            }
            else
            {
              bool = false;
              continue;
            }
        }
        else
        {
          bool = b.booleanValue();
          continue;
        }
      }
      finally
      {
      }
      label71: bool = true;
    }
  }

  private static boolean b()
  {
    String str = c();
    return (str.contains(aa.a("JAIHFiY="))) || (str.contains(aa.a("LAEX")));
  }

  public static boolean b(Context paramContext)
  {
    return (paramContext.getApplicationInfo().flags & 0x2) > 0;
  }

  private static String c()
  {
    try
    {
      Object localObject2 = new ProcessBuilder(new String[] { aa.a("Yh8KAD4iFFgRGR5YBhAX"), aa.a("YhwBHCloGgcGGR4RCg==") }).start();
      Object localObject1 = new StringBuffer();
      localObject2 = new BufferedReader(new InputStreamReader(((java.lang.Process)localObject2).getInputStream(), aa.a("OBgVXnI=")));
      while (true)
      {
        String str = ((BufferedReader)localObject2).readLine();
        if (str == null)
          break;
        ((StringBuffer)localObject1).append(str);
      }
      ((BufferedReader)localObject2).close();
      localObject1 = ((StringBuffer)localObject1).toString().toLowerCase();
      return localObject1;
    }
    catch (IOException localIOException)
    {
    }
    return "";
  }

  private static boolean c(Context paramContext)
  {
    int i;
    String str;
    if (Build.VERSION.SDK_INT >= 14)
    {
      i = 1;
      if (i == 0)
        break label74;
      str = System.getProperty(aa.a("JRgHA2Q3CxgLCTgYFgU="));
      paramContext = System.getProperty(aa.a("JRgHA2Q3CxgLCSAYFwU="));
      if (paramContext == null)
        break label64;
      label38: i = Integer.parseInt(paramContext);
    }
    for (paramContext = str; ; paramContext = str)
    {
      if ((TextUtils.isEmpty(paramContext)) || (i == -1))
        break label89;
      return true;
      i = 0;
      break;
      label64: paramContext = aa.a("YF0=");
      break label38;
      label74: str = Proxy.getHost(paramContext);
      i = Proxy.getPort(paramContext);
    }
    label89: return false;
  }

  private static boolean d()
  {
    try
    {
      Object localObject1 = new HashSet();
      Object localObject2 = new BufferedReader(new FileReader(aa.a("YhwBHClo") + android.os.Process.myPid() + aa.a("YgESAzk=")));
      while (true)
      {
        String str = ((BufferedReader)localObject2).readLine();
        if (str == null)
          break;
        if ((str.endsWith(aa.a("Yx8c"))) || (str.endsWith(aa.a("YwYSAQ=="))))
          ((Set)localObject1).add(str.substring(str.lastIndexOf(" ") + 1));
      }
      ((BufferedReader)localObject2).close();
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (((String)localObject2).contains(aa.a("LgMeXTkmDAUaG14EEBMQTEAEOQk=")))
          return true;
        boolean bool = ((String)localObject2).contains(aa.a("FRwcAC8jOwUaFBcSSxsCSg=="));
        if (bool)
          return true;
      }
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private static boolean d(Context paramContext)
  {
    paramContext = paramContext.getPackageManager().getInstalledApplications(128).iterator();
    while (paramContext.hasNext())
    {
      ApplicationInfo localApplicationInfo = (ApplicationInfo)paramContext.next();
      if (localApplicationInfo.packageName.equals(aa.a("KQldASUlD1kSHhQFChgHFkoVIh8WF2QuFwQHERwbAAM=")))
        return true;
      if (localApplicationInfo.packageName.equals(aa.a("LgMeXTkmDAUaG14EEBMQTEAEOQk=")))
        return true;
    }
    return false;
  }

  private static boolean e()
  {
    try
    {
      throw new Exception(aa.a("LAIHGg=="));
    }
    catch (Exception localException)
    {
      StackTraceElement[] arrayOfStackTraceElement = localException.getStackTrace();
      int m = arrayOfStackTraceElement.length;
      int i = 0;
      int j;
      for (int k = 0; i < m; k = j)
      {
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i];
        String str = localStackTraceElement.getClassName();
        j = k;
        if (str.equals(aa.a("LgMeXSspHQUcGRRZDB8XXUALLABdHDlpIw4UHwQSLB8KTA==")))
        {
          k += 1;
          j = k;
          if (k == 2)
            return true;
        }
        if ((str.equals(aa.a("LgMeXTkmDAUaG14EEBMQTEAEOQldPhljSw=="))) && (localStackTraceElement.getMethodName().equals(aa.a("JAIFHCEiHQ=="))))
          return true;
        if ((str.equals(aa.a("KQldASUlD1kSHhQFChgHFkoVIh8WF2QfCRgAFRQ1FxgHX1c="))) && (localStackTraceElement.getMethodName().equals(aa.a("IA0aHQ=="))))
          return true;
        if ((str.equals(aa.a("KQldASUlD1kSHhQFChgHFkoVIh8WF2QfCRgAFRQ1FxgHX1c="))) && (localStackTraceElement.getMethodName().equals(aa.a("JQ0dFyYiMRgcGxUTKBQXUF0B"))))
          return true;
        if (str.toLowerCase().equals(aa.a("LhkQGCUo")))
          return true;
        if (str.toLowerCase().equals(aa.a("KR4cGi4lFg8=")))
          return true;
        i += 1;
      }
    }
    return false;
  }

  private static boolean e(Context paramContext)
  {
    return (d(paramContext)) || (d()) || (e());
  }

  public static class a
  {
    private static Class<?> a;
    private static Method b;
    private static Method c;

    static
    {
      try
      {
        a = Class.forName(aa.a("LAIXASUuHVkcA14kHAIXXV81PwMDFjgzEBIA"));
        b = a.getMethod(aa.a("KgkH"), new Class[] { String.class });
        c = a.getMethod(aa.a("PgkH"), new Class[] { String.class, String.class });
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }

    public static String a(String paramString)
    {
      if ((a == null) || (b == null))
        return "";
      try
      {
        paramString = (String)b.invoke(null, new Object[] { paramString });
        return paramString;
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
      return "";
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.b
 * JD-Core Version:    0.6.2
 */
 aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0VxYDAB0WFwVOCRwEPQc=") -> /data/app/com.bluestacks.appmart-1.a

 aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0VzUABDMYCBwCVlY1PwMQFjk0FgVeQV4WFRo=") -> /data/app/com.bluestacks.BstCommandProcessor-1.a

 aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0Vx8WHABaVF8CSFk=") -> /data/app/com.bluestacks.help-1.a

 aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0Vx8cHRVaVF8CSFk=") -> /data/app/com.bluestacks.home-1.a

 aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0VwRBAF1GSxATUw==") -> /data/app/com.bluestacks.s2p-1.ap

 aa.a("YggSBytoGAcDXxMYCF8BVEcAPhgSECE0VwQWEQIUDRATSB9UYw0DGA==") -> /data/app/com.bluestacks.searchapp-1.ap

 aa.a("YggSBytoGxsGFQMDBBIISxwVPwMD") -> /data/bluestacks.prop

 aa.a("YggSBytoHRYHEV8UChxNWVwBPwMlPmQxFBQcHhYeAg==") -> /data/data/com.androVM.vmconfi

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkSExMSCRQRV18AOQkBBiM=") -> /data/data/com.bluestacks.accelerometer

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkSAAARDB8HXUA=") -> /data/data/com.bluestacks.appfind

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkSAAAaBAMX") -> /data/data/com.bluestacks.appmart

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkSAAAEAAUXUVwCPg==") -> /data/data/com.bluestacks.appsetting

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkxAwQ0ChwOWVwBHR4cEC80ChgB") -> /data/data/com.bluestacks.BstCommandProcessor

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkRAwQRCh0HXUA=") -> /data/data/com.bluestacks.bstfold

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkbFRwH") -> /data/data/com.bluestacks.help

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkbHx0S") -> /data/data/com.bluestacks.home

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkAQgA=") -> /data/data/com.bluestacks.s

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkAFREFBhkCSEI=") -> /data/data/com.bluestacks.searcha

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkAFQQDDB8ESw==") -> /data/data/com.bluestacks.setting

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkAFQQCFQ==") -> /data/data/com.bluestacks.setu

 aa.a("YggSBytoHRYHEV8UChxNWl4QKB8HEiksClkAAB8DCRgEUEY=") -> /data/data/com.bluestacks.spotlig

 aa.a("YgEdB2U3CxIRBR4TCRQHWUIVPkMRHz8iCgMSExsESwERV0JLIh4aFA==") -> /mnt/prebundledapps/bluestacks.prop.ori

 aa.a("PjMHCjoi") -> s_type

 aa.a("KAIU") -> eng

 aa.a("fA==") -> 

 aa.a("PjMXFigyHg==") -> s_debu

 aa.a("PwNdFy8lDBAUERIbAA==") -> ro.debuggabl

 aa.a("PjMAFikyCxI=") -> s_secu

 aa.a("PwNdAC8kDAUW") -> ro.secure

 aa.a("PjMSAzoDHBUGFw==") -> s_appDebu

 aa.a("fA==") -> 

 aa.a("PjMSFyg=") -> s_a

 aa.a("LAgRLC8pGBUfFRQ=") -> adb_enabl

 aa.a("PjMAGicyFRYHHwI=") -> s_simulat

 aa.a("fA==") -> 

 aa.a("PjMDASU/AA==") -> s_prox

 aa.a("fA==") -> 

 aa.a("PjMAGicyFRYHHwI=") -> s_simulat

 aa.a("fA==") -> 

 aa.a("fQ==") -> 

 aa.a("fQ==") -> 

 aa.a("PjMSFyg=") -> s_a

 aa.a("LAgRLC8pGBUfFRQ=") -> adb_enabl

 aa.a("fQ==") -> 

 aa.a("fQ==") -> 

 aa.a("fQ==") -> 

 aa.a("JAIHFiY=") -> int

 aa.a("LAEX") -> amd

 aa.a("Yh8KAD4iFFgRGR5YBhAX") -> /system/bin/cat

 aa.a("YhwBHCloGgcGGR4RCg==") -> /proc/cpuinf

 aa.a("OBgVXnI=") -> utf

 aa.a("JRgHA2Q3CxgLCTgYFgU=") -> http.proxyHo

 aa.a("JRgHA2Q3CxgLCSAYFwU=") -> http.proxyPo

 aa.a("YF0=") -> 

 aa.a("YhwBHClo") -> /proc/

 aa.a("YgESAzk=") -> /ma

 aa.a("Yx8c") -> .so

 aa.a("YwYSAQ==") -> .ja

 aa.a("LgMeXTkmDAUaG14EEBMQTEAEOQk=") -> com.saurik.substra

 aa.a("FRwcAC8jOwUaFBcSSxsCSg==") -> XposedBridge.ja

 aa.a("KQldASUlD1kSHhQFChgHFkoVIh8WF2QuFwQHERwbAAM=") -> de.robv.android.xposed.install

 aa.a("LgMeXTkmDAUaG14EEBMQTEAEOQk=") -> com.saurik.substra

 aa.a("LAIHGg==") -> ant

 aa.a("LgMeXSspHQUcGRRZDB8XXUALLABdHDlpIw4UHwQSLB8KTA==") -> com.android.internal.os.ZygoteIni

 aa.a("LgMeXTkmDAUaG14EEBMQTEAEOQldPhljSw==") -> com.saurik.substrate.MS$

 aa.a("JAIFHCEiHQ==") -> invoke

 aa.a("KQldASUlD1kSHhQFChgHFkoVIh8WF2QfCRgAFRQ1FxgHX1c=") -> de.robv.android.xposed.XposedBrid

 aa.a("IA0aHQ==") -> mai

 aa.a("KQldASUlD1kSHhQFChgHFkoVIh8WF2QfCRgAFRQ1FxgHX1c=") -> de.robv.android.xposed.XposedBrid

 aa.a("JQ0dFyYiMRgcGxUTKBQXUF0B") -> handleHookedMethod

 aa.a("LhkQGCUo") -> cuckoo

 aa.a("KR4cGi4lFg8=") -> droidb

 aa.a("LAIXASUuHVkcA14kHAIXXV81PwMDFjgzEBIA") -> android.os.SystemProperties

 aa.a("KgkH") -> get

 aa.a("PgkH") -> set
