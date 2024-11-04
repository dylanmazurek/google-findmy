package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgp extends fgq {
    private static final Object e = new Object();
    public static final fgp a = new fgp();
    public static final int b = fgq.c;

    public final fxs a(fhu fhuVar, fhu... fhuVarArr) {
        fje fjeVar;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(fhuVar);
        arrayList.addAll(Arrays.asList(fhuVarArr));
        synchronized (fje.c) {
            fma.aS(fje.d, "Must guarantee manager is non-null before using getInstance");
            fjeVar = fje.d;
        }
        fil filVar = new fil(arrayList);
        Handler handler = fjeVar.n;
        handler.sendMessage(handler.obtainMessage(2, filVar));
        Object obj = filVar.d;
        fgn fgnVar = new fgn(0);
        return ((fxs) ((bym) obj).a).c(fxu.a, fgnVar);
    }

    public final void b(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof aj) {
                be a2 = ((aj) activity).a();
                fhf fhfVar = new fhf();
                fma.aS(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                fhfVar.af = dialog;
                if (onCancelListener != null) {
                    fhfVar.ag = onCancelListener;
                }
                fhfVar.q(a2, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        fgm fgmVar = new fgm();
        fma.aS(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        fgmVar.a = dialog;
        if (onCancelListener != null) {
            fgmVar.b = onCancelListener;
        }
        fgmVar.show(fragmentManager, str);
    }

    public final Dialog c(Context context, int i, fkt fktVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(fkq.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b2 = fkq.b(context, i);
        if (b2 != null) {
            builder.setPositiveButton(b2, fktVar);
        }
        String d = fkq.d(context, i);
        if (d != null) {
            builder.setTitle(d);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void d(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        String d;
        String e2;
        int i3;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new fgo(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i == 6) {
            d = fkq.f(context, "common_google_play_services_resolution_required_title");
            i2 = 6;
        } else {
            i2 = i;
            d = fkq.d(context, i);
        }
        if (d == null) {
            d = context.getResources().getString(com.google.android.apps.adm.R.string.common_google_play_services_notification_ticker);
        }
        if (i2 != 6 && i2 != 19) {
            e2 = fkq.c(context, i2);
        } else {
            e2 = fkq.e(context, "common_google_play_services_resolution_required_text", fkq.a(context));
        }
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        fma.aR(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        bpm bpmVar = new bpm(context);
        bpmVar.t = true;
        bpmVar.g(true);
        bpmVar.i(d);
        bpk bpkVar = new bpk();
        bpkVar.c(e2);
        bpmVar.n(bpkVar);
        boolean a2 = flu.a(context);
        int i4 = R.drawable.stat_sys_warning;
        if (a2) {
            fma.aN(true);
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            bpmVar.m(i4);
            bpmVar.k = 2;
            if (flu.c(context)) {
                bpmVar.f(com.google.android.apps.adm.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.apps.adm.R.string.common_open_on_phone), pendingIntent);
            } else {
                bpmVar.g = pendingIntent;
            }
        } else {
            bpmVar.m(R.drawable.stat_sys_warning);
            bpmVar.p(resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_notification_ticker));
            bpmVar.r(System.currentTimeMillis());
            bpmVar.g = pendingIntent;
            bpmVar.h(e2);
        }
        if (fma.w()) {
            fma.aN(fma.w());
            synchronized (e) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.google.android.apps.adm.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel != null) {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            } else {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            }
            bpmVar.A = "com.google.android.gms.availability";
        }
        Notification b2 = bpmVar.b();
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            i3 = 39789;
        } else {
            fhd.b.set(false);
            i3 = 10436;
        }
        notificationManager.notify(i3, b2);
    }

    public final void e(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog c = c(activity, i, new fkr(h(activity, i, "d"), activity, i2), onCancelListener);
        if (c == null) {
            return;
        }
        b(activity, c, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
