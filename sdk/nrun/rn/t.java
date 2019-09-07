package sdk.nrun.rn;

import android.content.Context;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Build;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class t
{
  private static LocalServerSocket a;

  public Boolean a(final Context paramContext, Object paramObject)
  {
    try
    {
      paramContext = new LocalServerSocket(h.a(Build.MODEL + paramObject));
      a = paramContext;
      new Thread(new Runnable()
      {
        public void run()
        {
          while (true)
            try
            {
              paramContext.accept();
            }
            catch (IOException localIOException)
            {
            }
        }
      }).start();
      return Boolean.valueOf(true);
    }
    catch (IOException paramContext)
    {
    }
    return Boolean.valueOf(false);
  }

  public void b(Context paramContext, Object paramObject)
  {
    if (a != null);
    try
    {
      a.close();
      a = null;
      return;
    }
    catch (IOException paramContext)
    {
    }
  }

  public Boolean c(Context paramContext, final Object paramObject)
  {
    paramContext = new FutureTask(new Callable()
    {
      public Boolean a()
      {
        try
        {
          LocalSocket localLocalSocket = new LocalSocket();
          localLocalSocket.connect(new LocalSocketAddress(h.a(Build.MODEL + paramObject)));
          localLocalSocket.close();
          return Boolean.valueOf(false);
        }
        catch (Exception localException)
        {
        }
        return Boolean.valueOf(true);
      }
    });
    new Thread(paramContext).start();
    try
    {
      paramContext = (Boolean)paramContext.get();
      return paramContext;
    }
    catch (Exception paramContext)
    {
    }
    return Boolean.valueOf(true);
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.t
 * JD-Core Version:    0.6.2
 */