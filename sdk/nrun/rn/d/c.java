package sdk.nrun.rn.d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.l;
import sdk.nrun.rn.u;
import sdk.nrun.rn.u.b;
import sdk.nrun.rn.x;

public final class c
  implements SharedPreferences
{
  private static final String a = aa.a("HgQSAS8jKQUWFhUFAB8AXUEsIBwf");
  private static final Object k = new Object();
  private static u.b n;
  private static Object o;
  private final File b;
  private final File c;
  private final int d;
  private Map<String, Object> e;
  private int f = 0;
  private boolean g = false;
  private long h;
  private long i;
  private final Object j = new Object();
  private final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> l = new WeakHashMap();
  private Handler m = new Handler(Looper.getMainLooper());

  public c(File paramFile, int paramInt)
  {
    this.b = paramFile;
    this.c = a(paramFile);
    this.d = paramInt;
    this.g = false;
    this.e = null;
    a();
  }

  static File a(File paramFile)
  {
    return new File(paramFile.getPath() + aa.a("Yw4SGA=="));
  }

  private b a(String paramString)
  {
    b localb2 = b(paramString);
    b localb1 = localb2;
    if (localb2 == null)
    {
      localb2 = d(paramString);
      localb1 = localb2;
      if (localb2 == null)
      {
        localb2 = c(paramString);
        localb1 = localb2;
        if (localb2 == null)
        {
          localb1 = new b();
          paramString = new File(paramString);
          localb1.a = (paramString.lastModified() / 1000L);
          localb1.b = paramString.length();
        }
      }
    }
    return localb1;
  }

  private void a()
  {
    try
    {
      this.g = false;
      new Thread(aa.a("HgQSAS8jKQUWFhUFAB8AXUEsIBwfXiYoGBM="))
      {
        public void run()
        {
          c.a(c.this);
        }
      }
      .start();
      return;
    }
    finally
    {
    }
  }

  static void a(InputStream paramInputStream)
  {
    if (paramInputStream != null);
    try
    {
      paramInputStream.close();
      return;
    }
    catch (RuntimeException paramInputStream)
    {
      throw paramInputStream;
    }
    catch (Exception paramInputStream)
    {
    }
  }

  private static void a(String paramString, Exception paramException)
  {
    x.a().b(paramString);
    x.a().a(paramException);
  }

  // ERROR //
  private void a(c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   4: invokevirtual 189	java/io/File:exists	()Z
    //   7: ifeq +54 -> 61
    //   10: aload_1
    //   11: getfield 191	sdk/nrun/rn/d/c$c:a	Z
    //   14: ifne +9 -> 23
    //   17: aload_1
    //   18: iconst_1
    //   19: invokevirtual 194	sdk/nrun/rn/d/c$c:a	(Z)V
    //   22: return
    //   23: aload_0
    //   24: getfield 98	sdk/nrun/rn/d/c:c	Ljava/io/File;
    //   27: invokevirtual 189	java/io/File:exists	()Z
    //   30: ifne +23 -> 53
    //   33: aload_0
    //   34: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   37: aload_0
    //   38: getfield 98	sdk/nrun/rn/d/c:c	Ljava/io/File;
    //   41: invokevirtual 198	java/io/File:renameTo	(Ljava/io/File;)Z
    //   44: ifne +17 -> 61
    //   47: aload_1
    //   48: iconst_0
    //   49: invokevirtual 194	sdk/nrun/rn/d/c$c:a	(Z)V
    //   52: return
    //   53: aload_0
    //   54: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   57: invokevirtual 201	java/io/File:delete	()Z
    //   60: pop
    //   61: aload_0
    //   62: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   65: invokestatic 204	sdk/nrun/rn/d/c:b	(Ljava/io/File;)Ljava/io/FileOutputStream;
    //   68: astore_2
    //   69: aload_2
    //   70: ifnonnull +73 -> 143
    //   73: aload_1
    //   74: iconst_0
    //   75: invokevirtual 194	sdk/nrun/rn/d/c$c:a	(Z)V
    //   78: return
    //   79: astore_2
    //   80: ldc 206
    //   82: invokestatic 58	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   85: aload_2
    //   86: invokestatic 208	sdk/nrun/rn/d/c:a	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   89: aload_0
    //   90: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   93: invokevirtual 189	java/io/File:exists	()Z
    //   96: ifeq +41 -> 137
    //   99: aload_0
    //   100: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   103: invokevirtual 201	java/io/File:delete	()Z
    //   106: ifne +31 -> 137
    //   109: new 108	java/lang/StringBuilder
    //   112: dup
    //   113: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   116: ldc 210
    //   118: invokestatic 58	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   121: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: aload_0
    //   125: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   128: invokevirtual 213	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 122	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 215	sdk/nrun/rn/d/c:e	(Ljava/lang/String;)V
    //   137: aload_1
    //   138: iconst_0
    //   139: invokevirtual 194	sdk/nrun/rn/d/c$c:a	(Z)V
    //   142: return
    //   143: aload_1
    //   144: getfield 217	sdk/nrun/rn/d/c$c:d	Ljava/util/Map;
    //   147: aload_2
    //   148: invokestatic 222	sdk/nrun/rn/d/d:a	(Ljava/util/Map;Ljava/io/OutputStream;)V
    //   151: aload_2
    //   152: invokestatic 225	sdk/nrun/rn/d/c:a	(Ljava/io/FileOutputStream;)Z
    //   155: pop
    //   156: aload_2
    //   157: invokevirtual 228	java/io/FileOutputStream:close	()V
    //   160: aload_0
    //   161: aload_0
    //   162: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   165: invokevirtual 113	java/io/File:getPath	()Ljava/lang/String;
    //   168: invokespecial 230	sdk/nrun/rn/d/c:a	(Ljava/lang/String;)Lsdk/nrun/rn/d/c$b;
    //   171: astore_2
    //   172: aload_0
    //   173: monitorenter
    //   174: aload_0
    //   175: aload_2
    //   176: getfield 144	sdk/nrun/rn/d/c$b:a	J
    //   179: putfield 232	sdk/nrun/rn/d/c:h	J
    //   182: aload_0
    //   183: aload_2
    //   184: getfield 149	sdk/nrun/rn/d/c$b:b	J
    //   187: putfield 234	sdk/nrun/rn/d/c:i	J
    //   190: aload_0
    //   191: monitorexit
    //   192: aload_0
    //   193: getfield 98	sdk/nrun/rn/d/c:c	Ljava/io/File;
    //   196: invokevirtual 201	java/io/File:delete	()Z
    //   199: pop
    //   200: aload_1
    //   201: iconst_1
    //   202: invokevirtual 194	sdk/nrun/rn/d/c$c:a	(Z)V
    //   205: return
    //   206: astore_2
    //   207: ldc 206
    //   209: invokestatic 58	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   212: aload_2
    //   213: invokestatic 208	sdk/nrun/rn/d/c:a	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   216: goto -127 -> 89
    //   219: astore_2
    //   220: aload_0
    //   221: monitorexit
    //   222: aload_2
    //   223: athrow
    //   224: astore_2
    //   225: goto -33 -> 192
    //
    // Exception table:
    //   from	to	target	type
    //   61	69	79	org/xmlpull/v1/XmlPullParserException
    //   73	78	79	org/xmlpull/v1/XmlPullParserException
    //   143	160	79	org/xmlpull/v1/XmlPullParserException
    //   160	174	79	org/xmlpull/v1/XmlPullParserException
    //   192	205	79	org/xmlpull/v1/XmlPullParserException
    //   222	224	79	org/xmlpull/v1/XmlPullParserException
    //   61	69	206	java/io/IOException
    //   73	78	206	java/io/IOException
    //   143	160	206	java/io/IOException
    //   160	174	206	java/io/IOException
    //   192	205	206	java/io/IOException
    //   222	224	206	java/io/IOException
    //   174	192	219	finally
    //   220	222	219	finally
    //   160	174	224	java/lang/Exception
    //   222	224	224	java/lang/Exception
  }

  private void a(final c paramc, final Runnable paramRunnable)
  {
    int i2 = 1;
    paramc = new Runnable()
    {
      public void run()
      {
        synchronized (c.g(c.this))
        {
          c.a(c.this, paramc);
        }
        synchronized (c.this)
        {
          c.h(c.this);
          if (paramRunnable != null)
            paramRunnable.run();
          return;
          localObject2 = finally;
          throw localObject2;
        }
      }
    };
    int i1;
    if (paramRunnable == null)
      i1 = 1;
    while (i1 != 0)
      try
      {
        if (this.f == 1);
        for (i1 = i2; ; i1 = 0)
        {
          if (i1 == 0)
            break label65;
          paramc.run();
          return;
          i1 = 0;
          break;
        }
      }
      finally
      {
      }
    label65: b.a().execute(paramc);
  }

  private static boolean a(FileOutputStream paramFileOutputStream)
  {
    if (paramFileOutputStream != null);
    try
    {
      paramFileOutputStream.getFD().sync();
      return true;
    }
    catch (IOException paramFileOutputStream)
    {
    }
    return false;
  }

  private static FileOutputStream b(File paramFile)
  {
    try
    {
      FileOutputStream localFileOutputStream1 = new FileOutputStream(paramFile);
      return localFileOutputStream1;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      if (!paramFile.getParentFile().mkdir())
      {
        e(aa.a("DgMGHy4pXgNTEwISBAUGGFYMPwkQByU1AFcVHwJXNhkCSlcBHR4WFS81HBkQFQNXAxgPXRI=") + paramFile);
        return null;
      }
      try
      {
        FileOutputStream localFileOutputStream2 = new FileOutputStream(paramFile);
        return localFileOutputStream2;
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
        a(aa.a("DgMGHy4pXgNTEwISBAUGGGENLB4WFxo1HBEWAhUZBhQQGFQMIQlT") + paramFile, localFileNotFoundException2);
      }
    }
    return null;
  }

  private b b(String paramString)
  {
    try
    {
      if (n == null)
        n = u.a(aa.a("LAIXASUuHVkACQMDABxNd0E="), aa.a("PhgSBw=="), new Class[] { String.class }).a(true);
      paramString = n.a(null, new Object[] { paramString });
      b localb = new b();
      localb.a = ((Long)u.a(paramString, aa.a("PhgsHj4uFBI="))).longValue();
      localb.b = ((Long)u.a(paramString, aa.a("PhgsACM9HA=="))).longValue();
      return localb;
    }
    catch (Throwable paramString)
    {
    }
    return null;
  }

  // ERROR //
  private void b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 6
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 71	sdk/nrun/rn/d/c:g	Z
    //   11: ifeq +6 -> 17
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield 98	sdk/nrun/rn/d/c:c	Ljava/io/File;
    //   21: invokevirtual 189	java/io/File:exists	()Z
    //   24: ifeq +23 -> 47
    //   27: aload_0
    //   28: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   31: invokevirtual 201	java/io/File:delete	()Z
    //   34: pop
    //   35: aload_0
    //   36: getfield 98	sdk/nrun/rn/d/c:c	Ljava/io/File;
    //   39: aload_0
    //   40: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   43: invokevirtual 198	java/io/File:renameTo	(Ljava/io/File;)Z
    //   46: pop
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_0
    //   50: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   53: invokevirtual 189	java/io/File:exists	()Z
    //   56: ifeq +51 -> 107
    //   59: aload_0
    //   60: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   63: invokevirtual 327	java/io/File:canRead	()Z
    //   66: ifne +41 -> 107
    //   69: new 108	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   76: ldc_w 329
    //   79: invokestatic 58	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   82: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload_0
    //   86: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   89: invokevirtual 213	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   92: ldc_w 331
    //   95: invokestatic 58	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   98: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 122	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokestatic 215	sdk/nrun/rn/d/c:e	(Ljava/lang/String;)V
    //   107: aload_0
    //   108: aload_0
    //   109: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   112: invokevirtual 113	java/io/File:getPath	()Ljava/lang/String;
    //   115: invokespecial 230	sdk/nrun/rn/d/c:a	(Ljava/lang/String;)Lsdk/nrun/rn/d/c$b;
    //   118: astore 4
    //   120: aload_0
    //   121: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   124: invokevirtual 327	java/io/File:canRead	()Z
    //   127: istore_1
    //   128: aload 6
    //   130: astore_2
    //   131: iload_1
    //   132: ifeq +37 -> 169
    //   135: new 333	java/io/BufferedInputStream
    //   138: dup
    //   139: new 335	java/io/FileInputStream
    //   142: dup
    //   143: aload_0
    //   144: getfield 93	sdk/nrun/rn/d/c:b	Ljava/io/File;
    //   147: invokespecial 336	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   150: sipush 16384
    //   153: invokespecial 339	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   156: astore_3
    //   157: aload_3
    //   158: astore 5
    //   160: aload_3
    //   161: invokestatic 342	sdk/nrun/rn/d/d:a	(Ljava/io/InputStream;)Ljava/util/HashMap;
    //   164: astore_2
    //   165: aload_3
    //   166: invokestatic 344	sdk/nrun/rn/d/c:a	(Ljava/io/InputStream;)V
    //   169: aload_2
    //   170: astore_3
    //   171: aload 4
    //   173: astore_2
    //   174: aload_0
    //   175: monitorenter
    //   176: aload_0
    //   177: iconst_1
    //   178: putfield 71	sdk/nrun/rn/d/c:g	Z
    //   181: aload_3
    //   182: ifnull +74 -> 256
    //   185: aload_0
    //   186: aload_3
    //   187: putfield 102	sdk/nrun/rn/d/c:e	Ljava/util/Map;
    //   190: aload_0
    //   191: aload_2
    //   192: getfield 144	sdk/nrun/rn/d/c$b:a	J
    //   195: putfield 232	sdk/nrun/rn/d/c:h	J
    //   198: aload_0
    //   199: aload_2
    //   200: getfield 149	sdk/nrun/rn/d/c$b:b	J
    //   203: putfield 234	sdk/nrun/rn/d/c:i	J
    //   206: aload_0
    //   207: invokevirtual 347	java/lang/Object:notifyAll	()V
    //   210: aload_0
    //   211: monitorexit
    //   212: return
    //   213: astore_2
    //   214: aload_0
    //   215: monitorexit
    //   216: aload_2
    //   217: athrow
    //   218: astore_2
    //   219: aload_0
    //   220: monitorexit
    //   221: aload_2
    //   222: athrow
    //   223: astore_2
    //   224: aconst_null
    //   225: astore_3
    //   226: aload_3
    //   227: astore 5
    //   229: ldc_w 349
    //   232: invokestatic 58	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   235: aload_2
    //   236: invokestatic 208	sdk/nrun/rn/d/c:a	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   239: aload_3
    //   240: invokestatic 344	sdk/nrun/rn/d/c:a	(Ljava/io/InputStream;)V
    //   243: aload 6
    //   245: astore_2
    //   246: goto -77 -> 169
    //   249: aload 5
    //   251: invokestatic 344	sdk/nrun/rn/d/c:a	(Ljava/io/InputStream;)V
    //   254: aload_2
    //   255: athrow
    //   256: aload_0
    //   257: new 351	java/util/HashMap
    //   260: dup
    //   261: invokespecial 352	java/util/HashMap:<init>	()V
    //   264: putfield 102	sdk/nrun/rn/d/c:e	Ljava/util/Map;
    //   267: goto -61 -> 206
    //   270: astore_3
    //   271: aconst_null
    //   272: astore_3
    //   273: goto -99 -> 174
    //   276: astore_3
    //   277: aload_2
    //   278: astore_3
    //   279: aload 4
    //   281: astore_2
    //   282: goto -108 -> 174
    //   285: astore_2
    //   286: goto -37 -> 249
    //   289: astore_2
    //   290: goto -64 -> 226
    //   293: astore_2
    //   294: aconst_null
    //   295: astore_3
    //   296: goto -70 -> 226
    //   299: astore_2
    //   300: goto -74 -> 226
    //   303: astore_2
    //   304: aconst_null
    //   305: astore_3
    //   306: aload 4
    //   308: astore_2
    //   309: goto -135 -> 174
    //   312: astore_2
    //   313: aconst_null
    //   314: astore 5
    //   316: goto -67 -> 249
    //
    // Exception table:
    //   from	to	target	type
    //   176	181	213	finally
    //   185	206	213	finally
    //   206	212	213	finally
    //   214	216	213	finally
    //   256	267	213	finally
    //   7	16	218	finally
    //   17	47	218	finally
    //   47	49	218	finally
    //   219	221	218	finally
    //   135	157	223	org/xmlpull/v1/XmlPullParserException
    //   107	120	270	java/lang/Exception
    //   165	169	276	java/lang/Exception
    //   160	165	285	finally
    //   229	239	285	finally
    //   160	165	289	org/xmlpull/v1/XmlPullParserException
    //   135	157	293	java/io/IOException
    //   160	165	299	java/io/IOException
    //   120	128	303	java/lang/Exception
    //   239	243	303	java/lang/Exception
    //   249	256	303	java/lang/Exception
    //   135	157	312	finally
  }

  private b c(String paramString)
  {
    try
    {
      if (n == null)
      {
        o = Class.forName(aa.a("LAIXASUuHVkcA14xDB0GbUYMIR9XNSMrHCQHEQQCFg==")).newInstance();
        n = u.a(aa.a("LAIXASUuHVkcA14xDB0GbUYMIR8="), aa.a("KgkHNSMrHCQHEQQCFg=="), new Class[] { String.class, o.getClass() }).a(true);
      }
      n.a(null, new Object[] { paramString, o });
      paramString = new b();
      paramString.a = ((Long)u.a(o, aa.a("IBgaHi8="))).longValue();
      paramString.b = ((Long)u.a(o, aa.a("PgUJFg=="))).longValue();
      return paramString;
    }
    catch (Throwable paramString)
    {
    }
    return null;
  }

  private void c()
  {
    if (!this.g);
    while (!this.g)
      try
      {
        wait();
      }
      catch (InterruptedException localInterruptedException)
      {
      }
  }

  private b d(String paramString)
  {
    try
    {
      if (n == null)
      {
        o = u.a(aa.a("IQURECU1HFkaH147DBMAV0AA"), aa.a("Ih8="));
        n = u.a(o.getClass(), aa.a("PhgSBw=="), new Class[] { String.class }).a(true);
      }
      paramString = n.a(o, new Object[] { paramString });
      b localb = new b();
      localb.a = ((Long)u.a(paramString, aa.a("PhgsHj4uFBI="))).longValue();
      localb.b = ((Long)u.a(paramString, aa.a("PhgsACM9HA=="))).longValue();
      return localb;
    }
    catch (Throwable paramString)
    {
    }
    return null;
  }

  private static void e(String paramString)
  {
    x.a().b(paramString);
  }

  public boolean contains(String paramString)
  {
    try
    {
      c();
      boolean bool = this.e.containsKey(paramString);
      return bool;
    }
    finally
    {
    }
    throw paramString;
  }

  public SharedPreferences.Editor edit()
  {
    try
    {
      c();
      return new a();
    }
    finally
    {
    }
  }

  public Map<String, ?> getAll()
  {
    try
    {
      c();
      HashMap localHashMap = new HashMap(this.e);
      return localHashMap;
    }
    finally
    {
    }
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    try
    {
      c();
      paramString = (Boolean)this.e.get(paramString);
      if (paramString != null)
        paramBoolean = paramString.booleanValue();
      return paramBoolean;
    }
    finally
    {
    }
    throw paramString;
  }

  public float getFloat(String paramString, float paramFloat)
  {
    try
    {
      c();
      paramString = (Float)this.e.get(paramString);
      if (paramString != null)
        paramFloat = paramString.floatValue();
      return paramFloat;
    }
    finally
    {
    }
    throw paramString;
  }

  public int getInt(String paramString, int paramInt)
  {
    try
    {
      c();
      paramString = (Integer)this.e.get(paramString);
      if (paramString != null)
        paramInt = paramString.intValue();
      return paramInt;
    }
    finally
    {
    }
    throw paramString;
  }

  public long getLong(String paramString, long paramLong)
  {
    try
    {
      c();
      paramString = (Long)this.e.get(paramString);
      if (paramString != null)
        paramLong = paramString.longValue();
      return paramLong;
    }
    finally
    {
    }
    throw paramString;
  }

  public String getString(String paramString1, String paramString2)
  {
    while (true)
    {
      try
      {
        c();
        paramString1 = (String)this.e.get(paramString1);
        if (paramString1 != null)
          return paramString1;
      }
      finally
      {
      }
      paramString1 = paramString2;
    }
  }

  public Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    while (true)
    {
      try
      {
        c();
        paramString = (Set)this.e.get(paramString);
        if (paramString != null)
          return paramString;
      }
      finally
      {
      }
      paramString = paramSet;
    }
  }

  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    try
    {
      this.l.put(paramOnSharedPreferenceChangeListener, k);
      return;
    }
    finally
    {
    }
    throw paramOnSharedPreferenceChangeListener;
  }

  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    try
    {
      this.l.remove(paramOnSharedPreferenceChangeListener);
      return;
    }
    finally
    {
    }
    throw paramOnSharedPreferenceChangeListener;
  }

  public final class a
    implements SharedPreferences.Editor
  {
    private final Map<String, Object> b = new HashMap();
    private boolean c = false;

    public a()
    {
    }

    private c.c a()
    {
      c.c localc1 = new c.c(null);
      while (true)
      {
        Object localObject2;
        String str;
        synchronized (c.this)
        {
          if (c.b(c.this) > 0)
            c.a(c.this, new HashMap(c.c(c.this)));
          localc1.d = c.c(c.this);
          c.d(c.this);
          if (c.e(c.this).size() > 0)
          {
            i = 1;
            if (i != 0)
            {
              localc1.b = new ArrayList();
              localc1.c = new HashSet(c.e(c.this).keySet());
            }
            try
            {
              if (this.c)
              {
                if (!c.c(c.this).isEmpty())
                {
                  localc1.a = true;
                  c.c(c.this).clear();
                }
                this.c = false;
              }
              Iterator localIterator = this.b.entrySet().iterator();
              if (!localIterator.hasNext())
                break;
              localObject2 = (Map.Entry)localIterator.next();
              str = (String)((Map.Entry)localObject2).getKey();
              localObject2 = ((Map.Entry)localObject2).getValue();
              if ((localObject2 != this) && (localObject2 != null))
                break label305;
              if (!c.c(c.this).containsKey(str))
                continue;
              c.c(c.this).remove(str);
              localc1.a = true;
              if (i == 0)
                continue;
              localc1.b.add(str);
              continue;
            }
            finally
            {
            }
          }
        }
        int i = 0;
        continue;
        label305: if (c.c(c.this).containsKey(str))
        {
          Object localObject3 = c.c(c.this).get(str);
          if ((localObject3 != null) && (localObject3.equals(localObject2)));
        }
        else
        {
          c.c(c.this).put(str, localObject2);
        }
      }
      this.b.clear();
      return localc2;
    }

    private void a(final c.c paramc)
    {
      if ((paramc.c == null) || (paramc.b == null) || (paramc.b.size() == 0));
      while (true)
      {
        return;
        if (Looper.myLooper() != Looper.getMainLooper())
          break;
        int i = paramc.b.size() - 1;
        while (i >= 0)
        {
          String str = (String)paramc.b.get(i);
          Iterator localIterator = paramc.c.iterator();
          while (localIterator.hasNext())
          {
            SharedPreferences.OnSharedPreferenceChangeListener localOnSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener)localIterator.next();
            if (localOnSharedPreferenceChangeListener != null)
              localOnSharedPreferenceChangeListener.onSharedPreferenceChanged(c.this, str);
          }
          i -= 1;
        }
      }
      c.f(c.this).post(new Runnable()
      {
        public void run()
        {
          c.a.a(c.a.this, paramc);
        }
      });
    }

    public void apply()
    {
      final c.c localc = a();
      Object localObject = new Runnable()
      {
        public void run()
        {
          try
          {
            localc.e.await();
            return;
          }
          catch (InterruptedException localInterruptedException)
          {
          }
        }
      };
      b.a((Runnable)localObject);
      localObject = new Runnable()
      {
        public void run()
        {
          this.a.run();
          b.b(this.a);
        }
      };
      c.a(c.this, localc, (Runnable)localObject);
      a(localc);
    }

    public SharedPreferences.Editor clear()
    {
      try
      {
        this.c = true;
        return this;
      }
      finally
      {
      }
    }

    public boolean commit()
    {
      c.c localc = a();
      c.a(c.this, localc, null);
      try
      {
        localc.e.await();
        a(localc);
        return localc.f;
      }
      catch (InterruptedException localInterruptedException)
      {
      }
      return false;
    }

    public SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
    {
      try
      {
        this.b.put(paramString, Boolean.valueOf(paramBoolean));
        return this;
      }
      finally
      {
      }
      throw paramString;
    }

    public SharedPreferences.Editor putFloat(String paramString, float paramFloat)
    {
      try
      {
        this.b.put(paramString, Float.valueOf(paramFloat));
        return this;
      }
      finally
      {
      }
      throw paramString;
    }

    public SharedPreferences.Editor putInt(String paramString, int paramInt)
    {
      try
      {
        this.b.put(paramString, Integer.valueOf(paramInt));
        return this;
      }
      finally
      {
      }
      throw paramString;
    }

    public SharedPreferences.Editor putLong(String paramString, long paramLong)
    {
      try
      {
        this.b.put(paramString, Long.valueOf(paramLong));
        return this;
      }
      finally
      {
      }
      throw paramString;
    }

    public SharedPreferences.Editor putString(String paramString1, String paramString2)
    {
      try
      {
        this.b.put(paramString1, paramString2);
        return this;
      }
      finally
      {
      }
      throw paramString1;
    }

    public SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
    {
      try
      {
        Map localMap = this.b;
        if (paramSet == null);
        for (paramSet = null; ; paramSet = new HashSet(paramSet))
        {
          localMap.put(paramString, paramSet);
          return this;
        }
      }
      finally
      {
      }
      throw paramString;
    }

    public SharedPreferences.Editor remove(String paramString)
    {
      try
      {
        this.b.put(paramString, this);
        return this;
      }
      finally
      {
      }
      throw paramString;
    }
  }

  class b
  {
    public long a;
    public long b;

    b()
    {
    }
  }

  private static class c
  {
    public boolean a;
    public List<String> b;
    public Set<SharedPreferences.OnSharedPreferenceChangeListener> c;
    public Map<?, ?> d;
    public final CountDownLatch e = new CountDownLatch(1);
    public volatile boolean f = false;

    public void a(boolean paramBoolean)
    {
      this.f = paramBoolean;
      this.e.countDown();
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.d.c
 * JD-Core Version:    0.6.2
 */
 aa.a("HgQSAS8jKQUWFhUFAB8AXUEsIBwf") -> SharedPreferencesImpl

 aa.a("Yw4SGA==") -> .ba

 aa.a("HgQSAS8jKQUWFhUFAB8AXUEsIBwfXiYoGBM=") -> SharedPreferencesImpl-lo

 aa.a("DgMGHy4pXgNTEwISBAUGGFYMPwkQByU1AFcVHwJXNhkCSlcBHR4WFS81HBkQFQNXAxgPXRI=") -> Couldn't create directory for SharedPreferences fil

 aa.a("DgMGHy4pXgNTEwISBAUGGGENLB4WFxo1HBEWAhUZBhQQGFQMIQlT") -> Couldn't create SharedPreferences file 

 aa.a("LAIXASUuHVkACQMDABxNd0E=") -> android.system.

 aa.a("PhgSBw==") -> sta

 aa.a("PhgsHj4uFBI=") -> st_mti

 aa.a("PhgsACM9HA==") -> st_siz

 aa.a("LAIXASUuHVkcA14xDB0GbUYMIR9XNSMrHCQHEQQCFg==") -> android.os.FileUtils$FileStatu

 aa.a("LAIXASUuHVkcA14xDB0GbUYMIR8=") -> android.os.FileUti

 aa.a("KgkHNSMrHCQHEQQCFg==") -> getFileStatu

 aa.a("IBgaHi8=") -> mti

 aa.a("PgUJFg==") -> siz

 aa.a("IQURECU1HFkaH147DBMAV0AA") -> libcore.io.Libcore

 aa.a("Ih8=") -> 

 aa.a("PhgSBw==") -> sta

 aa.a("PhgsHj4uFBI=") -> st_mti

 aa.a("PhgsACM9HA==") -> st_siz
