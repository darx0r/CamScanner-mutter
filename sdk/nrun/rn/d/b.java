package sdk.nrun.rn.d;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b
{
  private static final ConcurrentLinkedQueue<Runnable> a = new ConcurrentLinkedQueue();
  private static ExecutorService b = null;

  public static ExecutorService a()
  {
    try
    {
      if (b == null)
        b = Executors.newSingleThreadExecutor();
      ExecutorService localExecutorService = b;
      return localExecutorService;
    }
    finally
    {
    }
  }

  public static void a(Runnable paramRunnable)
  {
    a.add(paramRunnable);
  }

  public static void b(Runnable paramRunnable)
  {
    a.remove(paramRunnable);
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.d.b
 * JD-Core Version:    0.6.2
 */