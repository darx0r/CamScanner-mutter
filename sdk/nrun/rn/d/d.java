package sdk.nrun.rn.d;

import android.util.Xml;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import sdk.nrun.rn.aa;

public class d
{
  private static final String a = aa.a("dw==");

  private static final Object a(XmlPullParser paramXmlPullParser, String paramString)
  {
    Boolean localBoolean = null;
    try
    {
      if (paramString.equals(aa.a("JAIH")))
        return Integer.valueOf(Integer.parseInt(paramXmlPullParser.getAttributeValue(null, aa.a("Ow0fBi8="))));
      if (paramString.equals(aa.a("IQMdFA==")))
        return Long.valueOf(paramXmlPullParser.getAttributeValue(null, aa.a("Ow0fBi8=")));
      if (paramString.equals(aa.a("KwAcEj4=")))
      {
        paramXmlPullParser = new Float(paramXmlPullParser.getAttributeValue(null, aa.a("Ow0fBi8=")));
        return paramXmlPullParser;
      }
    }
    catch (NullPointerException paramXmlPullParser)
    {
      throw new XmlPullParserException(aa.a("AwkWF2oxGBsGFVAWEQURUVAQOQlTGiRnRQ==") + paramString + aa.a("cw=="));
      if (paramString.equals(aa.a("KQMGESYi")))
      {
        paramXmlPullParser = new Double(paramXmlPullParser.getAttributeValue(null, aa.a("Ow0fBi8=")));
        return paramXmlPullParser;
      }
    }
    catch (NumberFormatException paramXmlPullParser)
    {
      throw new XmlPullParserException(aa.a("AwMHUytnFwIeEhUFRRgNGEQEIRkWUyszDQUaEgUDAFEKVhJZ") + paramString + aa.a("cw=="));
    }
    if (paramString.equals(aa.a("LwMcHy8mFw==")))
      localBoolean = Boolean.valueOf(paramXmlPullParser.getAttributeValue(null, aa.a("Ow0fBi8=")));
    return localBoolean;
  }

  public static final Object a(XmlPullParser paramXmlPullParser, String[] paramArrayOfString)
  {
    int i = paramXmlPullParser.getEventType();
    int j;
    do
    {
      if (i == 2)
        return a(paramXmlPullParser, paramArrayOfString, null, false);
      if (i == 3)
        throw new XmlPullParserException(aa.a("GAIWCzoiGgMWFFASCxVDTFMCbQ0HSWo=") + paramXmlPullParser.getName());
      if (i == 4)
        throw new XmlPullParserException(aa.a("GAIWCzoiGgMWFFADAAkXAhI=") + paramXmlPullParser.getText());
      j = paramXmlPullParser.next();
      i = j;
    }
    while (j != 1);
    throw new XmlPullParserException(aa.a("GAIWCzoiGgMWFFASCxVDV1RFKQMQBiciFwM="));
  }

