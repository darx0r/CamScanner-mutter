package sdk.nrun.rn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class q
{
  public static final String a = aa.a("HQAGFCMpNxYeFQ==");
  private Map<String, Bundle> b = new ConcurrentHashMap();

  public static boolean a(Context paramContext, String paramString, Bundle paramBundle)
  {
    paramString = w.a(paramContext, paramString + aa.a("HgkBBSMkHA=="), null);
    if ((paramString != null) && (!"".equals(paramString.trim())) && (j.a(paramContext, paramString)))
    {
      Intent localIntent = new Intent();
      localIntent.setClassName(paramContext.getPackageName(), paramString);
      localIntent.putExtra(aa.a("CQ0HEg=="), paramBundle);
      localIntent.putExtra(aa.a("AwMjASU/AA=="), true);
      paramContext.startService(localIntent);
      return true;
    }
    return false;
  }

  public String a(Bundle paramBundle)
  {
    String str = paramBundle.getString(a);
    if (!this.b.containsKey(str))
    {
      this.b.put(str, paramBundle);
      return str;
    }
    return null;
  }

  public List<String> a()
  {
    return new ArrayList(this.b.keySet());
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.q
 * JD-Core Version:    0.6.2
 */
 aa.a("HQAGFCMpNxYeFQ==") -> PluginNam

 aa.a("HgkBBSMkHA==") -> Servic

 aa.a("CQ0HEg==") -> Dat

 aa.a("AwMjASU/AA==") -> NoProx
