package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjp implements fxm {
    private final fje a;
    private final int b;
    private final fik c;
    private final long d;
    private final long e;

    public fjp(fje fjeVar, int i, fik fikVar, long j, long j2) {
        this.a = fjeVar;
        this.b = i;
        this.c = fikVar;
        this.d = j;
        this.e = j2;
    }

    public static ConnectionTelemetryConfiguration b(fjb fjbVar, fkn fknVar, int i) {
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration;
        int[] iArr;
        int[] iArr2;
        ConnectionInfo connectionInfo = fknVar.m;
        if (connectionInfo == null) {
            connectionTelemetryConfiguration = null;
        } else {
            connectionTelemetryConfiguration = connectionInfo.d;
        }
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.b || ((iArr = connectionTelemetryConfiguration.d) != null ? !fma.C(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.f) == null || !fma.C(iArr2, i))) || fjbVar.j >= connectionTelemetryConfiguration.e) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }

    @Override // defpackage.fxm
    public final void a(fxs fxsVar) {
        fjb b;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        if (this.a.g()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = flk.a().a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) && (b = this.a.b(this.c)) != null) {
                Object obj = b.b;
                if (obj instanceof fkn) {
                    boolean z2 = true;
                    if (this.d > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (rootTelemetryConfiguration != null) {
                        z &= rootTelemetryConfiguration.c;
                        fkn fknVar = (fkn) obj;
                        boolean B = fknVar.B();
                        i = rootTelemetryConfiguration.d;
                        int i7 = rootTelemetryConfiguration.e;
                        int i8 = rootTelemetryConfiguration.a;
                        if (B && !fknVar.n()) {
                            ConnectionTelemetryConfiguration b2 = b(b, fknVar, this.b);
                            if (b2 != null) {
                                if (!b2.c || this.d <= 0) {
                                    z2 = false;
                                }
                                i7 = b2.e;
                                i2 = i8;
                                z = z2;
                            } else {
                                return;
                            }
                        } else {
                            i2 = i8;
                        }
                        i3 = i7;
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    fje fjeVar = this.a;
                    if (fxsVar.i()) {
                        i4 = 0;
                        i5 = 0;
                    } else {
                        if (((fxv) fxsVar).c) {
                            i4 = 100;
                        } else {
                            Exception d = fxsVar.d();
                            if (d instanceof fhn) {
                                Status status = ((fhn) d).a;
                                int i9 = status.g;
                                ConnectionResult connectionResult = status.j;
                                if (connectionResult == null) {
                                    i4 = i9;
                                } else {
                                    i5 = connectionResult.c;
                                    i4 = i9;
                                }
                            } else {
                                i4 = 101;
                            }
                        }
                        i5 = -1;
                    }
                    if (z) {
                        long j3 = this.d;
                        long j4 = this.e;
                        long currentTimeMillis = System.currentTimeMillis();
                        i6 = (int) (SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = currentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                        i6 = -1;
                    }
                    int i10 = ((fkn) obj).i;
                    Handler handler = fjeVar.n;
                    handler.sendMessage(handler.obtainMessage(18, new fjq(new MethodInvocation(this.b, i4, i5, j, j2, null, null, i10, i6), i2, i, i3)));
                }
            }
        }
    }
}
