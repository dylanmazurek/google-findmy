package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grx implements grt {
    public static final joo a = joo.m("GnpSdk");
    private static final long d = TimeUnit.MINUTES.toMillis(5);
    private static final long e = TimeUnit.HOURS.toMillis(1);
    public final Map b;
    public final Map c;
    private final Context f;
    private final msw g;

    public grx(Context context, fma fmaVar, msw mswVar) {
        fmaVar.getClass();
        this.f = context;
        this.g = mswVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    public static final boolean f(grv grvVar) {
        Long l = grvVar.c;
        if (l != null) {
            if (TimeUnit.SECONDS.toMillis(l.longValue()) - fma.i().toEpochMilli() > d) {
                return true;
            }
            return false;
        }
        if (fma.i().toEpochMilli() - grvVar.b < e - d) {
            return true;
        }
        return false;
    }

    private final gmx g(Throwable th) {
        if (th instanceof UserRecoverableAuthException) {
            return new grr((UserRecoverableAuthException) th);
        }
        if (th instanceof IOException) {
            return new grs((IOException) th);
        }
        return new grq(th);
    }

    private final grv h(Account account, String str) {
        Bundle bundle = Bundle.EMPTY;
        bundle.getClass();
        TokenData a2 = fej.a(this.f, account, str, bundle);
        a2.getClass();
        String str2 = a2.b;
        str2.getClass();
        return new grv(str2, fma.i().toEpochMilli(), a2.c);
    }

    @Override // defpackage.grt
    public final gna a(String str, String str2) {
        gnc gncVar;
        str.getClass();
        Account account = new Account(str, "com.google");
        synchronized (this.b) {
            try {
                grv h = h(account, str2);
                if (!f(h)) {
                    a.k().z("Token for [%s, %s] is invalid with expiration %s, refreshing...", account.name, str2, h.c);
                    e(h);
                    h = h(account, str2);
                }
                a.k().z("Returning valid token for [%s, %s] with expiration %s", account.name, str2, h.c);
                gncVar = new gnc(h.a);
            } catch (Exception e2) {
                return g(e2);
            }
        }
        return gncVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.grt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r8, java.lang.String r9, defpackage.mmx r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.grw
            if (r0 == 0) goto L13
            r0 = r10
            grw r0 = (defpackage.grw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            grw r0 = new grw
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            grx r8 = r0.d
            defpackage.mjo.o(r10)
            goto L76
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.mjo.o(r10)
            java.lang.String r10 = "com.google"
            gru r2 = new gru
            android.accounts.Account r4 = new android.accounts.Account
            r4.<init>(r8, r10)
            r2.<init>(r4, r9)
            mpn r8 = new mpn
            r8.<init>()
            java.util.Map r9 = r7.c
            monitor-enter(r9)
            java.util.Map r10 = r7.c     // Catch: java.lang.Throwable -> L90
            java.lang.Object r10 = r10.get(r2)     // Catch: java.lang.Throwable -> L90
            mtc r10 = (defpackage.mtc) r10     // Catch: java.lang.Throwable -> L90
            if (r10 != 0) goto L64
            msw r10 = r7.g     // Catch: java.lang.Throwable -> L90
            ere r4 = new ere     // Catch: java.lang.Throwable -> L90
            r5 = 0
            r6 = 3
            r4.<init>(r7, r2, r5, r6)     // Catch: java.lang.Throwable -> L90
            mtc r10 = defpackage.mpp.o(r10, r4)     // Catch: java.lang.Throwable -> L90
            java.util.Map r4 = r7.c     // Catch: java.lang.Throwable -> L90
            r4.put(r2, r10)     // Catch: java.lang.Throwable -> L90
        L64:
            r8.a = r10     // Catch: java.lang.Throwable -> L90
            monitor-exit(r9)
            java.lang.Object r8 = r8.a
            mtc r8 = (defpackage.mtc) r8
            r0.d = r7
            r0.c = r3
            java.lang.Object r10 = r8.dn(r0)
            if (r10 == r1) goto L8f
            r8 = r7
        L76:
            mky r10 = (defpackage.mky) r10
            java.lang.Object r9 = r10.a
            java.lang.Throwable r10 = defpackage.mky.a(r9)
            if (r10 != 0) goto L8a
            grv r9 = (defpackage.grv) r9
            java.lang.String r8 = r9.a
            gnc r9 = new gnc
            r9.<init>(r8)
            goto L8e
        L8a:
            gmx r9 = r8.g(r10)
        L8e:
            return r9
        L8f:
            return r1
        L90:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grx.b(java.lang.String, java.lang.String, mmx):java.lang.Object");
    }

    @Override // defpackage.grt
    public final String c(String str) {
        str.getClass();
        String c = fej.c(this.f, str);
        c.getClass();
        return c;
    }

    public final grv d(gru gruVar) {
        grv h = h(gruVar.a, gruVar.b);
        this.b.put(gruVar, h);
        return h;
    }

    public final void e(grv grvVar) {
        fej.e(this.f, grvVar.a);
    }
}
