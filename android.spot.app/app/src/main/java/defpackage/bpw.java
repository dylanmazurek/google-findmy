package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.RemoteViews;
import j$.util.DesugarTimeZone;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpw {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        Notification.Action.Builder allowGeneratedReplies;
        allowGeneratedReplies = builder.setAllowGeneratedReplies(z);
        return allowGeneratedReplies;
    }

    public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
        Notification.Builder customBigContentView;
        customBigContentView = builder.setCustomBigContentView(remoteViews);
        return customBigContentView;
    }

    static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
        Notification.Builder customContentView;
        customContentView = builder.setCustomContentView(remoteViews);
        return customContentView;
    }

    static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
        Notification.Builder customHeadsUpContentView;
        customHeadsUpContentView = builder.setCustomHeadsUpContentView(remoteViews);
        return customHeadsUpContentView;
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
        Notification.Builder remoteInputHistory;
        remoteInputHistory = builder.setRemoteInputHistory(charSequenceArr);
        return remoteInputHistory;
    }

    public static Handler f(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Handler g(Looper looper, Handler.Callback callback) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper, callback);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, callback, true);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static long h(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                dga.c(e, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            String str2 = dga.a;
            return 0L;
        }
    }

    public static String i(Map map, String str) {
        String str2;
        if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public static dfh j(hww hwwVar) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        ?? r1 = hwwVar.c;
        long currentTimeMillis = System.currentTimeMillis();
        if (r1 != 0) {
            String str = (String) r1.get("Date");
            if (str != null) {
                j = h(str);
            } else {
                j = 0;
            }
            String str2 = (String) r1.get("Cache-Control");
            int i = 0;
            if (str2 != null) {
                String[] split = str2.split(",", 0);
                z = false;
                j2 = 0;
                j3 = 0;
                while (i < split.length) {
                    String trim = split[i].trim();
                    if (!trim.equals("no-cache") && !trim.equals("no-store")) {
                        if (trim.startsWith("max-age=")) {
                            try {
                                j3 = Long.parseLong(trim.substring(8));
                            } catch (Exception unused) {
                            }
                        } else if (trim.startsWith("stale-while-revalidate=")) {
                            j2 = Long.parseLong(trim.substring(23));
                        } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                            z = true;
                        }
                        i++;
                    } else {
                        return null;
                    }
                }
                i = 1;
            } else {
                z = false;
                j2 = 0;
                j3 = 0;
            }
            String str3 = (String) r1.get("Expires");
            if (str3 != null) {
                j4 = h(str3);
            } else {
                j4 = 0;
            }
            String str4 = (String) r1.get("Last-Modified");
            if (str4 != null) {
                j5 = h(str4);
            } else {
                j5 = 0;
            }
            String str5 = (String) r1.get("ETag");
            if (i != 0) {
                j7 = currentTimeMillis + (j3 * 1000);
                if (z) {
                    j8 = j7;
                } else {
                    Long.signum(j2);
                    j8 = (j2 * 1000) + j7;
                }
                j6 = j8;
            } else {
                j6 = 0;
                if (j > 0 && j4 >= j) {
                    j7 = currentTimeMillis + (j4 - j);
                    j6 = j7;
                } else {
                    j7 = 0;
                }
            }
            dfh dfhVar = new dfh();
            dfhVar.a = (byte[]) hwwVar.b;
            dfhVar.b = str5;
            dfhVar.f = j7;
            dfhVar.e = j6;
            dfhVar.c = j;
            dfhVar.d = j5;
            dfhVar.g = r1;
            dfhVar.h = hwwVar.d;
            return dfhVar;
        }
        return null;
    }
}
