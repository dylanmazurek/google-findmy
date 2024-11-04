package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frk {
    public final Object a;
    public Object b;

    public frk(dwj dwjVar) {
        this.a = dwjVar;
    }

    public final CameraPosition a() {
        try {
            Object obj = this.a;
            Parcel b = ((duf) obj).b(1, ((duf) obj).a());
            CameraPosition cameraPosition = (CameraPosition) duh.a(b, CameraPosition.CREATOR);
            b.recycle();
            return cameraPosition;
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    public final void b(frh frhVar) {
        try {
            if (frhVar == null) {
                ((frs) this.a).e(null);
                return;
            }
            ((frs) this.a).e(new fen(frhVar, 9));
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    public final void c(frj frjVar) {
        try {
            if (frjVar == null) {
                ((frs) this.a).f(null);
                return;
            }
            ((frs) this.a).f(new fen(frjVar, 11));
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    public final void d(boolean z) {
        try {
            Object obj = this.a;
            Parcel a = ((duf) obj).a();
            int i = duh.a;
            a.writeInt(z ? 1 : 0);
            ((duf) obj).c(51, a);
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    public final void e() {
        synchronized (this.a) {
            ((SparseIntArray) this.a).clear();
        }
    }

    public final int f(int i) {
        int i2;
        synchronized (this.a) {
            i2 = ((SparseIntArray) this.a).get(i, -1);
        }
        return i2;
    }

    public final bym g() {
        frw frwVar;
        try {
            if (this.b == null) {
                Object obj = this.a;
                Parcel b = ((duf) obj).b(25, ((duf) obj).a());
                IBinder readStrongBinder = b.readStrongBinder();
                if (readStrongBinder == null) {
                    frwVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (queryLocalInterface instanceof frw) {
                        frwVar = (frw) queryLocalInterface;
                    } else {
                        frwVar = new frw(readStrongBinder);
                    }
                }
                b.recycle();
                this.b = new bym(frwVar);
            }
            return (bym) this.b;
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    public frk() {
        this(fgp.a);
    }

    public frk(fgq fgqVar) {
        this.a = new SparseIntArray();
        fma.aR(fgqVar);
        this.b = fgqVar;
    }

    public frk(frs frsVar) {
        new HashMap();
        new HashMap();
        fma.aR(frsVar);
        this.a = frsVar;
    }
}
