package defpackage;

import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbh extends Handler {
    final /* synthetic */ lbi b;
    private boolean c = false;
    public lbg a = null;

    public lbh(lbi lbiVar) {
        this.b = lbiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        frv frvVar;
        lbg lbgVar;
        if (message.what == 1) {
            this.c = false;
            if (this.a != null) {
                sendEmptyMessage(0);
                return;
            }
            return;
        }
        removeMessages(0);
        if (!this.c && this.a != null) {
            try {
                Object obj = this.b.c.a;
                Parcel b = ((duf) obj).b(26, ((duf) obj).a());
                IBinder readStrongBinder = b.readStrongBinder();
                if (readStrongBinder == null) {
                    frvVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if (queryLocalInterface instanceof frv) {
                        frvVar = (frv) queryLocalInterface;
                    } else {
                        frvVar = new frv(readStrongBinder);
                    }
                }
                b.recycle();
                bym bymVar = new bym(frvVar);
                synchronized (this) {
                    lbgVar = this.a;
                    this.a = null;
                    this.c = true;
                }
                lbgVar.b = new jxe(this, 18);
                lbgVar.f = bymVar;
                lbgVar.d = this.b.c.a().b;
                lbgVar.c = new lbo(Math.pow(2.0d, Math.min(r0, lbgVar.e.j)) * 256.0d);
                this.b.g.execute(lbgVar);
            } catch (RemoteException e) {
                throw new fsc(e);
            }
        }
    }
}
