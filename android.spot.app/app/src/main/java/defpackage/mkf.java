package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mkf {
    public final lyt a;
    public final lys b;

    /* JADX INFO: Access modifiers changed from: protected */
    public mkf(lyt lytVar, lys lysVar) {
        this.a = lytVar;
        this.b = lysVar;
    }

    protected abstract mkf a(lyt lytVar, lys lysVar);

    public final mkf c(lyr lyrVar, Object obj) {
        return a(this.a, this.b.d(lyrVar, obj));
    }
}
