package sdk.nrun.rn.c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import sdk.nrun.rn.aa;
import sdk.nrun.rn.l;
import sdk.nrun.rn.x;

public class d extends Activity
{
  private void a(final String paramString1, final String paramString2)
  {
    new Thread(new Runnable()
    {
      public void run()
      {
        try
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put(aa.a("HQASEC8="), aa.a("DA8HGjwuDQ4="));
          localHashMap.put(aa.a("DgMdBy8/DQ=="), this);
          e.a(d.this.getApplicationContext()).a(paramString1, localHashMap).b(paramString2).a(localHashMap);
          return;
        }
        catch (g localg)
        {
          x.a().a(localg);
        }
      }
    }).start();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra(aa.a("PQAGFCMp"));
    String str = getIntent().getStringExtra(aa.a("KAIHATM="));
    if ((paramBundle != null) && (str != null))
      a(paramBundle, str);
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.c.d
 * JD-Core Version:    0.6.2
 */
 aa.a("HQASEC8=") -> Pla

 aa.a("DA8HGjwuDQ4=") -> Activi

 aa.a("DgMdBy8/DQ==") -> Contex

 aa.a("PQAGFCMp") -> plugin

 aa.a("KAIHATM=") -> ent
