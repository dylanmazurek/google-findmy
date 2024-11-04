package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkj implements ServiceConnection {
    final /* synthetic */ fkn a;
    private final int b;

    public fkj(fkn fknVar, int i) {
        this.a = fknVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        flg flgVar;
        int i;
        int i2;
        if (iBinder == null) {
            fkn fknVar = this.a;
            synchronized (fknVar.d) {
                i = fknVar.h;
            }
            if (i == 3) {
                fknVar.l = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = fknVar.c;
            handler.sendMessage(handler.obtainMessage(i2, fknVar.n.get(), 16));
            return;
        }
        synchronized (this.a.e) {
            fkn fknVar2 = this.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof flg)) {
                flgVar = (flg) queryLocalInterface;
            } else {
                flgVar = new flg(iBinder);
            }
            fknVar2.o = flgVar;
        }
        this.a.G(0, this.b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.e) {
            this.a.o = null;
        }
        fkn fknVar = this.a;
        int i = this.b;
        Handler handler = fknVar.c;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
