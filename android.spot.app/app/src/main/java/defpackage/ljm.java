package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljm implements Comparable {
    public final int a;
    public final llx b;

    public ljm(int i, llx llxVar) {
        this.a = i;
        this.b = llxVar;
    }

    public final lly a() {
        return this.b.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((ljm) obj).a;
    }
}
