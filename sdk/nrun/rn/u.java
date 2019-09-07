package sdk.nrun.rn;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class u
{
  public static <T> T a(Object paramObject, String paramString)
  {
    try
    {
      paramObject = a(paramObject.getClass(), paramString).a(true).a(paramObject);
      return paramObject;
    }
    catch (InvocationTargetException paramObject)
    {
      paramObject.printStackTrace();
      return null;
    }
    catch (Exception paramObject)
    {
      while (true)
        paramObject.printStackTrace();
    }
  }

  public static <T> T a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = a(Class.forName(paramString1), paramString2).a(true).a(paramString1);
      return paramString1;
    }
    catch (InvocationTargetException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (Exception paramString1)
    {
      while (true)
        paramString1.printStackTrace();
    }
  }

  public static a a(Class<?> paramClass, String paramString)
  {
    return new a(b(paramClass, paramString));
  }

  public static b a(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    return new b(b(paramClass, paramString, paramArrayOfClass));
  }

  public static b a(String paramString1, String paramString2, Class<?>[] paramArrayOfClass)
  {
    return new b(b(Class.forName(paramString1), paramString2, paramArrayOfClass));
  }

  public static boolean a(ClassLoader paramClassLoader1, ClassLoader paramClassLoader2)
  {
    String str = aa.a("PQ0BFiQz");
    return (a(paramClassLoader2, str, a(paramClassLoader1, str))) && (a(paramClassLoader1, str, paramClassLoader2));
  }

  public static boolean a(Object paramObject1, String paramString, Object paramObject2)
  {
    try
    {
      a(paramObject1.getClass(), paramString).a(true).a(paramObject1, paramObject2);
      return true;
    }
    catch (Exception paramObject1)
    {
      paramObject1.printStackTrace();
    }
    return false;
  }

  public static Field b(Class<?> paramClass, String paramString)
  {
    while (true)
    {
      if (paramClass == null)
        return null;
      try
      {
        Field localField = paramClass.getDeclaredField(paramString);
        return localField;
      }
      catch (Exception localException)
      {
        paramClass = paramClass.getSuperclass();
      }
    }
  }

  public static Method b(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    while (true)
    {
      if (paramClass == null)
        return null;
      try
      {
        Method localMethod = paramClass.getDeclaredMethod(paramString, paramArrayOfClass);
        return localMethod;
      }
      catch (Exception localException)
      {
        paramClass = paramClass.getSuperclass();
      }
    }
  }

  public static boolean b(Object paramObject1, String paramString, Object paramObject2)
  {
    Class localClass = paramObject1.getClass();
    boolean bool = false;
    while (true)
    {
      if (localClass != null);
      try
      {
        a(localClass, paramString).a(true).a(paramObject1, paramObject2);
        bool = true;
        label30: localClass = localClass.getSuperclass();
        continue;
        return bool;
      }
      catch (Exception localException)
      {
        break label30;
      }
    }
  }

  public static class a
  {
    private Field a;

    public a(Field paramField)
    {
      this.a = paramField;
    }

    public Object a(Object paramObject)
    {
      return this.a.get(paramObject);
    }

    public a a(boolean paramBoolean)
    {
      this.a.setAccessible(paramBoolean);
      return this;
    }

    public void a(Object paramObject1, Object paramObject2)
    {
      this.a.set(paramObject1, paramObject2);
    }
  }

  public static class b
  {
    private Method a;

    public b(Method paramMethod)
    {
      this.a = paramMethod;
    }

    public Object a(Object paramObject, Object[] paramArrayOfObject)
    {
      return this.a.invoke(paramObject, paramArrayOfObject);
    }

    public b a(boolean paramBoolean)
    {
      this.a.setAccessible(paramBoolean);
      return this;
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.u
 * JD-Core Version:    0.6.2
 */
 aa.a("PQ0BFiQz") -> parent
