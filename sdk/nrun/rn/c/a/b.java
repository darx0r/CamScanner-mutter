package sdk.nrun.rn.c.a;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.c.g;
import sdk.nrun.rn.e;
import sdk.nrun.rn.n.a;
import sdk.nrun.rn.n.b;

public class b extends a
{
  private int a;

  public b(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.a = paramInt;
  }

  private a b(String paramString)
  {
    if (paramString == null);
    a locala;
    do
    {
      return null;
      paramString = paramString.split(aa.a("YA=="));
      locala = new a();
      if (paramString.length > 1)
      {
        locala.a = paramString[0];
        locala.b = paramString[1];
        return locala;
      }
    }
    while (paramString.length <= 0);
    locala.a = paramString[0];
    return locala;
  }

  InputStream a(String paramString)
  {
    InputStream localInputStream = super.a(paramString);
    while (true)
    {
      try
      {
        paramString = b(Uri.parse(paramString).getQueryParameter(aa.a("KAIQJzM3HA==")));
        if (paramString == null)
          return new n.b(localInputStream, this.a);
        if (aa.a("KAIQ").equals(paramString.a))
        {
          if (paramString.b == null)
            break label203;
          i = Integer.parseInt(paramString.b) ^ 0x35C777B4;
          paramString = new n.b(localInputStream, i);
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        throw new g(paramString);
      }
      if (aa.a("IwkE").equals(paramString.a))
        if (paramString.b == null)
          break label197;
      label197: for (int i = Integer.parseInt(paramString.b) ^ 0x35C777B4; ; i = 897554)
      {
        return new n.a(localInputStream, i);
        if (aa.a("Ph8X").equals(paramString.a))
          return e.a(localInputStream, paramString.b.getBytes());
        if (aa.a("Ih4a").equals(paramString.a))
          return localInputStream;
        paramString = new n.b(localInputStream, this.a);
        return paramString;
      }
      label203: i = 897554;
    }
  }

  public class a
  {
    String a;
    String b;

    public a()
    {
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.a.b
 * JD-Core Version:    0.6.2
 */
 aa.a("YA==") -> 

 aa.a("KAIQJzM3HA==") -> encTyp

 aa.a("KAIQ") -> enc

 aa.a("IwkE") -> new

 aa.a("Ph8X") -> ssd

 aa.a("Ih4a") -> ori
