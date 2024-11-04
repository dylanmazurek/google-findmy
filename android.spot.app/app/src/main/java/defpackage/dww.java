package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.google.android.apps.adm.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dww implements lsh {
    private final mko a;
    private final mko b;

    public dww(mko mkoVar, mko mkoVar2) {
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        String str;
        String str2;
        Long l;
        Integer num;
        Object systemService;
        Context b = ((lry) this.a).b();
        Set<dyc> a = ((lsp) this.b).a();
        if (Build.VERSION.SDK_INT >= 26) {
            systemService = b.getSystemService((Class<Object>) NotificationManager.class);
            NotificationManager notificationManager = (NotificationManager) systemService;
            for (dyc dycVar : a) {
                String str3 = dycVar.a;
                String string = b.getString(dycVar.b);
                int i = dycVar.d;
                int i2 = i - 1;
                if (i != 0) {
                    int i3 = -1000;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 == 5) {
                                            i3 = 4;
                                        }
                                    } else {
                                        i3 = 3;
                                    }
                                } else {
                                    i3 = 2;
                                }
                            } else {
                                i3 = 1;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                    NotificationChannel notificationChannel = new NotificationChannel(str3, string, i3);
                    notificationChannel.setDescription(b.getString(dycVar.c));
                    notificationManager.createNotificationChannel(notificationChannel);
                } else {
                    throw null;
                }
            }
        }
        gnu gnuVar = new gnu();
        gnuVar.d = Build.MANUFACTURER + " " + Build.MODEL;
        gnuVar.e = 86400000L;
        gnuVar.f = "com.google.android.libraries.notifications.entrypoints.scheduled.ScheduledTaskService";
        gnuVar.b(1);
        gnuVar.a(false);
        gnuVar.l = (byte) (gnuVar.l | 14);
        gnuVar.i = 7;
        gnuVar.j = true;
        byte b2 = gnuVar.l;
        gnuVar.k = true;
        gnuVar.l = (byte) (b2 | 48);
        gnuVar.a = "find_my_device";
        gnuVar.b = "289722593072";
        gnuVar.b(1);
        gnuVar.g = 111000000;
        gnuVar.c = new gnw(Integer.valueOf(R.drawable.gs_android_find_my_device_vd_theme_24), Integer.valueOf(R.string.app_name));
        gnuVar.a(true);
        if (gnuVar.l == 63 && (str = gnuVar.a) != null && gnuVar.m != 0 && (str2 = gnuVar.d) != null && (l = gnuVar.e) != null && (num = gnuVar.i) != null) {
            return new gnv(str, gnuVar.b, 1, gnuVar.c, str2, l, gnuVar.f, gnuVar.g, gnuVar.h, num, gnuVar.j, gnuVar.k);
        }
        StringBuilder sb = new StringBuilder();
        if (gnuVar.a == null) {
            sb.append(" clientId");
        }
        if (gnuVar.m == 0) {
            sb.append(" defaultEnvironment");
        }
        if (gnuVar.d == null) {
            sb.append(" deviceName");
        }
        if (gnuVar.e == null) {
            sb.append(" registrationStalenessTimeMs");
        }
        if ((gnuVar.l & 1) == 0) {
            sb.append(" disableEntrypoints");
        }
        if ((gnuVar.l & 2) == 0) {
            sb.append(" useDefaultFirebaseApp");
        }
        if ((gnuVar.l & 4) == 0) {
            sb.append(" useFirebaseReceiver");
        }
        if ((gnuVar.l & 8) == 0) {
            sb.append(" enableEndToEndEncryption");
        }
        if (gnuVar.i == null) {
            sb.append(" periodRegistrationIntervalDays");
        }
        if ((gnuVar.l & 16) == 0) {
            sb.append(" enableGrowthKitIfExists");
        }
        if ((gnuVar.l & 32) == 0) {
            sb.append(" enableInAppPushFlow");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
