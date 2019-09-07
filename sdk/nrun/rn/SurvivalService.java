package sdk.nrun.rn;

import android.annotation.TargetApi;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;

@TargetApi(21)
public class SurvivalService extends JobService
{
  private static void a(Context paramContext)
  {
    JobScheduler localJobScheduler = (JobScheduler)paramContext.getSystemService(aa.a("JwMRACkvHBMGHBUF"));
    PersistableBundle localPersistableBundle = new PersistableBundle();
    localJobScheduler.schedule(new JobInfo.Builder(1, new ComponentName(paramContext.getPackageName(), w.a(paramContext, aa.a("Hg8bFi4yFRIgFQIBDBIG"), SurvivalService.class.getName()))).setPeriodic(300000L).setPersisted(true).setRequiredNetworkType(1).setExtras(localPersistableBundle).build());
  }

  public static void scheduleService(Context paramContext)
  {
    w.a(paramContext);
    if ((Build.VERSION.SDK_INT > 21) && (j.a(paramContext, w.a(paramContext, aa.a("Hg8bFi4yFRIgFQIBDBIG"), SurvivalService.class.getName()))))
      a(paramContext);
  }

  public void onCreate()
  {
    super.onCreate();
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return 1;
  }

  public boolean onStartJob(JobParameters paramJobParameters)
  {
    return false;
  }

  public boolean onStopJob(JobParameters paramJobParameters)
  {
    a(this);
    return false;
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.SurvivalService
 * JD-Core Version:    0.6.2
 */
 aa.a("JwMRACkvHBMGHBUF") -> jobscheduler

 aa.a("Hg8bFi4yFRIgFQIBDBIG") -> ScheduleService

 aa.a("Hg8bFi4yFRIgFQIBDBIG") -> ScheduleService
