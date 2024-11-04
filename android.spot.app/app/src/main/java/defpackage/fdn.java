package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdn extends fcl {
    public static fdn a;

    public fdn(fcn fcnVar) {
        super(fcnVar);
    }

    protected static final String e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            StringBuilder sb = new StringBuilder();
            if (charAt != '-') {
                str = "";
            }
            sb.append(str);
            sb.append(Math.round(Math.pow(10.0d, valueOf.length() - 1)));
            sb.append("...");
            sb.append(str);
            sb.append(Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d));
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return "-";
        }
        return obj.getClass().getCanonicalName();
    }

    @Override // defpackage.fcl
    protected final void a() {
        synchronized (fdn.class) {
            a = this;
        }
    }

    public final void b(fdj fdjVar, String str) {
        String str2;
        if (fdjVar != null) {
            str2 = fdjVar.toString();
        } else {
            str2 = "no hit data";
        }
        C("Discarding hit. ".concat(str), str2);
    }

    public final void c(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        C("Discarding hit. ".concat(str), sb.toString());
    }

    public final synchronized void d(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        boolean z;
        fdc k = k();
        if (k.b == null) {
            synchronized (k) {
                if (k.b == null) {
                    ApplicationInfo applicationInfo = k.a.a.getApplicationInfo();
                    String a2 = flz.a();
                    if (applicationInfo != null) {
                        String str2 = applicationInfo.processName;
                        if (str2 != null && str2.equals(a2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        k.b = Boolean.valueOf(z);
                    }
                    if ((k.b == null || !k.b.booleanValue()) && "com.google.android.gms.analytics".equals(a2)) {
                        k.b = Boolean.TRUE;
                    }
                    if (k.b == null) {
                        k.b = Boolean.TRUE;
                        k.a.h().u("My process not in the list of running processes");
                    }
                }
            }
        }
        if (k.b.booleanValue()) {
            k();
            c = 'C';
        } else {
            k();
            c = 'c';
        }
        String str3 = "3" + "01VDIWEA?".charAt(i) + c + fcm.a + ":" + q(str, e(obj), e(obj2), e(obj3));
        if (str3.length() > 1024) {
            str3 = str3.substring(0, 1024);
        }
        fdr fdrVar = this.c.f;
        if (fdrVar == null || !fdrVar.J()) {
            fdrVar = null;
        }
        if (fdrVar != null) {
            fdq fdqVar = fdrVar.b;
            if (fdqVar.a() == 0) {
                fdqVar.d();
            }
            if (str3 == null) {
                str3 = "";
            }
            synchronized (fdqVar) {
                long j = fdqVar.b.a.getLong(fdqVar.b(), 0L);
                if (j <= 0) {
                    SharedPreferences.Editor edit = fdqVar.b.a.edit();
                    edit.putString(fdqVar.c(), str3);
                    edit.putLong(fdqVar.b(), 1L);
                    edit.apply();
                    return;
                }
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;
                long j2 = j + 1;
                long j3 = Long.MAX_VALUE / j2;
                SharedPreferences.Editor edit2 = fdqVar.b.a.edit();
                if (leastSignificantBits < j3) {
                    edit2.putString(fdqVar.c(), str3);
                }
                edit2.putLong(fdqVar.b(), j2);
                edit2.apply();
            }
        }
    }
}
