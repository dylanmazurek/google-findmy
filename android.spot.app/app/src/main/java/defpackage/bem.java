package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bem extends mnp implements mol {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bem(ConstraintTrackingWorker constraintTrackingWorker, cqb cqbVar, bet betVar, cvu cvuVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.f = i;
        this.e = constraintTrackingWorker;
        this.d = cqbVar;
        this.c = betVar;
        this.b = cvuVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return ((bem) c((msw) obj, (mmx) obj2)).b(mlh.a);
                    }
                    return ((bem) c((msw) obj, (mmx) obj2)).b(mlh.a);
                }
                return ((bem) c((msw) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((bem) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((bem) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:            if (r9 != r0) goto L31;     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Object, jyz] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bem.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cpu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, jyz] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Object obj2 = this.e;
                        Object obj3 = this.d;
                        return new bem((ConstraintTrackingWorker) obj2, (cqb) obj3, (bet) this.c, (cvu) this.b, mmxVar, 4);
                    }
                    Object obj4 = this.d;
                    Object obj5 = this.c;
                    return new bem((bet) obj4, (cvu) obj5, (AtomicInteger) this.e, (jyz) this.b, mmxVar, 3);
                }
                Object obj6 = this.b;
                return new bem((cqb) obj6, (cvu) this.e, (cpu) this.c, (Context) this.d, mmxVar, 2);
            }
            return new bem(this.e, (gga) this.d, (agt) this.c, (agt) this.b, mmxVar, 1);
        }
        Object obj7 = this.b;
        Object obj8 = this.c;
        Object obj9 = this.d;
        ?? r8 = this.e;
        return new bem((beo) obj7, api$$ExternalSyntheticApiModelOutline0.m14m(obj8), (Rect) obj9, (Consumer) r8, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bem(beo beoVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.f = i;
        this.b = beoVar;
        this.c = scrollCaptureSession;
        this.d = rect;
        this.e = consumer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bem(bet betVar, cvu cvuVar, AtomicInteger atomicInteger, jyz jyzVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.f = i;
        this.d = betVar;
        this.c = cvuVar;
        this.e = atomicInteger;
        this.b = jyzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bem(cqb cqbVar, cvu cvuVar, cpu cpuVar, Context context, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.f = i;
        this.b = cqbVar;
        this.e = cvuVar;
        this.c = cpuVar;
        this.d = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bem(Object obj, gga ggaVar, agt agtVar, agt agtVar2, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.f = i;
        this.e = obj;
        this.d = ggaVar;
        this.c = agtVar;
        this.b = agtVar2;
    }
}
