package sdk.nrun.rn;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.net.Proxy;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.File;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class f
{
  private Context a;
  private g.i b;

  f(Context paramContext, g.i parami)
  {
    this.a = paramContext;
    this.b = parami;
  }

  boolean a()
  {
    try
    {
      BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
      if (localBluetoothAdapter == null)
        return true;
    }
    catch (Exception localException)
    {
      this.b.a(localException);
    }
    return false;
  }

  boolean b()
  {
    Object localObject = (SensorManager)this.a.getSystemService(aa.a("PgkdACU1"));
    if (localObject != null);
    for (localObject = ((SensorManager)localObject).getDefaultSensor(5); ; localObject = null)
      return localObject == null;
  }

  boolean c()
  {
    if (Build.VERSION.SDK_INT >= 17)
      if (Settings.Secure.getInt(this.a.getContentResolver(), aa.a("KQkFFiYoCRoWHgQoFhQXTFsLKh8sFiQmGxsWFA=="), 0) <= 0);
    while (Settings.Secure.getInt(this.a.getContentResolver(), aa.a("KQkFFiYoCRoWHgQoFhQXTFsLKh8sFiQmGxsWFA=="), 0) > 0)
    {
      return true;
      return false;
    }
    return false;
  }

  boolean d()
  {
    boolean bool = false;
    Object localObject = Build.TAGS;
    if ((localObject != null) && (((String)localObject).contains(aa.a("OQkAB2csHA4A"))));
    int k;
    for (int i = 1; ; i = 0)
    {
      localObject = new String[10];
      localObject[0] = aa.a("Yh8KAD4iFFgSAABYNgQTXUAQPgkBXSs3Eg==");
      localObject[1] = aa.a("Yh8RGiRoCgI=");
      localObject[2] = aa.a("Yh8KAD4iFFgRGR5YFgQ=");
      localObject[3] = aa.a("Yh8KAD4iFFgLEhkZSgIW");
      localObject[4] = aa.a("YggSBytoFRgQERxYHRMKVh0WOA==");
      localObject[5] = aa.a("YggSBytoFRgQERxYBxgNF0EQ");
      localObject[6] = aa.a("Yh8KAD4iFFgAFF8PBxgNF0EQ");
      localObject[7] = aa.a("Yh8KAD4iFFgRGR5YAxAKVEEEKwlcAD8=");
      localObject[8] = aa.a("YggSBytoFRgQERxYFgQ=");
      localObject[9] = aa.a("Yh8GXCguF1gABQ==");
      int m = localObject.length;
      int j = 0;
      k = 0;
      while (j < m)
      {
        if (new File(localObject[j]).exists())
          k = 1;
        j += 1;
      }
    }
    if ((i != 0) || (k != 0))
      bool = true;
    return bool;
  }

  boolean e()
  {
    Object localObject = new IntentFilter(aa.a("LAIXASUuHVkaHgQSCwVNWVERJAMdXQgGLSM2IikoJjkidnUgCQ=="));
    localObject = this.a.registerReceiver(null, (IntentFilter)localObject);
    if (localObject == null);
    int j;
    do
    {
      int i;
      do
      {
        return false;
        i = ((Intent)localObject).getIntExtra(aa.a("PhgSBz80"), -1);
        j = ((Intent)localObject).getIntExtra(aa.a("PQAGFC0iHQ=="), -1);
      }
      while ((i != 2) && (i != 5));
      if (j == 2)
        return true;
    }
    while (j != 1);
    return false;
  }

  boolean f()
  {
    if (Build.VERSION.SDK_INT >= 17)
      if (Settings.Secure.getInt(this.a.getContentResolver(), aa.a("LAgRLC8pGBUfFRQ="), 0) <= 0);
    while (Settings.Secure.getInt(this.a.getContentResolver(), aa.a("LAgRLC8pGBUfFRQ="), 0) > 0)
    {
      return true;
      return false;
    }
    return false;
  }

  boolean g()
  {
    int i;
    if (Build.VERSION.SDK_INT >= 23)
    {
      KeyguardManager localKeyguardManager = (KeyguardManager)this.a.getSystemService(aa.a("JgkKFD8mCxM="));
      if ((localKeyguardManager.isKeyguardSecure()) || (localKeyguardManager.isDeviceSecure()))
        i = 1;
    }
    while (i == 0)
    {
      return true;
      i = 0;
      continue;
      if (Settings.System.getInt(this.a.getContentResolver(), aa.a("IQMQGBU3GAMHFQIZOhAWTF0JIg8Y"), 0) == 1)
        i = 1;
      else
        i = 0;
    }
    return false;
  }

  boolean h()
  {
    int i;
    String str1;
    if (Build.VERSION.SDK_INT >= 14)
    {
      i = 1;
      if (i == 0)
        break label71;
      String str2 = System.getProperty(aa.a("JRgHA2Q3CxgLCTgYFgU="));
      str1 = System.getProperty(aa.a("JRgHA2Q3CxgLCSAYFwU="));
      if (str1 == null)
        break label62;
      label36: i = Integer.parseInt(str1);
      str1 = str2;
    }
    while (true)
    {
      if ((TextUtils.isEmpty(str1)) || (i == -1))
        break label90;
      return true;
      i = 0;
      break;
      label62: str1 = aa.a("YF0=");
      break label36;
      label71: str1 = Proxy.getHost(this.a);
      i = Proxy.getPort(this.a);
    }
    label90: return false;
  }

  boolean i()
  {
    try
    {
      Object localObject = NetworkInterface.getNetworkInterfaces();
      if (localObject != null)
      {
        localObject = Collections.list((Enumeration)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          NetworkInterface localNetworkInterface = (NetworkInterface)((Iterator)localObject).next();
          if ((localNetworkInterface.isUp()) && (localNetworkInterface.getInterfaceAddresses().size() != 0))
            if (!aa.a("ORkdQw==").equals(localNetworkInterface.getName()))
            {
              boolean bool = aa.a("PRwDQw==").equals(localNetworkInterface.getName());
              if (!bool)
                break;
            }
            else
            {
              return true;
            }
        }
      }
    }
    catch (Throwable localThrowable)
    {
      this.b.a(localThrowable);
    }
    return false;
  }

  boolean j()
  {
    if (Build.VERSION.SDK_INT < 9);
    while (true)
    {
      return false;
      int i;
      if (Build.VERSION.SDK_INT < 21)
        i = Camera.getNumberOfCameras();
      while (i <= 0)
      {
        return true;
        try
        {
          Object localObject = (CameraManager)this.a.getSystemService(aa.a("Lg0eFjgm"));
          if (localObject == null)
            break label75;
          localObject = ((CameraManager)localObject).getCameraIdList();
          if (localObject == null)
            break label75;
          i = localObject.length;
        }
        catch (CameraAccessException localCameraAccessException)
        {
          i = 1;
        }
        catch (Exception localException)
        {
          i = 1;
        }
        continue;
        label75: i = 0;
      }
    }
  }

  boolean k()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 26)
        return false;
      Account[] arrayOfAccount = AccountManager.get(this.a).getAccounts();
      int j = arrayOfAccount.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = arrayOfAccount[i];
        this.b.a(aa.a("LA8QHD8pDVkdER0SWA==") + ((Account)localObject).name);
        this.b.a(aa.a("LA8QHD8pDVkHCQASWA==") + ((Account)localObject).type);
        localObject = ((Account)localObject).type.toLowerCase();
        if (((String)localObject).contains(aa.a("LgMeXS0oFhAfFQ==")))
          break label173;
        boolean bool = ((String)localObject).contains(aa.a("Kw0QFigoFhw="));
        if (bool)
          break label173;
        i += 1;
      }
      return true;
    }
    catch (Exception localException)
    {
      this.b.a(localException);
    }
    label173: return false;
  }

  // ERROR //
  boolean l()
  {
    // Byte code:
    //   0: ldc 73
    //   2: ldc_w 307
    //   5: invokestatic 39	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   8: iconst_1
    //   9: anewarray 309	java/lang/Class
    //   12: dup
    //   13: iconst_0
    //   14: ldc 81
    //   16: aastore
    //   17: invokevirtual 313	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   20: astore_1
    //   21: aload_1
    //   22: iconst_1
    //   23: invokevirtual 319	java/lang/reflect/Method:setAccessible	(Z)V
    //   26: aload_1
    //   27: new 73	android/os/Build
    //   30: dup
    //   31: invokespecial 320	android/os/Build:<init>	()V
    //   34: iconst_1
    //   35: anewarray 4	java/lang/Object
    //   38: dup
    //   39: iconst_0
    //   40: ldc_w 322
    //   43: invokestatic 39	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   46: aastore
    //   47: invokevirtual 326	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   50: checkcast 81	java/lang/String
    //   53: astore_1
    //   54: aload_1
    //   55: invokevirtual 294	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   58: pop
    //   59: aload_1
    //   60: ldc_w 328
    //   63: invokestatic 39	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   66: invokevirtual 238	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   69: ifne +16 -> 85
    //   72: aload_1
    //   73: ldc_w 330
    //   76: invokestatic 39	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   79: invokevirtual 85	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   82: ifeq +59 -> 141
    //   85: iconst_1
    //   86: ireturn
    //   87: astore_2
    //   88: ldc_w 332
    //   91: astore_1
    //   92: aload_0
    //   93: getfield 17	sdk/nrun/rn/f:b	Lsdk/nrun/rn/g$i;
    //   96: aload_2
    //   97: invokeinterface 32 2 0
    //   102: goto -43 -> 59
    //   105: astore_2
    //   106: ldc_w 332
    //   109: astore_1
    //   110: aload_0
    //   111: getfield 17	sdk/nrun/rn/f:b	Lsdk/nrun/rn/g$i;
    //   114: aload_2
    //   115: invokeinterface 32 2 0
    //   120: goto -61 -> 59
    //   123: astore_2
    //   124: ldc_w 332
    //   127: astore_1
    //   128: aload_0
    //   129: getfield 17	sdk/nrun/rn/f:b	Lsdk/nrun/rn/g$i;
    //   132: aload_2
    //   133: invokeinterface 32 2 0
    //   138: goto -79 -> 59
    //   141: iconst_0
    //   142: ireturn
    //   143: astore_2
    //   144: goto -16 -> 128
    //   147: astore_2
    //   148: goto -38 -> 110
    //   151: astore_2
    //   152: goto -60 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   0	54	87	java/lang/NoSuchMethodException
    //   0	54	105	java/lang/reflect/InvocationTargetException
    //   0	54	123	java/lang/IllegalAccessException
    //   54	59	143	java/lang/IllegalAccessException
    //   54	59	147	java/lang/reflect/InvocationTargetException
    //   54	59	151	java/lang/NoSuchMethodException
  }

  int m()
  {
    int i;
    if (Build.VERSION.SDK_INT >= 21)
    {
      i = ((BatteryManager)this.a.getSystemService(aa.a("Lw0HBy81ABoSHhEQAAM="))).getIntProperty(4);
      this.b.a(aa.a("Lw0HBy81AFdOUA==") + i);
      return i;
    }
    Object localObject = new IntentFilter(aa.a("LAIXASUuHVkaHgQSCwVNWVERJAMdXQgGLSM2IikoJjkidnUgCQ=="));
    localObject = this.a.registerReceiver(null, (IntentFilter)localObject);
    if (localObject != null)
    {
      i = ((Intent)localObject).getIntExtra(aa.a("IQkFFiY="), 0);
      this.b.a(aa.a("Lw0HBy81AFcfFQYSCVFeGA==") + i);
      return i;
    }
    return 100;
  }

  int n()
  {
    Iterator localIterator = this.a.getPackageManager().getInstalledApplications(8192).iterator();
    int i = 0;
    int j;
    if (localIterator.hasNext())
      if ((((ApplicationInfo)localIterator.next()).flags & 0x2) != 0)
      {
        j = 1;
        label49: if (j == 0)
          break label67;
        i += 1;
      }
    label67: 
    while (true)
    {
      break;
      j = 0;
      break label49;
      return i;
    }
  }

  boolean o()
  {
    Object localObject = ((SensorManager)this.a.getSystemService(aa.a("PgkdACU1"))).getDefaultSensor(8);
    if (localObject == null)
      return true;
    String str = ((Sensor)localObject).getName();
    localObject = ((Sensor)localObject).getVendor();
    if ((TextUtils.isEmpty(str)) || (TextUtils.isEmpty((CharSequence)localObject)))
      return true;
    str = str.toLowerCase();
    localObject = str.toLowerCase();
    return (str.contains(aa.a("KgkdCicoDR4cHg=="))) || (str.contains(aa.a("KgMfFywuCh8="))) || (((String)localObject).contains(aa.a("KgkdCicoGx4fFQ=="))) || (((String)localObject).contains(aa.a("OQQWUyspHQUcGRRXCgEGVhIWIhkBEC9nCQUcGhUUEQ==")));
  }

  int p()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 23)
      {
        if (this.a.checkSelfPermission(aa.a("LAIXASUuHVkDFQIaDAIQUV0LYy0wMA8UKigwPzElNjQ8dH0mDDg6PAQ=")) == 0)
        {
          List localList = ((TelephonyManager)this.a.getSystemService(aa.a("PQQcHS8="))).getNeighboringCellInfo();
          if (localList != null)
            return localList.size();
        }
      }
      else
      {
        int i = ((TelephonyManager)this.a.getSystemService(aa.a("PQQcHS8="))).getNeighboringCellInfo().size();
        return i;
      }
    }
    catch (Exception localException)
    {
      this.b.a(aa.a("KgkHPS8uHh8RHwI0AB0Pe10QIxhTFjg1FgU="));
    }
    return 1;
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.f
 * JD-Core Version:    0.6.2
 */
 aa.a("PgkdACU1") -> sensor

 aa.a("KQkFFiYoCRoWHgQoFhQXTFsLKh8sFiQmGxsWFA==") -> development_settings_enable

 aa.a("KQkFFiYoCRoWHgQoFhQXTFsLKh8sFiQmGxsWFA==") -> development_settings_enable

 aa.a("OQkAB2csHA4A") -> test-keys

 aa.a("Yh8KAD4iFFgSAABYNgQTXUAQPgkBXSs3Eg==") -> /system/app/Superuser.ap

 aa.a("Yh8RGiRoCgI=") -> /sbin/

 aa.a("Yh8KAD4iFFgRGR5YFgQ=") -> /system/bin/

 aa.a("Yh8KAD4iFFgLEhkZSgIW") -> /system/xbin/su

 aa.a("YggSBytoFRgQERxYHRMKVh0WOA==") -> /data/local/xbin/s

 aa.a("YggSBytoFRgQERxYBxgNF0EQ") -> /data/local/bin/su

 aa.a("Yh8KAD4iFFgAFF8PBxgNF0EQ") -> /system/sd/xbin/su

 aa.a("Yh8KAD4iFFgRGR5YAxAKVEEEKwlcAD8=") -> /system/bin/failsafe/

 aa.a("YggSBytoFRgQERxYFgQ=") -> /data/local/

 aa.a("Yh8GXCguF1gABQ==") -> /su/bin/s

 aa.a("LAIXASUuHVkaHgQSCwVNWVERJAMdXQgGLSM2IikoJjkidnUgCQ==") -> android.intent.action.BATTERY_CHANGE

 aa.a("PhgSBz80") -> status

 aa.a("PQAGFC0iHQ==") -> plugge

 aa.a("LAgRLC8pGBUfFRQ=") -> adb_enabl

 aa.a("LAgRLC8pGBUfFRQ=") -> adb_enabl

 aa.a("JgkKFD8mCxM=") -> keygua

 aa.a("IQMQGBU3GAMHFQIZOhAWTF0JIg8Y") -> lock_pattern_autolock

 aa.a("JRgHA2Q3CxgLCTgYFgU=") -> http.proxyHo

 aa.a("JRgHA2Q3CxgLCSAYFwU=") -> http.proxyPo

 aa.a("YF0=") -> 

 aa.a("ORkdQw==") -> tun

 aa.a("PRwDQw==") -> ppp

 aa.a("Lg0eFjgm") -> camera

 aa.a("LA8QHD8pDVkdER0SWA==") -> account.name

 aa.a("LA8QHD8pDVkHCQASWA==") -> account.type

 aa.a("LgMeXS0oFhAfFQ==") -> com.googl

 aa.a("Kw0QFigoFhw=") -> facebo

 aa.a("Lw0HBy81ABoSHhEQAAM=") -> batterymanag

 aa.a("Lw0HBy81AFdOUA==") -> battery =

 aa.a("LAIXASUuHVkaHgQSCwVNWVERJAMdXQgGLSM2IikoJjkidnUgCQ==") -> android.intent.action.BATTERY_CHANGE

 aa.a("IQkFFiY=") -> lev

 aa.a("Lw0HBy81AFcfFQYSCVFeGA==") -> battery level =

 aa.a("PgkdACU1") -> sensor

 aa.a("KgkdCicoDR4cHg==") -> genymotio

 aa.a("KgMfFywuCh8=") -> goldfi

 aa.a("KgkdCicoGx4fFQ==") -> genymobil

 aa.a("OQQWUyspHQUcGRRXCgEGVhIWIhkBEC9nCQUcGhUUEQ==") -> the android open source projec

 aa.a("LAIXASUuHVkDFQIaDAIQUV0LYy0wMA8UKigwPzElNjQ8dH0mDDg6PAQ=") -> android.permission.ACCESS_COARSE_LOCATI

 aa.a("PQQcHS8=") -> pho

 aa.a("PQQcHS8=") -> pho

 aa.a("KgkHPS8uHh8RHwI0AB0Pe10QIxhTFjg1FgU=") -> getNeighborCellCount err
