package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class icd implements bmh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ icd(ici iciVar, AtomicReference atomicReference, jis jisVar, jer jerVar, int i) {
        this.e = i;
        this.a = iciVar;
        this.b = atomicReference;
        this.c = jisVar;
        this.d = jerVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [mnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.bmh
    public final Object a(bmf bmfVar) {
        if (this.e != 0) {
            Object obj = this.a;
            this.c.execute(new bxi((String) this.d, (mnw) this.b, (cfn) obj, bmfVar, 2));
            return mlh.a;
        }
        icg icgVar = new icg((jis) this.c, (jer) this.d, bmfVar);
        AtomicReference atomicReference = (AtomicReference) this.b;
        atomicReference.set(icgVar);
        ((ici) this.a).b.a((iay) atomicReference.get());
        return null;
    }

    public /* synthetic */ icd(Executor executor, String str, mnw mnwVar, cfn cfnVar, int i) {
        this.e = i;
        this.c = executor;
        this.d = str;
        this.b = mnwVar;
        this.a = cfnVar;
    }
}
