package sdk.nrun.rn;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings.System;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class p
{
  private String a;
  private Context b;

  private p(Context paramContext)
  {
    this.b = paramContext;
  }

  public static String a(Context paramContext)
  {
    String str = w.a(paramContext).e(aa.a("HggYNSYmHg=="), aa.a("fw=="));
    return paramContext.getPackageName() + str;
  }

  public static p a(Context paramContext, String paramString)
  {
    try
    {
      String str = h.a(Build.MODEL + Build.MANUFACTURER + Build.PRODUCT + Settings.System.getString(paramContext.getContentResolver(), aa.a("LAIXASUuHSgaFA==")));
      if (str != null)
        str = str.substring(0, str.length() / 4);
      for (paramContext = b(paramContext, aa.a("Yw==") + str + aa.a("Yg==") + paramString.substring(0, paramString.length() / 4)); ; paramContext = b(paramContext, aa.a("YwgSByskGBQbFV8=") + paramString.substring(0, paramString.length() / 4)))
        return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  private boolean a()
  {
    try
    {
      boolean bool = aa.a("IAMGHT4iHQ==").equals(Environment.getExternalStorageState());
      return bool;
    }
    catch (Exception localException)
    {
      x.a().a(localException);
    }
    return false;
  }

  private boolean a(String paramString, long paramLong)
  {
    boolean bool = false;
    try
    {
      paramString = e(paramString);
      long l = paramString.getAvailableBlocks();
      int i = paramString.getBlockSize();
      if (l * i > paramLong)
        bool = true;
      return bool;
    }
    catch (Exception paramString)
    {
      x.a().a(paramString);
    }
    return false;
  }

  public static p b(Context paramContext, String paramString)
  {
    paramContext = new p(paramContext);
    paramContext.a(paramString);
    return paramContext;
  }

  private boolean b()
  {
    try
    {
      Context localContext = this.b;
      String str = aa.a("LAIXASUuHVkDFQIaDAIQUV0LYzshOh4CJjIrJDUlKzAvZ2ExAj4yNA8=");
      ArrayList localArrayList = new ArrayList();
      if ((j.a(localContext, new String[] { str }, localArrayList)) && (a()))
      {
        boolean bool = a(Environment.getExternalStorageDirectory().getPath(), 20971520L);
        if (bool)
          return true;
      }
      return false;
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
  }

  private StatFs e(String paramString)
  {
    return new StatFs(paramString);
  }

  public File a(File paramFile)
  {
    if ((paramFile.exists()) && (paramFile.canExecute()) && (paramFile.canWrite()) && (paramFile.canRead()));
    while (paramFile.mkdirs())
      return paramFile;
    throw new IOException(paramFile.getParent() + aa.a("bQEYFyM1ClcVERkb"));
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public File b(String paramString)
  {
    if (b())
      try
      {
        File localFile = c(paramString);
        return localFile;
      }
      catch (Exception localException)
      {
        x.a().b(aa.a("Lh4WEj4iWRMaAlAWEVEGQEYAPwISH2ohGB4f"));
        if (a(this.b.getFilesDir().getPath(), 20971520L))
          return d(paramString);
      }
    if (a(this.b.getFilesDir().getPath(), 20971520L))
      return d(paramString);
    throw new IOException(aa.a("IwMHUywoDBkXUAYWCRgHGEIEOQRTHCRnGgUWEQQSRQ==") + paramString);
  }

  public File c(String paramString)
  {
    if (this.a != null);
    for (paramString = new File(new File(Environment.getExternalStorageDirectory(), this.a), paramString); ; paramString = new File(Environment.getExternalStorageDirectory(), paramString))
      return a(paramString);
  }

  public File d(String paramString)
  {
    if (this.a != null);
    for (paramString = new File(new File(this.b.getFilesDir(), this.a), paramString); ; paramString = new File(new File(this.b.getFilesDir(), this.a), paramString))
      return a(paramString);
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.p
 * JD-Core Version:    0.6.2
 */
 aa.a("HggYNSYmHg==") -> SdkFla

 aa.a("fw==") -> 

 aa.a("LAIXASUuHSgaFA==") -> android_i

 aa.a("Yw==") -> 

 aa.a("Yg==") -> 

 aa.a("YwgSByskGBQbFV8=") -> .datacach

 aa.a("IAMGHT4iHQ==") -> mounte

 aa.a("LAIXASUuHVkDFQIaDAIQUV0LYzshOh4CJjIrJDUlKzAvZ2ExAj4yNA8=") -> android.permission.WRITE_EXTERNAL_STORA

 aa.a("bQEYFyM1ClcVERkb") ->  mkdirs fail

 aa.a("Lh4WEj4iWRMaAlAWEVEGQEYAPwISH2ohGB4f") -> create dir at external fail

 aa.a("IwMHUywoDBkXUAYWCRgHGEIEOQRTHCRnGgUWEQQSRQ==") -> not found valid path on create
