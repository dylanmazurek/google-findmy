package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lak implements ktp {
    public final jjr e;
    private final jis i;
    private final jiy j;
    private static final hmq f = new hmq("google.internal.spot.v1.SpotReportingService");
    public static final hmq a = new hmq("google.internal.spot.v1.SpotReportingService.");
    private static final hmq g = new hmq("google.internal.spot.v1.SpotReportingService/");
    public static final kto b = new laj(1, (byte[]) null);
    public static final kto c = new laj(0);
    public static final lak d = new lak();
    private static final hmq h = new hmq("spot-pa.googleapis.com");

    private lak() {
        jin jinVar = new jin();
        jinVar.h("canary-spot-pa.sandbox.googleapis.com");
        jinVar.h("dev-spot-pa.sandbox.googleapis.com");
        jinVar.h("spot-pa.googleapis.com");
        jinVar.h("spot-pa.googleapis.com");
        this.i = jinVar.g();
        jjp jjpVar = new jjp();
        jjpVar.d("https://www.googleapis.com/auth/spot");
        jjpVar.d("https://www.googleapis.com/auth/android_device_manager");
        jjpVar.d("https://www.googleapis.com/auth/spot");
        jjpVar.d("https://www.googleapis.com/auth/android_device_manager");
        this.e = jjpVar.g();
        kto ktoVar = b;
        kto ktoVar2 = c;
        jjr.o(ktoVar, ktoVar2);
        jiu jiuVar = new jiu();
        jiuVar.d("UploadScans", ktoVar);
        jiuVar.d("UploadOwnerScans", ktoVar2);
        this.j = jiuVar.b();
        new jiu().b();
    }

    @Override // defpackage.ktp
    public final hmq a() {
        return f;
    }

    @Override // defpackage.ktp
    public final hmq b() {
        return h;
    }

    @Override // defpackage.ktp
    public final kto c(String str) {
        String str2 = g.a;
        if (str.startsWith(str2)) {
            String substring = str.substring(str2.length());
            if (this.j.containsKey(substring)) {
                return (kto) this.j.get(substring);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.ktp
    public final List d() {
        return this.i;
    }
}
