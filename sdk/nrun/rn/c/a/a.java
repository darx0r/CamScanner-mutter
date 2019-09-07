package sdk.nrun.rn.c.a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.c.g;
import sdk.nrun.rn.c.j.b;
import sdk.nrun.rn.c.j.c;
import sdk.nrun.rn.h;
import sdk.nrun.rn.m;
import sdk.nrun.rn.p;
import sdk.nrun.rn.w;

public class a
  implements j.b
{
  private Context a;

  public a(Context paramContext)
  {
    this.a = paramContext;
  }

  private j.c b(final String paramString1, final String paramString2)
  {
    try
    {
      InputStream localInputStream = a(paramString1);
      paramString2 = new File(p.a(this.a, h.a(p.a(this.a))).b(h.a(Build.MODEL + aa.a("PQAXHw==")).substring(0, 7)), paramString2);
      if (!paramString2.getParentFile().exists())
        paramString2.getParentFile().mkdirs();
      if (!paramString2.exists())
        paramString2.createNewFile();
      m.a(localInputStream, paramString2);
      localInputStream.close();
      paramString2 = new j.c()
      {
        public Uri a()
        {
          return Uri.parse(paramString1);
        }

        public File b()
        {
          return paramString2;
        }
      };
      return paramString2;
    }
    catch (Exception paramString2)
    {
    }
    throw new g(aa.a("PR4cEC80ClcSAwMSEQJDSF4QKgUdUw==") + paramString1 + aa.a("bQoSGiY="), paramString2);
  }

  InputStream a(String paramString)
  {
    if (paramString == null)
      throw new g(aa.a("PQAGFCMpWQMSAhcSEVEKSxILOAAf"));
    try
    {
      Object localObject = Uri.parse(paramString);
      if (aa.a("LB8AFj40").equals(((Uri)localObject).getScheme()))
        return w.a(this.a, ((Uri)localObject).getPath().substring(1));
      if (aa.a("KwUfFg==").equals(((Uri)localObject).getScheme()))
      {
        localObject = new FileInputStream(new File(((Uri)localObject).getPath()));
        return localObject;
      }
    }
    catch (IOException localIOException)
    {
      throw new g(aa.a("IhwWHWomCgQWBANX") + paramString + aa.a("bQoSGiY="), localIOException);
      throw new g(aa.a("IwMHUzkyCQcBBFAEBhkGVVdF") + localIOException.getScheme());
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new g(aa.a("IhwWHWomCgQWBANX") + paramString + aa.a("bQoSGiY="), localIllegalArgumentException);
    }
  }

  public j.c a(String paramString1, String paramString2)
  {
    return b(paramString1, paramString2);
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.a.a
 * JD-Core Version:    0.6.2
 */
 aa.a("PQAXHw==") -> pld

 aa.a("PR4cEC80ClcSAwMSEQJDSF4QKgUdUw==") -> process assets plugin

 aa.a("bQoSGiY=") ->  fa

 aa.a("PQAGFCMpWQMSAhcSEVEKSxILOAAf") -> plugin target is null

 aa.a("LB8AFj40") -> assets

 aa.a("KwUfFg==") -> fil

 aa.a("IhwWHWomCgQWBANX") -> open assets 

 aa.a("bQoSGiY=") ->  fa

 aa.a("IwMHUzkyCQcBBFAEBhkGVVdF") -> not supprt scheme 

 aa.a("IhwWHWomCgQWBANX") -> open assets 

 aa.a("bQoSGiY=") ->  fa
