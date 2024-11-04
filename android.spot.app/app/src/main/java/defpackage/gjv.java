package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjv implements gjm {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;

    public gjv(Context context) {
        this.b = context;
    }

    @Override // defpackage.gjm
    public final jer a() {
        jer i;
        int currentInterruptionFilter;
        jer i2;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationManager notificationManager = (NotificationManager) this.b.getSystemService("notification");
            if (notificationManager != null) {
                currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                if (currentInterruptionFilter != 1) {
                    if (currentInterruptionFilter != 2) {
                        if (currentInterruptionFilter != 3) {
                            if (currentInterruptionFilter != 4) {
                                i2 = jdl.a;
                            } else {
                                i2 = jer.i(gjl.FILTER_ALARMS);
                            }
                        } else {
                            i2 = jer.i(gjl.FILTER_NONE);
                        }
                    } else {
                        i2 = jer.i(gjl.FILTER_PRIORITY);
                    }
                } else {
                    i2 = jer.i(gjl.FILTER_ALL);
                }
                ((jol) a.k().j("com/google/android/libraries/notifications/internal/rpc/impl/InterruptionFilterStateImpl", "getCurrent", 50, "InterruptionFilterStateImpl.java")).x("Current is %s (SDK >= M, NotificationManager's interruption filter == %s).", i2, currentInterruptionFilter);
                return i2;
            }
            ((jol) a.k().j("com/google/android/libraries/notifications/internal/rpc/impl/InterruptionFilterStateImpl", "getCurrent", 41, "InterruptionFilterStateImpl.java")).r("Current unknown (SDK >= M, NotificationManager missing).");
            return jdl.a;
        }
        try {
            int i3 = Settings.Global.getInt(this.b.getContentResolver(), "zen_mode");
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            i = jdl.a;
                        } else {
                            i = jer.i(gjl.FILTER_ALARMS);
                        }
                    } else {
                        i = jer.i(gjl.FILTER_NONE);
                    }
                } else {
                    i = jer.i(gjl.FILTER_PRIORITY);
                }
            } else {
                i = jer.i(gjl.FILTER_ALL);
            }
            ((jol) a.k().j("com/google/android/libraries/notifications/internal/rpc/impl/InterruptionFilterStateImpl", "getCurrent", 64, "InterruptionFilterStateImpl.java")).x("Current is %s (SDK < M, zen_mode == %s).", i, i3);
            return i;
        } catch (Settings.SettingNotFoundException unused) {
            ((jol) a.k().j("com/google/android/libraries/notifications/internal/rpc/impl/InterruptionFilterStateImpl", "getCurrent", 60, "InterruptionFilterStateImpl.java")).r("Current unknown (SDK < M, zen_mode missing).");
            return jdl.a;
        }
    }
}
