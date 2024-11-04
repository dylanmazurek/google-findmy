package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqi implements gqb {
    private final gqm a;
    private final gqb b;
    private final gvg c;
    private final Context d;
    private final msw e;
    private final ddg f;

    public gqi(gqm gqmVar, ddg ddgVar, gqb gqbVar, gvg gvgVar, Context context, msw mswVar) {
        gqbVar.getClass();
        gvgVar.getClass();
        this.a = gqmVar;
        this.f = ddgVar;
        this.b = gqbVar;
        this.c = gvgVar;
        this.d = context;
        this.e = mswVar;
    }

    private final gqe e(gqe gqeVar) {
        gqd b = gqeVar.b();
        gqc gqcVar = gqc.d;
        Set a = ((lsp) this.f.a).a();
        a.getClass();
        b.c(gqcVar, mkm.ar(a, ",", null, null, null, 62));
        return b.a();
    }

    private final gqe f(gqe gqeVar) {
        gqeVar.getClass();
        String c = lvv.c();
        c.getClass();
        if (c.length() > 0) {
            ContentResolver contentResolver = this.a.a.getContentResolver();
            contentResolver.getClass();
            long a = fyo.a(contentResolver, "android_id", 0L);
            if (a != 0) {
                gqd b = gqeVar.b();
                gqc gqcVar = gqc.b;
                moz.N(16);
                String l = Long.toString(a, 16);
                l.getClass();
                b.c(gqcVar, l);
                gqc gqcVar2 = gqc.c;
                ljh k = lny.c.k();
                k.getClass();
                lim v = lim.v(lvv.c());
                if (!k.b.y()) {
                    k.t();
                }
                lny lnyVar = (lny) k.b;
                lnyVar.a |= 8;
                lnyVar.b = v;
                ljn q = k.q();
                q.getClass();
                b.c(gqcVar2, frx.F((lny) q));
                return b.a();
            }
            return gqeVar;
        }
        return gqeVar;
    }

    @Override // defpackage.gqb
    public final gqf a(gqe gqeVar) {
        String str;
        gqe e = e(f(gqeVar));
        gqf a = this.b.a(e);
        int i = e.e;
        String packageName = this.d.getPackageName();
        if (i == 2) {
            str = e.a.getPath();
        } else {
            str = "";
        }
        String str2 = str;
        Integer num = a.a;
        if (num == null) {
            num = -1;
        }
        int i2 = e.e;
        int intValue = num.intValue();
        if (i2 != 0) {
            gqb gqbVar = this.b;
            this.c.b(packageName, gqbVar.c(), str2, intValue, fzo.u(i2));
            return a;
        }
        throw null;
    }

    @Override // defpackage.gqb
    public final jyz b(gqe gqeVar) {
        gqeVar.getClass();
        return mpd.r(this.e, new dzk(this, gqeVar, (mmx) null, 15));
    }

    @Override // defpackage.gqb
    public final String c() {
        return "common";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.gqe r9, defpackage.mmx r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.gqh
            if (r0 == 0) goto L13
            r0 = r10
            gqh r0 = (defpackage.gqh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gqh r0 = new gqh
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            gqe r9 = r0.e
            gqi r0 = r0.d
            defpackage.mjo.o(r10)
            goto L54
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.mjo.o(r10)
            gqe r10 = r8.f(r9)
            gqe r10 = r8.e(r10)
            gqb r2 = r8.b
            jyz r10 = r2.b(r10)
            r10.getClass()
            r0.d = r8
            r0.e = r9
            r0.c = r3
            java.lang.Object r10 = defpackage.mpd.p(r10, r0)
            if (r10 == r1) goto L93
            r0 = r8
        L54:
            r1 = r10
            gqf r1 = (defpackage.gqf) r1
            gvg r2 = r0.c
            android.content.Context r3 = r0.d
            java.lang.String r3 = r3.getPackageName()
            gqb r0 = r0.b
            java.lang.String r4 = r0.c()
            int r0 = r9.e
            r5 = 2
            if (r0 != r5) goto L71
            java.net.URL r0 = r9.a
            java.lang.String r0 = r0.getPath()
            goto L73
        L71:
            java.lang.String r0 = ""
        L73:
            r5 = r0
            java.lang.Integer r0 = r1.a
            if (r0 != 0) goto L7e
            java.lang.Integer r0 = new java.lang.Integer
            r1 = -1
            r0.<init>(r1)
        L7e:
            int r9 = r9.e
            java.lang.String r7 = defpackage.fzo.u(r9)
            int r6 = r0.intValue()
            if (r9 == 0) goto L91
            r2.b(r3, r4, r5, r6, r7)
            r10.getClass()
            return r10
        L91:
            r9 = 0
            throw r9
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqi.d(gqe, mmx):java.lang.Object");
    }
}
