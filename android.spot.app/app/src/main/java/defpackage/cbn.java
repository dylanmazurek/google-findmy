package defpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbn extends mnp implements moh {
    Object a;
    int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbn(cbo cboVar, mmx mmxVar, int i) {
        super(1, mmxVar);
        this.d = i;
        this.c = cboVar;
    }

    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        if (this.d != 0) {
            return new cbn((hpd) this.c, (mmx) obj, 1).b(mlh.a);
        }
        return new cbn((cbo) this.c, (mmx) obj, 0).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        ?? r0;
        FileInputStream fileInputStream;
        ?? r2;
        Throwable th;
        FileInputStream fileInputStream2;
        Object obj2;
        ccd ccdVar;
        if (this.d != 0) {
            mne mneVar = mne.a;
            int i = this.b;
            try {
            } catch (Throwable th2) {
                apc n = ((hpd) this.c).n();
                this.a = th2;
                this.b = 2;
                Object h = n.h();
                if (h != mneVar) {
                    obj2 = th2;
                    obj = h;
                } else {
                    return mneVar;
                }
            }
            if (i != 0) {
                if (i != 1) {
                    obj2 = this.a;
                    mjo.o(obj);
                    ccdVar = new cbw((Throwable) obj2, ((Number) obj).intValue());
                    return new mkw(ccdVar, true);
                }
                mjo.o(obj);
            } else {
                mjo.o(obj);
                Object obj3 = this.c;
                this.b = 1;
                obj = ((hpd) obj3).k(true, this);
                if (obj == mneVar) {
                    return mneVar;
                }
            }
            ccdVar = (ccd) obj;
            return new mkw(ccdVar, true);
        }
        mne mneVar2 = mne.a;
        int i2 = this.b;
        try {
        } catch (FileNotFoundException unused) {
            if (((cbo) this.c).a.exists()) {
                FileInputStream fileInputStream3 = new FileInputStream(((cbo) this.c).a);
                try {
                    dhx dhxVar = ((cbo) this.c).b;
                    this.a = fileInputStream3;
                    this.b = 2;
                    if (dhxVar.k(fileInputStream3) != mneVar2) {
                        fileInputStream = fileInputStream3;
                    } else {
                        return mneVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r0 = fileInputStream3;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                r0 = this.a;
                try {
                    mjo.o(obj);
                    fileInputStream = r0;
                    mjo.r(fileInputStream, null);
                    return ((cbo) this.c).b.a;
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            }
            r2 = this.a;
            try {
                mjo.o(obj);
                fileInputStream2 = r2;
            } catch (Throwable th5) {
                th = th5;
                try {
                    throw th;
                } finally {
                }
            }
        } else {
            mjo.o(obj);
            FileInputStream fileInputStream4 = new FileInputStream(((cbo) this.c).a);
            try {
                dhx dhxVar2 = ((cbo) this.c).b;
                this.a = fileInputStream4;
                this.b = 1;
                Object k = dhxVar2.k(fileInputStream4);
                if (k != mneVar2) {
                    fileInputStream2 = fileInputStream4;
                    obj = k;
                } else {
                    return mneVar2;
                }
            } catch (Throwable th6) {
                r2 = fileInputStream4;
                th = th6;
                throw th;
            }
        }
        mjo.r(fileInputStream2, null);
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbn(hpd hpdVar, mmx mmxVar, int i) {
        super(1, mmxVar);
        this.d = i;
        this.c = hpdVar;
    }
}
