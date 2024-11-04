package defpackage;

import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gas extends lyy {
    public final Object a = new Object();
    public final hsb b;
    public boolean c;
    public int d;
    public int e;

    public gas(hsb hsbVar) {
        this.b = hsbVar;
    }

    @Override // defpackage.lyy
    public final void b() {
        synchronized (this.a) {
            if (!this.c) {
                hsb hsbVar = this.b;
                hsbVar.b = SystemClock.elapsedRealtime() - hsbVar.a;
            }
        }
    }

    @Override // defpackage.mjo
    public final void c(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }

    @Override // defpackage.mjo
    public final void d(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    @Override // defpackage.lyy
    public final void e(lyp lypVar) {
        synchronized (this.a) {
            hsb hsbVar = this.b;
            SocketAddress socketAddress = (SocketAddress) lypVar.a(lzr.a);
            if (!(socketAddress instanceof InetSocketAddress)) {
                if (socketAddress instanceof mcr) {
                    hsbVar.u = 2;
                } else if (socketAddress instanceof mch) {
                    hsbVar.u = 3;
                }
            }
        }
    }
}
