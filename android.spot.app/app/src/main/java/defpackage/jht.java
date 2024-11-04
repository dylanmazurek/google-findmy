package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jht implements Iterable {
    private final jer a;

    /* JADX INFO: Access modifiers changed from: protected */
    public jht() {
        this.a = jdl.a;
    }

    public static jht b(Iterable iterable) {
        if (iterable instanceof jht) {
            return (jht) iterable;
        }
        return new jhq(iterable, iterable);
    }

    public final jer a(jet jetVar) {
        return hzc.U(e(), jetVar);
    }

    public final jht c(jei jeiVar) {
        return b(new jjy(e(), jeiVar));
    }

    public final jis d() {
        return jis.n(e());
    }

    public final Iterable e() {
        return (Iterable) this.a.e(this);
    }

    public final String toString() {
        return hzc.Z(e());
    }

    public jht(Iterable iterable) {
        this.a = jer.i(iterable);
    }
}
