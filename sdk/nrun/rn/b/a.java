package sdk.nrun.rn.b;

import android.os.SystemClock;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.l;
import sdk.nrun.rn.x;

public class a
{
  private boolean a = false;
  private l b = x.a();
  private long c = -1L;

  private void a(Exception paramException)
  {
    this.b.a(paramException);
  }

  private void a(String paramString)
  {
    this.b.c(paramString);
  }

  // ERROR //
  private byte[] a(boolean paramBoolean, String paramString, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 55	sdk/nrun/rn/b/a$a:a	(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    //   4: astore 6
    //   6: iload_1
    //   7: ifeq +109 -> 116
    //   10: aload 6
    //   12: ldc 57
    //   14: invokestatic 62	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   17: invokevirtual 67	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   20: aload 6
    //   22: iconst_1
    //   23: invokevirtual 71	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   26: aload_3
    //   27: ifnull +112 -> 139
    //   30: aload_3
    //   31: invokeinterface 77 1 0
    //   36: invokeinterface 83 1 0
    //   41: astore 8
    //   43: aload 8
    //   45: invokeinterface 89 1 0
    //   50: ifeq +89 -> 139
    //   53: aload 8
    //   55: invokeinterface 93 1 0
    //   60: checkcast 95	java/lang/String
    //   63: astore 7
    //   65: aload 6
    //   67: aload 7
    //   69: aload_3
    //   70: aload 7
    //   72: invokeinterface 99 2 0
    //   77: checkcast 95	java/lang/String
    //   80: invokevirtual 103	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: goto -40 -> 43
    //   86: astore_2
    //   87: aload_2
    //   88: athrow
    //   89: astore_2
    //   90: iconst_0
    //   91: ifeq +11 -> 102
    //   94: new 105	java/lang/NullPointerException
    //   97: dup
    //   98: invokespecial 106	java/lang/NullPointerException:<init>	()V
    //   101: athrow
    //   102: iconst_0
    //   103: ifeq +11 -> 114
    //   106: new 105	java/lang/NullPointerException
    //   109: dup
    //   110: invokespecial 106	java/lang/NullPointerException:<init>	()V
    //   113: athrow
    //   114: aload_2
    //   115: athrow
    //   116: aload 6
    //   118: ldc 108
    //   120: invokestatic 62	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   123: invokevirtual 67	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   126: goto -100 -> 26
    //   129: astore_2
    //   130: new 48	sdk/nrun/rn/b/b
    //   133: dup
    //   134: aload_2
    //   135: invokespecial 110	sdk/nrun/rn/b/b:<init>	(Ljava/lang/Exception;)V
    //   138: athrow
    //   139: iload_1
    //   140: ifeq +49 -> 189
    //   143: aload 6
    //   145: invokevirtual 114	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   148: astore_3
    //   149: aload 4
    //   151: ifnull +38 -> 189
    //   154: aload 4
    //   156: arraylength
    //   157: ifle +32 -> 189
    //   160: aload_0
    //   161: invokevirtual 116	sdk/nrun/rn/b/a:a	()Z
    //   164: ifeq +83 -> 247
    //   167: new 118	java/io/ByteArrayInputStream
    //   170: dup
    //   171: aload 4
    //   173: invokespecial 121	java/io/ByteArrayInputStream:<init>	([B)V
    //   176: new 123	sdk/nrun/rn/n$c
    //   179: dup
    //   180: aload_3
    //   181: ldc 124
    //   183: invokespecial 127	sdk/nrun/rn/n$c:<init>	(Ljava/io/OutputStream;I)V
    //   186: invokestatic 132	sdk/nrun/rn/m:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   189: aload 6
    //   191: invokevirtual 136	java/net/HttpURLConnection:getResponseCode	()I
    //   194: istore 5
    //   196: iload 5
    //   198: sipush 200
    //   201: if_icmpeq +62 -> 263
    //   204: iload 5
    //   206: sipush 206
    //   209: if_icmpeq +54 -> 263
    //   212: new 48	sdk/nrun/rn/b/b
    //   215: dup
    //   216: new 138	java/lang/StringBuilder
    //   219: dup
    //   220: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   223: aload_2
    //   224: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: ldc 145
    //   229: invokestatic 62	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   232: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: iload 5
    //   237: invokevirtual 148	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   240: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   243: invokespecial 154	sdk/nrun/rn/b/b:<init>	(Ljava/lang/String;)V
    //   246: athrow
    //   247: new 118	java/io/ByteArrayInputStream
    //   250: dup
    //   251: aload 4
    //   253: invokespecial 121	java/io/ByteArrayInputStream:<init>	([B)V
    //   256: aload_3
    //   257: invokestatic 132	sdk/nrun/rn/m:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   260: goto -71 -> 189
    //   263: aload_0
    //   264: invokevirtual 116	sdk/nrun/rn/b/a:a	()Z
    //   267: ifeq +52 -> 319
    //   270: new 156	sdk/nrun/rn/n$b
    //   273: dup
    //   274: aload 6
    //   276: invokevirtual 160	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   279: ldc 124
    //   281: invokespecial 163	sdk/nrun/rn/n$b:<init>	(Ljava/io/InputStream;I)V
    //   284: invokestatic 166	sdk/nrun/rn/m:c	(Ljava/io/InputStream;)[B
    //   287: astore_2
    //   288: aload 6
    //   290: invokevirtual 169	java/net/HttpURLConnection:disconnect	()V
    //   293: iconst_0
    //   294: ifeq +11 -> 305
    //   297: new 105	java/lang/NullPointerException
    //   300: dup
    //   301: invokespecial 106	java/lang/NullPointerException:<init>	()V
    //   304: athrow
    //   305: iconst_0
    //   306: ifeq +11 -> 317
    //   309: new 105	java/lang/NullPointerException
    //   312: dup
    //   313: invokespecial 106	java/lang/NullPointerException:<init>	()V
    //   316: athrow
    //   317: aload_2
    //   318: areturn
    //   319: aload 6
    //   321: invokevirtual 160	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   324: invokestatic 166	sdk/nrun/rn/m:c	(Ljava/io/InputStream;)[B
    //   327: astore_2
    //   328: goto -40 -> 288
    //   331: astore_3
    //   332: goto -27 -> 305
    //   335: astore_3
    //   336: aload_2
    //   337: areturn
    //   338: astore_3
    //   339: goto -237 -> 102
    //   342: astore_3
    //   343: goto -229 -> 114
    //
    // Exception table:
    //   from	to	target	type
    //   0	6	86	sdk/nrun/rn/b/b
    //   10	26	86	sdk/nrun/rn/b/b
    //   30	43	86	sdk/nrun/rn/b/b
    //   43	83	86	sdk/nrun/rn/b/b
    //   116	126	86	sdk/nrun/rn/b/b
    //   143	149	86	sdk/nrun/rn/b/b
    //   154	189	86	sdk/nrun/rn/b/b
    //   189	196	86	sdk/nrun/rn/b/b
    //   212	247	86	sdk/nrun/rn/b/b
    //   247	260	86	sdk/nrun/rn/b/b
    //   263	288	86	sdk/nrun/rn/b/b
    //   288	293	86	sdk/nrun/rn/b/b
    //   319	328	86	sdk/nrun/rn/b/b
    //   0	6	89	finally
    //   10	26	89	finally
    //   30	43	89	finally
    //   43	83	89	finally
    //   87	89	89	finally
    //   116	126	89	finally
    //   130	139	89	finally
    //   143	149	89	finally
    //   154	189	89	finally
    //   189	196	89	finally
    //   212	247	89	finally
    //   247	260	89	finally
    //   263	288	89	finally
    //   288	293	89	finally
    //   319	328	89	finally
    //   0	6	129	java/lang/Exception
    //   10	26	129	java/lang/Exception
    //   30	43	129	java/lang/Exception
    //   43	83	129	java/lang/Exception
    //   116	126	129	java/lang/Exception
    //   143	149	129	java/lang/Exception
    //   154	189	129	java/lang/Exception
    //   189	196	129	java/lang/Exception
    //   212	247	129	java/lang/Exception
    //   247	260	129	java/lang/Exception
    //   263	288	129	java/lang/Exception
    //   288	293	129	java/lang/Exception
    //   319	328	129	java/lang/Exception
    //   297	305	331	java/io/IOException
    //   309	317	335	java/io/IOException
    //   94	102	338	java/io/IOException
    //   106	114	342	java/io/IOException
  }

  private long b()
  {
    return this.c;
  }

  private byte[] b(boolean paramBoolean, String paramString, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    int i = 0;
    while (i < 3)
    {
      a(aa.a("PwkCBi80DVc=") + paramString + aa.a("bUQ=") + (i + 1) + aa.a("ZA=="));
      try
      {
        byte[] arrayOfByte = a(paramBoolean, paramString, paramMap, paramArrayOfByte);
        return arrayOfByte;
      }
      catch (b localb)
      {
        if (i < 2)
        {
          a(localb);
          if (b() > 0L)
            SystemClock.sleep(b());
          i += 1;
        }
        else
        {
          throw localb;
        }
      }
    }
    return null;
  }

  void a(long paramLong)
  {
    this.c = paramLong;
  }

  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public boolean a()
  {
    return this.a;
  }

  public byte[] a(String paramString, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    return b(true, paramString, paramMap, paramArrayOfByte);
  }

  static class a
  {
    private static SSLContext a;

    private static HttpURLConnection b(String paramString)
    {
      try
      {
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
        localHttpURLConnection.setRequestProperty(aa.a("GB8WAWcmHhIdBA=="), aa.a("AAMJGiYrGFhGXkBXTT0KVkcddkwmSGoGFxMBHxkTRUNNChxUdkwWHWcyCkxTPhUPEAJDd1wAbS4GGiYjVjEhN0hETFEiSEIJKDsWEQEuDVhGQ0NZVFFLc3oxACBfUyYuEhJTNxUUDh5KGGQAPx8aHCRoTVlDUD0YBxgPXRI2LAoSASNoTERAXkE="));
        localHttpURLConnection.setReadTimeout(20000);
        localHttpURLConnection.setConnectTimeout(10000);
        localHttpURLConnection.setDoInput(true);
        localHttpURLConnection.setRequestProperty(aa.a("DgMdHS8kDR4cHg=="), aa.a("LgAcAC8="));
        if ((paramString != null) && (paramString.startsWith(aa.a("JRgHAzk="))))
        {
          paramString = (HttpsURLConnection)localHttpURLConnection;
          if (a == null)
          {
            a = SSLContext.getInstance(aa.a("GSAg"));
            SSLContext localSSLContext = a;
            a.c localc = new a.c(null);
            SecureRandom localSecureRandom = new SecureRandom();
            localSSLContext.init(null, new TrustManager[] { localc }, localSecureRandom);
          }
          paramString.setSSLSocketFactory(a.getSocketFactory());
          paramString.setHostnameVerifier(new a.b(null));
        }
        return localHttpURLConnection;
      }
      finally
      {
      }
      throw paramString;
    }
  }

  private static class b
    implements HostnameVerifier
  {
    public boolean verify(String paramString, SSLSession paramSSLSession)
    {
      return true;
    }
  }

  private static class c
    implements X509TrustManager
  {
    public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    {
    }

    public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    {
    }

    public X509Certificate[] getAcceptedIssuers()
    {
      return null;
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.b.a
 * JD-Core Version:    0.6.2
 */
 aa.a("PwkCBi80DVc=") -> reques

 aa.a("bUQ=") -> 

 aa.a("ZA==") -> 

 aa.a("GB8WAWcmHhIdBA==") -> User-agen

 aa.a("AAMJGiYrGFhGXkBXTT0KVkcddkwmSGoGFxMBHxkTRUNNChxUdkwWHWcyCkxTPhUPEAJDd1wAbS4GGiYjVjEhN0hETFEiSEIJKDsWEQEuDVhGQ0NZVFFLc3oxACBfUyYuEhJTNxUUDh5KGGQAPx8aHCRoTVlDUD0YBxgPXRI2LAoSASNoTERAXkE=") -> Mozilla/5.0 (Linux; U; Android 2.2.1; en-us; Nexus One Build/FRG83) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533

 aa.a("DgMdHS8kDR4cHg==") -> Connectio

 aa.a("LgAcAC8=") -> clo

 aa.a("JRgHAzk=") -> htt

 aa.a("GSAg") -> TLS
