package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jct implements ServiceConnection {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jct(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.b != 0) {
            ((izc) this.a).c(new iza(this, iBinder));
        } else {
            ((jcs) this.a).c(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (this.b != 0) {
            ((izc) this.a).c(new izb(this));
        } else {
            ((jcs) this.a).d();
        }
    }
}
