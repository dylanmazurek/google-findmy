package defpackage;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.util.EventLog;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezx extends FilterInputStream implements InputStreamRetargetInterface {
    final /* synthetic */ ezy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezx(ezy ezyVar, InputStream inputStream) {
        super(inputStream);
        this.a = ezyVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
            ezy ezyVar = this.a;
            long elapsedRealtime = SystemClock.elapsedRealtime() - ezyVar.f;
            ezy ezyVar2 = this.a;
            long uidTxBytes = TrafficStats.getUidTxBytes(ezyVar.b);
            long uidRxBytes = TrafficStats.getUidRxBytes(ezyVar2.b);
            ezy ezyVar3 = this.a;
            EventLog.writeEvent(52001, ezyVar3.a, Long.valueOf(ezyVar3.e), Long.valueOf(elapsedRealtime), Long.valueOf(uidTxBytes - this.a.c), Long.valueOf(uidRxBytes - this.a.d));
        } catch (Throwable th) {
            ezy ezyVar4 = this.a;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - ezyVar4.f;
            ezy ezyVar5 = this.a;
            long uidTxBytes2 = TrafficStats.getUidTxBytes(ezyVar4.b);
            long uidRxBytes2 = TrafficStats.getUidRxBytes(ezyVar5.b);
            ezy ezyVar6 = this.a;
            EventLog.writeEvent(52001, ezyVar6.a, Long.valueOf(ezyVar6.e), Long.valueOf(elapsedRealtime2), Long.valueOf(uidTxBytes2 - this.a.c), Long.valueOf(uidRxBytes2 - this.a.d));
            throw th;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
