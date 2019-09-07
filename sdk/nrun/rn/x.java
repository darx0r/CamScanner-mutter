package sdk.nrun.rn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import java.io.PrintWriter;
import java.io.Writer;

public class x
  implements l
{
  private static Handler a = new Handler(Looper.getMainLooper());
  private static l b;
  private l c = new a();

  public static l a()
  {
    try
    {
      if (b == null)
        b = new x();
      l locall = b;
      return locall;
    }
    finally
    {
    }
  }

  public static void a(Context paramContext, final String paramString)
  {
    if (w.d())
      a.post(new Runnable()
      {
        public void run()
        {
          Toast.makeText(this.a, paramString, 1).show();
        }
      });
  }

  public static String b(Throwable paramThrowable)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    paramThrowable.printStackTrace(new PrintWriter(new Writer()
    {
      public void close()
      {
      }

      public void flush()
      {
      }

      public void write(char[] paramAnonymousArrayOfChar, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        this.a.append(paramAnonymousArrayOfChar, paramAnonymousInt1, paramAnonymousInt2);
      }
    }));
    return localStringBuffer.toString();
  }

  public void a(String paramString)
  {
    if (w.d())
      this.c.a(paramString);
  }

  public void a(Throwable paramThrowable)
  {
    if (w.d())
      this.c.a(paramThrowable);
  }

  public void b(String paramString)
  {
    if (w.d())
      this.c.b(paramString);
  }

  public void c(String paramString)
  {
    if (w.d())
      this.c.c(paramString);
  }

  public void d(String paramString)
  {
    if (w.d())
      this.c.d(paramString);
  }

  public class a
    implements l
  {
    private static final String b = aa.a("HggY");

    public a()
    {
    }

    private String b(Throwable paramThrowable)
    {
      return x.b(paramThrowable);
    }

    public void a(String paramString)
    {
      Log.i(b, paramString);
    }

    public void a(Throwable paramThrowable)
    {
      b(b(paramThrowable));
    }

    public void b(String paramString)
    {
      Log.e(b, paramString);
    }

    public void c(String paramString)
    {
      Log.d(b, paramString);
    }

    public void d(String paramString)
    {
      Log.w(b, paramString);
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.x
 * JD-Core Version:    0.6.2
 */
 aa.a("HggY") -> Sdk
