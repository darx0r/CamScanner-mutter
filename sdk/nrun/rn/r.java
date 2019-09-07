package sdk.nrun.rn;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract interface r extends IInterface
{
  public abstract List<String> a();

  public static abstract class a extends Binder
    implements r
  {
    private static final String a = aa.a("PggYXSQ1DBldAh5ZNQMMW1cWPi8cHT41FhsfFQI=");

    public a()
    {
      attachInterface(this, aa.a("PggYXSQ1DBldAh5ZNQMMW1cWPi8cHT41FhsfFQI="));
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default:
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
        paramParcel2.writeString(a);
        return true;
      case 1:
      }
      paramParcel1.enforceInterface(a);
      paramParcel1 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeStringList(paramParcel1);
      return true;
    }
  }
}

/* Location:           classes-dex2jar.jar
 * Qualified Name:     sdk.nrun.rn.r
 * JD-Core Version:    0.6.2
 */
 aa.a("PggYXSQ1DBldAh5ZNQMMW1cWPi8cHT41FhsfFQI=") -> sdk.nrun.rn.ProcessControll

 aa.a("PggYXSQ1DBldAh5ZNQMMW1cWPi8cHT41FhsfFQI=") -> sdk.nrun.rn.ProcessControll
