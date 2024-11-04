package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jio extends jmx {
    private final jis a;

    public jio(jis jisVar, int i) {
        super(jisVar.size(), i);
        this.a = jisVar;
    }

    @Override // defpackage.jmx
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
