package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.maps.model.LatLng;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhx {
    public final Object a;

    public dhx(Context context) {
        this.a = new eey(context);
    }

    public static final Float o() {
        return Float.valueOf(0.0f);
    }

    public final boolean a() {
        if (ltr.a.a().c() && apc.d((Context) this.a).b(32783) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [diy, java.lang.Object] */
    public final synchronized diy b(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            elo eloVar = (elo) this.a.get(i);
            if (((Class) eloVar.b).isAssignableFrom(cls)) {
                return eloVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    public final synchronized void c(Class cls, diy diyVar) {
        this.a.add(new elo(cls, diyVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    public final synchronized List d() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final synchronized void e(dil dilVar) {
        this.a.add(dilVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052 A[PHI: r7
  0x0052: PHI (r7v8 java.lang.Object) = (r7v7 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x004f, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, mwv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(android.accounts.Account r6, defpackage.mmx r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.exc
            if (r0 == 0) goto L13
            r0 = r7
            exc r0 = (defpackage.exc) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            exc r0 = new exc
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.mjo.o(r7)
            goto L52
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.mjo.o(r7)
            goto L45
        L36:
            defpackage.mjo.o(r7)
            java.lang.Object r7 = r5.a
            r0.b = r4
            evw r7 = (defpackage.evw) r7
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 == r1) goto L53
        L45:
            hpd r7 = (defpackage.hpd) r7
            java.lang.Object r6 = r7.i
            r0.b = r3
            java.lang.Object r7 = defpackage.mpd.w(r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            return r7
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhx.f(android.accounts.Account, mmx):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:            if (defpackage.mpp.l(new defpackage.cci(r6, r8), new defpackage.cja(r8, r7, (defpackage.mmx) null, 1), r0) != r1) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:            if (r8 != r1) goto L45;     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(int r6, android.accounts.Account r7, defpackage.mmx r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.exd
            if (r0 == 0) goto L13
            r0 = r8
            exd r0 = (defpackage.exd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            exd r0 = new exd
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.mjo.o(r8)
            goto L75
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.a
            defpackage.mjo.o(r8)
            goto L49
        L38:
            defpackage.mjo.o(r8)
            java.lang.Object r8 = r5.a
            r0.a = r6
            r0.c = r4
            evw r8 = (defpackage.evw) r8
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 == r1) goto L78
        L49:
            hpd r8 = (defpackage.hpd) r8
            exe r7 = new exe
            r2 = 0
            r7.<init>(r6, r2)
            r0.c = r3
            mnb r6 = r0.o()
            bcr r3 = defpackage.bcr.c
            mmz r6 = r6.get(r3)
            cci r6 = (defpackage.cci) r6
            if (r6 == 0) goto L64
            r6.a(r8)
        L64:
            cci r3 = new cci
            r3.<init>(r6, r8)
            cja r6 = new cja
            r6.<init>(r8, r7, r2, r4)
            java.lang.Object r6 = defpackage.mpp.l(r3, r6, r0)
            if (r6 != r1) goto L75
            goto L78
        L75:
            mlh r6 = defpackage.mlh.a
            return r6
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhx.g(int, android.accounts.Account, mmx):java.lang.Object");
    }

    public final void h(ewk ewkVar) {
        ((ArrayList) this.a).add(ewkVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void i() {
        ?? r0 = this.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            ((ewk) r0.get(i)).cx();
        }
    }

    public final void j(ewk ewkVar) {
        ((ArrayList) this.a).remove(ewkVar);
    }

    public final Object k(InputStream inputStream) {
        try {
            Object e = ((lkx) ((ljn) this.a).z(7)).e(inputStream);
            e.getClass();
            return e;
        } catch (ljy e2) {
            throw new cak(e2);
        }
    }

    public final evh l(int i, Bundle bundle, evj evjVar) {
        evh evhVar = new evh(i, bundle, evjVar, new ebd(this, 11));
        ((cfk) this.a).i(jer.i(evhVar));
        return evhVar;
    }

    public final void m(int i) {
        l(i, null, evj.a().e());
    }

    public final LatLng n() {
        lnr lnrVar = ((dya) this.a).b.b;
        if (lnrVar == null) {
            lnrVar = lnr.c;
        }
        Object obj = this.a;
        double d = lnrVar.a;
        lnr lnrVar2 = ((dya) obj).b.b;
        if (lnrVar2 == null) {
            lnrVar2 = lnr.c;
        }
        return new LatLng(d, lnrVar2.b);
    }

    public dhx(Object obj) {
        this.a = obj;
    }

    public dhx(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public dhx() {
        this.a = new msk();
    }

    public dhx(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public dhx(short[] sArr) {
        this.a = new ArrayList();
    }

    public dhx(evw evwVar) {
        evwVar.getClass();
        this.a = evwVar;
    }

    public dhx(byte[] bArr) {
        this.a = new ArrayDeque();
    }

    public dhx(char[] cArr) {
        this.a = new ArrayList();
    }

    public dhx(fma fmaVar, dux duxVar) {
        fmaVar.getClass();
        duxVar.getClass();
        this.a = duxVar;
    }

    public dhx(mko mkoVar) {
        mkoVar.getClass();
        this.a = mkoVar;
    }

    public dhx(byte[] bArr, char[] cArr) {
        this.a = new cfn();
    }
}
