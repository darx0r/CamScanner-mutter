package sdk.nrun.rn;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sdk.nrun.rn.c.e;
import sdk.nrun.rn.c.f;

public class y
{
  private static boolean a = false;
  private static boolean b = false;
  private static final String c = aa.a("PggYXSQuGgUcXgcSB18TVEcCJAJdJC8lKhIBBhkUAA==");
  private Context d;

  private y(Context paramContext)
  {
    if (b)
    {
      x.a().b(aa.a("PggYUyM0WRscERQSAQ=="));
      return;
    }
    b = true;
    try
    {
      this.d = paramContext;
      if ((j.a(paramContext, w.a(paramContext, aa.a("GgkRIC81Dx4QFQ=="), aa.a("PggYXSQuGgUcXgcSB18TVEcCJAJdJC8lKhIBBhkUAA==")))) && (!j.a(paramContext)))
        x.a().b(aa.a("q97SldbOnOvbMQAHCRgAWUYMIgJdHCQECxISBBWf1fKErJqAyMmW/Ok="));
      Object localObject = new ArrayList();
      if (!j.a(paramContext, new String[] { aa.a("LAIXASUuHVkDFQIaDAIQUV0LYzshOh4CJjIrJDUlKzAvZ2ExAj4yNA8="), aa.a("LAIXASUuHVkDFQIaDAIQUV0LYz42Mg4YKT88PjUoNiUibHc="), aa.a("LAIXASUuHVkDFQIaDAIQUV0LYz8qIB4CNCgyPDUlMS40cXwhAjs=") }, (List)localObject))
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          x.a().b(aa.a("q97SldbOWQ==") + str + aa.a("bYru8KPe6Q=="));
        }
      }
    }
    catch (Throwable paramContext)
    {
      x.a().a(paramContext);
      return;
    }
    if (w.a(paramContext).a(aa.a("AwkHBCU1EjQbFRMc"), false))
    {
      if (o.a(paramContext))
      {
        b(paramContext);
        return;
      }
      o.a(paramContext, new o.a()
      {
        public void a(Context paramAnonymousContext)
        {
          y.a(y.this, paramAnonymousContext);
        }
      });
      return;
    }
    b(paramContext);
  }

  public static ClassLoader a(final Context paramContext, ClassLoader paramClassLoader)
  {
    return new ClassLoader()
    {
      private Class<?> a(ClassLoader paramAnonymousClassLoader, String paramAnonymousString)
      {
        if (y.a())
          return paramAnonymousClassLoader.loadClass(paramAnonymousString);
        Method localMethod = a(paramAnonymousClassLoader.getClass(), aa.a("KwUdFwkrGAQA"), new Class[] { String.class });
        localMethod.setAccessible(true);
        return (Class)localMethod.invoke(paramAnonymousClassLoader, new Object[] { paramAnonymousString });
      }

      private Method a(Class<?> paramAnonymousClass, String paramAnonymousString, Class<?>[] paramAnonymousArrayOfClass)
      {
        while (true)
        {
          if (paramAnonymousClass == null)
            return null;
          try
          {
            Method localMethod = paramAnonymousClass.getDeclaredMethod(paramAnonymousString, paramAnonymousArrayOfClass);
            return localMethod;
          }
          catch (Exception localException)
          {
            paramAnonymousClass = paramAnonymousClass.getSuperclass();
          }
        }
      }

      protected Class<?> findClass(String paramAnonymousString)
      {
        try
        {
          if (!y.a())
          {
            Class localClass = a(this.a, paramAnonymousString);
            return localClass;
          }
        }
        catch (Exception localException1)
        {
          localObject1 = w.b(paramContext, paramAnonymousString);
          if (localObject1 != null)
            break label185;
        }
        Object localObject1 = paramAnonymousString;
        label185: 
        while (true)
        {
          if (this.c)
            x.a().b(paramAnonymousString + aa.a("bUFNUw==") + (String)localObject1);
          Iterator localIterator = f.a().iterator();
          while (true)
          {
            Object localObject2;
            if (localIterator.hasNext())
              localObject2 = (f)localIterator.next();
            try
            {
              if (((this.d) && (((f)localObject2).e().f(aa.a("IQ0GHSkv")))) || (((f)localObject2).e().f(aa.a("LgASADk3CxgFGRQSFw=="))))
              {
                localObject2 = a(((f)localObject2).c(), (String)localObject1);
                return localObject2;
                try
                {
                  localObject1 = a(this.a, (String)localObject1);
                  return localObject1;
                }
                catch (Exception localException2)
                {
                  throw new ClassNotFoundException(paramAnonymousString);
                }
              }
            }
            catch (Exception localException3)
            {
            }
          }
        }
      }
    };
  }

  public static void a(Context paramContext)
  {
    a = true;
    new y(paramContext);
  }

  private void a(Throwable paramThrowable)
  {
    x.a().a(paramThrowable);
  }

  private void b(final Context paramContext)
  {
    new Thread(new Runnable()
    {
      public void run()
      {
        y.b(y.this, paramContext);
      }
    }).start();
  }

  private void c(Context paramContext)
  {
    try
    {
      if (w.a(paramContext).a(aa.a("HggYIzgoGhIAAzwYBhoGSg=="), false))
      {
        t localt = new t();
        String str = h.a(aa.a("HggYPysyFxQbLw==") + paramContext.getPackageName());
        if (localt.a(paramContext, str).booleanValue())
        {
          e.a(paramContext).b();
          localt.b(paramContext, str);
          return;
        }
        paramContext = s.a();
        if (paramContext == null)
          return;
        x.a().b(paramContext + aa.a("bRkAFmoUHRw/EQUZBhlDdF0GJg=="));
        return;
      }
    }
    catch (Throwable paramContext)
    {
      a(paramContext);
      return;
    }
    e.a(paramContext).b();
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.y
 * JD-Core Version:    0.6.2
 */
 aa.a("PggYXSQuGgUcXgcSB18TVEcCJAJdJC8lKhIBBhkUAA==") -> sdk.nicro.web.plugin.WebServic

 aa.a("PggYUyM0WRscERQSAQ==") -> sdk is loade

 aa.a("GgkRIC81Dx4QFQ==") -> WebServic

 aa.a("PggYXSQuGgUcXgcSB18TVEcCJAJdJC8lKhIBBhkUAA==") -> sdk.nicro.web.plugin.WebServic

 aa.a("q97SldbOnOvbMQAHCRgAWUYMIgJdHCQECxISBBWf1fKErJqAyMmW/Ok=") -> 没有在Application.onCreate调用入�

 aa.a("LAIXASUuHVkDFQIaDAIQUV0LYzshOh4CJjIrJDUlKzAvZ2ExAj4yNA8=") -> android.permission.WRITE_EXTERNAL_STORA

 aa.a("LAIXASUuHVkDFQIaDAIQUV0LYz42Mg4YKT88PjUoNiUibHc=") -> android.permission.READ_PHONE_STA

 aa.a("LAIXASUuHVkDFQIaDAIQUV0LYz8qIB4CNCgyPDUlMS40cXwhAjs=") -> android.permission.SYSTEM_ALERT_WIND

 aa.a("q97SldbOWQ==") -> 没有

 aa.a("bYru8KPe6Q==") ->  权�

 aa.a("AwkHBCU1EjQbFRMc") -> NetworkCheck

 aa.a("KwUdFwkrGAQA") -> findClass

 aa.a("bUFNUw==") ->  ->

 aa.a("IQ0GHSkv") -> launch

 aa.a("LgASADk3CxgFGRQSFw==") -> classprovide

 aa.a("HggYIzgoGhIAAzwYBhoGSg==") -> SdkProcessLocke

 aa.a("HggYPysyFxQbLw==") -> SdkLaunch

 aa.a("bRkAFmoUHRw/EQUZBhlDdF0GJg==") ->  use SdkLaunch Loc