  private static final Object a(XmlPullParser paramXmlPullParser, String[] paramArrayOfString, a parama, boolean paramBoolean)
  {
    String str1 = paramXmlPullParser.getAttributeValue(null, aa.a("Iw0eFg=="));
    String str2 = paramXmlPullParser.getName();
    Object localObject1;
    if (str2.equals(aa.a("IxkfHw==")))
      localObject1 = null;
    int i;
    label249: 
    do
    {
      Object localObject2;
      do
      {
        i = paramXmlPullParser.next();
        if (i == 1)
          break label780;
        if (i != 3)
          break label672;
        if (!paramXmlPullParser.getName().equals(str2))
          break;
        paramArrayOfString[0] = str1;
        return localObject1;
        if (str2.equals(aa.a("PhgBGiQg")))
        {
          parama = "";
          do
            while (true)
            {
              i = paramXmlPullParser.next();
              if (i == 1)
                break label249;
              if (i == 3)
              {
                if (paramXmlPullParser.getName().equals(aa.a("PhgBGiQg")))
                {
                  paramArrayOfString[0] = str1;
                  return parama;
                }
                throw new XmlPullParserException(aa.a("GAIWCzoiGgMWFFASCxVDTFMCbQUdU3Y0DQUaHhdJX1E=") + paramXmlPullParser.getName());
              }
              if (i != 4)
                break;
              parama = parama + paramXmlPullParser.getText();
            }
          while (i != 2);
          throw new XmlPullParserException(aa.a("GAIWCzoiGgMWFFAEERARTBIRLAtTGiRnRQQHAhkZAk9ZGA==") + paramXmlPullParser.getName());
          throw new XmlPullParserException(aa.a("GAIWCzoiGgMWFFASCxVDV1RFKQMQBiciFwNTGR5XWQIXSlsLKlI="));
        }
        localObject2 = a(paramXmlPullParser, str2);
        localObject1 = localObject2;
      }
      while (localObject2 != null);
      if (str2.equals(aa.a("JAIHXis1CxYK")))
      {
        paramXmlPullParser = a(paramXmlPullParser, aa.a("JAIHXis1CxYK"), paramArrayOfString);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      if (str2.equals(aa.a("IQMdFGcmCwUSCQ==")))
      {
        paramXmlPullParser = b(paramXmlPullParser, aa.a("IQMdFGcmCwUSCQ=="), paramArrayOfString);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      if (str2.equals(aa.a("KQMGESYiVBYBAhEO")))
      {
        paramXmlPullParser = c(paramXmlPullParser, aa.a("KQMGESYiVBYBAhEO"), paramArrayOfString);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      if (str2.equals(aa.a("PhgBGiQgVBYBAhEO")))
      {
        paramXmlPullParser = d(paramXmlPullParser, aa.a("PhgBGiQgVBYBAhEO"), paramArrayOfString);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      if (str2.equals(aa.a("LwMcHy8mF1oSAgIWHA==")))
      {
        paramXmlPullParser = e(paramXmlPullParser, aa.a("LwMcHy8mF1oSAgIWHA=="), paramArrayOfString);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      if (str2.equals(aa.a("IA0D")))
      {
        paramXmlPullParser.next();
        if (paramBoolean);
        for (paramXmlPullParser = a(paramXmlPullParser, aa.a("IA0D"), paramArrayOfString, parama); ; paramXmlPullParser = a(paramXmlPullParser, aa.a("IA0D"), paramArrayOfString, parama))
        {
          paramArrayOfString[0] = str1;
          return paramXmlPullParser;
        }
      }
      if (str2.equals(aa.a("IQUABw==")))
      {
        paramXmlPullParser.next();
        paramXmlPullParser = a(paramXmlPullParser, aa.a("IQUABw=="), paramArrayOfString, parama, paramBoolean);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      if (str2.equals(aa.a("PgkH")))
      {
        paramXmlPullParser.next();
        paramXmlPullParser = b(paramXmlPullParser, aa.a("PgkH"), paramArrayOfString, parama, paramBoolean);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      if (parama != null)
      {
        paramXmlPullParser = parama.a(paramXmlPullParser, str2);
        paramArrayOfString[0] = str1;
        return paramXmlPullParser;
      }
      throw new XmlPullParserException(aa.a("GAIYHSUwF1cHERdNRQ==") + str2);
      throw new XmlPullParserException(aa.a("GAIWCzoiGgMWFFASCxVDTFMCbQUdU3Y=") + str2 + aa.a("c1ZT") + paramXmlPullParser.getName());
      if (i == 4)
        throw new XmlPullParserException(aa.a("GAIWCzoiGgMWFFADAAkXGFsLbVA=") + str2 + aa.a("c1ZT") + paramXmlPullParser.getName());
    }
    while (i != 2);
    label672: throw new XmlPullParserException(aa.a("GAIWCzoiGgMWFFAEERARTBIRLAtTGiRnRQ==") + str2 + aa.a("c1ZT") + paramXmlPullParser.getName());
    label780: throw new XmlPullParserException(aa.a("GAIWCzoiGgMWFFASCxVDV1RFKQMQBiciFwNTGR5XWQ==") + str2 + aa.a("cw=="));
  }

  private static final ArrayList a(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString, a parama, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramXmlPullParser.getEventType();
    if (i == 2)
      localArrayList.add(a(paramXmlPullParser, paramArrayOfString, parama, paramBoolean));
    while (i != 3)
    {
      int j = paramXmlPullParser.next();
      i = j;
      if (j != 1)
        break;
      throw new XmlPullParserException(aa.a("CQMQBiciFwNTFR4TABVDWlcDIh4WUw==") + paramString + aa.a("bQkdF2ozGBA="));
    }
    if (paramXmlPullParser.getName().equals(paramString))
      return localArrayList;
    throw new XmlPullParserException(aa.a("CBQDFikzHBNT") + paramString + aa.a("bQkdF2ozGBBTEQRNRQ==") + paramXmlPullParser.getName());
  }

  public static final HashMap<String, ?> a(InputStream paramInputStream)
  {
    XmlPullParser localXmlPullParser = Xml.newPullParser();
    localXmlPullParser.setInput(paramInputStream, Charset.forName(aa.a("GDg1XnI=")).name());
    return (HashMap)a(localXmlPullParser, new String[1]);
  }

  public static final HashMap<String, ?> a(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString, a parama)
  {
    HashMap localHashMap = new HashMap();
    int i = paramXmlPullParser.getEventType();
    if (i == 2)
    {
      localObject = a(paramXmlPullParser, paramArrayOfString, parama, false);
      localHashMap.put(paramArrayOfString[0], localObject);
    }
    while (i != 3)
    {
      Object localObject;
      int j = paramXmlPullParser.next();
      i = j;
      if (j != 1)
        break;
      throw new XmlPullParserException(aa.a("CQMQBiciFwNTFR4TABVDWlcDIh4WUw==") + paramString + aa.a("bQkdF2ozGBA="));
    }
    if (paramXmlPullParser.getName().equals(paramString))
      return localHashMap;
    throw new XmlPullParserException(aa.a("CBQDFikzHBNT") + paramString + aa.a("bQkdF2ozGBBTEQRNRQ==") + paramXmlPullParser.getName());
  }

  public static final void a(Object paramObject, String paramString, XmlSerializer paramXmlSerializer)
  {
    a(paramObject, paramString, paramXmlSerializer, null);
  }

  private static final void a(Object paramObject, String paramString, XmlSerializer paramXmlSerializer, b paramb)
  {
    if (paramObject == null)
    {
      paramXmlSerializer.startTag(null, aa.a("IxkfHw=="));
      if (paramString != null)
        paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
      paramXmlSerializer.endTag(null, aa.a("IxkfHw=="));
      return;
    }
    if ((paramObject instanceof String))
    {
      paramXmlSerializer.startTag(null, aa.a("PhgBGiQg"));
      if (paramString != null)
        paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
      paramXmlSerializer.text(paramObject.toString());
      paramXmlSerializer.endTag(null, aa.a("PhgBGiQg"));
      return;
    }
    if ((paramObject instanceof Integer))
      paramb = aa.a("JAIH");
    while (true)
    {
      paramXmlSerializer.startTag(null, paramb);
      if (paramString != null)
        paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
      paramXmlSerializer.attribute(null, aa.a("Ow0fBi8="), paramObject.toString());
      paramXmlSerializer.endTag(null, paramb);
      return;
      if ((paramObject instanceof Long))
      {
        paramb = aa.a("IQMdFA==");
      }
      else if ((paramObject instanceof Float))
      {
        paramb = aa.a("KwAcEj4=");
      }
      else if ((paramObject instanceof Double))
      {
        paramb = aa.a("KQMGESYi");
      }
      else
      {
        if (!(paramObject instanceof Boolean))
          break;
        paramb = aa.a("LwMcHy8mFw==");
      }
    }
    if ((paramObject instanceof byte[]))
    {
      a((byte[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof int[]))
    {
      a((int[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof long[]))
    {
      a((long[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof double[]))
    {
      a((double[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof String[]))
    {
      a((String[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof boolean[]))
    {
      a((boolean[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof Map))
    {
      a((Map)paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof List))
    {
      a((List)paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof Set))
    {
      a((Set)paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof CharSequence))
    {
      paramXmlSerializer.startTag(null, aa.a("PhgBGiQg"));
      if (paramString != null)
        paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
      paramXmlSerializer.text(paramObject.toString());
      paramXmlSerializer.endTag(null, aa.a("PhgBGiQg"));
      return;
    }
    if (paramb != null)
    {
      paramb.a(paramObject, paramString, paramXmlSerializer);
      return;
    }
    throw new RuntimeException(aa.a("Oh4aBy8RGBsGFSgaCUtDTVwELwAWUz4oWQABGQQSRQcCVEcAbQ==") + paramObject);
  }

  public static final void a(List paramList, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramList == null)
    {
      paramXmlSerializer.startTag(null, aa.a("IxkfHw=="));
      paramXmlSerializer.endTag(null, aa.a("IxkfHw=="));
      return;
    }
    paramXmlSerializer.startTag(null, aa.a("IQUABw=="));
    if (paramString != null)
      paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      a(paramList.get(i), null, paramXmlSerializer);
      i += 1;
    }
    paramXmlSerializer.endTag(null, aa.a("IQUABw=="));
  }

  public static final void a(Map paramMap, OutputStream paramOutputStream)
  {
    a locala = new a();
    locala.setOutput(paramOutputStream, Charset.forName(aa.a("GDg1XnI=")).name());
    locala.startDocument(null, Boolean.valueOf(true));
    locala.setFeature(aa.a("JRgHA3BoVg8eHAACCR1NV0ACYhpCXC4oGlgVFREDEAMGSxwNOQEfUCMpHRIdBF0YEAUTTUY="), true);
    a(paramMap, null, locala);
    locala.endDocument();
  }

  public static final void a(Map paramMap, String paramString, XmlSerializer paramXmlSerializer)
  {
    a(paramMap, paramString, paramXmlSerializer, null);
  }

  public static final void a(Map paramMap, String paramString, XmlSerializer paramXmlSerializer, b paramb)
  {
    if (paramMap == null)
    {
      paramXmlSerializer.startTag(null, aa.a("IxkfHw=="));
      paramXmlSerializer.endTag(null, aa.a("IxkfHw=="));
      return;
    }
    paramXmlSerializer.startTag(null, aa.a("IA0D"));
    if (paramString != null)
      paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
    a(paramMap, paramXmlSerializer, paramb);
    paramXmlSerializer.endTag(null, aa.a("IA0D"));
  }

  public static final void a(Map paramMap, XmlSerializer paramXmlSerializer, b paramb)
  {
    if (paramMap == null);
    while (true)
    {
      return;
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        a(localEntry.getValue(), (String)localEntry.getKey(), paramXmlSerializer, paramb);
      }
    }
  }

  public static final void a(Set paramSet, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramSet == null)
    {
      paramXmlSerializer.startTag(null, aa.a("IxkfHw=="));
      paramXmlSerializer.endTag(null, aa.a("IxkfHw=="));
      return;
    }
    paramXmlSerializer.startTag(null, aa.a("PgkH"));
    if (paramString != null)
      paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
      a(paramSet.next(), null, paramXmlSerializer);
    paramXmlSerializer.endTag(null, aa.a("PgkH"));
  }

  public static final void a(byte[] paramArrayOfByte, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfByte == null)
    {
      paramXmlSerializer.startTag(null, aa.a("IxkfHw=="));
      paramXmlSerializer.endTag(null, aa.a("IxkfHw=="));
      return;
    }
    paramXmlSerializer.startTag(null, aa.a("LxUHFmcmCwUSCQ=="));
    if (paramString != null)
      paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
    int k = paramArrayOfByte.length;
    paramXmlSerializer.attribute(null, aa.a("Ixke"), Integer.toString(k));
    paramString = new StringBuilder(paramArrayOfByte.length * 2);
    int i = 0;
    if (i < k)
    {
      int m = paramArrayOfByte[i];
      int j = m >> 4;
      if (j >= 10)
      {
        j = j + 97 - 10;
        label134: paramString.append(j);
        j = m & 0xFF;
        if (j < 10)
          break label190;
        j = j + 97 - 10;
      }
      while (true)
      {
        paramString.append(j);
        i += 1;
        break;
        j += 48;
        break label134;
        label190: j += 48;
      }
    }
    paramXmlSerializer.text(paramString.toString());
    paramXmlSerializer.endTag(null, aa.a("LxUHFmcmCwUSCQ=="));
  }

  public static final void a(double[] paramArrayOfDouble, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfDouble == null)
    {
      paramXmlSerializer.startTag(null, aa.a("IxkfHw=="));
      paramXmlSerializer.endTag(null, aa.a("IxkfHw=="));
      return;
    }
    paramXmlSerializer.startTag(null, aa.a("KQMGESYiVBYBAhEO"));
    if (paramString != null)
      paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
    int j = paramArrayOfDouble.length;
    paramXmlSerializer.attribute(null, aa.a("Ixke"), Integer.toString(j));
    int i = 0;
    while (i < j)
    {
      paramXmlSerializer.startTag(null, aa.a("JBgWHg=="));
      paramXmlSerializer.attribute(null, aa.a("Ow0fBi8="), Double.toString(paramArrayOfDouble[i]));
      paramXmlSerializer.endTag(null, aa.a("JBgWHg=="));
      i += 1;
    }
    paramXmlSerializer.endTag(null, aa.a("KQMGESYiVBYBAhEO"));
  }

  public static final void a(int[] paramArrayOfInt, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfInt == null)
    {
      paramXmlSerializer.startTag(null, aa.a("IxkfHw=="));
      paramXmlSerializer.endTag(null, aa.a("IxkfHw=="));
      return;
    }
    paramXmlSerializer.startTag(null, aa.a("JAIHXis1CxYK"));
    if (paramString != null)
      paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
    int j = paramArrayOfInt.length;
    paramXmlSerializer.attribute(null, aa.a("Ixke"), Integer.toString(j));
    int i = 0;
    while (i < j)
    {
      paramXmlSerializer.startTag(null, aa.a("JBgWHg=="));
      paramXmlSerializer.attribute(null, aa.a("Ow0fBi8="), Integer.toString(paramArrayOfInt[i]));
      paramXmlSerializer.endTag(null, aa.a("JBgWHg=="));
      i += 1;
    }
    paramXmlSerializer.endTag(null, aa.a("JAIHXis1CxYK"));
  }

  public static final void a(long[] paramArrayOfLong, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfLong == null)
    {
      paramXmlSerializer.startTag(null, aa.a("IxkfHw=="));
      paramXmlSerializer.endTag(null, aa.a("IxkfHw=="));
      return;
    }
    paramXmlSerializer.startTag(null, aa.a("IQMdFGcmCwUSCQ=="));
    if (paramString != null)
      paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
    int j = paramArrayOfLong.length;
    paramXmlSerializer.attribute(null, aa.a("Ixke"), Integer.toString(j));
    int i = 0;
    while (i < j)
    {
      paramXmlSerializer.startTag(null, aa.a("JBgWHg=="));
      paramXmlSerializer.attribute(null, aa.a("Ow0fBi8="), Long.toString(paramArrayOfLong[i]));
      paramXmlSerializer.endTag(null, aa.a("JBgWHg=="));
      i += 1;
    }
    paramXmlSerializer.endTag(null, aa.a("IQMdFGcmCwUSCQ=="));
  }

  public static final void a(String[] paramArrayOfString, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfString == null)
    {
      paramXmlSerializer.startTag(null, aa.a("IxkfHw=="));
      paramXmlSerializer.endTag(null, aa.a("IxkfHw=="));
      return;
    }
    paramXmlSerializer.startTag(null, aa.a("PhgBGiQgVBYBAhEO"));
    if (paramString != null)
      paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
    int j = paramArrayOfString.length;
    paramXmlSerializer.attribute(null, aa.a("Ixke"), Integer.toString(j));
    int i = 0;
    while (i < j)
    {
      paramXmlSerializer.startTag(null, aa.a("JBgWHg=="));
      paramXmlSerializer.attribute(null, aa.a("Ow0fBi8="), paramArrayOfString[i]);
      paramXmlSerializer.endTag(null, aa.a("JBgWHg=="));
      i += 1;
    }
    paramXmlSerializer.endTag(null, aa.a("PhgBGiQgVBYBAhEO"));
  }

  public static final void a(boolean[] paramArrayOfBoolean, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfBoolean == null)
    {
      paramXmlSerializer.startTag(null, aa.a("IxkfHw=="));
      paramXmlSerializer.endTag(null, aa.a("IxkfHw=="));
      return;
    }
    paramXmlSerializer.startTag(null, aa.a("LwMcHy8mF1oSAgIWHA=="));
    if (paramString != null)
      paramXmlSerializer.attribute(null, aa.a("Iw0eFg=="), paramString);
    int j = paramArrayOfBoolean.length;
    paramXmlSerializer.attribute(null, aa.a("Ixke"), Integer.toString(j));
    int i = 0;
    while (i < j)
    {
      paramXmlSerializer.startTag(null, aa.a("JBgWHg=="));
      paramXmlSerializer.attribute(null, aa.a("Ow0fBi8="), Boolean.toString(paramArrayOfBoolean[i]));
      paramXmlSerializer.endTag(null, aa.a("JBgWHg=="));
      i += 1;
    }
    paramXmlSerializer.endTag(null, aa.a("LwMcHy8mF1oSAgIWHA=="));
  }

  // ERROR //
  public static final int[] a(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: ldc_w 391
    //   5: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   8: invokeinterface 44 3 0
    //   13: invokestatic 50	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   16: istore_3
    //   17: aload_0
    //   18: invokeinterface 123 1 0
    //   23: pop
    //   24: iload_3
    //   25: newarray int
    //   27: astore_2
    //   28: aload_0
    //   29: invokeinterface 107 1 0
    //   34: istore_3
    //   35: iconst_0
    //   36: istore 4
    //   38: iload_3
    //   39: iconst_2
    //   40: if_icmpne +199 -> 239
    //   43: aload_0
    //   44: invokeinterface 115 1 0
    //   49: ldc_w 402
    //   52: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   55: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifeq +145 -> 203
    //   61: aload_2
    //   62: iload 4
    //   64: aload_0
    //   65: aconst_null
    //   66: ldc 38
    //   68: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   71: invokeinterface 44 3 0
    //   76: invokestatic 50	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   79: iastore
    //   80: iload 4
    //   82: istore 5
    //   84: aload_0
    //   85: invokeinterface 123 1 0
    //   90: istore 6
    //   92: iload 5
    //   94: istore 4
    //   96: iload 6
    //   98: istore_3
    //   99: iload 6
    //   101: iconst_1
    //   102: if_icmpne -64 -> 38
    //   105: new 71	org/xmlpull/v1/XmlPullParserException
    //   108: dup
    //   109: new 73	java/lang/StringBuilder
    //   112: dup
    //   113: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   116: ldc 205
    //   118: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   121: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: aload_1
    //   125: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: ldc 207
    //   130: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   133: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   142: athrow
    //   143: astore_0
    //   144: new 71	org/xmlpull/v1/XmlPullParserException
    //   147: dup
    //   148: ldc_w 413
    //   151: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   154: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   157: athrow
    //   158: astore_0
    //   159: new 71	org/xmlpull/v1/XmlPullParserException
    //   162: dup
    //   163: ldc_w 415
    //   166: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   169: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   172: athrow
    //   173: astore_0
    //   174: new 71	org/xmlpull/v1/XmlPullParserException
    //   177: dup
    //   178: ldc_w 417
    //   181: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   184: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   187: athrow
    //   188: astore_0
    //   189: new 71	org/xmlpull/v1/XmlPullParserException
    //   192: dup
    //   193: ldc_w 419
    //   196: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   199: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   202: athrow
    //   203: new 71	org/xmlpull/v1/XmlPullParserException
    //   206: dup
    //   207: new 73	java/lang/StringBuilder
    //   210: dup
    //   211: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   214: ldc_w 421
    //   217: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   220: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload_0
    //   224: invokeinterface 115 1 0
    //   229: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   235: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   238: athrow
    //   239: iload 4
    //   241: istore 5
    //   243: iload_3
    //   244: iconst_3
    //   245: if_icmpne -161 -> 84
    //   248: aload_0
    //   249: invokeinterface 115 1 0
    //   254: aload_1
    //   255: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   258: ifeq +5 -> 263
    //   261: aload_2
    //   262: areturn
    //   263: aload_0
    //   264: invokeinterface 115 1 0
    //   269: ldc_w 402
    //   272: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   275: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   278: ifeq +12 -> 290
    //   281: iload 4
    //   283: iconst_1
    //   284: iadd
    //   285: istore 5
    //   287: goto -203 -> 84
    //   290: new 71	org/xmlpull/v1/XmlPullParserException
    //   293: dup
    //   294: new 73	java/lang/StringBuilder
    //   297: dup
    //   298: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   301: ldc 209
    //   303: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   306: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: aload_1
    //   310: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: ldc 211
    //   315: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   318: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: aload_0
    //   322: invokeinterface 115 1 0
    //   327: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   333: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   336: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	17	143	java/lang/NullPointerException
    //   0	17	158	java/lang/NumberFormatException
    //   61	80	173	java/lang/NullPointerException
    //   61	80	188	java/lang/NumberFormatException
  }

  private static final HashSet b(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString, a parama, boolean paramBoolean)
  {
    HashSet localHashSet = new HashSet();
    int i = paramXmlPullParser.getEventType();
    if (i == 2)
      localHashSet.add(a(paramXmlPullParser, paramArrayOfString, parama, paramBoolean));
    while (i != 3)
    {
      int j = paramXmlPullParser.next();
      i = j;
      if (j != 1)
        break;
      throw new XmlPullParserException(aa.a("CQMQBiciFwNTFR4TABVDWlcDIh4WUw==") + paramString + aa.a("bQkdF2ozGBA="));
    }
    if (paramXmlPullParser.getName().equals(paramString))
      return localHashSet;
    throw new XmlPullParserException(aa.a("CBQDFikzHBNT") + paramString + aa.a("bQkdF2ozGBBTEQRNRQ==") + paramXmlPullParser.getName());
  }

  // ERROR //
  public static final long[] b(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: ldc_w 391
    //   5: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   8: invokeinterface 44 3 0
    //   13: invokestatic 50	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   16: istore_3
    //   17: aload_0
    //   18: invokeinterface 123 1 0
    //   23: pop
    //   24: iload_3
    //   25: newarray long
    //   27: astore_2
    //   28: aload_0
    //   29: invokeinterface 107 1 0
    //   34: istore_3
    //   35: iconst_0
    //   36: istore 4
    //   38: iload_3
    //   39: iconst_2
    //   40: if_icmpne +199 -> 239
    //   43: aload_0
    //   44: invokeinterface 115 1 0
    //   49: ldc_w 402
    //   52: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   55: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifeq +145 -> 203
    //   61: aload_2
    //   62: iload 4
    //   64: aload_0
    //   65: aconst_null
    //   66: ldc 38
    //   68: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   71: invokeinterface 44 3 0
    //   76: invokestatic 429	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   79: lastore
    //   80: iload 4
    //   82: istore 5
    //   84: aload_0
    //   85: invokeinterface 123 1 0
    //   90: istore 6
    //   92: iload 5
    //   94: istore 4
    //   96: iload 6
    //   98: istore_3
    //   99: iload 6
    //   101: iconst_1
    //   102: if_icmpne -64 -> 38
    //   105: new 71	org/xmlpull/v1/XmlPullParserException
    //   108: dup
    //   109: new 73	java/lang/StringBuilder
    //   112: dup
    //   113: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   116: ldc 205
    //   118: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   121: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: aload_1
    //   125: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: ldc 207
    //   130: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   133: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   142: athrow
    //   143: astore_0
    //   144: new 71	org/xmlpull/v1/XmlPullParserException
    //   147: dup
    //   148: ldc_w 431
    //   151: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   154: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   157: athrow
    //   158: astore_0
    //   159: new 71	org/xmlpull/v1/XmlPullParserException
    //   162: dup
    //   163: ldc_w 433
    //   166: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   169: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   172: athrow
    //   173: astore_0
    //   174: new 71	org/xmlpull/v1/XmlPullParserException
    //   177: dup
    //   178: ldc_w 417
    //   181: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   184: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   187: athrow
    //   188: astore_0
    //   189: new 71	org/xmlpull/v1/XmlPullParserException
    //   192: dup
    //   193: ldc_w 419
    //   196: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   199: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   202: athrow
    //   203: new 71	org/xmlpull/v1/XmlPullParserException
    //   206: dup
    //   207: new 73	java/lang/StringBuilder
    //   210: dup
    //   211: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   214: ldc_w 421
    //   217: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   220: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload_0
    //   224: invokeinterface 115 1 0
    //   229: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   235: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   238: athrow
    //   239: iload 4
    //   241: istore 5
    //   243: iload_3
    //   244: iconst_3
    //   245: if_icmpne -161 -> 84
    //   248: aload_0
    //   249: invokeinterface 115 1 0
    //   254: aload_1
    //   255: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   258: ifeq +5 -> 263
    //   261: aload_2
    //   262: areturn
    //   263: aload_0
    //   264: invokeinterface 115 1 0
    //   269: ldc_w 402
    //   272: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   275: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   278: ifeq +12 -> 290
    //   281: iload 4
    //   283: iconst_1
    //   284: iadd
    //   285: istore 5
    //   287: goto -203 -> 84
    //   290: new 71	org/xmlpull/v1/XmlPullParserException
    //   293: dup
    //   294: new 73	java/lang/StringBuilder
    //   297: dup
    //   298: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   301: ldc 209
    //   303: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   306: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: aload_1
    //   310: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: ldc 211
    //   315: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   318: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: aload_0
    //   322: invokeinterface 115 1 0
    //   327: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   333: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   336: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	17	143	java/lang/NullPointerException
    //   0	17	158	java/lang/NumberFormatException
    //   61	80	173	java/lang/NullPointerException
    //   61	80	188	java/lang/NumberFormatException
  }

  // ERROR //
  public static final double[] c(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: ldc_w 391
    //   5: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   8: invokeinterface 44 3 0
    //   13: invokestatic 50	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   16: istore_3
    //   17: aload_0
    //   18: invokeinterface 123 1 0
    //   23: pop
    //   24: iload_3
    //   25: newarray double
    //   27: astore_2
    //   28: aload_0
    //   29: invokeinterface 107 1 0
    //   34: istore_3
    //   35: iconst_0
    //   36: istore 4
    //   38: iload_3
    //   39: iconst_2
    //   40: if_icmpne +199 -> 239
    //   43: aload_0
    //   44: invokeinterface 115 1 0
    //   49: ldc_w 402
    //   52: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   55: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifeq +145 -> 203
    //   61: aload_2
    //   62: iload 4
    //   64: aload_0
    //   65: aconst_null
    //   66: ldc 38
    //   68: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   71: invokeinterface 44 3 0
    //   76: invokestatic 437	java/lang/Double:parseDouble	(Ljava/lang/String;)D
    //   79: dastore
    //   80: iload 4
    //   82: istore 5
    //   84: aload_0
    //   85: invokeinterface 123 1 0
    //   90: istore 6
    //   92: iload 5
    //   94: istore 4
    //   96: iload 6
    //   98: istore_3
    //   99: iload 6
    //   101: iconst_1
    //   102: if_icmpne -64 -> 38
    //   105: new 71	org/xmlpull/v1/XmlPullParserException
    //   108: dup
    //   109: new 73	java/lang/StringBuilder
    //   112: dup
    //   113: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   116: ldc 205
    //   118: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   121: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: aload_1
    //   125: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: ldc 207
    //   130: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   133: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   142: athrow
    //   143: astore_0
    //   144: new 71	org/xmlpull/v1/XmlPullParserException
    //   147: dup
    //   148: ldc_w 439
    //   151: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   154: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   157: athrow
    //   158: astore_0
    //   159: new 71	org/xmlpull/v1/XmlPullParserException
    //   162: dup
    //   163: ldc_w 441
    //   166: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   169: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   172: athrow
    //   173: astore_0
    //   174: new 71	org/xmlpull/v1/XmlPullParserException
    //   177: dup
    //   178: ldc_w 417
    //   181: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   184: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   187: athrow
    //   188: astore_0
    //   189: new 71	org/xmlpull/v1/XmlPullParserException
    //   192: dup
    //   193: ldc_w 419
    //   196: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   199: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   202: athrow
    //   203: new 71	org/xmlpull/v1/XmlPullParserException
    //   206: dup
    //   207: new 73	java/lang/StringBuilder
    //   210: dup
    //   211: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   214: ldc_w 421
    //   217: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   220: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload_0
    //   224: invokeinterface 115 1 0
    //   229: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   235: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   238: athrow
    //   239: iload 4
    //   241: istore 5
    //   243: iload_3
    //   244: iconst_3
    //   245: if_icmpne -161 -> 84
    //   248: aload_0
    //   249: invokeinterface 115 1 0
    //   254: aload_1
    //   255: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   258: ifeq +5 -> 263
    //   261: aload_2
    //   262: areturn
    //   263: aload_0
    //   264: invokeinterface 115 1 0
    //   269: ldc_w 402
    //   272: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   275: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   278: ifeq +12 -> 290
    //   281: iload 4
    //   283: iconst_1
    //   284: iadd
    //   285: istore 5
    //   287: goto -203 -> 84
    //   290: new 71	org/xmlpull/v1/XmlPullParserException
    //   293: dup
    //   294: new 73	java/lang/StringBuilder
    //   297: dup
    //   298: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   301: ldc 209
    //   303: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   306: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: aload_1
    //   310: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: ldc 211
    //   315: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   318: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: aload_0
    //   322: invokeinterface 115 1 0
    //   327: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   333: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   336: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	17	143	java/lang/NullPointerException
    //   0	17	158	java/lang/NumberFormatException
    //   61	80	173	java/lang/NullPointerException
    //   61	80	188	java/lang/NumberFormatException
  }

  // ERROR //
  public static final String[] d(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: ldc_w 391
    //   5: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   8: invokeinterface 44 3 0
    //   13: invokestatic 50	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   16: istore_3
    //   17: aload_0
    //   18: invokeinterface 123 1 0
    //   23: pop
    //   24: iload_3
    //   25: anewarray 32	java/lang/String
    //   28: astore_2
    //   29: aload_0
    //   30: invokeinterface 107 1 0
    //   35: istore_3
    //   36: iconst_0
    //   37: istore 4
    //   39: iload_3
    //   40: iconst_2
    //   41: if_icmpne +196 -> 237
    //   44: aload_0
    //   45: invokeinterface 115 1 0
    //   50: ldc_w 402
    //   53: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   56: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   59: ifeq +142 -> 201
    //   62: aload_2
    //   63: iload 4
    //   65: aload_0
    //   66: aconst_null
    //   67: ldc 38
    //   69: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   72: invokeinterface 44 3 0
    //   77: aastore
    //   78: iload 4
    //   80: istore 5
    //   82: aload_0
    //   83: invokeinterface 123 1 0
    //   88: istore 6
    //   90: iload 5
    //   92: istore 4
    //   94: iload 6
    //   96: istore_3
    //   97: iload 6
    //   99: iconst_1
    //   100: if_icmpne -61 -> 39
    //   103: new 71	org/xmlpull/v1/XmlPullParserException
    //   106: dup
    //   107: new 73	java/lang/StringBuilder
    //   110: dup
    //   111: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   114: ldc 205
    //   116: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   119: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload_1
    //   123: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: ldc 207
    //   128: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   131: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   140: athrow
    //   141: astore_0
    //   142: new 71	org/xmlpull/v1/XmlPullParserException
    //   145: dup
    //   146: ldc_w 443
    //   149: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   152: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   155: athrow
    //   156: astore_0
    //   157: new 71	org/xmlpull/v1/XmlPullParserException
    //   160: dup
    //   161: ldc_w 445
    //   164: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   167: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   170: athrow
    //   171: astore_0
    //   172: new 71	org/xmlpull/v1/XmlPullParserException
    //   175: dup
    //   176: ldc_w 417
    //   179: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   182: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   185: athrow
    //   186: astore_0
    //   187: new 71	org/xmlpull/v1/XmlPullParserException
    //   190: dup
    //   191: ldc_w 419
    //   194: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   197: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   200: athrow
    //   201: new 71	org/xmlpull/v1/XmlPullParserException
    //   204: dup
    //   205: new 73	java/lang/StringBuilder
    //   208: dup
    //   209: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   212: ldc_w 421
    //   215: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   218: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload_0
    //   222: invokeinterface 115 1 0
    //   227: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   236: athrow
    //   237: iload 4
    //   239: istore 5
    //   241: iload_3
    //   242: iconst_3
    //   243: if_icmpne -161 -> 82
    //   246: aload_0
    //   247: invokeinterface 115 1 0
    //   252: aload_1
    //   253: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   256: ifeq +5 -> 261
    //   259: aload_2
    //   260: areturn
    //   261: aload_0
    //   262: invokeinterface 115 1 0
    //   267: ldc_w 402
    //   270: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   273: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   276: ifeq +12 -> 288
    //   279: iload 4
    //   281: iconst_1
    //   282: iadd
    //   283: istore 5
    //   285: goto -203 -> 82
    //   288: new 71	org/xmlpull/v1/XmlPullParserException
    //   291: dup
    //   292: new 73	java/lang/StringBuilder
    //   295: dup
    //   296: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   299: ldc 209
    //   301: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   304: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: aload_1
    //   308: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: ldc 211
    //   313: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   316: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: aload_0
    //   320: invokeinterface 115 1 0
    //   325: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   331: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   334: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	17	141	java/lang/NullPointerException
    //   0	17	156	java/lang/NumberFormatException
    //   62	78	171	java/lang/NullPointerException
    //   62	78	186	java/lang/NumberFormatException
  }

  // ERROR //
  public static final boolean[] e(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: ldc_w 391
    //   5: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   8: invokeinterface 44 3 0
    //   13: invokestatic 50	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   16: istore_3
    //   17: aload_0
    //   18: invokeinterface 123 1 0
    //   23: pop
    //   24: iload_3
    //   25: newarray boolean
    //   27: astore_2
    //   28: aload_0
    //   29: invokeinterface 107 1 0
    //   34: istore_3
    //   35: iconst_0
    //   36: istore 4
    //   38: iload_3
    //   39: iconst_2
    //   40: if_icmpne +202 -> 242
    //   43: aload_0
    //   44: invokeinterface 115 1 0
    //   49: ldc_w 402
    //   52: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   55: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifeq +148 -> 206
    //   61: aload_2
    //   62: iload 4
    //   64: aload_0
    //   65: aconst_null
    //   66: ldc 38
    //   68: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   71: invokeinterface 44 3 0
    //   76: invokestatic 102	java/lang/Boolean:valueOf	(Ljava/lang/String;)Ljava/lang/Boolean;
    //   79: invokevirtual 448	java/lang/Boolean:booleanValue	()Z
    //   82: bastore
    //   83: iload 4
    //   85: istore 5
    //   87: aload_0
    //   88: invokeinterface 123 1 0
    //   93: istore 6
    //   95: iload 5
    //   97: istore 4
    //   99: iload 6
    //   101: istore_3
    //   102: iload 6
    //   104: iconst_1
    //   105: if_icmpne -67 -> 38
    //   108: new 71	org/xmlpull/v1/XmlPullParserException
    //   111: dup
    //   112: new 73	java/lang/StringBuilder
    //   115: dup
    //   116: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   119: ldc 205
    //   121: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   124: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: aload_1
    //   128: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: ldc 207
    //   133: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   136: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   145: athrow
    //   146: astore_0
    //   147: new 71	org/xmlpull/v1/XmlPullParserException
    //   150: dup
    //   151: ldc_w 443
    //   154: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   157: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   160: athrow
    //   161: astore_0
    //   162: new 71	org/xmlpull/v1/XmlPullParserException
    //   165: dup
    //   166: ldc_w 445
    //   169: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   172: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   175: athrow
    //   176: astore_0
    //   177: new 71	org/xmlpull/v1/XmlPullParserException
    //   180: dup
    //   181: ldc_w 417
    //   184: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   187: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   190: athrow
    //   191: astore_0
    //   192: new 71	org/xmlpull/v1/XmlPullParserException
    //   195: dup
    //   196: ldc_w 419
    //   199: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   202: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   205: athrow
    //   206: new 71	org/xmlpull/v1/XmlPullParserException
    //   209: dup
    //   210: new 73	java/lang/StringBuilder
    //   213: dup
    //   214: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   217: ldc_w 421
    //   220: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   223: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: aload_0
    //   227: invokeinterface 115 1 0
    //   232: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   238: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   241: athrow
    //   242: iload 4
    //   244: istore 5
    //   246: iload_3
    //   247: iconst_3
    //   248: if_icmpne -161 -> 87
    //   251: aload_0
    //   252: invokeinterface 115 1 0
    //   257: aload_1
    //   258: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   261: ifeq +5 -> 266
    //   264: aload_2
    //   265: areturn
    //   266: aload_0
    //   267: invokeinterface 115 1 0
    //   272: ldc_w 402
    //   275: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   278: invokevirtual 36	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   281: ifeq +12 -> 293
    //   284: iload 4
    //   286: iconst_1
    //   287: iadd
    //   288: istore 5
    //   290: goto -203 -> 87
    //   293: new 71	org/xmlpull/v1/XmlPullParserException
    //   296: dup
    //   297: new 73	java/lang/StringBuilder
    //   300: dup
    //   301: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   304: ldc 209
    //   306: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   309: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: aload_1
    //   313: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: ldc 211
    //   318: invokestatic 20	sdk/nrun/rn/aa:a	(Ljava/lang/String;)Ljava/lang/String;
    //   321: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: aload_0
    //   325: invokeinterface 115 1 0
    //   330: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   336: invokespecial 88	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   339: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	17	146	java/lang/NullPointerException
    //   0	17	161	java/lang/NumberFormatException
    //   61	83	176	java/lang/NullPointerException
    //   61	83	191	java/lang/NumberFormatException
  }

  public static abstract interface a
  {
    public abstract Object a(XmlPullParser paramXmlPullParser, String paramString);
  }

  public static abstract interface b
  {
    public abstract void a(Object paramObject, String paramString, XmlSerializer paramXmlSerializer);
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.d.d
 * JD-Core Version:    0.6.2
 */
 aa.a("dw==") -> 

 aa.a("JAIH") -> int

 aa.a("Ow0fBi8=") -> val

 aa.a("IQMdFA==") -> lon

 aa.a("Ow0fBi8=") -> val

 aa.a("KwAcEj4=") -> flo

 aa.a("Ow0fBi8=") -> val

 aa.a("AwkWF2oxGBsGFVAWEQURUVAQOQlTGiRnRQ==") -> Need value attribute in 

 aa.a("cw==") -> 

 aa.a("KQMGESYi") -> double

 aa.a("Ow0fBi8=") -> val

 aa.a("AwMHUytnFwIeEhUFRRgNGEQEIRkWUyszDQUaEgUDAFEKVhJZ") -> Not a number in value attribute in <

 aa.a("cw==") -> 

 aa.a("LwMcHy8mFw==") -> boolea

 aa.a("Ow0fBi8=") -> val

 aa.a("GAIWCzoiGgMWFFASCxVDTFMCbQ0HSWo=") -> Unexpected end tag at

 aa.a("GAIWCzoiGgMWFFADAAkXAhI=") -> Unexpected text

 aa.a("GAIWCzoiGgMWFFASCxVDV1RFKQMQBiciFwM=") -> Unexpected end of docume

 aa.a("Iw0eFg==") -> nam

 aa.a("IxkfHw==") -> nul

 aa.a("PhgBGiQg") -> string

 aa.a("PhgBGiQg") -> string

 aa.a("GAIWCzoiGgMWFFASCxVDTFMCbQUdU3Y0DQUaHhdJX1E=") -> Unexpected end tag in <string>

 aa.a("GAIWCzoiGgMWFFAEERARTBIRLAtTGiRnRQQHAhkZAk9ZGA==") -> Unexpected start tag in <string>:

 aa.a("GAIWCzoiGgMWFFASCxVDV1RFKQMQBiciFwNTGR5XWQIXSlsLKlI=") -> Unexpected end of document in <strin

 aa.a("JAIHXis1CxYK") -> int-array

 aa.a("JAIHXis1CxYK") -> int-array

 aa.a("IQMdFGcmCwUSCQ==") -> long-arra

 aa.a("IQMdFGcmCwUSCQ==") -> long-arra

 aa.a("KQMGESYiVBYBAhEO") -> double-array

 aa.a("KQMGESYiVBYBAhEO") -> double-array

 aa.a("PhgBGiQgVBYBAhEO") -> string-array

 aa.a("PhgBGiQgVBYBAhEO") -> string-array

 aa.a("LwMcHy8mF1oSAgIWHA==") -> boolean-arra

 aa.a("LwMcHy8mF1oSAgIWHA==") -> boolean-arra

 aa.a("IA0D") -> map

 aa.a("IA0D") -> map

 aa.a("IA0D") -> map

 aa.a("IQUABw==") -> lis

 aa.a("IQUABw==") -> lis

 aa.a("PgkH") -> set

 aa.a("PgkH") -> set

 aa.a("GAIYHSUwF1cHERdNRQ==") -> Unknown tag:

 aa.a("GAIWCzoiGgMWFFASCxVDTFMCbQUdU3Y=") -> Unexpected end tag in

 aa.a("c1ZT") -> >: 

 aa.a("GAIWCzoiGgMWFFADAAkXGFsLbVA=") -> Unexpected text in

 aa.a("c1ZT") -> >: 

 aa.a("GAIWCzoiGgMWFFAEERARTBIRLAtTGiRnRQ==") -> Unexpected start tag in 

 aa.a("c1ZT") -> >: 

 aa.a("GAIWCzoiGgMWFFASCxVDV1RFKQMQBiciFwNTGR5XWQ==") -> Unexpected end of document in 

 aa.a("cw==") -> 

 aa.a("CQMQBiciFwNTFR4TABVDWlcDIh4WUw==") -> Document ended before

 aa.a("bQkdF2ozGBA=") ->  end t

 aa.a("CBQDFikzHBNT") -> Expected 

 aa.a("bQkdF2ozGBBTEQRNRQ==") ->  end tag at:

 aa.a("GDg1XnI=") -> UTF

 aa.a("CQMQBiciFwNTFR4TABVDWlcDIh4WUw==") -> Document ended before

 aa.a("bQkdF2ozGBA=") ->  end t

 aa.a("CBQDFikzHBNT") -> Expected 

 aa.a("bQkdF2ozGBBTEQRNRQ==") ->  end tag at:

 aa.a("IxkfHw==") -> nul

 aa.a("Iw0eFg==") -> nam

 aa.a("IxkfHw==") -> nul

 aa.a("PhgBGiQg") -> string

 aa.a("Iw0eFg==") -> nam

 aa.a("PhgBGiQg") -> string

 aa.a("JAIH") -> int

 aa.a("Iw0eFg==") -> nam

 aa.a("Ow0fBi8=") -> val

 aa.a("IQMdFA==") -> lon

 aa.a("KwAcEj4=") -> flo

 aa.a("KQMGESYi") -> double

 aa.a("LwMcHy8mFw==") -> boolea

 aa.a("PhgBGiQg") -> string

 aa.a("Iw0eFg==") -> nam

 aa.a("PhgBGiQg") -> string

 aa.a("Oh4aBy8RGBsGFSgaCUtDTVwELwAWUz4oWQABGQQSRQcCVEcAbQ==") -> writeValueXml: unable to write value

 aa.a("IxkfHw==") -> nul

 aa.a("IxkfHw==") -> nul

 aa.a("IQUABw==") -> lis

 aa.a("Iw0eFg==") -> nam

 aa.a("IQUABw==") -> lis

 aa.a("GDg1XnI=") -> UTF

 aa.a("JRgHA3BoVg8eHAACCR1NV0ACYhpCXC4oGlgVFREDEAMGSxwNOQEfUCMpHRIdBF0YEAUTTUY=") -> http://xmlpull.org/v1/doc/features.html#indent-outp

 aa.a("IxkfHw==") -> nul

 aa.a("IxkfHw==") -> nul

 aa.a("IA0D") -> map

 aa.a("Iw0eFg==") -> nam

 aa.a("IA0D") -> map

 aa.a("IxkfHw==") -> nul

 aa.a("IxkfHw==") -> nul

 aa.a("PgkH") -> set

 aa.a("Iw0eFg==") -> nam

 aa.a("PgkH") -> set

 aa.a("IxkfHw==") -> nul

 aa.a("IxkfHw==") -> nul

 aa.a("LxUHFmcmCwUSCQ==") -> byte-arra

 aa.a("Iw0eFg==") -> nam

 aa.a("Ixke") -> num

 aa.a("LxUHFmcmCwUSCQ==") -> byte-arra

 aa.a("IxkfHw==") -> nul

 aa.a("IxkfHw==") -> nul

 aa.a("KQMGESYiVBYBAhEO") -> double-array

 aa.a("Iw0eFg==") -> nam

 aa.a("Ixke") -> num

 aa.a("JBgWHg==") -> ite

 aa.a("Ow0fBi8=") -> val

 aa.a("JBgWHg==") -> ite

 aa.a("KQMGESYiVBYBAhEO") -> double-array

 aa.a("IxkfHw==") -> nul

 aa.a("IxkfHw==") -> nul

 aa.a("JAIHXis1CxYK") -> int-array

 aa.a("Iw0eFg==") -> nam

 aa.a("Ixke") -> num

 aa.a("JBgWHg==") -> ite

 aa.a("Ow0fBi8=") -> val

 aa.a("JBgWHg==") -> ite

 aa.a("JAIHXis1CxYK") -> int-array

 aa.a("IxkfHw==") -> nul

 aa.a("IxkfHw==") -> nul

 aa.a("IQMdFGcmCwUSCQ==") -> long-arra

 aa.a("Iw0eFg==") -> nam

 aa.a("Ixke") -> num

 aa.a("JBgWHg==") -> ite

 aa.a("Ow0fBi8=") -> val

 aa.a("JBgWHg==") -> ite

 aa.a("IQMdFGcmCwUSCQ==") -> long-arra

 aa.a("IxkfHw==") -> nul

 aa.a("IxkfHw==") -> nul

 aa.a("PhgBGiQgVBYBAhEO") -> string-array

 aa.a("Iw0eFg==") -> nam

 aa.a("Ixke") -> num

 aa.a("JBgWHg==") -> ite

 aa.a("Ow0fBi8=") -> val

 aa.a("JBgWHg==") -> ite

 aa.a("PhgBGiQgVBYBAhEO") -> string-array

 aa.a("IxkfHw==") -> nul

 aa.a("IxkfHw==") -> nul

 aa.a("LwMcHy8mF1oSAgIWHA==") -> boolean-arra

 aa.a("Iw0eFg==") -> nam

 aa.a("Ixke") -> num

 aa.a("JBgWHg==") -> ite

 aa.a("Ow0fBi8=") -> val

 aa.a("JBgWHg==") -> ite

 aa.a("LwMcHy8mF1oSAgIWHA==") -> boolean-arra

 aa.a("CQMQBiciFwNTFR4TABVDWlcDIh4WUw==") -> Document ended before

 aa.a("bQkdF2ozGBA=") ->  end t

 aa.a("CBQDFikzHBNT") -> Expected 

 aa.a("bQkdF2ozGBBTEQRNRQ==") ->  end tag at:
