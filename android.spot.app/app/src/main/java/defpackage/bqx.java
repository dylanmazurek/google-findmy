package defpackage;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bqx {
    public static int b(Context context, String str) {
        amr.p(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            Object obj = bqh.a;
            if (bqh.a(context, (NotificationManager) context.getSystemService("notification"))) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static int c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return bqr.a(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static Context d(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return bqs.a(context);
        }
        return null;
    }

    public static ColorStateList e(Context context, int i) {
        ColorStateList colorStateList;
        Object obj;
        hxh hxhVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        bri briVar = new bri(resources, theme2);
        synchronized (brm.c) {
            SparseArray sparseArray = (SparseArray) brm.b.get(briVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (hxhVar = (hxh) sparseArray.get(i)) != null) {
                if (((Configuration) hxhVar.b).equals(briVar.a.getConfiguration()) && (((theme = briVar.b) == null && hxhVar.a == 0) || (theme != null && hxhVar.a == theme.hashCode()))) {
                    obj = hxhVar.c;
                } else {
                    sparseArray.remove(i);
                }
            }
            obj = null;
        }
        if (obj == null) {
            TypedValue typedValue = (TypedValue) brm.a.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                brm.a.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                try {
                    colorStateList = brc.a(resources, resources.getXml(i), theme2);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateList != null) {
                synchronized (brm.c) {
                    SparseArray sparseArray2 = (SparseArray) brm.b.get(briVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        brm.b.put(briVar, sparseArray2);
                    }
                    sparseArray2.append(i, new hxh(colorStateList, briVar.a.getConfiguration(), theme2));
                }
                obj = colorStateList;
            } else if (Build.VERSION.SDK_INT >= 23) {
                obj = brh.b(resources, i, theme2);
            } else {
                obj = resources.getColorStateList(i);
            }
        }
        return (ColorStateList) obj;
    }

    public static File f(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return bqs.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static String g(Context context) {
        String concat = String.valueOf(context.getPackageName()).concat(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        if (bpd.e(context, concat) == 0) {
            return concat;
        }
        throw new RuntimeException(a.ag(concat, "Permission ", " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static void h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        i(context, broadcastReceiver, intentFilter, null, i);
    }

    public static void i(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        if ((i & 1) != 0) {
            if ((i & 4) == 0) {
                i |= 2;
            } else {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            }
        }
        int i2 = i;
        int i3 = i2 & 4;
        if ((i2 & 2) == 0) {
            if (i3 == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
        } else if (i3 != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            bqw.a(context, broadcastReceiver, intentFilter, str, null, i2);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            bqt.b(context, broadcastReceiver, intentFilter, str, null, i2);
        } else if (i3 != 0 && str == null) {
            context.registerReceiver(broadcastReceiver, intentFilter, g(context), null);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, str, null);
        }
    }
}
