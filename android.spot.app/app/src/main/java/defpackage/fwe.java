package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwe extends fvc {
    final /* synthetic */ String a;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwe(fht fhtVar, String str, int i) {
        super(fhtVar);
        this.a = str;
        this.h = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ fhz a(Status status) {
        return new fwd(status);
    }

    @Override // defpackage.fio
    protected final /* bridge */ /* synthetic */ void c(fhh fhhVar) {
        flb flbVar;
        fvz fvzVar = (fvz) fhhVar;
        fvw fvwVar = new fvw(this);
        int i = this.h;
        String str = this.a;
        flb flbVar2 = null;
        try {
            fvs L = fvzVar.L();
            Parcel a = L.a();
            duh.d(a, fvwVar);
            a.writeString(str);
            a.writeString(null);
            a.writeInt(i);
            a.writeInt(1);
            Parcel b = L.b(505, a);
            IBinder readStrongBinder = b.readStrongBinder();
            if (readStrongBinder == null) {
                flbVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                if (queryLocalInterface instanceof flb) {
                    flbVar = (flb) queryLocalInterface;
                } else {
                    flbVar = new flb(readStrongBinder);
                }
            }
            b.recycle();
            flbVar2 = flbVar;
        } catch (RemoteException unused) {
            fvwVar.c(8, null, null, null);
        }
        synchronized (this.c) {
            this.g = flbVar2;
        }
    }
}
