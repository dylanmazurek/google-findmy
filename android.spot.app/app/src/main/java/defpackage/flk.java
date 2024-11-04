package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flk {
    private static flk b;
    private static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    private flk() {
    }

    public static synchronized flk a() {
        flk flkVar;
        synchronized (flk.class) {
            if (b == null) {
                b = new flk();
            }
            flkVar = b;
        }
        return flkVar;
    }

    public final synchronized void b(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.a = c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
        if (rootTelemetryConfiguration2 != null) {
            if (rootTelemetryConfiguration2.a >= rootTelemetryConfiguration.a) {
                return;
            }
        }
        this.a = rootTelemetryConfiguration;
    }
}
