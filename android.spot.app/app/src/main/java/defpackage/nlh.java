package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlh {
    private static final nlg a = new nlg(new byte[0], 0, 0, false);
    private static final int b;
    private static final AtomicReference[] c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int highestOneBit = Integer.highestOneBit((availableProcessors + availableProcessors) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final nlg a() {
        AtomicReference c2 = c();
        nlg nlgVar = a;
        nlg nlgVar2 = (nlg) c2.getAndSet(nlgVar);
        if (nlgVar2 == nlgVar) {
            return new nlg();
        }
        if (nlgVar2 == null) {
            c2.set(null);
            return new nlg();
        }
        c2.set(nlgVar2.f);
        nlgVar2.f = null;
        nlgVar2.c = 0;
        return nlgVar2;
    }

    public static final void b(nlg nlgVar) {
        int i;
        if (nlgVar.f == null && nlgVar.g == null) {
            if (!nlgVar.d) {
                AtomicReference c2 = c();
                nlg nlgVar2 = a;
                nlg nlgVar3 = (nlg) c2.getAndSet(nlgVar2);
                if (nlgVar3 != nlgVar2) {
                    if (nlgVar3 != null) {
                        i = nlgVar3.c;
                    } else {
                        i = 0;
                    }
                    if (i >= 65536) {
                        c2.set(nlgVar3);
                        return;
                    }
                    nlgVar.f = nlgVar3;
                    nlgVar.b = 0;
                    nlgVar.c = i + 8192;
                    c2.set(nlgVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final AtomicReference c() {
        return c[(int) (Thread.currentThread().getId() & (b - 1))];
    }
}
