package sdk.nrun.rn;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class m
{
  public static BufferedReader a(InputStream paramInputStream)
  {
    return new BufferedReader(new InputStreamReader(paramInputStream));
  }

  public static void a(File paramFile1, File paramFile2)
  {
    paramFile1 = new FileInputStream(paramFile1);
    try
    {
      b(paramFile1, paramFile2);
      return;
    }
    finally
    {
      paramFile1.close();
    }
    throw paramFile2;
  }

  // ERROR //
  public static void a(InputStream paramInputStream, File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aload 4
    //   7: astore_2
    //   8: aload_1
    //   9: invokevirtual 42	java/io/File:exists	()Z
    //   12: ifne +35 -> 47
    //   15: aload 4
    //   17: astore_2
    //   18: aload_1
    //   19: invokevirtual 46	java/io/File:getParentFile	()Ljava/io/File;
    //   22: invokevirtual 42	java/io/File:exists	()Z
    //   25: ifne +14 -> 39
    //   28: aload 4
    //   30: astore_2
    //   31: aload_1
    //   32: invokevirtual 46	java/io/File:getParentFile	()Ljava/io/File;
    //   35: invokevirtual 49	java/io/File:mkdirs	()Z
    //   38: pop
    //   39: aload 4
    //   41: astore_2
    //   42: aload_1
    //   43: invokevirtual 52	java/io/File:createNewFile	()Z
    //   46: pop
    //   47: aload 4
    //   49: astore_2
    //   50: aload_1
    //   51: invokevirtual 55	java/io/File:canWrite	()Z
    //   54: ifne +70 -> 124
    //   57: aload 4
    //   59: astore_2
    //   60: new 57	java/io/IOException
    //   63: dup
    //   64: new 59	java/lang/StringBuilder
    //   67: dup
    //   68: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   71: ldc 63
    //   73: invokestatic 68	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   76: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: aload_1
    //   80: invokevirtual 76	java/io/File:getPath	()Ljava/lang/String;
    //   83: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: ldc 78
    //   88: invokestatic 68	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   91: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokespecial 84	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   100: athrow
    //   101: astore_0
    //   102: aload_3
    //   103: astore_2
    //   104: new 57	java/io/IOException
    //   107: dup
    //   108: aload_0
    //   109: invokespecial 87	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   112: athrow
    //   113: astore_0
    //   114: aload_2
    //   115: ifnull +7 -> 122
    //   118: aload_2
    //   119: invokevirtual 90	java/io/FileOutputStream:close	()V
    //   122: aload_0
    //   123: athrow
    //   124: aload 4
    //   126: astore_2
    //   127: new 89	java/io/FileOutputStream
    //   130: dup
    //   131: aload_1
    //   132: invokespecial 91	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   135: astore_1
    //   136: aload_0
    //   137: aload_1
    //   138: invokestatic 94	sdk/nrun/rn/m:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   141: aload_1
    //   142: ifnull +7 -> 149
    //   145: aload_1
    //   146: invokevirtual 90	java/io/FileOutputStream:close	()V
    //   149: return
    //   150: astore_0
    //   151: aload_1
    //   152: astore_2
    //   153: goto -39 -> 114
    //   156: astore_0
    //   157: aload_1
    //   158: astore_2
    //   159: goto -55 -> 104
    //
    // Exception table:
    //   from	to	target	type
    //   8	15	101	java/lang/Exception
    //   18	28	101	java/lang/Exception
    //   31	39	101	java/lang/Exception
    //   42	47	101	java/lang/Exception
    //   50	57	101	java/lang/Exception
    //   60	101	101	java/lang/Exception
    //   127	136	101	java/lang/Exception
    //   8	15	113	finally
    //   18	28	113	finally
    //   31	39	113	finally
    //   42	47	113	finally
    //   50	57	113	finally
    //   60	101	113	finally
    //   104	113	113	finally
    //   127	136	113	finally
    //   136	141	150	finally
    //   136	141	156	java/lang/Exception
  }

  public static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte[4096];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      if (i == -1)
        break;
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }

  public static boolean a(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      String[] arrayOfString = paramFile.list();
      if (arrayOfString != null)
      {
        int i = 0;
        while (i < arrayOfString.length)
        {
          if (!a(new File(paramFile, arrayOfString[i])))
            return false;
          i += 1;
        }
      }
    }
    return paramFile.delete();
  }

  public static String b(InputStream paramInputStream)
  {
    paramInputStream = new InputStreamReader(paramInputStream);
    StringBuffer localStringBuffer = new StringBuffer();
    char[] arrayOfChar = new char[4096];
    while (true)
    {
      int i = paramInputStream.read(arrayOfChar, 0, arrayOfChar.length);
      if (i <= 0)
        break;
      localStringBuffer.append(arrayOfChar, 0, i);
    }
    return localStringBuffer.toString();
  }

  public static void b(InputStream paramInputStream, File paramFile)
  {
    try
    {
      if (!paramFile.exists())
      {
        if ((paramFile.getParentFile() != null) && (!paramFile.getParentFile().exists()))
          paramFile.getParentFile().mkdirs();
        paramFile.createNewFile();
      }
      FileOutputStream localFileOutputStream;
      if (paramFile.length() != paramInputStream.available())
        localFileOutputStream = new FileOutputStream(paramFile);
      try
      {
        FileLock localFileLock = localFileOutputStream.getChannel().lock();
        if (paramFile.length() != paramInputStream.available())
        {
          a(paramInputStream, localFileOutputStream);
          localFileLock.release();
        }
        localFileOutputStream.close();
        return;
      }
      finally
      {
        paramInputStream = finally;
        localFileOutputStream.close();
        throw paramInputStream;
      }
    }
    finally
    {
    }
    throw paramInputStream;
  }

  public static byte[] c(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    a(paramInputStream, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.m
 * JD-Core Version:    0.6.2
 */