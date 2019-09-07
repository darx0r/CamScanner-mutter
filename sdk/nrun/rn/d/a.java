package sdk.nrun.rn.d;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;
import sdk.nrun.rn.aa;

public class a
  implements XmlSerializer
{
  private static final String[] a = { aa.a("a09DSA=="), aa.a("a09CSA=="), aa.a("a09BSA=="), aa.a("a09ASA=="), aa.a("a09HSA=="), aa.a("a09GSA=="), aa.a("a09FSA=="), aa.a("a09ESA=="), aa.a("a09LSA=="), aa.a("a09KSA=="), aa.a("a09CQ3E="), aa.a("a09CQnE="), aa.a("a09CQXE="), aa.a("a09CQHE="), aa.a("a09CR3E="), aa.a("a09CRnE="), aa.a("a09CRXE="), aa.a("a09CRHE="), aa.a("a09CS3E="), aa.a("a09CSnE="), aa.a("a09BQ3E="), aa.a("a09BQnE="), aa.a("a09BQXE="), aa.a("a09BQHE="), aa.a("a09BR3E="), aa.a("a09BRnE="), aa.a("a09BRXE="), aa.a("a09BRHE="), aa.a("a09BS3E="), aa.a("a09BSnE="), aa.a("a09AQ3E="), aa.a("a09AQnE="), null, null, aa.a("ax0GHD58"), null, null, null, aa.a("aw0eA3E="), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, aa.a("awAHSA=="), null, aa.a("awsHSA=="), null };
  private static String b = "                                                              ";
  private final char[] c = new char[8192];
  private int d;
  private Writer e;
  private OutputStream f;
  private CharsetEncoder g;
  private ByteBuffer h = ByteBuffer.allocate(8192);
  private boolean i = false;
  private boolean j;
  private int k = 0;
  private boolean l = true;

  private void a()
  {
    int m = this.h.position();
    if (m > 0)
    {
      this.h.flip();
      this.f.write(this.h.array(), 0, m);
      this.h.clear();
    }
  }

  private void a(char paramChar)
  {
    int n = this.d;
    int m = n;
    if (n >= 8191)
    {
      flush();
      m = this.d;
    }
    this.c[m] = paramChar;
    this.d = (m + 1);
  }

  private void a(int paramInt)
  {
    int m = paramInt * 4;
    paramInt = m;
    if (m > b.length())
      paramInt = b.length();
    a(b, 0, paramInt);
  }

  private void a(String paramString)
  {
    a(paramString, 0, paramString.length());
  }

  private void a(String paramString, int paramInt1, int paramInt2)
  {
    int n;
    int m;
    if (paramInt2 > 8192)
    {
      n = paramInt1 + paramInt2;
      if (paramInt1 < n)
      {
        m = paramInt1 + 8192;
        if (m < n);
        for (paramInt2 = 8192; ; paramInt2 = n - paramInt1)
        {
          a(paramString, paramInt1, paramInt2);
          paramInt1 = m;
          break;
        }
      }
    }
    else
    {
      n = this.d;
      m = n;
      if (n + paramInt2 > 8192)
      {
        flush();
        m = this.d;
      }
      paramString.getChars(paramInt1, paramInt1 + paramInt2, this.c, m);
      this.d = (m + paramInt2);
    }
  }

  private void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int n;
    int m;
    if (paramInt2 > 8192)
    {
      n = paramInt1 + paramInt2;
      if (paramInt1 < n)
      {
        m = paramInt1 + 8192;
        if (m < n);
        for (paramInt2 = 8192; ; paramInt2 = n - paramInt1)
        {
          a(paramArrayOfChar, paramInt1, paramInt2);
          paramInt1 = m;
          break;
        }
      }
    }
    else
    {
      n = this.d;
      m = n;
      if (n + paramInt2 > 8192)
      {
        flush();
        m = this.d;
      }
      System.arraycopy(paramArrayOfChar, paramInt1, this.c, m, paramInt2);
      this.d = (m + paramInt2);
    }
  }

  private void b(String paramString)
  {
    int n = 0;
    int i2 = paramString.length();
    int i3 = (char)a.length;
    String[] arrayOfString = a;
    int m = 0;
    if (m < i2)
    {
      int i1 = paramString.charAt(m);
      if (i1 >= i3)
        i1 = n;
      while (true)
      {
        m += 1;
        n = i1;
        break;
        String str = arrayOfString[i1];
        i1 = n;
        if (str != null)
        {
          if (n < m)
            a(paramString, n, m - n);
          i1 = m + 1;
          a(str);
        }
      }
    }
    if (n < m)
      a(paramString, n, m - n);
  }

  private void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i2 = (char)a.length;
    String[] arrayOfString = a;
    int n = paramInt1;
    int m = paramInt1;
    int i1 = m;
    if (i1 < paramInt1 + paramInt2)
    {
      m = paramArrayOfChar[i1];
      if (m >= i2)
        m = n;
      while (true)
      {
        i1 += 1;
        n = m;
        m = i1;
        break;
        String str = arrayOfString[m];
        m = n;
        if (str != null)
        {
          if (n < i1)
            a(paramArrayOfChar, n, i1 - n);
          m = i1 + 1;
          a(str);
        }
      }
    }
    if (n < i1)
      a(paramArrayOfChar, n, i1 - n);
  }

  public XmlSerializer attribute(String paramString1, String paramString2, String paramString3)
  {
    a(' ');
    if (paramString1 != null)
    {
      a(paramString1);
      a(':');
    }
    a(paramString2);
    a(aa.a("cE4="));
    b(paramString3);
    a('"');
    this.l = false;
    return this;
  }

  public void cdsect(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public void comment(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public void docdecl(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public void endDocument()
  {
    flush();
  }

  public XmlSerializer endTag(String paramString1, String paramString2)
  {
    this.k -= 1;
    if (this.j)
      a(aa.a("bUNNeQ=="));
    while (true)
    {
      this.l = true;
      this.j = false;
      return this;
      if ((this.i) && (this.l))
        a(this.k);
      a(aa.a("cUM="));
      if (paramString1 != null)
      {
        a(paramString1);
        a(':');
      }
      a(paramString2);
      a(aa.a("c2Y="));
    }
  }

  public void entityRef(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public void flush()
  {
    if (this.d > 0)
    {
      if (this.f == null)
        break label105;
      CharBuffer localCharBuffer = CharBuffer.wrap(this.c, 0, this.d);
      for (CoderResult localCoderResult = this.g.encode(localCharBuffer, this.h, true); ; localCoderResult = this.g.encode(localCharBuffer, this.h, true))
      {
        if (localCoderResult.isError())
          throw new IOException(localCoderResult.toString());
        if (!localCoderResult.isOverflow())
          break;
        a();
      }
      a();
      this.f.flush();
    }
    while (true)
    {
      this.d = 0;
      return;
      label105: this.e.write(this.c, 0, this.d);
      this.e.flush();
    }
  }

  public int getDepth()
  {
    throw new UnsupportedOperationException();
  }

  public boolean getFeature(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public String getName()
  {
    throw new UnsupportedOperationException();
  }

  public String getNamespace()
  {
    throw new UnsupportedOperationException();
  }

  public String getPrefix(String paramString, boolean paramBoolean)
  {
    throw new UnsupportedOperationException();
  }

  public Object getProperty(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public void ignorableWhitespace(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public void processingInstruction(String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public void setFeature(String paramString, boolean paramBoolean)
  {
    if (paramString.equals(aa.a("JRgHA3BoVg8eHAACCR1NV0ACYhpCXC4oGlgVFREDEAMGSxwNOQEfUCMpHRIdBF0YEAUTTUY=")))
    {
      this.i = true;
      return;
    }
    throw new UnsupportedOperationException();
  }

  public void setOutput(OutputStream paramOutputStream, String paramString)
  {
    if (paramOutputStream == null)
      throw new IllegalArgumentException();
    try
    {
      this.g = Charset.forName(paramString).newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
      this.f = paramOutputStream;
      return;
    }
    catch (IllegalCharsetNameException paramOutputStream)
    {
      throw ((UnsupportedEncodingException)new UnsupportedEncodingException(paramString).initCause(paramOutputStream));
    }
    catch (UnsupportedCharsetException paramOutputStream)
    {
    }
    throw ((UnsupportedEncodingException)new UnsupportedEncodingException(paramString).initCause(paramOutputStream));
  }

  public void setOutput(Writer paramWriter)
  {
    this.e = paramWriter;
  }

  public void setPrefix(String paramString1, String paramString2)
  {
    throw new UnsupportedOperationException();
  }

  public void setProperty(String paramString, Object paramObject)
  {
    throw new UnsupportedOperationException();
  }

  public void startDocument(String paramString, Boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(aa.a("cVMLHiZnDxIBAxkYC0xECRxVakwWHSkoHR4dF01QEAUFFQpCbR8HEiQjGBscHhVKQg=="));
    if (paramBoolean.booleanValue());
    for (paramString = aa.a("NAkA"); ; paramString = aa.a("IwM="))
    {
      a(paramString + aa.a("akxMTUA="));
      this.l = true;
      return;
    }
  }

  public XmlSerializer startTag(String paramString1, String paramString2)
  {
    if (this.j)
      a(aa.a("c2Y="));
    if (this.i)
      a(this.k);
    this.k += 1;
    a('<');
    if (paramString1 != null)
    {
      a(paramString1);
      a(':');
    }
    a(paramString2);
    this.j = true;
    this.l = false;
    return this;
  }

  public XmlSerializer text(String paramString)
  {
    boolean bool2 = false;
    if (this.j)
    {
      a(aa.a("cw=="));
      this.j = false;
    }
    b(paramString);
    if (this.i)
    {
      boolean bool1 = bool2;
      if (paramString.length() > 0)
      {
        bool1 = bool2;
        if (paramString.charAt(paramString.length() - 1) == '\n')
          bool1 = true;
      }
      this.l = bool1;
    }
    return this;
  }

  public XmlSerializer text(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    if (this.j)
    {
      a(aa.a("cw=="));
      this.j = false;
    }
    b(paramArrayOfChar, paramInt1, paramInt2);
    if (this.i)
    {
      if (paramArrayOfChar[(paramInt1 + paramInt2 - 1)] == '\n')
        bool = true;
      this.l = bool;
    }
    return this;
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.d.a
 * JD-Core Version:    0.6.2
 */
 aa.a("a09DSA==") -> &#0

 aa.a("a09CSA==") -> &#1

 aa.a("a09BSA==") -> &#2

 aa.a("a09ASA==") -> &#3

 aa.a("a09HSA==") -> &#4

 aa.a("a09GSA==") -> &#5

 aa.a("a09FSA==") -> &#6

 aa.a("a09ESA==") -> &#7

 aa.a("a09LSA==") -> &#8

 aa.a("a09KSA==") -> &#9

 aa.a("a09CQ3E=") -> &#1

 aa.a("a09CQnE=") -> &#1

 aa.a("a09CQXE=") -> &#1

 aa.a("a09CQHE=") -> &#1

 aa.a("a09CR3E=") -> &#1

 aa.a("a09CRnE=") -> &#1

 aa.a("a09CRXE=") -> &#1

 aa.a("a09CRHE=") -> &#1

 aa.a("a09CS3E=") -> &#1

 aa.a("a09CSnE=") -> &#1

 aa.a("a09BQ3E=") -> &#2

 aa.a("a09BQnE=") -> &#2

 aa.a("a09BQXE=") -> &#2

 aa.a("a09BQHE=") -> &#2

 aa.a("a09BR3E=") -> &#2

 aa.a("a09BRnE=") -> &#2

 aa.a("a09BRXE=") -> &#2

 aa.a("a09BRHE=") -> &#2

 aa.a("a09BS3E=") -> &#2

 aa.a("a09BSnE=") -> &#2

 aa.a("a09AQ3E=") -> &#3

 aa.a("a09AQnE=") -> &#3

 aa.a("ax0GHD58") -> &quot;

 aa.a("aw0eA3E=") -> &am

 aa.a("awAHSA==") -> &lt

 aa.a("awsHSA==") -> &gt

 aa.a("cE4=") -> 

 aa.a("bUNNeQ==") ->  />

 aa.a("cUM=") -> 

 aa.a("c2Y=") -> 

 aa.a("JRgHA3BoVg8eHAACCR1NV0ACYhpCXC4oGlgVFREDEAMGSxwNOQEfUCMpHRIdBF0YEAUTTUY=") -> http://xmlpull.org/v1/doc/features.html#indent-outp

 aa.a("cVMLHiZnDxIBAxkYC0xECRxVakwWHSkoHR4dF01QEAUFFQpCbR8HEiQjGBscHhVKQg==") -> <?xml version='1.0' encoding='utf-8' standalone=

 aa.a("NAkA") -> yes

 aa.a("IwM=") -> 

 aa.a("akxMTUA=") -> ' ?

 aa.a("c2Y=") -> 

 aa.a("cw==") -> 

 aa.a("cw==") -> 
