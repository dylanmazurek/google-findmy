package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxq extends mnp implements mol {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cqb d;
    final /* synthetic */ cvu e;
    final /* synthetic */ bet f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxq(cqb cqbVar, bet betVar, cvu cvuVar, mmx mmxVar) {
        super(2, mmxVar);
        this.d = cqbVar;
        this.f = betVar;
        this.e = cvuVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxq) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [mne, java.lang.Object, muf] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [jyz] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        Throwable th;
        AtomicInteger atomicInteger;
        ?? r1;
        CancellationException e;
        muf mufVar;
        ?? r0 = mne.a;
        try {
            if (this.c != 0) {
                ?? r02 = this.b;
                r1 = this.a;
                atomicInteger = (AtomicInteger) this.g;
                try {
                    mjo.o(obj);
                    mufVar = r02;
                    r1 = r1;
                } catch (CancellationException e2) {
                    e = e2;
                    String str = cxu.a;
                    cqb cqbVar = this.d;
                    cqc.b();
                    Objects.toString(cqbVar.getClass());
                    int i = atomicInteger.get();
                    if (!r1.isCancelled()) {
                    }
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    String str2 = cxu.a;
                    cqb cqbVar2 = this.d;
                    cqc.b();
                    Objects.toString(cqbVar2.getClass());
                    throw th;
                }
            } else {
                mjo.o(obj);
                msw mswVar = (msw) this.g;
                AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                cqb cqbVar3 = this.d;
                bet betVar = this.f;
                cvu cvuVar = this.e;
                jyz b = cqbVar3.b();
                muf q = mpp.q(mswVar, null, 0, new bem(betVar, cvuVar, atomicInteger2, b, (mmx) null, 3), 3);
                try {
                    this.g = atomicInteger2;
                    this.a = b;
                    this.b = q;
                    this.c = 1;
                    Object b2 = bei.b(b, this);
                    if (b2 != r0) {
                        mufVar = q;
                        obj = b2;
                        atomicInteger = atomicInteger2;
                        r1 = b;
                    } else {
                        return r0;
                    }
                } catch (CancellationException e3) {
                    atomicInteger = atomicInteger2;
                    r1 = b;
                    e = e3;
                    String str3 = cxu.a;
                    cqb cqbVar4 = this.d;
                    cqc.b();
                    Objects.toString(cqbVar4.getClass());
                    int i2 = atomicInteger.get();
                    if (!r1.isCancelled() && i2 != -256) {
                        throw new cxo(atomicInteger.get());
                    }
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    String str22 = cxu.a;
                    cqb cqbVar22 = this.d;
                    cqc.b();
                    Objects.toString(cqbVar22.getClass());
                    throw th;
                }
            }
            boy boyVar = (boy) obj;
            mufVar.s(null);
            return boyVar;
        } catch (Throwable th4) {
            r0.s(null);
            throw th4;
        }
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        cxq cxqVar = new cxq(this.d, this.f, this.e, mmxVar);
        cxqVar.g = obj;
        return cxqVar;
    }
}
