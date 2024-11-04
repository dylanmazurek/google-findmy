package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mnn extends mnj {
    public mnn(mmx mmxVar) {
        super(mmxVar);
        if (mmxVar != null && mmxVar.o() != mnc.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.mmx
    public final mnb o() {
        return mnc.a;
    }
}
