package defpackage;

import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbu extends mnp implements moh {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Object d;
    final /* synthetic */ cbo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbu(cbo cboVar, Object obj, mmx mmxVar) {
        super(1, mmxVar);
        this.e = cboVar;
        this.d = obj;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new cbu(this.e, this.d, (mmx) obj).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        Object obj2;
        mne mneVar = mne.a;
        ?? r1 = this.c;
        try {
            if (r1 != 0) {
                obj2 = this.b;
                Object obj3 = this.a;
                mjo.o(obj);
                r1 = obj3;
            } else {
                mjo.o(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.e.a);
                Object obj4 = this.d;
                cch cchVar = new cch(fileOutputStream);
                this.a = fileOutputStream;
                this.b = fileOutputStream;
                this.c = 1;
                ((lkq) obj4).f(cchVar);
                if (mlh.a != mneVar) {
                    obj2 = fileOutputStream;
                    r1 = fileOutputStream;
                } else {
                    return mneVar;
                }
            }
            ((FileOutputStream) obj2).getFD().sync();
            mjo.r(r1, null);
            return mlh.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                mjo.r(r1, th);
                throw th2;
            }
        }
    }
}
